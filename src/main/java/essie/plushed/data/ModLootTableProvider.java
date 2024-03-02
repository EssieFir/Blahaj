package essie.plushed.data;

import essie.plushed.Common;
import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.CopyNameFunction;
import net.minecraft.world.level.storage.loot.functions.CopyNbtFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.nbt.ContextNbtProvider;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.stream.Collectors;

import static essie.plushed.Common.MOD_ID;

public class ModLootTableProvider  extends BlockLoot {
	private static final LootItemCondition.Builder HAS_SILK_TOUCH = MatchTool.toolMatches(ItemPredicate.Builder.item().hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.atLeast(1))));

	@Override
	protected void addTables() {
		add(Common.SOFT_BEAR_BLOCK.get(), this::addCuddlyBlock);
		add(Common.FOX_PLUSH_BLOCK.get(), this::addCuddlyBlock);
	}

	@Override
	protected Iterable<Block> getKnownBlocks() {
		return ForgeRegistries.BLOCKS.getValues().stream().filter(block -> ForgeRegistries.BLOCKS.getKey(block).getNamespace().equals(MOD_ID)).collect(Collectors.toList());
	}

	private LootTable.Builder addCuddlyBlock(Block block) {
		return LootTable.lootTable()
			.withPool(applyExplosionCondition(block, LootPool.lootPool()
				.setRolls(ConstantValue.exactly(1.0F))
				.add(LootItem.lootTableItem(block)
					.apply(CopyNameFunction
						.copyName(CopyNameFunction.NameSource.BLOCK_ENTITY))
					.apply(CopyNbtFunction
						.copyData(ContextNbtProvider.BLOCK_ENTITY)
						.copy("Owner", "Owner")))));
	}
}
