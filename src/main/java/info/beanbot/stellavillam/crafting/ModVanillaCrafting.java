package info.beanbot.stellavillam.crafting;

import info.beanbot.stellavillam.blocks.ModBlocks;
import info.beanbot.stellavillam.items.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModVanillaCrafting
{
    public static void initCrafting()
    {
        GameRegistry.addSmelting(ModBlocks.copperOre, new ItemStack(ModItems.copperIngot), 1.0F);
        GameRegistry.addSmelting(ModBlocks.iridiumOre, new ItemStack(ModItems.iridiumIngot), 1.0F);
        GameRegistry.addSmelting(Items.quartz, new ItemStack(ModItems.refinedQuartz), 1.0F);
    }

}
