package essie.plushed.blocks.cuddlyblockentities;

import essie.plushed.Common;
import essie.plushed.blocks.CuddlyBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class CuddlyStinkyBottleBoyBlockEntity extends CuddlyBlockEntity {
	public CuddlyStinkyBottleBoyBlockEntity(BlockPos blockPos, BlockState blockState) {
		super(Common.STINKY_BOTTLE_BOY_PLUSH_BLOCK_ENTITY.get(), blockPos, blockState);
	}
}
