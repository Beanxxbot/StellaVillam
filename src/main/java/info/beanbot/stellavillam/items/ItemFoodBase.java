package info.beanbot.stellavillam.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

public class ItemFoodBase extends ItemFood{

    public ItemFoodBase(String name, int amount, float saturation, boolean isWolfFood, PotionEffect... effects) {
        super(amount, saturation, isWolfFood);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabFood);
    }

}
