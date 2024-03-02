package essie.plushed.blocks;

import essie.plushed.CuddlyItem;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public abstract class CuddlyBlock extends BaseEntityBlock {
	public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	public CuddlyBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any()
			.setValue(FACING, Direction.NORTH)
			.setValue(WATERLOGGED, Boolean.FALSE));
	}


	public BlockEntityType<?> getBlockEntityType() { return null; }

	public VoxelShape SHAPE_NORTH() { return Shapes.block(); }
	public VoxelShape SHAPE_SOUTH() { return Shapes.block(); }
	public VoxelShape SHAPE_EAST() { return Shapes.block(); }
	public VoxelShape SHAPE_WEST() { return Shapes.block(); }
	@Override
	public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
		if (pState.getValue(FACING).equals(Direction.NORTH)) return SHAPE_NORTH();
		if (pState.getValue(FACING).equals(Direction.SOUTH)) return SHAPE_SOUTH();
		if (pState.getValue(FACING).equals(Direction.WEST)) return SHAPE_WEST();
		if (pState.getValue(FACING).equals(Direction.EAST)) return SHAPE_EAST();
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

	public BlockState mirror (BlockState pState, Mirror pMirror) {
		return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
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

	//BlockEntity :)

	@Override
	public RenderShape getRenderShape(@NotNull BlockState blockState) {
		return RenderShape.MODEL;
	}
	@Override
	public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
		return new CuddlyBlockEntity(getBlockEntityType(), blockPos, blockState);
	}

	public void setPlacedBy(Level level, BlockPos blockPos, BlockState blockState, @Nullable LivingEntity livingEntity, ItemStack itemStack) {
		super.setPlacedBy(level, blockPos, blockState, livingEntity, itemStack);
		BlockEntity blockentity = level.getBlockEntity(blockPos);
		if (blockentity instanceof CuddlyBlockEntity cuddlyBlockEntity) {
			String owner = null;
			if (itemStack.hasTag()) {
				CompoundTag compoundtag = itemStack.getTag();
				if (compoundtag.contains(CuddlyItem.OWNER_KEY)) {
					owner = compoundtag.getString(CuddlyItem.OWNER_KEY);
				}
			}

			cuddlyBlockEntity.updateOwner(owner);
		}

	}
}
