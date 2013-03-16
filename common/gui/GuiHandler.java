package mods.communityMod.common.gui;


import mods.communityMod.common.container.ContainerLavaFurnace;
import mods.communityMod.common.container.ContainerLogger;
import mods.communityMod.common.container.ContainerResearcher;
import mods.communityMod.common.entities.tile.TileEntityLavaFurnace;
import mods.communityMod.common.entities.tile.TileEntityLogger;
import mods.communityMod.common.entities.tile.TileEntityResearcher;
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
		
		if (entity instanceof TileEntityResearcher)
		{
			return new ContainerResearcher((TileEntityResearcher)entity, player.inventory);
		}
		
		if (entity instanceof TileEntityLogger)
		{
			return new ContainerLogger((TileEntityLogger)entity, player.inventory);
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
		
		if(entity instanceof TileEntityResearcher)
		{
			return new GuiResearcher((TileEntityResearcher)entity, player.inventory);
		}
		
		if(entity instanceof TileEntityLogger)
		{
			return new GuiLogger((TileEntityLogger)entity, player.inventory);
		}
		
		return null;
	}

}
