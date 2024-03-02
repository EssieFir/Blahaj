package essie.plushed.blocks;

import essie.plushed.Common;
import essie.plushed.CuddlyItem;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CuddlyBlockEntity extends BlockEntity {
	private String owner;
	private Component name;
	public CuddlyBlockEntity(BlockPos blockPos, BlockState blockState) {
		super (Common.CUDDLY_BLOCK_ENTITY.get(), blockPos, blockState);
	}

	@Override
	public void load(CompoundTag compoundTag) {
		super.load(compoundTag);

		if (compoundTag.contains(CuddlyItem.OWNER_KEY)) {
			this.owner = compoundTag.getString(CuddlyItem.OWNER_KEY);
		}
		if (compoundTag.contains("CustomName", 8)) {
			this.name = Component.Serializer.fromJson(compoundTag.getString("CustomName"));
		}
	}

	@Override
	protected void saveAdditional(CompoundTag compoundTag) {
		super.saveAdditional(compoundTag);

		if (this.owner != null) {
			compoundTag.putString(CuddlyItem.OWNER_KEY, this.owner);
		}
		if (this.name != null) {
			compoundTag.putString("CustomName", Component.Serializer.toJson(this.name));
		}
	}

	public void updateOwner(String value) {
		this.owner = value;
		this.setChanged();
	}

	public void setCustomName(Component component) {
		this.name = component;
		this.setChanged();
	}
}
