package com.mrcrayfish.vehicle.datagen;

import com.mrcrayfish.vehicle.client.CameraProperties;
import com.mrcrayfish.vehicle.common.Seat;
import com.mrcrayfish.vehicle.common.entity.PartPosition;
import com.mrcrayfish.vehicle.entity.EngineType;
import com.mrcrayfish.vehicle.entity.Wheel;
import com.mrcrayfish.vehicle.entity.properties.PlaneProperties;
import com.mrcrayfish.vehicle.entity.properties.VehicleProperties;
import com.mrcrayfish.vehicle.init.ModEntities;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;

/**
 * Author: MrCrayfish
 */
public class VehiclePropertiesGen extends VehiclePropertiesProvider
{
    public VehiclePropertiesGen(DataGenerator generator)
    {
        super(generator);
    }

    @Override
    protected void registerProperties()
    {
        this.add(ModEntities.ALUMINUM_BOAT.get(), VehicleProperties.builder()
                .setBodyPosition(PartPosition.create(0.0, 0.0, 0.2, 1.1))
                .setFuelPortPosition(PartPosition.create(-16.0, 3.0, -18.0, 0.0, -90.0, 0.0, 0.25))
                .setDisplayPosition(PartPosition.create(1.0))
                .addSeat(Seat.of(-7.0, 8.0, -15.0, true))
                .addSeat(Seat.of(7.0, 6.0, -15.0))
                .addSeat(Seat.of(-7.0, 6.0, 3.0))
                .addSeat(Seat.of(7.0, 6.0, 3.0))
                .setEngineType(EngineType.SMALL_MOTOR)
                .setEnginePower(12F)
                .setColored(true));

        this.add(ModEntities.ATV.get(), VehicleProperties.builder()
                .setAxleOffset(-1.5F)
                .setBodyPosition(PartPosition.create(1.25))
                .setFuelPortPosition(PartPosition.create(0.0, 6.55, 5.0, -90.0, 0.0, 0.0, 0.35))
                .setKeyPortPosition(PartPosition.create(-5.0, 4.5, 6.5, -45.0, 0.0, 0.0, 0.5))
                .setDisplayPosition(PartPosition.create(1.5))
                .setHeldOffset(4.0, 3.5, 0.0)
                .setTowBarPosition(0.0, 0.0, -20.8)
                .setTrailerOffset(0.0, 0.0, -0.55)
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(4.0, 0.0, 10.5)
                        .setScale(1.15625)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(4.0, 0.0, 10.5)
                        .setScale(1.15625)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(4.0, 0.0, -10.5)
                        .setScale(1.15625)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(4.0, 0.0, -10.5)
                        .setScale(1.15625)
                        .setParticles(true))
                .setFrontAxleOffset(10.5)
                .setRearAxleOffset(-10.5)
                .addSeat(Seat.of(0.0, 5.0, -3.0, true))
                .addSeat(Seat.of(0.0, 5.5, -12.0))
                .setEngineType(EngineType.SMALL_MOTOR)
                .setEnginePower(15F)
                .setCanChangeWheels(true)
                .setColored(true));

