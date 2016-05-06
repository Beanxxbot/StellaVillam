package info.beanbot.stellavillam.crafting;

import info.beanbot.stellavillam.blocks.ModBlocks;
import info.beanbot.stellavillam.items.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModVanillaCrafting
{
    public static void initCrafting()
    {
        //Meals
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cheese), new ItemStack(Items.milk_bucket.setContainerItem(Items.bucket)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.mealArtichokeDip), new ItemStack(ModItems.foodArtichoke), new ItemStack(Items.milk_bucket.setContainerItem(Items.bucket)), new ItemStack(Items.bowl));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.autumnsBounty), new ItemStack(ModItems.foodYam), new ItemStack(ModItems.foodYam), new ItemStack(Blocks.pumpkin), new ItemStack(Blocks.pumpkin), new ItemStack(Items.bowl));

        //Ores
        GameRegistry.addSmelting(ModBlocks.copperOre, new ItemStack(ModItems.copperIngot), 1.0F);
        GameRegistry.addSmelting(ModBlocks.iridiumOre, new ItemStack(ModItems.iridiumIngot), 1.0F);
        GameRegistry.addSmelting(Items.quartz, new ItemStack(ModItems.refinedQuartz), 1.0F);
    }

}
