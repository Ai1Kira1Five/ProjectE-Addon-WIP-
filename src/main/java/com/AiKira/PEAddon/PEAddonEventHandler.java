package com.AiKira.PEAddon;

import com.AiKira.PEAddon.Items.ItemTransmutationTableMK2;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = PE_Addon.MODID)
public class PEAddonEventHandler {
	private static Item withName(Item item, String name)
	{
		item.setCreativeTab(PE_Addon.PEA_Tab_Main);
		item.setRegistryName(name);
		item.setTranslationKey(PE_Addon.MODID + "." + name);
		
		return item;
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		IForgeRegistry<Item> r = event.getRegistry();
		
		r.register(withName(new ItemTransmutationTableMK2(), "transmutation_table_MK2"));
	}
}
