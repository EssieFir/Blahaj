package hibi.blahaj.blocks;

import hibi.blahaj.CuddlyItem;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CuddlyBlockEntity extends BlockEntity {
	private String owner;
	public CuddlyBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
		super (blockEntityType, blockPos, blockState);
	}

	@Override
	public void load(CompoundTag compoundTag) {
		super.load(compoundTag);

		if (compoundTag.contains(CuddlyItem.OWNER_KEY)) {
			this.owner = compoundTag.getString(CuddlyItem.OWNER_KEY);
		}
	}

	@Override
	protected void saveAdditional(CompoundTag compoundTag) {
		super.saveAdditional(compoundTag);

		if (this.owner != null) {
			compoundTag.putString(CuddlyItem.OWNER_KEY, this.owner);
		}
	}

	public void updateOwner(String value) {
		this.owner = value;
		this.setChanged();
	}
}
