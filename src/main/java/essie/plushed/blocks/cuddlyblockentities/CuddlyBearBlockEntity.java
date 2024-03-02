package essie.plushed.blocks.cuddlyblockentities;

import essie.plushed.blocks.CuddlyBlockEntity;
import essie.plushed.Common;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class CuddlyBearBlockEntity extends CuddlyBlockEntity {
	public CuddlyBearBlockEntity(BlockPos blockPos, BlockState blockState) {
		super(Common.SOFT_BEAR_BLOCK_ENTITY.get(), blockPos, blockState);
	}
}
