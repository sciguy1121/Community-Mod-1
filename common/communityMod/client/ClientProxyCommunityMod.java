package communityMod.client;

import net.minecraftforge.client.MinecraftForgeClient;
import communityMod.common.CommonProxyCommunityMod;
import communityMod.common.entities.EntityRobot;
import communityMod.common.entities.EntityScientist;
import communityMod.common.items.ItemsHelper;
//import communityMod.common.entities.EntityScientist;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxyCommunityMod extends CommonProxyCommunityMod {
    
	@Override
	public void registerRenderInformation() {
		RenderingRegistry.registerEntityRenderingHandler(EntityRobot.class, new RenderRobot(new ModelRobot(), 2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityScientist.class, new RenderScientist(new ModelScientist(), 2F));
		
		MinecraftForgeClient.registerItemRenderer(ItemsHelper.robotModel.itemID, new ItemRendererRobotModel());
	}
	
}