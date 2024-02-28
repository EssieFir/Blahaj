package hibi.blahaj.data;

import hibi.blahaj.Common;
import hibi.blahaj.CuddlyBlock.CuddlySharkBlock;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.MultiPartBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import static hibi.blahaj.Common.MOD_ID;
import static hibi.blahaj.Common.prefix;

public class ModBlockStateProvider extends BlockStateProvider {
	public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, MOD_ID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		cuddlyBlock(Common.BLUE_SHARK_BLOCK);
		cuddlyBlock(Common.SOFT_BREAD_BLOCK);
		cuddlyBlock(Common.SOFT_BEAR_BLOCK);
}

	private void cuddlyBlock(RegistryObject<Block> block) {
		MultiPartBlockStateBuilder cuddlyBlock = getMultipartBuilder(block.get());
		ModelFile cuddlyBlockModel = models().getExistingFile(prefix("block/" + block.getId().getPath()));
		for (Direction d : BlockStateProperties.HORIZONTAL_FACING.getPossibleValues()) {
			int rotY = switch (d) {
				default -> 0;
				case EAST -> 90;
				case SOUTH -> 180;
				case WEST -> 270;
			};

			cuddlyBlock.part().modelFile(cuddlyBlockModel).rotationY(rotY).addModel().condition(CuddlySharkBlock.FACING, d).end();
		}
	}
}
