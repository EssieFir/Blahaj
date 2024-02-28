package hibi.blahaj.data;

import hibi.blahaj.Common;
import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.stream.Collectors;

import static hibi.blahaj.Common.MOD_ID;

public class ModLootTableProvider  extends BlockLoot {
	private static final LootItemCondition.Builder HAS_SILK_TOUCH = MatchTool.toolMatches(ItemPredicate.Builder.item().hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.atLeast(1))));

	@Override
	protected void addTables() {
		add(Common.BLUE_SHARK_BLOCK.get(), createSingleItemTable(Common.BLUE_SHARK_ITEM.get()));
		add(Common.SOFT_BREAD_BLOCK.get(), createSingleItemTable(Common.SOFT_BREAD_ITEM.get()));
		add(Common.SOFT_BEAR_BLOCK.get(), createSingleItemTable(Common.SOFT_BEAR_ITEM.get()));
	}

	@Override
	protected Iterable<Block> getKnownBlocks() {
		return ForgeRegistries.BLOCKS.getValues().stream().filter(block -> ForgeRegistries.BLOCKS.getKey(block).getNamespace().equals(MOD_ID)).collect(Collectors.toList());
	}
}
