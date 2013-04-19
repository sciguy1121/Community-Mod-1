package communityMod.client;

import communityMod.common.CommonProxyCommunityMod;
import communityMod.common.entities.EntityRobot;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxyCommunityMod extends CommonProxyCommunityMod {

	@Override
	public void registerRenderInformation() {
		RenderingRegistry.registerEntityRenderingHandler(EntityRobot.class,
				new RenderRobot(new ModelRobot(), 2F));
	}

}