package mods.communityMod.common.gui;

import org.lwjgl.opengl.GL11;

import mods.communityMod.common.container.ContainerResearcher;
import mods.communityMod.common.entities.tile.TileEntityResearcher;
import mods.communityMod.textures.TextureHandler;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.StatCollector;

public class GuiResearcher extends GuiContainer{

	private TileEntityResearcher entity;
	
	public GuiResearcher(TileEntityResearcher par1Entity, InventoryPlayer inv) {
		super(new ContainerResearcher(par1Entity, inv));
		
		this.entity = par1Entity;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) 
	{
		this.mc.renderEngine.func_98187_b(TextureHandler.RESEARCHER_GUI); 
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		int x = (this.width - this.xSize) / 2;
		int y = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(x, y, 0, 0, this.xSize, this.ySize);
		
		int progress = entity.progress;
		
		this.drawTexturedModalRect(x + 79, y + 35, 176, 14, progress - 1, 16);
	}
	
	@Override
    protected void drawGuiContainerForegroundLayer(int i, int j)
	{
		fontRenderer.drawString(entity.getInvName(), 56, 6, 4210752);
        fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
	}
	
}
