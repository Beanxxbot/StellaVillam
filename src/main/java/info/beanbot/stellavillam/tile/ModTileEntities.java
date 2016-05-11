package info.beanbot.stellavillam.tile;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTileEntities
{
    public static void init()
    {
        GameRegistry.registerTileEntity(TileCheesePress.class, "cheesePress_tile_entity");
    }

}
