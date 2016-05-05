package info.beanbot.stellavillam.proxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy extends CommonProxy
{
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent pre)
    {
        super.preInit(pre);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent init)
    {
        super.init(init);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent post)
    {
        super.postInit(post);
    }

}
