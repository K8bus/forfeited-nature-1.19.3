package ancientstudio.forfeitednature.data;

import ancientstudio.forfeitednature.block.ModBlocks;
import ancientstudio.forfeitednature.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MAGNESIUM_BLOCK);
        addDrop(ModBlocks.RAW_MAGNESIUM_BLOCK);

        addDrop(ModBlocks.MAGNESIUM_ORE, oreDrops(ModBlocks.MAGNESIUM_ORE, ModItems.RAW_MAGNESIUM));
        addDrop(ModBlocks.DEEPSLATE_MAGNESIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_MAGNESIUM_ORE, ModItems.RAW_MAGNESIUM));
    }
}
