package mods.communityMod.common.gui;

import org.lwjgl.opengl.GL11;


import mods.communityMod.common.container.ContainerLavaFurnace;
import mods.communityMod.common.entities.tile.TileEntityLavaFurnace;
import mods.communityMod.textures.TextureHandler;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.StatCollector;

public class GuiLavaFurnace extends GuiContainer
{
	private TileEntityLavaFurnace entity;

	public GuiLavaFurnace(TileEntityLavaFurnace entity,	InventoryPlayer inventory)
	{
		super(new ContainerLavaFurnace(entity, inventory));
		
		this.entity = entity;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) 
	{
		int picture = mc.renderEngine.getTexture(TextureHandler.LAVAFURNACE_GUI); 
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		//this.mc.renderEngine.bindTexture(picture);
		int x = (this.width - this.xSize) / 2;
		int y = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(x, y, 0, 0, this.xSize, this.ySize);
		
		int progress = entity.furnaceBurnTime;
		int heat = entity.heat;
		
		if(progress != 0)
		{
			progress = progress / 4;
		}
		if(heat != 0)
		{
			heat = heat / 12;
			if(entity.active)
			{
				this.drawTexturedModalRect(x + 83, y + 47 + 12 - heat, 176, 4 - heat, 28, heat + 10);
			}
		}
		
		this.drawTexturedModalRect(x + 82, y + 23, 176, 14, progress - 1, 16);
	}
	
	@Override
    protected void drawGuiContainerForegroundLayer(int i, int j)
	{
		fontRenderer.drawString(entity.getInvName(), 56, 6, 4210752);
        fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
	}

}
