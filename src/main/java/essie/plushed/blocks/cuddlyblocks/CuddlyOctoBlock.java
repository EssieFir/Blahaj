package essie.plushed.blocks.cuddlyblocks;

import essie.plushed.Common;
import essie.plushed.blocks.CuddlyBlock;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CuddlyOctoBlock extends CuddlyBlock {
	public CuddlyOctoBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any()
			.setValue(FACING, Direction.NORTH)
			.setValue(WATERLOGGED, Boolean.FALSE));
	}

	@Override
	public BlockEntityType<?> getBlockEntityType() { return Common.FOX_PLUSH_BLOCK_ENTITY.get();}

	@Override
	public VoxelShape SHAPE_NORTH(){
		VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0.21875, 0, 0.25, 0.78125, 0.5, 0.75), BooleanOp.OR);

		return shape;
	}

	@Override
	public VoxelShape SHAPE_SOUTH() {
	VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0.21875, 0, 0.25, 0.78125, 0.5, 0.75), BooleanOp.OR);

	return shape;
	}

	@Override
	public VoxelShape SHAPE_WEST(){
		VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0.25, 0, 0.21875, 0.75, 0.5, 0.78125), BooleanOp.OR);

		return shape;
	}

	@Override
	public VoxelShape SHAPE_EAST(){
		VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0.25, 0, 0.21875, 0.75, 0.5, 0.78125), BooleanOp.OR);

		return shape;
	}


}
