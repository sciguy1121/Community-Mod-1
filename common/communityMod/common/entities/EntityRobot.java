package communityMod.common.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import communityMod.common.blocks.BlocksHelper;
import communityMod.common.items.ItemsHelper;

public class EntityRobot extends EntityMob {
    
	private String texture;
    private float moveSpeed;

    public EntityRobot(World par1World) {
		super(par1World);
		this.texture = "/assets/communityMod/textures/mob/Robot.png";
		this.moveSpeed = 0.35F;
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(0, new EntityAIBreakDoor(this));
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, this.moveSpeed,
                                                          true));
		this.tasks.addTask(2, new EntityAIWatchClosest(this,
                                                       EntityPlayer.class, 6.0F));
		this.tasks
        .addTask(3, new EntityAIMoveTowardsTarget(this, 0.22F, 32.0F));
		this.tasks.addTask(4, new EntityAIWander(this, this.moveSpeed));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this,
                                                                        EntityLiving.class, 0, true, false, IMob.mobSelector));
		this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
	}
    
	@Override
	protected String getLivingSound() {
		return null;
	}
    
	@Override
	protected String getHurtSound() {
		return null;
	}
    
	@Override
	protected String getDeathSound() {
		return null;
	}
    
	@Override
	protected void playStepSound(int par1, int par2, int par3, int par4) {
		this.worldObj.playSoundAtEntity(this, null, 0.15F, 1.0F);
	}
    
	public int getTatalArmorValue() {
		return 50;
	}
    
	@Override
	protected boolean isAIEnabled() {
		return true;
	}
    
	/*@Override
	public int getMaxHealth() {
		return 200;
	}
    
	@Override
	public int getAttackStrength(Entity par1Entity) {
		return 30;
	}*/
    
	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}
    
	@Override
	protected int getDropItemId() {
		return ItemsHelper.siliconChip.itemID;
	}
    
	@Override
	protected void dropRareDrop(int par1) {
		switch (this.rand.nextInt(2)) {
			case 0:
				this.dropItem(BlocksHelper.siliconBlock.blockID, 2);
			case 1:
				this.dropItem(ItemsHelper.siliconIngot.itemID, 10);
		}
	}
    
}