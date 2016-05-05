package info.beanbot.stellavillam.proxy;

import info.beanbot.stellavillam.blocks.ModBlocks;
import info.beanbot.stellavillam.crafting.ModVanillaCrafting;
import info.beanbot.stellavillam.items.ModItems;
import info.beanbot.stellavillam.world.OreWorldGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.functions.ModIdFunction;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy
{
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent pre)
    {
        ModItems.createItems();
        ModBlocks.createBlocks();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent init)
    {
        ModVanillaCrafting.initCrafting();
        GameRegistry.registerWorldGenerator(new OreWorldGen(), 0);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent post)
    {

    }

}
