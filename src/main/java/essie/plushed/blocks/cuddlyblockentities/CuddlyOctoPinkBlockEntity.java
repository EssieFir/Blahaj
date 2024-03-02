package essie.plushed.blocks.cuddlyblockentities;

import essie.plushed.Common;
import essie.plushed.blocks.CuddlyBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class CuddlyOctoPinkBlockEntity extends CuddlyBlockEntity {
	public CuddlyOctoPinkBlockEntity(BlockPos blockPos, BlockState blockState) {
		super(Common.OCTO_PLUSH_PINK_BLOCK_ENTITY.get(), blockPos, blockState);
	}
}
