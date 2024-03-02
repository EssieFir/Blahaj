package hibi.blahaj.blocks.cuddlyblocks;

import hibi.blahaj.Common;
import hibi.blahaj.blocks.CuddlyBlock;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CuddlyFoxBlock extends CuddlyBlock {
	public CuddlyFoxBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any()
			.setValue(FACING, Direction.NORTH)
			.setValue(WATERLOGGED, Boolean.FALSE));
	}

	@Override
	public BlockEntityType<?> getBlockEntityType() { return Common.BLUE_SHARK_BLOCK_ENTITY.get();}

	@Override
	public VoxelShape SHAPE_NORTH(){
		VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0.5625, 0.25, 0.1875, 0.6875, 0.3125, 0.25), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.3125, 0.25, 0.1875, 0.4375, 0.3125, 0.25), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.3125, 0, 0.125, 0.6875, 0.25, 0.3125), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.40625, 0, 0, 0.59375, 0.125, 0.125), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.34375, 0, 0.3125, 0.65625, 0.25, 0.75), BooleanOp.OR);

		return shape;
	}

	@Override
	public VoxelShape SHAPE_SOUTH() {
	VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0.5625, 0.25, 0.75, 0.6875, 0.3125, 0.8125), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.3125, 0.25, 0.75, 0.4375, 0.3125, 0.8125), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.3125, 0, 0.6875, 0.6875, 0.25, 0.875), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.40625, 0, 0.87, 0.59375, 0.125, 1), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.34375, 0, 0.25, 0.65625, 0.25, 0.6875), BooleanOp.OR);

	return shape;
	}

	@Override
	public VoxelShape SHAPE_WEST(){
		VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0.1875, 0.25, 0.5625, 0.25, 0.3125, 0.6875), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.1875, 0.25, 0.3125, 0.25, 0.3125, 0.4375), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.125, 0, 0.3125, 0.3125, 0.25, 0.6875), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0, 0, 0.40625, 0.125, 0.125, 0.59375), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.3, 0, 0.34375, 0.74, 0.25, 0.65625), BooleanOp.OR);

		return shape;
	}

	@Override
	public VoxelShape SHAPE_EAST(){
		VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0.75, 0.25, 0.5625, 0.8125, 0.3125, 0.6875), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.75, 0.25, 0.3125, 0.8125, 0.3125, 0.4375), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.6875, 0, 0.3125, 0.875, 0.25, 0.6875), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.87, 0, 0.40625, 1, 0.125, 0.59375), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.25, 0, 0.34, 0.6875, 0.25, 0.65625), BooleanOp.OR);

		return shape;
	}
}
