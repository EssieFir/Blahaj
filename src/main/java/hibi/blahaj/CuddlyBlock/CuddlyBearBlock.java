package hibi.blahaj.CuddlyBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class CuddlyBearBlock extends HorizontalDirectionalBlock {
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
	public CuddlyBearBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any()
			.setValue(FACING, Direction.NORTH)
			.setValue(WATERLOGGED, Boolean.FALSE));
	}

	@Override
	public RenderShape getRenderShape(@NotNull BlockState blockState) {
		return RenderShape.MODEL;
	}

	public VoxelShape SHAPE_NORTH(){
		VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0.25, 0, 0.375, 0.75, 0.5625, 0.6875), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.21875, 0.875, 0.5, 0.40625, 1.0625, 0.5625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.40625, 0.5625, 0.25, 0.59375, 0.6875, 0.3125), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.28125, 0.5625, 0.3125, 0.71875, 0.9375, 0.75), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.59375, 0.875, 0.5, 0.78125, 1.0625, 0.5625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.125, 0.003125000000000001, -0.03125, 0.375, 0.190625, 0.40625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.625, 0.003125000000000001, -0.03125, 0.875, 0.190625, 0.40625), BooleanOp.OR);
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
		shape = Shapes.join(shape, Shapes.box(0.125, 0.003125000000000001, 0.59375, 0.375, 0.190625, 1.03125), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.625, 0.003125000000000001, 0.59375, 0.875, 0.190625, 1.03125), BooleanOp.OR);
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
		shape = Shapes.join(shape, Shapes.box(-0.03125, 0.003125, 0.125, 0.40625, 0.190625, 0.375), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(-0.03125, 0.003125, 0.625, 0.40625, 0.190625, 0.875), BooleanOp.OR);

		return shape;
	}

	public VoxelShape SHAPE_EAST(){
		VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0.4375, 0.875, 0.21875, 0.5, 1.0625, 0.40625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.4375, 0.875, 0.59375, 0.5, 1.0625, 0.78125), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.25, 0.5625, 0.28125, 0.6875, 0.9375, 0.71875), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.6875, 0.5625, 0.40625, 0.75, 0.6875, 0.59375), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.375, 0.125, 0.6875, 0.5625, 0.4375, 1), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.375, 0.125, 0, 0.5625, 0.4375, 0.3125), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.3125, 0, 0.25, 0.625, 0.5625, 0.75), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.59375, 0.003125, 0.125, 1.03125, 0.190625, 0.375), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.59375, 0.003125, 0.625, 1.03125, 0.190625, 0.875), BooleanOp.OR);

		return shape;
	}


	@Override
	public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
		if (pState.getValue(FACING).equals(Direction.NORTH)) return SHAPE_NORTH();
		if (pState.getValue(FACING).equals( Direction.SOUTH)) return SHAPE_SOUTH();
		if (pState.getValue(FACING).equals( Direction.WEST)) return SHAPE_WEST();
		if (pState.getValue(FACING).equals( Direction.EAST)) return SHAPE_EAST();
		else return SHAPE_NORTH();
	}

	public boolean propagatesSkylightDown(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
		return true;
	}
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
		pBuilder.add(WATERLOGGED,FACING);
	}

	public BlockState rotate (BlockState pState, Rotation pRotation) {
		return pState.setValue(FACING,pRotation.rotate(pState.getValue(FACING)));
	}

	public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
		if (pState.getValue(WATERLOGGED)) {
			pLevel.scheduleTick(pCurrentPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
		}

		return pState;
	}

	public FluidState getFluidState(BlockState pState) {
		return pState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(pState);
	}

	@Nullable
	public BlockState getStateForPlacement(BlockPlaceContext pContext) {
		FluidState fluidstate = pContext.getLevel().getFluidState(pContext.getClickedPos());

		return this.defaultBlockState()
			.setValue(FACING, pContext.getHorizontalDirection().getOpposite())
			.setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
	}
}
