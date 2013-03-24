package mods.communityMod.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import mods.communityMod.common.CommonProxyCommunityMod;
import mods.communityMod.common.entities.EntityRobot;
import mods.communityMod.textures.TextureHandler;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxyCommunityMod extends CommonProxyCommunityMod{
	
	public void registerRenderInformation(){
		RenderingRegistry.registerEntityRenderingHandler(EntityRobot.class, new RenderRobot(new ModelRobot(), 1.0F));
	}
	
	@Override
	public void registerRenders(){
		MinecraftForgeClient.preloadTexture(TextureHandler.BLOCK_TEXTURE_A);
		MinecraftForgeClient.preloadTexture(TextureHandler.ITEM_TEXTURE_A);
		MinecraftForgeClient.preloadTexture(TextureHandler.MACHINE_TEXTURE_A);
	}
	
}