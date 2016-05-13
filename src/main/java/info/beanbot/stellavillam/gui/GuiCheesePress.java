package info.beanbot.stellavillam.gui;

import info.beanbot.stellavillam.container.ContainerCheesePress;
import info.beanbot.stellavillam.tile.TileCheesePress;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

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
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        String s = "Cheese Press";
        this.fontRendererObj.drawString(s, 88 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);            //#404040
        this.fontRendererObj.drawString(this.playerInv.getDisplayName().getUnformattedText(), 8, 72, 4210752);      //#404040
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(new ResourceLocation("stellavillam:textures/gui/container/cheesePress.png"));
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
    }

}
