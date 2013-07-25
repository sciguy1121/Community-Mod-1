package communityMod.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.world.World;

public interface IGuiTile {
	
	public Container getContainer(World world, int x, int y, int z, EntityPlayer player);
	
	public GuiContainer getGuiContainer(World world, int x, int y, int z, EntityPlayer player);

}
