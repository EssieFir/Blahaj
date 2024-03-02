package hibi.blahaj.blocks;

import net.minecraft.core.Direction;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CuddlyBreadBlock extends CuddlyBlock {
	public CuddlyBreadBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any()
			.setValue(FACING, Direction.NORTH)
			.setValue(WATERLOGGED, Boolean.FALSE));
	}

	@Override
	public VoxelShape SHAPE_NORTH() { return Shapes.box(0.3125, 0, -0.0625, 0.6875, 0.375, 1); }
	@Override
	public VoxelShape SHAPE_SOUTH() { return Shapes.box(0.3125, 0, 0, 0.6875, 0.375, 1.0625); }
	@Override
	public VoxelShape SHAPE_WEST() { return Shapes.box(-0.0625, 0, 0.3125, 1, 0.375, 0.6875); }
	@Override
	public VoxelShape SHAPE_EAST() { return Shapes.box(0, 0, 0.3125, 1.0625, 0.375, 0.6875); }
}
