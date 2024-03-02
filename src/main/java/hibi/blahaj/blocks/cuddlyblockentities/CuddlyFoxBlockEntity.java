package hibi.blahaj.blocks.cuddlyblockentities;

import hibi.blahaj.Common;
import hibi.blahaj.blocks.CuddlyBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class CuddlyFoxBlockEntity extends CuddlyBlockEntity {
	public CuddlyFoxBlockEntity(BlockPos blockPos, BlockState blockState) {
		super(Common.FOX_PLUSH_BLOCK_ENTITY.get(), blockPos, blockState);
	}
}
