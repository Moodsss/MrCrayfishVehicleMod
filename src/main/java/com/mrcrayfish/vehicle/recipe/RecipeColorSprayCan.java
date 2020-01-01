package com.mrcrayfish.vehicle.recipe;

import com.google.common.collect.Lists;
import com.mrcrayfish.vehicle.init.ModRecipes;
import com.mrcrayfish.vehicle.item.IDyeable;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.DyeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.SpecialRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.Tags;

import java.util.List;

/**
 * Author: MrCrayfish
 */
public class RecipeColorSprayCan extends SpecialRecipe
{
    public RecipeColorSprayCan(ResourceLocation id)
    {
        super(id);
    }

    @Override
    public boolean matches(CraftingInventory inventory, World worldIn)
    {
        ItemStack dyeableItem = ItemStack.EMPTY;
        List<ItemStack> dyes = Lists.newArrayList();

        for(int i = 0; i < inventory.getSizeInventory(); ++i)
        {
            ItemStack stack = inventory.getStackInSlot(i);
            if(!stack.isEmpty())
            {
                if(stack.getItem() instanceof IDyeable)
                {
                    if(!dyeableItem.isEmpty())
                    {
                        return false;
                    }
                    dyeableItem = stack.copy();
                }
                else
                {
                    if(!stack.getItem().isIn(Tags.Items.DYES))
                    {
                        return false;
                    }
                    dyes.add(stack);
                }
            }
        }

        return !dyeableItem.isEmpty() && !dyes.isEmpty();
    }

    @Override
    public ItemStack getCraftingResult(CraftingInventory inventory)
    {
        ItemStack dyeableItem = ItemStack.EMPTY;
        List<DyeItem> dyes = Lists.newArrayList();

        for(int i = 0; i < inventory.getSizeInventory(); ++i)
        {
            ItemStack stack = inventory.getStackInSlot(i);
            if(!stack.isEmpty())
            {
                if(stack.getItem() instanceof IDyeable)
                {
                    if(!dyeableItem.isEmpty())
                    {
                        return ItemStack.EMPTY;
                    }
                    dyeableItem = stack.copy();
                }
                else
                {
                    if(!(stack.getItem() instanceof DyeItem))
                    {
                        return ItemStack.EMPTY;
                    }
                    dyes.add((DyeItem) stack.getItem());
                }
            }
        }

        return !dyeableItem.isEmpty() && !dyes.isEmpty() ? IDyeable.dyeStack(dyeableItem, dyes) : ItemStack.EMPTY;
    }

    @Override
    public boolean canFit(int width, int height)
    {
        return width * height >= 2;
    }

    @Override
    public boolean isDynamic()
    {
        return true;
    }

    @Override
    public IRecipeSerializer<?> getSerializer()
    {
        return ModRecipes.COLOR_SPRAY_CAN;
    }
}
