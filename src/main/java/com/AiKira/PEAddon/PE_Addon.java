package com.AiKira.PEAddon;

import moze_intel.projecte.PECore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

import com.AiKira.PEAddon.Items.ModItems;

@Mod(
		modid = PE_Addon.MODID,
		name = PE_Addon.NAME, 
		version = PE_Addon.VERSION,
		dependencies = "required-after:" + PECore.MODID
	)

public class PE_Addon
{
    public static final String MODID = "pe addon";
    public static final String NAME = "ProjectE Addons";
    public static final String VERSION = "1.0-pre-alpha";

    public static final CreativeTabs PEA_Tab_Main = new CreativeTabs(MODID){
    	@Override
    	public ItemStack createIcon(){
    		return new ItemStack(ModItems.Transmutation_Table_Mk2);
    	}
    };

    @Mod.Instance(MODID)
    public static PE_Addon INSTANCE;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	
    }
}
