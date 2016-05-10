package info.beanbot.stellavillam.world;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class GrassGen
{
    public static void init()
    {
        MinecraftForge.addGrassSeed(new ItemStack(Items.beetroot_seeds), 10);
    }

}
