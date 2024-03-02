package hibi.blahaj.data;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

import static hibi.blahaj.Common.*;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
	public ModRecipeProvider(DataGenerator dataGenerator) {
		super(dataGenerator);
	}

	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
		plushieRecipe(Ingredient.of(ItemTags.WOOL), BLUE_SHARK_ITEM.get(), pFinishedRecipeConsumer);
		plushieRecipe(Ingredient.of(ItemTags.WOOL), SOFT_BREAD_ITEM.get(), pFinishedRecipeConsumer);
		plushieRecipe(Ingredient.of(ItemTags.WOOL), SOFT_BEAR_ITEM.get(), pFinishedRecipeConsumer);
		plushieRecipe(Ingredient.of(ItemTags.WOOL), FOX_PLUSH_ITEM.get(), pFinishedRecipeConsumer);
	}

	private void plushieRecipe(Ingredient input, Item output, Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
		SingleItemRecipeBuilder.stonecutting(input, output)
			.unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
				.of(ItemTags.WOOL).build()))
			.save(pFinishedRecipeConsumer);
	}
}
