package ancientstudio.forfeitednature;

 import ancientstudio.forfeitednature.data.ModModelProvider;
 import ancientstudio.forfeitednature.data.ModRecipeGenerator;
 import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
 import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
 import ancientstudio.forfeitednature.data.ModLootTableGenerator;


public class ForfeitedNatureDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModLootTableGenerator::new);
        pack.addProvider(ModRecipeGenerator::new);
        pack.addProvider(ModModelProvider::new);
    }
}