        this.add(ModEntities.BUMPER_CAR.get(), VehicleProperties.builder()
                .setAxleOffset(-1.5F)
                .setBodyPosition(PartPosition.create(1.2))
                .setFuelPortPosition(PartPosition.create(-8.0, 6.0, -8.0, 0.0, -90.0, 0.0, 0.25))
                .setDisplayPosition(PartPosition.create(1.5))
                .setHeldOffset(6.0, 0.0, 0.0)
                .setTrailerOffset(0.0, -0.03125, -0.5625)
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(7.0, 0.0, 8.5)
                        .setScale(0.47))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(7.0, 0.0, 8.5)
                        .setScale(0.47))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(7.0, 0.0F, -8.5)
                        .setScale(0.47))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(7.0, 0.0F, -8.5)
                        .setScale(0.47))
                .setFrontAxleOffset(8.5)
                .setRearAxleOffset(-8.5)
                .addSeat(Seat.of(0.0, 1.0, -6.0, true))
                .setEngineType(EngineType.ELECTRIC_MOTOR)
                .setEnginePower(5F)
                .setCanChangeWheels(true)
                .setColored(true));

        this.add(ModEntities.DIRT_BIKE.get(), VehicleProperties.builder()
                .setEnginePosition(PartPosition.create(0.0, 1.0, 0.0, 0.0, 180.0, 0.0, 0.6))
                .setFuelPortPosition(PartPosition.create(0.0, 12.1, 3.0, 67.5, 180.0, 0.0, 0.35))
                .setDisplayPosition(PartPosition.create(1.4))
                .setHeldOffset(0.0, 3.5, 0.0)
                .setTrailerOffset(0, -0.0625, -0.3125)
                .addWheel(Wheel.builder()
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(0.0, 0.0, 14.08)
                        .setScale(0.9375, 1.4, 1.4)
                        .setRender(false))
                .addWheel(Wheel.builder()
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(0.0, 0.0, -11.61F)
                        .setScale(0.9375, 1.4, 1.4)
                        .setParticles(true))
                .setFrontAxleOffset(14.08)
                .setRearAxleOffset(-11.61)
                .addSeat(Seat.of(0.0, 8.0, -2.0, true))
                .addSeat(Seat.of(0.0, 9.0, -9.0))
                .setEngineType(EngineType.SMALL_MOTOR)
                .setEnginePower(16F)
                .setCanChangeWheels(true)
                .setColored(true));

        this.add(ModEntities.DUNE_BUGGY.get(), VehicleProperties.builder()
                .setAxleOffset(-2.3F)
                .setBodyPosition(PartPosition.create(1.3))
                .setFuelPortPosition(PartPosition.create(0.0, 3.0, -7.0, 0.0, 180.0, 0.0, 0.25))
                .setDisplayPosition(PartPosition.create(1.75))
                .setHeldOffset(2.0, 0.0, 0.0)
                .setTrailerOffset(0.0, -0.025, -0.25)
                .addWheel(Wheel.builder()
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(2.4, 0.0, 5.3)
                        .setScale(0.625)
                        .setRender(false))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(2.4, 0.0, -5.7)
                        .setScale(0.625)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(2.4, 0.0, -5.7)
                        .setScale(0.625)
                        .setParticles(true))
                .setFrontAxleOffset(5.3)
                .setRearAxleOffset(-5.7)
                .addSeat(Seat.of(0.0, 2.0, -3.0, true))
                .setEngineType(EngineType.SMALL_MOTOR)
                .setEnginePower(2F)
                .setCanChangeWheels(true));

        this.add(ModEntities.GO_KART.get(), VehicleProperties.builder()
                .setAxleOffset(-2.5F)
                .setEnginePosition(PartPosition.create(0.0, 2.0, -9.0, 0.0, 180.0, 0.0, 0.8))
                .setDisplayPosition(PartPosition.create(0.0, 0.0, -0.15, 0.0, 0.0, 0.0, 1.5))
                .setHeldOffset(3.0, 0.5, 0.0)
                .setTrailerOffset(0.0, -0.03125, -0.375)
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(9.0, 0.0, 13.5)
                        .setScale(0.8F))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(9.0, 0.0, 13.5)
                        .setScale(0.8F))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(9.0, 0.0, -8.5)
                        .setScale(0.8F)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(9.0, 0.0, -8.5)
                        .setScale(0.8F)
                        .setParticles(true))
                .setFrontAxleOffset(13.5)
                .setRearAxleOffset(-8.5)
                .addSeat(Seat.of(0.0, -2.0, -1.0, true))
                .setEngineType(EngineType.SMALL_MOTOR)
                .setEnginePower(18F)
                .setCanChangeWheels(true)
                .setColored(true));

        this.add(ModEntities.GOLF_CART.get(), VehicleProperties.builder()
                .setAxleOffset(-0.5F)
                .setBodyPosition(PartPosition.create(1.15))
                .setFuelPortPosition(PartPosition.create(-13, 3.5, -6.0, 0.0, -90.0, 0.0, 0.25))
                .setKeyPortPosition(PartPosition.create(-8.5, 2.75, 8.5, -67.5, 0.0, 0.0, 0.5))
                .setDisplayPosition(PartPosition.create(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.25))
                .setHeldOffset(1.5, 2.5, 0.0)
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(9.0, 0.0, 16.0)
                        .setScale(1.1))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(9.0, 0.0, 16.0)
                        .setScale(1.1))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(9.0, 0.0, -12.5)
                        .setScale(1.1)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(9.0, 0.0, -12.5)
                        .setScale(1.1)
                        .setParticles(true))
                .setFrontAxleOffset(16.0)
                .setRearAxleOffset(-12.5)
                .addSeat(Seat.of(5.5, 5.0, -6.0, true))
                .addSeat(Seat.of(-5.5, 5.0, -6.0))
                .addSeat(Seat.of(5.5, 5.0, -15.0, 180F))
                .addSeat(Seat.of(-5.5, 5.0, -15.0, 180F))
                .setEngineType(EngineType.ELECTRIC_MOTOR)
                .setEnginePower(25F)
                .setCanChangeWheels(true)
                .setColored(true));

        this.add(ModEntities.JET_SKI.get(), VehicleProperties.builder()
                .setAxleOffset(2.75F)
                .setBodyPosition(PartPosition.create(0.0, 0.0, 0.25, 0.0, 0.0, 0.0, 1.25))
                .setFuelPortPosition(PartPosition.create(0.0, 9.25, 8.5, -90, 0.0, 0.0, 0.35))
                .setDisplayPosition(PartPosition.create(0.0F, 0.0F, -0.45F, 0.0F, 0.0F, 0.0F, 1.5F))
                .setHeldOffset(6.0, 0.0, 0.0)
                .setTrailerOffset(0.0, -0.09375, -0.65)
                .addSeat(Seat.of(0.0, 5.0, 0.0, true))
                .addSeat(Seat.of(0.0, 5.0, -7.0))
                .setEngineType(EngineType.SMALL_MOTOR)
                .setEnginePower(18F)
                .setColored(true));

        this.add(ModEntities.LAWN_MOWER.get(), VehicleProperties.builder()
                .setAxleOffset(-2.0F)
                .setBodyPosition(PartPosition.create(1.25))
                .setFuelPortPosition(PartPosition.create(-4.50, 9.5, 4.0, 0.0, -90.0, 0.0, 0.2))
                .setKeyPortPosition(PartPosition.create(-5.0, 4.5, 6.5, -45, 0.0, 0.0, 0.5))
                .setDisplayPosition(PartPosition.create(1.5))
                .setHeldOffset(12.0, -1.5, 0.0)
                .setTowBarPosition(0.0, 0.0, -20.0)
                .setTrailerOffset(0.0, -0.01, -1.0)
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(6.0, 0.0, 13.5)
                        .setAutoScale(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(6.0, 0.0, 13.5)
                        .setAutoScale(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(5.0, 0.8, -10.7)
                        .setScale(0.97)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(5.0, 0.8, -10.7)
                        .setScale(0.97)
                        .setParticles(true))
                .setFrontAxleOffset(13.5)
                .setRearAxleOffset(-10.7)
                .addSeat(Seat.of(0.0, 7.0, -9.0, true))
                .setEngineType(EngineType.SMALL_MOTOR)
                .setEnginePower(8F)
                .setCanChangeWheels(true)
                .setColored(true));

        this.add(ModEntities.MINI_BIKE.get(), VehicleProperties.builder()
                .setAxleOffset(-1.7F)
                .setBodyPosition(PartPosition.create(1.05))
                .setEnginePosition(PartPosition.create(0.0, 1.0, 2.5, 0.0, 180.0, 0.0, 0.7))
                .setDisplayPosition(PartPosition.create(0.0, 0.0, -0.1, 0.0, 0.0, 0.0, 1.5))
                .setHeldOffset(6.0, 0.0, 0.0)
                .setTrailerOffset(0.0, -0.0625, -0.5)
                .addWheel(Wheel.builder()
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(0.0, -0.5 + 1.7 * 0.0625, 13.0)
                        .setScale(1.03)
                        .setParticles(true)
                        .setRender(false))
                .addWheel(Wheel.builder()
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(0.0, 0.0, -6.7)
                        .setScale(1.03)
                        .setParticles(true))
                .setFrontAxleOffset(13)
                .setRearAxleOffset(-6.7)
                .addSeat(Seat.of(0.0, 7.0, -2.0, true))
                .setEngineType(EngineType.SMALL_MOTOR)
                .setEnginePower(12F)
                .setCanChangeWheels(true)
                .setColored(true));

        this.add(ModEntities.MINI_BUS.get(), VehicleProperties.builder()
                .setAxleOffset(1.0F)
                .setBodyPosition(PartPosition.create(1.3))
                .setFuelPortPosition(PartPosition.create(-12.0, 8.0, -8.75, 0.0, -90.0, 0.0, 0.25))
                .setKeyPortPosition(PartPosition.create(0.0, 6.75, 19.5, -67.5, 0.0, 0.0, 0.5))
                .setDisplayPosition(PartPosition.create(1.0))
                .setHeldOffset(0.0, 3.5, 0.0)
                .setTowBarPosition(0.0, 0.0, -33.0)
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(9.0, 0.0, 13.5)
                        .setScale(0.9375, 1.19, 1.19)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(9.0, 0.0, 13.5)
                        .setScale(0.9375, 1.19, 1.19)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(9.0, 0.0, -13.5)
                        .setScale(0.9375, 1.19, 1.19)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(9.0, 0.0, -13.5)
                        .setScale(0.9375, 1.19, 1.19)
                        .setParticles(true))
                .setFrontAxleOffset(14.5)
                .setRearAxleOffset(-14.5)
                .addSeat(Seat.of(4.5, 2.0, 11.0, true))
                .addSeat(Seat.of(-4.5, 2.0, 11.0))
                .addSeat(Seat.of(4.5, 2.0, -3.0))
                .addSeat(Seat.of(-4.5, 2.0, -3.0))
                .addSeat(Seat.of(4.5, 2.0, -15.0))
                .setEngineType(EngineType.LARGE_MOTOR)
                .setEnginePower(14F)
                .setCanChangeWheels(true)
                .setColored(true));

        this.add(ModEntities.MOPED.get(), VehicleProperties.builder()
                .setAxleOffset(-1.0F)
                .setBodyPosition(PartPosition.create(1.2))
                .setFuelPortPosition(PartPosition.create(-2.5, 4.2, -1.5, 0.0, -90.0, 0.0, 0.2))
                .setDisplayPosition(PartPosition.create(0.0, 0.0, -0.25, 0.0, 0.0, 0.0, 1.5))
                .setHeldOffset(4.5, 2.0, 0.0)
                .setTrailerOffset(0.0, -0.03125, -0.65)
                .addWheel(Wheel.builder()
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(0.0, 0.0, 14.0884)
                        .setScale(0.6, 0.8, 0.8)
                        .setParticles(true)
                        .setRender(false))
                .addWheel(Wheel.builder()
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(0.0, 0.0, -6.7)
                        .setParticles(true))
                .setFrontAxleOffset(14.5)
                .setRearAxleOffset(-6.7)
                .addSeat(Seat.of(0.0, 4.0, -1.0, true))
                .setEngineType(EngineType.SMALL_MOTOR)
                .setEnginePower(12F)
                .setCanChangeWheels(true)
                .setColored(true));

        this.add(ModEntities.OFF_ROADER.get(), VehicleProperties.builder()
                .setAxleOffset(-1.0F)
                .setBodyPosition(PartPosition.create(1.4))
                .setFuelPortPosition(PartPosition.create(-12.0, 8.5, -6.5, 0.0, -90, 0.0, 0.25))
                .setKeyPortPosition(PartPosition.create(0.0, 7.0, 6.2, -67.5, 0.0, 0.0, 0.5))
                .setDisplayPosition(PartPosition.create(0.0, 0.0, 0.1, 0.0, 0.0, 0.0, 1.0))
                .setHeldOffset(0.0, 3.5, 0.0)
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(10.0, 0.0, 14.5)
                        .setScale(1.4F)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(10.0, 0.0, 14.5)
                        .setScale(1.4F)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(10.0, 0.0, -14.5)
                        .setScale(1.4F)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(10.0, 0.0, -14.5)
                        .setScale(1.4F)
                        .setParticles(true))
                .setFrontAxleOffset(14.5)
                .setRearAxleOffset(-14.5)
                .addSeat(Seat.of(5.0, 4.0, -3.0, true))
                .addSeat(Seat.of(-5.0, 4.0, -3.0))
                .addSeat(Seat.of(5.0, 11.5, -14.5))
                .addSeat(Seat.of(-5.0, 3.5, -18.9))
                .setEngineType(EngineType.LARGE_MOTOR)
                .setEnginePower(16F)
                .setCanChangeWheels(true)
                .setColored(true));

        this.add(ModEntities.SHOPPING_CART.get(), VehicleProperties.builder()
                .setAxleOffset(-1.0F)
                .setBodyPosition(PartPosition.create(1.05))
                .setDisplayPosition(PartPosition.create(1.45F))
                .setHeldOffset(4.0, 9.25, 0.0)
                .setTrailerOffset(0.0, -0.03125, -0.25)
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setOffset(5.75, 0.0, -10.5)
                        .setScale(0.47F))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setOffset(5.75, 0.0, -10.5)
                        .setScale(0.47F))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(4.0, 0.0, 9.5)
                        .setScale(0.47F))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(4.0, 0.0, 9.5)
                        .setScale(0.47F))
                .setFrontAxleOffset(9.5)
                .setRearAxleOffset(-10.5)
                .addSeat(Seat.of(0.0, 7.0, -4.0, true))
                .setEngineType(EngineType.NONE)
                .setEnginePower(1F)
                .setCanChangeWheels(true));

        this.add(ModEntities.SMART_CAR.get(), VehicleProperties.builder()
                .setAxleOffset(-1.7F)
                .setBodyPosition(PartPosition.create(1.25))
                .setFuelPortPosition(PartPosition.create(-9.0, 8.7, -12.3, 0, -90, 0, 0.25))
                .setDisplayPosition(PartPosition.create(1.35F))
                .setHeldOffset(3.0, 1.0, 0.0)
                .setTowBarPosition(0.0, 0.0, -24.5)
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(7.0, 0.0, 12.0)
                        .setScale(0.9375)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(7.0, 0.0, 12.0)
                        .setScale(0.9375)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(7.0, 0.0, -12.0)
                        .setScale(0.9375))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(7.0, 0.0, -12.0)
                        .setScale(0.9375))
                .setFrontAxleOffset(12)
                .setRearAxleOffset(-12)
                .addSeat(Seat.of(0.0, 0.5, -2.0, true))
                .setEngineType(EngineType.ELECTRIC_MOTOR)
                .setEnginePower(14F)
                .setCanChangeWheels(true)
                .setColored(true));

        this.add(ModEntities.SPEED_BOAT.get(), VehicleProperties.builder()
                .setAxleOffset(2.5F)
                .setBodyPosition(PartPosition.create(0.0, -0.03125, 0.6875, 1.0))
                .setFuelPortPosition(PartPosition.create(0.0, 5.25, -20.5, -90.0, 0.0, 0.0, 0.65))
                .setDisplayPosition(PartPosition.create(0.0, 0.0, -0.65, 0.0, 0.0, 0.0, 1.25))
                .setHeldOffset(6.0, -0.5, 0.0)
                .setTrailerOffset(0.0, -0.09375, -0.75)
                .addSeat(Seat.of(0.0, 0.0, 0.0, true))
                .setEngineType(EngineType.LARGE_MOTOR)
                .setEnginePower(20F)
                .setColored(true));

        this.add(ModEntities.SPORTS_PLANE.get(), VehicleProperties.builder()
                .setBodyPosition(PartPosition.create(0.0, 0.0, -8.0 * 0.0625, 0.0, 0.0, 0.0, 1.8))
                .setFuelPortPosition(PartPosition.create(-4.35, 4.0, -6.0, 0.0, -112.5, 0.0, 0.25))
                .setKeyPortPosition(PartPosition.create(0.0, 3.75, 12.5, -67.5, 0.0, 0.0, 0.5))
                .setDisplayPosition(PartPosition.create(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.85))
                .setFrontAxleOffset(16.0)
                .setRearAxleOffset(-2.5)
                .addSeat(Seat.of(0.0, 0.0, 0.0, true))
                .setEngineType(EngineType.LARGE_MOTOR)
                .setEnginePower(24F)
                .addWheel(Wheel.builder()
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(0.0, -4.5, 20.25)
                        .setScale(0.45))
                .addWheel(Wheel.builder()
                        .setOffset(6.5, -4.5, 1.5)
                        .setScale(0.45))
                .addWheel(Wheel.builder()
                        .setOffset(-6.5, -4.5, 1.5)
                        .setScale(0.45))
                .setColored(true)
                .setCamera(CameraProperties.builder()
                        .setStrength(0.25F)
                        .setPosition(0, 2, 0)
                        .setDistance(7.0))
                .addExtended(PlaneProperties.builder()
                        .setFlapSensitivity(0.1F)
                        .setElevatorSensitivity(0.075F)
                        .setMaxTurnAngle(2F)
                        .build()));

        this.add(ModEntities.TRACTOR.get(), VehicleProperties.builder()
                .setAxleOffset(-3.0F)
                .setEnginePosition(PartPosition.create(0.0, 6.0, 7.5, 0.0, 0.0, 0.0, 0.85))
                .setFuelPortPosition(PartPosition.create(-6.0, 9.5, -0.5, 0.0, -90, 0.0, 0.3))
                .setKeyPortPosition(PartPosition.create(-2.75, 12.0, -1.75, -45.0, 0.0, 0.0, 0.5))
                .setDisplayPosition(PartPosition.create(1.25))
                .setHeldOffset(0.0, 3.5, 0.0)
                .setTowBarPosition(0.0, 0.0, -24.5)
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(8.0, 0.0, 14.0)
                        .setScale(0.9375F, 0F, 0F)
                        .setAutoScale(true)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(8.0, 0.0, 14.0)
                        .setScale(0.9375F, 0F, 0F)
                        .setAutoScale(true)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(8.0, 5.5, -14.5)
                        .setScale(1.875, 2.8, 2.8)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(8.0, 5.5, -14.5)
                        .setScale(1.875, 2.8, 2.8)
                        .setParticles(true))
                .setFrontAxleOffset(14.0)
                .setRearAxleOffset(-14.5)
                .addSeat(Seat.of(0.0, 9.0, -14.0, true))
                .setEngineType(EngineType.LARGE_MOTOR)
                .setEnginePower(8F)
                .setCanChangeWheels(true)
                .setColored(true));

        this.add(ModEntities.FERTILIZER.get(), VehicleProperties.builder()
                .setBodyPosition(PartPosition.create(0.0, 0.325, 0.0, 0.0, 0.0, 0.0, 1.1))
                .setDisplayPosition(PartPosition.create(0.0, 0.0, -0.15, 0.0, 0.0, 0.0, 1.35))
                .setColored(true));

        this.add(ModEntities.FLUID_TRAILER.get(), VehicleProperties.builder()
                .setBodyPosition(PartPosition.create(0.0, 0.325, 0.0, 0.0, 0.0, 0.0, 1.1))
                .setDisplayPosition(PartPosition.create(0.0, 0.0, -0.15, 0.0, 0.0, 0.0, 1.35))
                .setHeldOffset(0.0, 3.0, 0.0)
                .setColored(true));

        this.add(ModEntities.SEEDER.get(), VehicleProperties.builder()
                .setBodyPosition(PartPosition.create(0.0, 0.325, 0.0, 0.0, 0.0, 0.0, 1.1))
                .setDisplayPosition(PartPosition.create(0.0, 0.0, -0.15, 0.0, 0.0, 0.0, 1.35))
                .setColored(true));

        this.add(ModEntities.STORAGE_TRAILER.get(), VehicleProperties.builder()
                .setBodyPosition(PartPosition.create(0.0, 0.325, 0.0, 0.0, 0.0, 0.0, 1.1))
                .setDisplayPosition(PartPosition.create(0.0, 0.0, -0.15, 0.0, 0.0, 0.0, 1.35))
                .setTowBarPosition(0.0, 0.0, -12.0)
                .setColored(true));

        this.add(ModEntities.VEHICLE_TRAILER.get(), VehicleProperties.builder()
                .setBodyPosition(PartPosition.create(0.0, 0.325, 0.0, 0.0, 0.0, 0.0, 1.1))
                .setDisplayPosition(PartPosition.create(0.0, 0.0, -0.15, 0.0, 0.0, 0.0, 1.35))
                .setHeldOffset(0.0, 3.0, 0.0)
                .setColored(true));

        this.add(new ResourceLocation("vehicle", "bath"), VehicleProperties.builder()
                .setDisplayPosition(PartPosition.create(0.0, 0.0, -0.25, 0.0, 0.0, 0.0, 1.5))
                .setHeldOffset(4.0, 3.5, 0.0)
                .setTrailerOffset(0.0, 0.0, -0.4375)
                .addSeat(Seat.of(0.0, 0.0, 0.0, true))
                .setEngineType(EngineType.NONE)
                .setEnginePower(10F));

        this.add(new ResourceLocation("vehicle", "sofa_car"), VehicleProperties.builder()
                .setAxleOffset(-1.5F)
                .setBodyPosition(PartPosition.create(0.0, -0.0625, 0.0, 0.0, 0.0, 0.0, 1.0))
                .setFuelPortPosition(PartPosition.create(0.0, 2.0, 8.0, 0.0, 0.0, 0.0, 0.5))
                .setDisplayPosition(PartPosition.create(0.0, 0.0, -0.25, 0.0, 0.0, 0.0, 1.5))
                .setHeldOffset(2.0, 2.0, 0.0)
                .setTrailerOffset(0.0, 0.0, -0.25)
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(8.0, 0.0625, 7.0)
                        .setScale(1.1F))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(8.0, 0.0625, 7.0)
                        .setScale(1.1F))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(8.0, 0.0625, -7.0)
                        .setScale(1.1F)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(8.0, 0.0625, -7.0)
                        .setScale(1.1F)
                        .setParticles(true))
                .setFrontAxleOffset(7.0)
                .setRearAxleOffset(-7.0)
                .addSeat(Seat.of(0.0, 5.0, 0.0, true))
                .setEngineType(EngineType.SMALL_MOTOR)
                .setEnginePower(10F)
                .setCanChangeWheels(true));

        this.add(new ResourceLocation("vehicle", "sofacopter"), VehicleProperties.builder()
                .setBodyPosition(PartPosition.create(0.0, 0.0, 0.0625, 0.0, 0.0, 0.0, 1.0))
                .setFuelPortPosition(PartPosition.create(0.0, 1.5, 8.0, 0.0, 0.0, 0.0, 0.45))
                .setKeyPortPosition(PartPosition.create(-9.25, 8.0, 5.0, 0.0, 0.0, 0.0, 0.8))
                .setDisplayPosition(PartPosition.create(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.25))
                .addSeat(Seat.of(0.0, 0.0, 0.0, true))
                .setEngineType(EngineType.SMALL_MOTOR)
                .setEnginePower(15F));
    }
}
