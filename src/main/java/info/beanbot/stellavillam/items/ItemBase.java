package info.beanbot.stellavillam.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item
{
    public ItemBase(String name)
    {
        super();
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabMisc);
    }

}
