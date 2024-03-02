package essie.plushed;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class CuddlyOctoBlueItem extends CuddlyItem {
	public CuddlyOctoBlueItem(Block block, Properties properties, String subtitle) {
		super(block, properties, subtitle);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
		ItemStack itemstack = pPlayer.getItemInHand(pUsedHand);
		itemstack.setCount(0);

		ItemStack item = new ItemStack(Common.OCTO_PLUSH_PINK_ITEM.get());

		return InteractionResultHolder.consume(item);
	}
}
