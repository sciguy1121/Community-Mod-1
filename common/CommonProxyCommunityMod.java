package mods.communityMod.common;

import mods.communityMod.common.entities.EntityRobot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.EntityRegistry;

public class CommonProxyCommunityMod implements IGuiHandler{
    
	public void registerRenders(){
	}
	
	public void registerRenderInformation(){
	}
	
	public void init(){
		EntityRegistry.registerGlobalEntityID(EntityRobot.class, "Robot", EntityRegistry.findGlobalUniqueEntityId(), 23443223, 1312312312);
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
