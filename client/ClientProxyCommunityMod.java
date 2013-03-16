package mods.communityMod.client;

import mods.communityMod.common.CommonProxyCommunityMod;
import mods.communityMod.textures.TextureHandler;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxyCommunityMod extends CommonProxyCommunityMod{
	
	@Override
	public void registerRenders(){
		MinecraftForgeClient.preloadTexture(TextureHandler.BLOCK_TEXTURE_A);
		MinecraftForgeClient.preloadTexture(TextureHandler.ITEM_TEXTURE_A);
		MinecraftForgeClient.preloadTexture(TextureHandler.MACHINE_TEXTURE_A);
	}
	
}
