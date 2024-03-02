package essie.plushed.blocks.cuddlyblocks;

import essie.plushed.Common;
import essie.plushed.blocks.CuddlyBlock;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CuddlyStinkyBottleBoyBlock extends CuddlyBlock {
	public CuddlyStinkyBottleBoyBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any()
			.setValue(FACING, Direction.NORTH)
			.setValue(WATERLOGGED, Boolean.FALSE));
	}


	@Override
	public VoxelShape SHAPE_NORTH(){
		VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0.34, 0.07, 0.48, 0.65, 0.45, 0.79), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.34, 0.07, 0.48, 0.65, 0.45, 0.79), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.43, 0.48, 0.57, 0.56, 0.54, 0.70), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.25, 0.06, 0.29, 0.31, 0.125, 0.67), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.25, 0.06, 0.29, 0.31, 0.125, 0.35), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.68, 0.06, 0.29, 0.75, 0.125, 0.67), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.68, 0.06, 0.29, 0.75, 0.125, 0.35), BooleanOp.OR);

		return shape;
	}

	@Override
	public VoxelShape SHAPE_SOUTH() {
	VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0.34, 0.07, 0.20, 0.65, 0.45, 0.51), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.34, 0.07, 0.20, 0.65, 0.45, 0.51), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.43, 0.48, 0.29, 0.56, 0.54, 0.42), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.25, 0.06, 0.32, 0.31, 0.12, 0.70), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.24, 0.06, 0.64, 0.31, 0.12, 0.70), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.68, 0.06, 0.32, 0.75, 0.12, 0.70), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.68, 0.06, 0.64, 0.75, 0.12, 0.70), BooleanOp.OR);

	return shape;
	}

	@Override
	public VoxelShape SHAPE_WEST(){
		VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0.48, 0.07, 0.35, 0.79, 0.45, 0.67), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.48, 0.07, 0.35, 0.79, 0.45, 0.67), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.57, 0.48, 0.45, 0.70, 0.54, 0.57), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.29, 0.06, 0.26, 0.67, 0.12, 0.32), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.29, 0.06, 0.26, 0.35, 0.12, 0.32), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.29, 0.06, 0.70, 0.67, 0.12, 0.76), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.29, 0.06, 0.70, 0.35, 0.12, 0.76), BooleanOp.OR);

		return shape;
	}

	@Override
	public VoxelShape SHAPE_EAST(){
		VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0.20, 0.07, 0.35, 0.51, 0.45, 0.67), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.20, 0.07, 0.35, 0.51, 0.45, 0.67), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.29, 0.48, 0.45, 0.42, 0.54, 0.57), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.32, 0.06, 0.26, 0.70, 0.12, 0.32), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.64, 0.06, 0.26, 0.70, 0.12, 0.32), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.32, 0.06, 0.70, 0.70, 0.12, 0.76), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.64, 0.06, 0.70, 0.70, 0.12, 0.76), BooleanOp.OR);

		return shape;
	}
}
