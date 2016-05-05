package info.beanbot.stellavillam.client.render.items;

import info.beanbot.stellavillam.StellaVillam;
import info.beanbot.stellavillam.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister
{
    public static void registerItemRender()
    {
        register(ModItems.copperIngot);
        register(ModItems.iridiumIngot);
        register(ModItems.refinedQuartz);
    }

    public static void register(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(StellaVillam.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
