package communityMod.common;

import communityMod.common.entities.EntityRobot;
import communityMod.common.entities.EntityScientist;

import cpw.mods.fml.common.registry.EntityRegistry;

public class CommonProxyCommunityMod {
    
	public void registerRenderInformation() {}
    
	public void init() {
		EntityRegistry.registerGlobalEntityID(EntityRobot.class, "Robot", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerGlobalEntityID(EntityScientist.class, "Scientist", EntityRegistry.findGlobalUniqueEntityId());
		registerRenderInformation();
	}
       
}