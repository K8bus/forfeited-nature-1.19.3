package ancientstudio.forfeitednature.data;

import ancientstudio.forfeitednature.block.ModBlocks;
import ancientstudio.forfeitednature.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGNESIUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_MAGNESIUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGNESIUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_MAGNESIUM_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MAGNESIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_MAGNESIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_MAGNESIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGNESIUM_NUGGET, Models.GENERATED);
    }
}
