package hibi.blahaj.blocks.cuddlyblockentities;

import hibi.blahaj.Common;
import hibi.blahaj.blocks.CuddlyBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class CuddlySharkBlockEntity extends CuddlyBlockEntity {
	public CuddlySharkBlockEntity(BlockPos blockPos, BlockState blockState) {
		super(Common.BLUE_SHARK_BLOCK_ENTITY.get(), blockPos, blockState);
	}
}
