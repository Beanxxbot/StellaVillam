package info.beanbot.stellavillam;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = StellaVillam.MODID, name = StellaVillam.MODNAME, version = StellaVillam.VERSION)
public class StellaVillam
{
    public static final String MODID = "stellavillam";
    public static final String MODNAME = "Stella Villam";
    public static final String VERSION = "1.9-0.1";

    @Mod.Instance
    public static StellaVillam instance = new StellaVillam();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent pre)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent init)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent post)
    {
        
    }

}
