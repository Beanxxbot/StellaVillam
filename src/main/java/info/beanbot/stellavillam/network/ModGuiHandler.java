package info.beanbot.stellavillam.network;

import info.beanbot.stellavillam.blocks.TileBlockCheesePress;
import info.beanbot.stellavillam.container.ContainerCheesePress;
import info.beanbot.stellavillam.gui.GuiCheesePress;
import info.beanbot.stellavillam.tile.TileCheesePress;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class ModGuiHandler implements IGuiHandler
{
    public static final int MOD_TILE_ENTITY_GUI = 0;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if (ID == MOD_TILE_ENTITY_GUI)
            return new ContainerCheesePress(player.inventory, (TileCheesePress) world.getTileEntity(new BlockPos(x, y, z)));

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == MOD_TILE_ENTITY_GUI)
            return new GuiCheesePress(player.inventory, (TileCheesePress) world.getTileEntity(new BlockPos(x, y, z)));

        return null;
    }

}
