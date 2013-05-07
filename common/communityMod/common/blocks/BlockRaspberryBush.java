package communityMod.common.blocks;

import java.util.Random;

import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

import communityMod.common.CommunityMod;
import communityMod.common.Reference;
import communityMod.common.items.ItemsHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRaspberryBush extends BlockFlower implements IPlantable
{
	private Icon grown;
	private int growProgress = 0;
	private int growTime = 400;

	public BlockRaspberryBush(int id) 
	{
		super(id);
		
		float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
		this.setCreativeTab(CommunityMod.modTab);
		this.setHardness(0.0F);
        this.setStepSound(soundGrassFootstep);
        this.disableStats();
		this.setTickRandomly(true);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) 
	{
		this.blockIcon = register.registerIcon(Reference.modTextureID + ":RaspberryBush");
		this.grown = register.registerIcon(Reference.modTextureID + ":RaspberryBushGrown");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata) 
	{
		
		if(metadata == 1)
		{
			return grown;
		}
		
		return this.blockIcon;
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y,int z,
			EntityPlayer player, int par6, float par7, float par8, float par9) 
	{
		Random random = new Random();
		
		int metadata = world.getBlockMetadata(x, y, z);
		
		int raspberryAmount = random.nextInt(5);
		if(raspberryAmount == 0)
		{
			raspberryAmount = 2;
		}
		
		ItemStack raspberry = new ItemStack(ItemsHelper.raspberry, raspberryAmount);
		ItemStack selectedItem = player.getCurrentEquippedItem();
		
		if(metadata == 0)
		{
			if(selectedItem != null)
			{
				if(selectedItem.itemID == Item.dyePowder.itemID
						&& selectedItem.getItemDamage() == 15)
				{
					if(!player.capabilities.isCreativeMode)
						--player.getCurrentEquippedItem().stackSize;
					world.setBlockMetadataWithNotify(x, y, z, 1, 2);
					growProgress = 0;
					return true;
				}
			}
			return false;
		}
		
		player.inventory.addItemStackToInventory(raspberry);
		world.setBlockMetadataWithNotify(x, y, z, 0, 2);
		return true;
	}

	@Override
	public void randomDisplayTick(World world, int x, int y, int z, Random random) 
	{
		if(world.getBlockMetadata(x, y, z) == 0)
		{
			if(growProgress < growTime)
			{
				growProgress++;
			}
			else
			{
				growProgress = 0;
				world.setBlockMetadataWithNotify(x, y, z, 1, 2);
			}
		}
	}

	@Override
	public EnumPlantType getPlantType(World world, int x, int y, int z) 
	{
		return EnumPlantType.Plains;
	}

}