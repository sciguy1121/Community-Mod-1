package communityMod.common.items;

import communityMod.common.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import communityMod.common.entities.EntityRobot;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemRobotModel extends Item {

	public ItemRobotModel(int id) {
		super(id);
		this.setUnlocalizedName("RobotModel");
	}

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        super.registerIcons(iconRegister);
        this.itemIcon = iconRegister.registerIcon(Reference.modTextureID + ":" + "RobotModel");
    }

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world,
			int x, int y, int z, int par7, float par8, float par9, float par10) {
		if (world.isRemote) {
			return true;
		} else {
			int i1 = world.getBlockId(x, y, z);
			x += Facing.offsetsXForSide[par7];
			y += Facing.offsetsYForSide[par7];
			z += Facing.offsetsZForSide[par7];
			double d0 = 0.0D;

			if (par7 == 1 && Block.blocksList[i1] != null
					&& Block.blocksList[i1].getRenderType() == 11) {
				d0 = 0.5D;
			}

			EntityRobot robot = spawnRobot(world, x + 0.5D, y + d0, z + 0.5D);

			if (robot != null) {
				if (robot instanceof EntityLiving && stack.hasDisplayName()) {
					((EntityLiving) robot).setCustomNameTag(stack.getDisplayName());
				}

				if (!player.capabilities.isCreativeMode) {
					--stack.stackSize;
				}
			}

			return true;
		}
	}

	public static EntityRobot spawnRobot(World world, double x, double y,
			double z) {
		EntityRobot robot = new EntityRobot(world);

		EntityLiving entity = robot;
		robot.setLocationAndAngles(x, y, z, MathHelper
				.wrapAngleTo180_float(world.rand.nextFloat() * 360.0F), 0.0F);
		entity.rotationYawHead = entity.rotationYaw;
		entity.renderYawOffset = entity.rotationYaw;
		//entity.initCreature();
		world.spawnEntityInWorld(robot);
		entity.playLivingSound();

		return robot;
	}

}