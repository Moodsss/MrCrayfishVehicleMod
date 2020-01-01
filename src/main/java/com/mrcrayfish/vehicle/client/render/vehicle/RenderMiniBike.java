package com.mrcrayfish.vehicle.client.render.vehicle;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mrcrayfish.vehicle.client.SpecialModel;
import com.mrcrayfish.vehicle.client.render.AbstractRenderVehicle;
import com.mrcrayfish.vehicle.client.render.Axis;
import com.mrcrayfish.vehicle.common.ItemLookup;
import com.mrcrayfish.vehicle.entity.vehicle.MiniBikeEntity;
import com.mrcrayfish.vehicle.util.RenderUtil;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.player.PlayerEntity;

/**
 * Author: MrCrayfish
 */
public class RenderMiniBike extends AbstractRenderVehicle<MiniBikeEntity>
{
    @Override
    public SpecialModel getBodyModel()
    {
        return SpecialModel.MINI_BIKE_BODY;
    }

    @Override
    public void render(MiniBikeEntity entity, MatrixStack matrixStack, IRenderTypeBuffer renderTypeBuffer, float partialTicks)
    {
        this.renderDamagedPart(entity, SpecialModel.MINI_BIKE_BODY.getModel(), matrixStack, renderTypeBuffer);

        //Render the handles bars
        matrixStack.func_227860_a_();

        matrixStack.func_227861_a_(0.0, 0.0, 10.5 * 0.0625);
        matrixStack.func_227863_a_(Axis.POSITIVE_X.func_229187_a_(-22.5F));

        float wheelScale = 1.65F;
        float wheelAngle = entity.prevRenderWheelAngle + (entity.renderWheelAngle - entity.prevRenderWheelAngle) * partialTicks;
        float wheelAngleNormal = wheelAngle / 45F;
        float turnRotation = wheelAngleNormal * 25F;

        matrixStack.func_227863_a_(Axis.POSITIVE_Y.func_229187_a_(turnRotation));
        matrixStack.func_227863_a_(Axis.POSITIVE_X.func_229187_a_(22.5F));
        matrixStack.func_227861_a_(0.0, 0.0, -10.5 * 0.0625);

        this.renderDamagedPart(entity, SpecialModel.MINI_BIKE_HANDLES.getModel(), matrixStack, renderTypeBuffer);

        if(entity.hasWheels())
        {
            matrixStack.func_227860_a_();
            matrixStack.func_227861_a_(0, -0.5 + 1.7 * 0.0625, 13 * 0.0625);
            float frontWheelSpin = entity.prevFrontWheelRotation + (entity.frontWheelRotation - entity.prevFrontWheelRotation) * partialTicks;
            if(entity.isMoving())
            {
                matrixStack.func_227863_a_(Axis.POSITIVE_X.func_229187_a_(-frontWheelSpin));
            }
            matrixStack.func_227862_a_(wheelScale, wheelScale, wheelScale);
            matrixStack.func_227863_a_(Axis.POSITIVE_Y.func_229187_a_(180F));
            RenderUtil.renderColoredModel(RenderUtil.getModel(ItemLookup.getWheel(entity)), ItemCameraTransforms.TransformType.NONE, false, matrixStack, renderTypeBuffer, -1,15728880, OverlayTexture.field_229196_a_);
            matrixStack.func_227865_b_();
        }

        matrixStack.func_227865_b_();
    }

    @Override
    public void applyPlayerModel(MiniBikeEntity entity, PlayerEntity player, PlayerModel model, float partialTicks)
    {
        float wheelAngle = entity.prevRenderWheelAngle + (entity.renderWheelAngle - entity.prevRenderWheelAngle) * partialTicks;
        float wheelAngleNormal = wheelAngle / 45F;
        float turnRotation = wheelAngleNormal * 8F;
        model.bipedRightArm.rotateAngleX = (float) Math.toRadians(-55F - turnRotation);
        model.bipedLeftArm.rotateAngleX = (float) Math.toRadians(-55F + turnRotation);
        //model.bipedRightArm.offsetZ = -0.1F * wheelAngleNormal;
        //model.bipedLeftArm.offsetZ = 0.1F * wheelAngleNormal;
        model.bipedRightLeg.rotateAngleX = (float) Math.toRadians(-65F);
        model.bipedRightLeg.rotateAngleY = (float) Math.toRadians(30F);
        model.bipedLeftLeg.rotateAngleX = (float) Math.toRadians(-65F);
        model.bipedLeftLeg.rotateAngleY = (float) Math.toRadians(-30F);
    }

    @Override
    public void applyPlayerRender(MiniBikeEntity entity, PlayerEntity player, float partialTicks, MatrixStack matrixStack, IVertexBuilder builder)
    {
        double offset = 24 * 0.0625 + entity.getMountedYOffset() + player.getYOffset();
        matrixStack.func_227861_a_(0.0, offset, 0.0);
        float currentSpeedNormal = (entity.prevCurrentSpeed + (entity.currentSpeed - entity.prevCurrentSpeed) * partialTicks) / entity.getMaxSpeed();
        float turnAngleNormal = (entity.prevTurnAngle + (entity.turnAngle - entity.prevTurnAngle) * partialTicks) / 45F;
        matrixStack.func_227863_a_(Axis.POSITIVE_Z.func_229187_a_(turnAngleNormal * currentSpeedNormal * 20F));
        matrixStack.func_227861_a_(0.0, -offset, 0.0);
    }
}
