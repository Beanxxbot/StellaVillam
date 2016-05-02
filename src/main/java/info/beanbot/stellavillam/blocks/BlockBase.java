package info.beanbot.stellavillam.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBase extends Block
{
    public BlockBase(String name, Material material, float hardness, float resistance)
    {
        super(material);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }

    public BlockBase(String name, float hardness, float resistance)
    {
        this(name, Material.rock, hardness, resistance);
    }

    public BlockBase(String name)
    {
        this(name, 2.0f, 10.0f);
    }

}
