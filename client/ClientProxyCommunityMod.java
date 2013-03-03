package communityMod.client;

import net.minecraftforge.client.MinecraftForgeClient;
import communityMod.common.CommonProxyCommunityMod;
import communityMod.textures.TextureHandler;

public class ClientProxyCommunityMod extends CommonProxyCommunityMod{
	
	@Override
	public void registerRenders(){
		MinecraftForgeClient.preloadTexture(TextureHandler.BLOCK_TEXTURE_A);
		MinecraftForgeClient.preloadTexture(TextureHandler.ITEM_TEXTURE_A);
	}
	
}
