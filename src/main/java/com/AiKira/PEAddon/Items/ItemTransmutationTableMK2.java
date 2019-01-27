package com.AiKira.PEAddon.Items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemTransmutationTableMK2 extends Item
{
	public ItemTransmutationTableMK2()
	{
		setMaxStackSize(1);
	}

	@Override
	public boolean hasEffect(ItemStack stack)
	{
		return stack.hasTagCompound() && stack.getTagCompound().hasKey("id");
	}
	
	@Override
	public EnumRarity getRarity(ItemStack stack)
	{
		return EnumRarity.RARE;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World world, List<String> tooltip, ITooltipFlag flag)
	{
		if (stack.hasTagCompound() && stack.getTagCompound().hasKey("name"))
		{
			tooltip.add(stack.getTagCompound().getString("name"));
		}
	}
}
