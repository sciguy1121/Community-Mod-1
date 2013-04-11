package communityMod.common.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemBucket;

public class ItemBucketConcrete extends ItemBucket
{

	public ItemBucketConcrete(int par1, int par2) 
	{
		super(par1, par2);
	}
	
	public void updateIcons(IconRegister register)
	{
		this.iconIndex = register.registerIcon("communityMod:LiquidConcreteBucket");
	}

}
