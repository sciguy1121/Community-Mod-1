package communityMod.client.gui;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import communityMod.common.entities.tile.TileEntityLavaFurnace;
import communityMod.common.entities.tile.TileEntityLogger;
import communityMod.common.entities.tile.TileEntityResearcher;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	
	public static List<IGuiTile> guitiles = new ArrayList<IGuiTile>();
	
	public static void registerGuiTile(IGuiTile tile)
	{
		guitiles.add(tile);
	}
	
	static
	{
		registerGuiTile((IGuiTile)new TileEntityLavaFurnace());
		registerGuiTile((IGuiTile)new TileEntityLogger());
		registerGuiTile((IGuiTile)new TileEntityResearcher());
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		for(IGuiTile tile : guitiles)
		{
			if(tile.getContainer(world, x, y, z, player) != null)
			{
				return tile.getContainer(world, x, y, z, player);
			}
		}

		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		for(IGuiTile tile : guitiles)
		{
			if(tile.getGuiContainer(world, x, y, z, player) != null)
			{
				return tile.getGuiContainer(world, x, y, z, player);
			}
		}

		return null;
	}

}
