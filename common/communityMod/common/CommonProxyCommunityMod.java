package communityMod.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import communityMod.common.entities.EntityRobot;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.EntityRegistry;

public class CommonProxyCommunityMod implements IGuiHandler {

	public void registerRenders() {
	}

	public void registerRenderInformation() {
	}

	public void init() {
		EntityRegistry.registerGlobalEntityID(EntityRobot.class, "Robot",
				EntityRegistry.findGlobalUniqueEntityId());
		registerRenderInformation();
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		return null;
	}

}
