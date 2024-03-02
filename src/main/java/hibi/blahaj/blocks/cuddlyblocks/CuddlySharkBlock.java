package hibi.blahaj.blocks.cuddlyblocks;

import hibi.blahaj.Common;
import hibi.blahaj.blocks.CuddlyBlock;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CuddlySharkBlock extends CuddlyBlock {
	public CuddlySharkBlock(Properties properties) {
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
		shape = Shapes.join(shape, Shapes.box(0.375, 0, 0, 0.625, 0.25, 0.5625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.4375, 0.0625, 0.5625, 0.5625, 0.1875, 1), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.40625, 0.03125, 0.5625, 0.59375, 0.21875, 0.6875), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.46875, 0.125, 0.875, 0.53125, 0.375, 1), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.25, 0, 0.375, 0.375, 0.0625, 0.625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.625, 0, 0.375, 0.75, 0.0625, 0.625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.4375, 0.1875, 0.3125, 0.5625, 0.5, 0.5), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.46875, 0.15625, 0.75, 0.53125, 0.21875, 0.8125), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.375, 0, 0.0625, 0.625, 0.0625, 0.0625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.375, 0.0625, 0, 0.625, 0.0625, 0.0625), BooleanOp.OR);

		return shape;
	}

	@Override
	public VoxelShape SHAPE_SOUTH() {
	VoxelShape shape = Shapes.empty();
	shape = Shapes.join(shape, Shapes.box(0.375, 0, 0.4375, 0.625, 0.25, 1), BooleanOp.OR);
	shape = Shapes.join(shape, Shapes.box(0.4375, 0.0625, 0, 0.5625, 0.1875, 0.4375), BooleanOp.OR);
	shape = Shapes.join(shape, Shapes.box(0.40625, 0.03125, 0.3125, 0.59375, 0.21875, 0.4375), BooleanOp.OR);
	shape = Shapes.join(shape, Shapes.box(0.46875, 0.125, 0, 0.53125, 0.375, 0.125), BooleanOp.OR);
	shape = Shapes.join(shape, Shapes.box(0.25, 0, 0.375, 0.375, 0.0625, 0.625), BooleanOp.OR);
	shape = Shapes.join(shape, Shapes.box(0.625, 0, 0.375, 0.75, 0.0625, 0.625), BooleanOp.OR);
	shape = Shapes.join(shape, Shapes.box(0.4375, 0.1875, 0.5, 0.5625, 0.5, 0.6875), BooleanOp.OR);
	shape = Shapes.join(shape, Shapes.box(0.46875, 0.15625, 0.1875, 0.53125, 0.21875, 0.25), BooleanOp.OR);
	shape = Shapes.join(shape, Shapes.box(0.375, 0, 0.9375, 0.625, 0.0625, 0.9375), BooleanOp.OR);
	shape = Shapes.join(shape, Shapes.box(0.375, 0.0625, 0.9375, 0.625, 0.0625, 1), BooleanOp.OR);

	return shape;
	}

	@Override
	public VoxelShape SHAPE_WEST(){
		VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0, 0, 0.375, 0.5625, 0.25, 0.625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.5625, 0.0625, 0.4375, 1, 0.1875, 0.5625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.5625, 0.03125, 0.40625, 0.6875, 0.21875, 0.59375), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.875, 0.125, 0.46875, 1, 0.375, 0.53125), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.375, 0, 0.25, 0.625, 0.0625, 0.375), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.375, 0, 0.625, 0.625, 0.0625, 0.75), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.3125, 0.1875, 0.4375, 0.5, 0.5, 0.5625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.75, 0.15625, 0.46875, 0.8125, 0.21875, 0.53125), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.0625, 0, 0.375, 0.0625, 0.0625, 0.625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0, 0.0625, 0.375, 0.0625, 0.0625, 0.625), BooleanOp.OR);

		return shape;
	}

	@Override
	public VoxelShape SHAPE_EAST(){
		VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0.4375, 0, 0.375, 1, 0.25, 0.625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0, 0.0625, 0.4375, 0.4375, 0.1875, 0.5625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.3125, 0.03125, 0.40625, 0.4375, 0.21875, 0.59375), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0, 0.125, 0.46875, 0.125, 0.375, 0.53125), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.375, 0, 0.25, 0.625, 0.0625, 0.375), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.375, 0, 0.625, 0.625, 0.0625, 0.75), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.5, 0.1875, 0.4375, 0.6875, 0.5, 0.5625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.1875, 0.15625, 0.46875, 0.25, 0.21875, 0.53125), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.9375, 0, 0.375, 0.9375, 0.0625, 0.625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.9375, 0.0625, 0.375, 1, 0.0625, 0.625), BooleanOp.OR);

		return shape;
	}
}
