package essie.plushed.data;

import essie.plushed.Common;
import essie.plushed.blocks.CuddlyBlock;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.MultiPartBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
	public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, Common.MOD_ID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		cuddlyBlock(Common.SOFT_BEAR_BLOCK);
		cuddlyBlock(Common.FOX_PLUSH_BLOCK);
	}

	private void cuddlyBlock(RegistryObject<Block> block) {
		MultiPartBlockStateBuilder cuddlyBlock = getMultipartBuilder(block.get());
		ModelFile cuddlyBlockModel = models().getExistingFile(Common.prefix("block/" + block.getId().getPath()));
		for (Direction d : BlockStateProperties.HORIZONTAL_FACING.getPossibleValues()) {
			int rotY = switch (d) {
				default -> 0;
				case EAST -> 90;
				case SOUTH -> 180;
				case WEST -> 270;
			};

			cuddlyBlock.part().modelFile(cuddlyBlockModel).rotationY(rotY).addModel().condition(CuddlyBlock.FACING, d).end();
		}
	}
}
