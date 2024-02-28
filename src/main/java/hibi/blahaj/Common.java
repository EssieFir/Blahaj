package hibi.blahaj;

import hibi.blahaj.CuddlyBlock.CuddlyBearBlock;
import hibi.blahaj.CuddlyBlock.CuddlyBreadBlock;
import hibi.blahaj.CuddlyBlock.CuddlySharkBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
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
	public static final String MOD_ID = "blahaj";
	public static final DeferredRegister<Block> blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
	public static final DeferredRegister<Item> items = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
	IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
	public static final RegistryObject<Block> BLUE_SHARK_BLOCK = blocks.register("blue_shark", () ->
		new CuddlySharkBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_BLUE)
			.strength(0.5F, 0.1F)
			.sound(SoundType.WOOL)
			.noOcclusion()));
	public static final RegistryObject<Block> SOFT_BREAD_BLOCK = blocks.register("bread", () ->
		new CuddlyBreadBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_BROWN)
			.strength(0.5F, 0.1F)
			.sound(SoundType.WOOL)
			.noOcclusion()));

	public static final RegistryObject<Block> SOFT_BEAR_BLOCK = blocks.register("toy_bear", () ->
		new CuddlyBearBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_BROWN)
			.strength(0.5F, 0.1F)
			.sound(SoundType.WOOL)
			.noOcclusion()));

	public static final RegistryObject<Item> BLUE_SHARK_ITEM = items.register("blue_shark", () -> new CuddlyItem(BLUE_SHARK_BLOCK.get(), new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC), "item.blahaj.blue_shark.tooltip"));
	public static final RegistryObject<Item> SOFT_BREAD_ITEM = items.register("bread", () -> new CuddlyItem(SOFT_BREAD_BLOCK.get(), new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC), null));
	public static final RegistryObject<Item> SOFT_BEAR_ITEM = items.register("toy_bear", () -> new CuddlyItem(SOFT_BEAR_BLOCK.get(), new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC), null));

	public Common() {
		blocks.register(modEventBus);
		items.register(modEventBus);
	}

	public static ResourceLocation prefix(String name) {
		return new ResourceLocation(MOD_ID, name.toLowerCase(Locale.ROOT));
	}
}
