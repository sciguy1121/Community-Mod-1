package mods.communityMod.common.entities;

import mods.communityMod.common.IDsHelper;
import mods.communityMod.common.items.ItemsHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityRobot extends EntityMob{
    
	public EntityRobot(World par1World){
		super(par1World);
		this.texture = "textures/mob/Robot.png";
		this.moveSpeed = 0.35F;
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(0, new EntityAIBreakDoor(this));
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, this.moveSpeed, true));
		this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(3, new EntityAIMoveTowardsTarget(this, 0.22F, 32.0F));
		this.tasks.addTask(4, new EntityAIWander(this, this.moveSpeed));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityLiving.class, 16.0F, 0, true, false, IMob.mobSelector));
		this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
	}
	
	protected String getLivingSound(){
		return null;
	}
	
	protected String getHurtSound(){
		return null;
	}
	
	protected String getDeathSound(){
		return null;
	}
	
	protected void playStepSound(int par1, int par2, int par3, int par4){
		this.worldObj.playSoundAtEntity(this, null, 0.15F, 1.0F);
	}
	
	public int getTatalArmorValue(){
		return 20;
	}
	
	protected boolean isAIEnabled(){
		return true;
	}
	
	public int getMaxHealth() {
		return 100;
	}
	
	public int getAttackStrength(Entity par1Entity){
		return 10;
	}
	
	public EnumCreatureAttribute getCreatureAttribute(){
		return EnumCreatureAttribute.UNDEFINED;
	}
	
	protected int getDropItemId(){
		return IDsHelper.siliconChipID;
	}
	
	protected void dropRareDrop(int par1){
		switch(this.rand.nextInt(2)){
            case 0:
                this.dropItem(IDsHelper.siliconBlockID, 2);
            case 1:
                this.dropItem(IDsHelper.siliconIngotID, 10);
		}
	}
	
}