package info.beanbot.stellavillam;

import info.beanbot.stellavillam.items.ModItems;
import info.beanbot.stellavillam.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = StellaVillam.MODID, name = StellaVillam.MODNAME, version = StellaVillam.VERSION)
public class StellaVillam
{
    public static final String MODID = "stellavillam";
    public static final String MODNAME = "Stella Villam";
    public static final String VERSION = "1.9-0.1";

    @SidedProxy(clientSide="info.beanbot.stellavillam.proxy.ClientProxy", serverSide="info.beanbot.stellavillam.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static StellaVillam instance = new StellaVillam();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent pre)
    {
        this.proxy.preInit(pre);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent init)
    {
        this.proxy.init(init);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent post)
    {
        this.proxy.postInit(post);
    }



}
