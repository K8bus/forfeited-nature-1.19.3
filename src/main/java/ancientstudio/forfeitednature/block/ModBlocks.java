package ancientstudio.forfeitednature.block;

import ancientstudio.forfeitednature.ForfeitedNature;
import ancientstudio.forfeitednature.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block MAGNESIUM_BLOCK = registerBlock("magnesium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALS);
    public static final Block RAW_MAGNESIUM_BLOCK = registerBlock("raw_magnesium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALS);
    public static final Block DEEPSLATE_MAGNESIUM_ORE = registerBlock("deepslate_magnesium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroup.METALS);
    public static final Block MAGNESIUM_ORE = registerBlock("magnesium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroup.METALS);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(ForfeitedNature.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(ForfeitedNature.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        ForfeitedNature.LOGGER.info("Registering ModBlocks for " + ForfeitedNature.MOD_ID);
    }
}
