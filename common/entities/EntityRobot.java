package mods.communityMod.common.entities;

<<<<<<< HEAD:common/entities/EntityRobot.java
import mods.communityMod.common.items.ItemsHelper;
=======
import net.minecraft.entity.Entity;
>>>>>>> Added more attributes to Robot:common/EntityRobot.java
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityRobot extends EntityLiving{
    
	public EntityRobot(World par1World) {
		super(par1World);
		this.texture = "/mob/Robot.png";
		this.getNavigator().setAvoidsWater(true);
		this.moveSpeed = 0.23F;
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
	}
	
	
	
	protected void entityInit(){
        super.entityInit();
        this.dataWatcher.addObject(13, new Byte((byte)0));
    }
	
	protected String getLivingSound(){
        return "none";
    }
	
	protected String getDeathSound(){
        return "none";
    }
	
	protected String getHurtSound(){
        return "none";
    }
	
	protected boolean canDespawn(){
        return false;
    }
	
	protected void fall(float par1){
		
	}

	public int getMaxHealth(){
		return 50;
	}
	
	public boolean isAIEnabled(){
		return true;
	}
	
	public int getDropItemId()
	{
		return ItemsHelper.siliconChip.itemID;
	}
	
	public void initCreature()
    {
        if (this.worldObj.rand.nextInt(100) == 0)
        {
            EntityRobot entityrobot = new EntityRobot(this.worldObj);
            entityrobot.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
            entityrobot.initCreature();
            this.worldObj.spawnEntityInWorld(entityrobot);
        }
    }
}
