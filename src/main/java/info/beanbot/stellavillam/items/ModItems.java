package info.beanbot.stellavillam.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems
{
    public static Item copperIngot;
    public static Item iridiumIngot;
    public static Item refinedQuartz;

    public static void createItems()
    {
        GameRegistry.registerItem(copperIngot = new ItemBase("copperIngot"), "copperIngot");
        GameRegistry.registerItem(iridiumIngot = new ItemBase("iridiumIngot"), "iridiumIngot");
        GameRegistry.registerItem(refinedQuartz = new ItemBase("refinedQuartz"), "refinedQuartz");
    }

}
