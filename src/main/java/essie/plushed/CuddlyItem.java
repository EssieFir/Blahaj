package essie.plushed;

import java.util.List;
import java.util.function.Consumer;

import essie.plushed.mixinreplacement.HumanoidModelReplacement;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.common.util.FakePlayer;
import org.jetbrains.annotations.Nullable;

public class CuddlyItem extends ItemNameBlockItem {

	public static final String OWNER_KEY = "Owner";

	private final Component subtitle;

	public CuddlyItem(Block block, Properties properties, String subtitle) {
		super(block, properties);
		this.subtitle = subtitle == null? null: Component.translatable(subtitle).withStyle(ChatFormatting.GRAY);
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag context) {
		if (this.subtitle != null) {
			tooltip.add(this.subtitle);
		}
		if (stack.hasTag()) {
			CompoundTag nbt = stack.getTag();
			String owner = nbt.getString(OWNER_KEY);
			if (owner == "") {
				return;
			}
			tooltip.add(Component.translatable("tooltip.plushed.owner", (Component.literal(owner)), this.getDescription()).withStyle(ChatFormatting.GRAY));
		}
	}

	@Override
	public void onCraftedBy(ItemStack stack, Level level, Player player) {
		if (player != null && !(player instanceof FakePlayer)) { // compensate for auto-crafter mods
			stack.addTagElement(OWNER_KEY, StringTag.valueOf(player.getName().getString()));
		}
		super.onCraftedBy(stack, level, player);
	}

	@Override
	public void initializeClient(Consumer<IClientItemExtensions> consumer) {
		HumanoidModelReplacement.consume(consumer);
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState state) {
		return super.getDestroySpeed(stack, state);
	}
}
