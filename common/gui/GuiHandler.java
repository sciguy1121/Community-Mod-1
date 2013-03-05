package communityMod.common.gui;

import communityMod.common.container.ContainerLavaFurnace;
import communityMod.common.entities.tile.TileEntityLavaFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;;

public class GuiHandler implements IGuiHandler
{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		TileEntity entity = world.getBlockTileEntity(x, y, z);
		if (entity instanceof TileEntityLavaFurnace)
		{
			return new ContainerLavaFurnace((TileEntityLavaFurnace)entity, player.inventory);
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		TileEntity entity = world.getBlockTileEntity(x, y, z);
		if (entity instanceof TileEntityLavaFurnace)
		{
			return new GuiLavaFurnace((TileEntityLavaFurnace)entity, player.inventory);
		}
		return null;
	}

}
