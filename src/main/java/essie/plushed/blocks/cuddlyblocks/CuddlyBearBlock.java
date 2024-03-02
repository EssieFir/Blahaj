package essie.plushed.blocks.cuddlyblocks;

import essie.plushed.Common;
import essie.plushed.blocks.CuddlyBlock;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CuddlyBearBlock extends CuddlyBlock {
	public CuddlyBearBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any()
			.setValue(FACING, Direction.NORTH)
			.setValue(WATERLOGGED, Boolean.FALSE));
	}
	@Override
	public BlockEntityType<?> getBlockEntityType() { return Common.SOFT_BEAR_BLOCK_ENTITY.get();}
	@Override
	public VoxelShape SHAPE_NORTH(){
		VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0.25, 0, 0.375, 0.75, 0.5625, 0.6875), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.21875, 0.875, 0.5, 0.40625, 1.0625, 0.5625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.40625, 0.5625, 0.25, 0.59375, 0.6875, 0.3125), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.28125, 0.5625, 0.3125, 0.71875, 0.9375, 0.75), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.59375, 0.875, 0.5, 0.78125, 1.0625, 0.5625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.125, 0, -0.03, 0.375, 0.190625, 0.40625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.625, 0, -0.03, 0.875, 0.190625, 0.40625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.6875, 0.125, 0.4375, 1, 0.4375, 0.625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0, 0.125, 0.4375, 0.3125, 0.4375, 0.625), BooleanOp.OR);

		return shape;
	}

	public VoxelShape SHAPE_SOUTH() {
	VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0.25, 0, 0.3125, 0.75, 0.5625, 0.625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.21875, 0.875, 0.4375, 0.40625, 1.0625, 0.5), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.40625, 0.5625, 0.6875, 0.59375, 0.6875, 0.75), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.28125, 0.5625, 0.25, 0.71875, 0.9375, 0.6875), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.59375, 0.875, 0.4375, 0.78125, 1.0625, 0.5), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.125, 0, 0.59375, 0.375, 0.190625, 1.03125), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.625, 0, 0.59375, 0.875, 0.190625, 1.03125), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.6875, 0.125, 0.375, 1, 0.4375, 0.5625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0, 0.125, 0.375, 0.3125, 0.4375, 0.5625), BooleanOp.OR);

	return shape;
	}

	public VoxelShape SHAPE_WEST(){
		VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0.5, 0.875, 0.21875, 0.5625, 1.0625, 0.40625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.5, 0.875, 0.59375, 0.5625, 1.0625, 0.78125), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.3125, 0.5625, 0.28125, 0.75, 0.9375, 0.71875), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.25, 0.5625, 0.40625, 0.3125, 0.6875, 0.59375), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.4375, 0.125, 0.6875, 0.625, 0.4375, 1), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.4375, 0.125, 0, 0.625, 0.4375, 0.3125), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.375, 0, 0.25, 0.6875, 0.5625, 0.75), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(-0.03125, 0, 0.125, 0.40625, 0.190625, 0.375), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(-0.03125, 0, 0.625, 0.40625, 0.190625, 0.875), BooleanOp.OR);

		return shape;
	}

	@Override
	public VoxelShape SHAPE_EAST(){
		VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0.4375, 0.875, 0.21875, 0.5, 1.0625, 0.40625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.4375, 0.875, 0.59375, 0.5, 1.0625, 0.78125), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.25, 0.5625, 0.28125, 0.6875, 0.9375, 0.71875), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.6875, 0.5625, 0.40625, 0.75, 0.6875, 0.59375), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.375, 0.125, 0.6875, 0.5625, 0.4375, 1), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.375, 0.125, 0, 0.5625, 0.4375, 0.3125), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.3125, 0, 0.25, 0.625, 0.5625, 0.75), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.59375, 0, 0.125, 1.03125, 0.190625, 0.375), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.59375, 0, 0.625, 1.03125, 0.190625, 0.875), BooleanOp.OR);

		return shape;
	}
}
