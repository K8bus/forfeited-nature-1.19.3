package ancientstudio.forfeitednature.data;

import ancientstudio.forfeitednature.block.ModBlocks;
import ancientstudio.forfeitednature.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_MAGNESIUM), RecipeCategory.MISC, ModItems.MAGNESIUM_INGOT,
                0.7f, 200, "magnesium");
        offerSmelting(exporter, List.of(ModItems.RAW_MAGNESIUM_NUGGET), RecipeCategory.MISC, ModItems.MAGNESIUM_NUGGET,
                0.1f, 25, "magnesium");
        offerBlasting(exporter, List.of(ModItems.RAW_MAGNESIUM), RecipeCategory.MISC, ModItems.MAGNESIUM_INGOT,
                0.7f, 100, "magnesium");
        offerBlasting(exporter, List.of(ModItems.RAW_MAGNESIUM_NUGGET), RecipeCategory.MISC, ModItems.MAGNESIUM_NUGGET,
                0.1f, 12, "magnesium");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.MAGNESIUM_NUGGET, RecipeCategory.MISC,
                ModItems.MAGNESIUM_INGOT);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.MAGNESIUM_INGOT, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.MAGNESIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_MAGNESIUM_NUGGET, RecipeCategory.MISC,
                ModItems.RAW_MAGNESIUM);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_MAGNESIUM, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.RAW_MAGNESIUM_BLOCK);
    }
}
