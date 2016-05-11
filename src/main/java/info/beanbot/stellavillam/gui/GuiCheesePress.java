package info.beanbot.stellavillam.gui;

import info.beanbot.stellavillam.container.ContainerCheesePress;
import info.beanbot.stellavillam.tile.TileCheesePress;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.IInventory;

public class GuiCheesePress extends GuiContainer
{
    private IInventory playerInv;
    private TileCheesePress te;

    public GuiCheesePress(IInventory playerInv, TileCheesePress te)
    {
        super(new ContainerCheesePress(playerInv, te));

        this.playerInv = playerInv;
        this.te = te;

        this.xSize = 176;
        this.ySize = 116;
    }

    public GuiCheesePress(ContainerCheesePress containerCheesePress) {
        super(containerCheesePress);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {

    }

}
