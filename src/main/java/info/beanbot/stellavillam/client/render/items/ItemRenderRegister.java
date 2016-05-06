package info.beanbot.stellavillam.client.render.items;

import info.beanbot.stellavillam.StellaVillam;
import info.beanbot.stellavillam.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;

public final class ItemRenderRegister
{
    public static void registerItemRender()
    {
        register(ModItems.copperIngot);
        register(ModItems.iridiumIngot);
        register(ModItems.refinedQuartz);
        register(ModItems.foodCauliflower);
        register(ModItems.foodGarlic);
        register(ModItems.foodGreenBean);
        register(ModItems.foodKale);
        register(ModItems.foodParsnip);
        register(ModItems.foodRhubarb);
        register(ModItems.foodStrawberry);
        register(ModItems.foodBlueberry);
        register(ModItems.foodCorn);
        register(ModItems.foodHotPepper);
        register(ModItems.foodRadish);
        register(ModItems.foodRedCabbage);
        register(ModItems.foodStarfruit);
        register(ModItems.foodTomato);
        register(ModItems.foodArtichoke);
        register(ModItems.foodBokChoy);
        register(ModItems.foodCranberries);
        register(ModItems.foodEggplant);
        register(ModItems.foodGrape);
        register(ModItems.foodYam);
        register(ModItems.foodSweetGemBerry);
        register(ModItems.foodAncientFruit);
        register(ModItems.cheese);
        register(ModItems.mealArtichokeDip);
        register(ModItems.autumnsBounty);
    }

    public static void register(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(StellaVillam.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
