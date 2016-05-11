package info.beanbot.stellavillam.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks
{
    public static Block copperOre;
    public static Block iridiumOre;

    public static Block cheesePress;

    @SuppressWarnings("deprecated")
    public static void createBlocks()
    {

        GameRegistry.registerBlock(copperOre = new BlockBase("copperOre").setCreativeTab(CreativeTabs.tabBlock), "copperOre").setHarvestLevel("pickaxe", 1);
        GameRegistry.registerBlock(iridiumOre = new BlockBase("iridiumOre").setCreativeTab(CreativeTabs.tabBlock), "iridiumOre").setHarvestLevel("pickaxe", 3);

        GameRegistry.registerBlock(cheesePress = new TileBlockCheesePress().setCreativeTab(CreativeTabs.tabMisc), "cheesePress").setHarvestLevel("axe", 0);
    }

}
