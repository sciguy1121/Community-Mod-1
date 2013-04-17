package communityMod.common.items;

import communityMod.common.Reference;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemBucket;

public class ItemBucketConcrete extends ItemBucket {

	public ItemBucketConcrete(int par1, int par2) {
		super(par1, par2);
		this.setMaxStackSize(1);
	}

	@Override
	public void registerIcons(IconRegister register) {
		this.itemIcon = register.registerIcon(Reference.modTextureID + ":" + "LiquidConcreteBucket");
	}

}
