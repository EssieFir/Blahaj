package hibi.blahaj.data;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

import static hibi.blahaj.Common.*;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
	public ModRecipeProvider(DataGenerator dataGenerator) {
		super(dataGenerator);
	}

	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
		blueSharkRecipe(BLUE_SHARK_ITEM.get(), pFinishedRecipeConsumer);
		softBreadRecipe(SOFT_BREAD_ITEM.get(), pFinishedRecipeConsumer);
	}

	private void blueSharkRecipe(Item blueShark, Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
		ShapedRecipeBuilder.shaped(blueShark)
			.define('B', Items.LIGHT_BLUE_WOOL)
			.define('W', Items.WHITE_WOOL)
			.define('P', Items.PINK_DYE)
			.pattern(" B ")
			.pattern("BBB")
			.pattern("PW ")
			.unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
				.of(ItemTags.WOOL).build()))
			.save(pFinishedRecipeConsumer);
	}
	private void softBreadRecipe(Item blueShark, Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
		ShapedRecipeBuilder.shaped(blueShark)
			.define('o', Items.ORANGE_WOOL)
			.pattern("ooo")
			.pattern("ooo")
			.pattern("   ")
			.unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
				.of(ItemTags.WOOL).build()))
			.save(pFinishedRecipeConsumer);
	}
}
