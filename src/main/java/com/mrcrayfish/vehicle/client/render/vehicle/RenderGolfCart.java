package com.mrcrayfish.vehicle.client.render.vehicle;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mrcrayfish.vehicle.client.SpecialModel;
import com.mrcrayfish.vehicle.client.render.AbstractRenderVehicle;
import com.mrcrayfish.vehicle.client.render.Axis;
import com.mrcrayfish.vehicle.entity.vehicle.GolfCartEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.entity.player.PlayerEntity;

/**
 * Author: MrCrayfish
 */
public class RenderGolfCart extends AbstractRenderVehicle<GolfCartEntity>
{
    @Override
    public SpecialModel getBodyModel()
    {
        return SpecialModel.GOLF_CART_BODY;
    }

    @Override
    public void render(GolfCartEntity entity, MatrixStack matrixStack, IRenderTypeBuffer renderTypeBuffer, float partialTicks)
    {
        //Render the body
        this.renderDamagedPart(entity, SpecialModel.GOLF_CART_BODY.getModel(), matrixStack, renderTypeBuffer);

        //Render the handles bars
        matrixStack.func_227860_a_();

        // Positions the steering wheel in the correct position
        matrixStack.func_227861_a_(-0.345, 0.425, 0.1);
        matrixStack.func_227863_a_(Axis.POSITIVE_X.func_229187_a_(-45F));
        matrixStack.func_227861_a_(0, -0.02, 0);
        matrixStack.func_227862_a_(0.95F, 0.95F, 0.95F);

        // Rotates the steering wheel based on the wheel angle
        float wheelAngle = entity.prevRenderWheelAngle + (entity.renderWheelAngle - entity.prevRenderWheelAngle) * partialTicks;
        float wheelAngleNormal = wheelAngle / 45F;
        float turnRotation = wheelAngleNormal * 25F;
        matrixStack.func_227863_a_(Axis.POSITIVE_Y.func_229187_a_(turnRotation));

        this.renderDamagedPart(entity, SpecialModel.GO_KART_STEERING_WHEEL.getModel(), matrixStack, renderTypeBuffer);

        matrixStack.func_227865_b_();
    }

    @Override
    public void applyPlayerModel(GolfCartEntity entity, PlayerEntity player, PlayerModel model, float partialTicks)
    {
        model.bipedRightLeg.rotateAngleX = (float) Math.toRadians(-80F);
        model.bipedRightLeg.rotateAngleY = (float) Math.toRadians(15F);
        model.bipedLeftLeg.rotateAngleX = (float) Math.toRadians(-80F);
        model.bipedLeftLeg.rotateAngleY = (float) Math.toRadians(-15F);

        if(entity.getControllingPassenger() == player)
        {
            float wheelAngle = entity.prevRenderWheelAngle + (entity.renderWheelAngle - entity.prevRenderWheelAngle) * partialTicks;
            float wheelAngleNormal = wheelAngle / 45F;
            float turnRotation = wheelAngleNormal * 6F;
            model.bipedRightArm.rotateAngleX = (float) Math.toRadians(-65F - turnRotation);
            model.bipedRightArm.rotateAngleY = (float) Math.toRadians(-7F);
            model.bipedLeftArm.rotateAngleX = (float) Math.toRadians(-65F + turnRotation);
            model.bipedLeftArm.rotateAngleY = (float) Math.toRadians(7F);
        }
    }
}
