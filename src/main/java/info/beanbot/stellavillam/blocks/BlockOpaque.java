package info.beanbot.stellavillam.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;

public class BlockOpaque extends Block {

    public BlockOpaque(String name, Material material, float hardness, float resistance)
    {
        super(material);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }

    public BlockOpaque(String name, float hardness, float resistance)
    {
        this(name, Material.rock, hardness, resistance);
    }

    public BlockOpaque(String name)
    {
        this(name, 2.0f, 10.0f);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state){return false;}
}
