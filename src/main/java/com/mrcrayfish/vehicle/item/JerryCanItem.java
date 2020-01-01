package com.mrcrayfish.vehicle.item;

import com.mrcrayfish.vehicle.VehicleMod;
import com.mrcrayfish.vehicle.util.CommonUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;

import javax.annotation.Nullable;
import java.text.DecimalFormat;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Author: MrCrayfish
 */
public class JerryCanItem extends Item
{
    private final DecimalFormat FUEL_FORMAT = new DecimalFormat("0.#%");

    private final int capacity;
    private final int fillRate;

    public JerryCanItem(String id, int capacity, int fillRate)
    {
        super(new Item.Properties().maxStackSize(1).group(VehicleMod.CREATIVE_TAB));
        this.setRegistryName(id);
        this.capacity = capacity;
        this.fillRate = fillRate;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        if(Screen.hasShiftDown())
        {
            String info = I18n.format(this.getTranslationKey() + ".info");
            tooltip.addAll(Minecraft.getInstance().fontRenderer.listFormattedStringToWidth(info, 150).stream().map((Function<String, ITextComponent>) StringTextComponent::new).collect(Collectors.toList()));
        }
        else
        {
            String currentFuel = TextFormatting.RESET + FUEL_FORMAT.format(getCurrentFuel(stack) / (float) getCapacity(stack));
            tooltip.add(new StringTextComponent(TextFormatting.AQUA + TextFormatting.BOLD.toString() + I18n.format(this.getTranslationKey() + ".fuel", currentFuel)));
            tooltip.add(new StringTextComponent(TextFormatting.YELLOW + I18n.format("vehicle.info_help")));
        }
    }

    public int getCurrentFuel(ItemStack stack)
    {
        if(!stack.isEmpty() && stack.getItem() == this)
        {
            CompoundNBT compound = stack.getTag();
            if(compound != null)
            {
                return compound.getInt("Fuel");
            }
        }
        return 0;
    }

    public boolean isFull(ItemStack stack)
    {
        return getCurrentFuel(stack) == getCapacity(stack);
    }

    public int fill(ItemStack stack, int fuel)
    {
        int capacity = getCapacity(stack);
        int currentFuel = getCurrentFuel(stack);
        int newFuel = Math.min(currentFuel + fuel, capacity);
        CompoundNBT compound = CommonUtils.getOrCreateStackTag(stack);
        compound.putInt("Fuel", newFuel);
        return Math.max(0, currentFuel + fuel - capacity);
    }

    public int drain(ItemStack stack, int maxAmount)
    {
        int currentFuel = getCurrentFuel(stack);
        int remainingFuel = Math.max(0, currentFuel - maxAmount);
        CompoundNBT compound = CommonUtils.getOrCreateStackTag(stack);
        compound.putInt("Fuel", remainingFuel);
        return currentFuel - remainingFuel;
    }

    public static void setCurrentFuel(ItemStack stack, int fuel)
    {
        CompoundNBT compound = CommonUtils.getOrCreateStackTag(stack);
        compound.putInt("Fuel", fuel);
    }

    public int getCapacity(ItemStack stack)
    {
        if(!stack.isEmpty() && stack.getItem() instanceof JerryCanItem)
        {
            CompoundNBT compound = stack.getTag();
            if(compound != null && compound.contains("Capacity", Constants.NBT.TAG_INT))
            {
                int capacity = compound.getInt("Capacity");
                return capacity > 0 ? capacity : this.capacity;
            }
        }
        return this.capacity;
    }

    public int getFillRate(ItemStack stack)
    {
        if(!stack.isEmpty() && stack.getItem() instanceof JerryCanItem)
        {
            CompoundNBT compound = stack.getTag();
            if(compound != null && compound.contains("FillRate", Constants.NBT.TAG_INT))
            {
                int fillRate = compound.getInt("FillRate");
                return fillRate > 0 ? fillRate : this.fillRate;
            }
        }
        return this.fillRate;
    }

    @Override
    public boolean showDurabilityBar(ItemStack stack)
    {
        CompoundNBT compound = stack.getTag();
        if(compound != null && compound.contains("Fuel", Constants.NBT.TAG_INT))
        {
            float fuel = compound.getInt("Fuel");
            return fuel < this.capacity;
        }
        return false;
    }

    @Override
    public double getDurabilityForDisplay(ItemStack stack)
    {
        CompoundNBT compound = stack.getTag();
        if(compound != null && compound.contains("Fuel", Constants.NBT.TAG_INT))
        {
            double fuel = compound.getInt("Fuel");
            return 1.0 - (fuel / (double) this.capacity);
        }
        return 1.0;
    }

    @Override
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged)
    {
        return slotChanged;
    }
}
