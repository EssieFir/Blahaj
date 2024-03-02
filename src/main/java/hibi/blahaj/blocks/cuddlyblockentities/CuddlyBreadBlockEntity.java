package hibi.blahaj.blocks.cuddlyblockentities;

import hibi.blahaj.Common;
import hibi.blahaj.blocks.CuddlyBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class CuddlyBreadBlockEntity extends CuddlyBlockEntity {
	public CuddlyBreadBlockEntity(BlockPos blockPos, BlockState blockState) {
		super(Common.SOFT_BREAD_BLOCK_ENTITY.get(), blockPos, blockState);
	}
}
