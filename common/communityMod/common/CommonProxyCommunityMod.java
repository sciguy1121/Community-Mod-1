package communityMod.common;

import communityMod.common.entities.EntityRobot;

import cpw.mods.fml.common.registry.EntityRegistry;

public class CommonProxyCommunityMod {

	public void registerRenderInformation() {}

	public void init() {
		EntityRegistry.registerGlobalEntityID(EntityRobot.class, "Robot",
				EntityRegistry.findGlobalUniqueEntityId());
		registerRenderInformation();
	}

}
