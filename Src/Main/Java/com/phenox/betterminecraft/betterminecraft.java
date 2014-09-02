package com.phenox.betterminecraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "betterminecraft", name = "Better Minecraft", version = "1.7.10-1.0")
public class betterminecraft
{

    @Mod.Instance("betterminecraft")
    public static betterminecraft instance;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void post(FMLPostInitializationEvent evet)
    {

    }
}
