package communityMod.common;

import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.FillBucketEvent;

import communityMod.common.blocks.BlocksHelper;
import communityMod.common.items.ItemsHelper;

public class ConcreteBucketHandler {

	@ForgeSubscribe
	public void onBucketFill(FillBucketEvent event) {

		ItemStack result = fillCustomBucket(event.world, event.target);

		if (result == null)
			return;

		event.result = result;
		event.setResult(Result.ALLOW);
	}

	public ItemStack fillCustomBucket(World world, MovingObjectPosition pos) {

		int blockID = world.getBlockId(pos.blockX, pos.blockY, pos.blockZ);

		if ((blockID == BlocksHelper.liquidConcreteStill.blockID || blockID == BlocksHelper.liquidConcreteFlowing.blockID)
				&& world.getBlockMetadata(pos.blockX, pos.blockY, pos.blockZ) == 0) {

			world.setBlock(pos.blockX, pos.blockY, pos.blockZ, 0);

			return new ItemStack(ItemsHelper.bucketConcrete);
		} else
			return null;

	}
}
