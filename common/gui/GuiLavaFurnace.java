package communityMod.common.gui;

import org.lwjgl.opengl.GL11;

import communityMod.common.container.ContainerLavaFurnace;
import communityMod.common.entities.tile.TileEntityLavaFurnace;
import communityMod.textures.TextureHandler;

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
		int picture = mc.renderEngine.getTexture(TextureHandler.BLOCK_TEXTURE_A);  //No GUI texture
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(picture);
		int x = (this.width - this.xSize) / 2;
		int y = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(x, y, 0, 0, this.xSize, this.ySize);
	}
	
	@Override
    protected void drawGuiContainerForegroundLayer(int i, int j)
	{
		fontRenderer.drawString(entity.getInvName(), 60, 6, 4210752);;
        fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
	}

}
