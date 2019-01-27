package com.AiKira.PEAddon.client;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import com.AiKira.PEAddon.PE_Addon;
import com.AiKira.PEAddon.Items.ModItems;


@Mod.EventBusSubscriber(modid = PE_Addon.MODID, value = Side.CLIENT)
public class PEAddonClientEventHandler {
	private static void addModel(Item item, String variant)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), variant));
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event)
	{
		addModel(ModItems.Transmutation_Table_Mk2, "inventory");
	}
}
