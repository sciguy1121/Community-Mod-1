package mods.communityMod.common.entities;

import mods.communityMod.common.items.ItemsHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;

public class EntityRobot extends EntityLiving{
    
	public EntityRobot(World par1World) {
		super(par1World);
		this.texture = "/textures/mob/Robot.png";
		this.getNavigator().setAvoidsWater(true);
	}

	public int getMaxHealth(){
		return 15;
	}
	
	public boolean isAIEnabled(){
		return true;
	}
	
	public int getDropItemId()
	{
		return ItemsHelper.siliconChip.itemID;
	}
	
}
