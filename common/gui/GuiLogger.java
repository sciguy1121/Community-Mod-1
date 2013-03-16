package mods.communityMod.common.gui;

import org.lwjgl.opengl.GL11;


import mods.communityMod.common.container.ContainerLavaFurnace;
import mods.communityMod.common.container.ContainerLogger;
import mods.communityMod.common.entities.tile.TileEntityLogger;
import mods.communityMod.textures.TextureHandler;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.StatCollector;

public class GuiLogger extends GuiContainer
{

	private TileEntityLogger entity;

	public GuiLogger(TileEntityLogger entity,	InventoryPlayer inventory)
	{
		super(new ContainerLogger(entity, inventory));
		
		this.entity = entity;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) 
	{
		int picture = mc.renderEngine.getTexture(TextureHandler.LOGGER_GUI); 
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		//this.mc.renderEngine.bindTexture(picture);
		int x = (this.width - this.xSize) / 2;
		int y = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(x, y, 0, 0, this.xSize, this.ySize);
		
		int progress = entity.progress;
		int burn = entity.burning;
		
		if(progress != 0)
		{
			progress = progress / 2;
		}
		if (burn > 0)
	    {
	        burn = entity.burning / 12 * 200;
	        this.drawTexturedModalRect(x + 56, y + 36 + 12 - burn, 176, 12 - burn, 15, burn + 2);
	    }
		
		this.drawTexturedModalRect(x + 79, y + 35, 176, 14, progress - 5, 16);
	}
	
	@Override
    protected void drawGuiContainerForegroundLayer(int i, int j)
	{
		fontRenderer.drawString(entity.getInvName(), (this.xSize / 2) - (entity.getInvName().length() / 2) - 7, 6, 4210752);
        fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
	}

}
