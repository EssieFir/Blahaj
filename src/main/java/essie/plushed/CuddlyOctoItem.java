package essie.plushed;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class CuddlyOctoItem extends CuddlyItem {
	public CuddlyOctoItem(Block block, Properties properties, String subtitle) {
		super(block, properties, subtitle);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
		ItemStack itemstack = pPlayer.getItemInHand(pUsedHand);
		ItemStack item;

		if (itemstack.is(Common.OCTO_PLUSH_BLUE_ITEM.get())) {
			item = new ItemStack(Common.OCTO_PLUSH_PINK_ITEM.get());
		} else {
			item = new ItemStack(Common.OCTO_PLUSH_BLUE_ITEM.get());
		}

		item.setTag(itemstack.getTag());
		itemstack.setCount(0);

		pLevel.playSound(pPlayer, pPlayer.getOnPos(), SoundEvents.BUNDLE_DROP_CONTENTS, SoundSource.PLAYERS, 1,1);
		return InteractionResultHolder.consume(item);
	}
}
