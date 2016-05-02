package info.beanbot.stellavillam.client.render.blocks;

import info.beanbot.stellavillam.StellaVillam;
import info.beanbot.stellavillam.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister
{
    public static void registerBlockRender()
    {
        register(ModBlocks.copperOre);
        register(ModBlocks.iridiumOre);
    }

    public static void register(Block block)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(StellaVillam.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));    }

}
