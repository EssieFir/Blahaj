package essie.plushed;

import essie.plushed.blocks.CuddlyBlockEntity;
import essie.plushed.blocks.cuddlyblocks.CuddlyBearBlock;
import essie.plushed.blocks.cuddlyblocks.CuddlyFoxBlock;
import essie.plushed.blocks.cuddlyblocks.CuddlyOctoBlock;
import essie.plushed.blocks.cuddlyblocks.CuddlyStinkyBottleBoyBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Locale;

@Mod(Common.MOD_ID)
public class Common {
	public static final String MOD_ID = "plushed";
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MOD_ID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
	IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

	public static final RegistryObject<Block> FOX_PLUSH_BLOCK = BLOCKS.register("fox_plush", () ->
		new CuddlyFoxBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_ORANGE)
			.strength(0.5F, 0.1F)
			.sound(SoundType.WOOL)
			.noOcclusion()));

	public static final RegistryObject<Block> STINKY_BOTTLE_BOY_PLUSH_BLOCK = BLOCKS.register("stinky_bottle_boy_plush", () ->
		new CuddlyStinkyBottleBoyBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_GREEN)
			.strength(0.5F, 0.1F)
			.sound(SoundType.WOOL)
			.noOcclusion()));

	public static final RegistryObject<Block> OCTO_PLUSH_BLUE_BLOCK = BLOCKS.register("octo_plush_blue", () ->
		new CuddlyOctoBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_BLUE)
			.strength(0.5F, 0.1F)
			.sound(SoundType.WOOL)
			.noOcclusion()));

	public static final RegistryObject<Block> OCTO_PLUSH_PINK_BLOCK = BLOCKS.register("octo_plush_pink", () ->
		new CuddlyOctoBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_BLUE)
			.strength(0.5F, 0.1F)
			.sound(SoundType.WOOL)
			.noOcclusion()));

	public static final RegistryObject<Block> SOFT_BEAR_BLOCK = BLOCKS.register("toy_bear", () ->
		new CuddlyBearBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_BROWN)
			.strength(0.5F, 0.1F)
			.sound(SoundType.WOOL)
			.noOcclusion()));
	public static final RegistryObject<BlockEntityType<CuddlyBlockEntity>> CUDDLY_BLOCK_ENTITY = BLOCK_ENTITIES.register("cuddly_block_entity", () ->
		BlockEntityType.Builder.of(CuddlyBlockEntity::new,
			SOFT_BEAR_BLOCK.get(), OCTO_PLUSH_PINK_BLOCK.get(), OCTO_PLUSH_BLUE_BLOCK.get(),STINKY_BOTTLE_BOY_PLUSH_BLOCK.get(),FOX_PLUSH_BLOCK.get()).build(null));

	public static final RegistryObject<Item> SOFT_BEAR_ITEM = ITEMS.register("toy_bear", () -> new CuddlyItem(SOFT_BEAR_BLOCK.get(), new Item.Properties().stacksTo(1).tab(CreativeTab.PLUSHED_ITEMS_TAB), null));
	public static final RegistryObject<Item> FOX_PLUSH_ITEM = ITEMS.register("fox_plush", () -> new CuddlyItem(FOX_PLUSH_BLOCK.get(), new Item.Properties().stacksTo(1).tab(CreativeTab.PLUSHED_ITEMS_TAB), null));
	public static final RegistryObject<Item> STINKY_BOTTLE_BOY_PLUSH_ITEM = ITEMS.register("stinky_bottle_boy_plush", () -> new CuddlyItem(STINKY_BOTTLE_BOY_PLUSH_BLOCK.get(), new Item.Properties().stacksTo(1).tab(CreativeTab.PLUSHED_ITEMS_TAB), null));
	public static final RegistryObject<Item> OCTO_PLUSH_BLUE_ITEM = ITEMS.register("octo_plush_blue", () -> new CuddlyOctoItem(OCTO_PLUSH_BLUE_BLOCK.get(), new Item.Properties().stacksTo(1).tab(CreativeTab.PLUSHED_ITEMS_TAB), null));
	public static final RegistryObject<Item> OCTO_PLUSH_PINK_ITEM = ITEMS.register("octo_plush_pink", () -> new CuddlyOctoItem(OCTO_PLUSH_PINK_BLOCK.get(), new Item.Properties().stacksTo(1).tab(CreativeTab.PLUSHED_ITEMS_TAB), null));
	public Common() {
		BLOCKS.register(modEventBus);
		ITEMS.register(modEventBus);
		BLOCK_ENTITIES.register(modEventBus);
	}

	public static ResourceLocation prefix(String name) {
		return new ResourceLocation(MOD_ID, name.toLowerCase(Locale.ROOT));
	}
}
