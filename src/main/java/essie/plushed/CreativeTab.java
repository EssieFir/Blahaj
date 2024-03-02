package essie.plushed;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab {
	public static final CreativeModeTab PLUSHED_ITEMS_TAB = new CreativeModeTab("plushed.items_tab") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Common.FOX_PLUSH_ITEM.get());
		}
	};
}
