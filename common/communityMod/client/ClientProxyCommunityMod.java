package communityMod.client;

import mods.communityMod.textures.TextureHandler;
import net.minecraftforge.client.MinecraftForgeClient;

import communityMod.common.CommonProxyCommunityMod;
import communityMod.common.entities.EntityRobot;
import communityMod.common.entities.EntityScientist;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxyCommunityMod extends CommonProxyCommunityMod {
    
	@Override
	public void registerRenderInformation() {
		RenderingRegistry.registerEntityRenderingHandler(EntityRobot.class, new RenderRobot(new ModelRobot(), 2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityScientist.class, new RenderScientist(new ModelScientist(), 2F));
	}
    
	@Override
	public void registerRenders() {
		MinecraftForgeClient.preloadTexture(TextureHandler.BLOCK_TEXTURE_A);
		MinecraftForgeClient.preloadTexture(TextureHandler.ITEM_TEXTURE_A);
		MinecraftForgeClient.preloadTexture(TextureHandler.MACHINE_TEXTURE_A);
	}
    
}