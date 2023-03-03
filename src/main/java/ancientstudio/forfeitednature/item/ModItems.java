package ancientstudio.forfeitednature.item;

import ancientstudio.forfeitednature.ForfeitedNature;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item MAGNESIUM_NUGGET = registerItem("magnesium_nugget",
            new Item(new FabricItemSettings()));
    public static final Item MAGNESIUM_INGOT = registerItem("magnesium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item RAW_MAGNESIUM_NUGGET = registerItem("raw_magnesium_nugget",
            new Item(new FabricItemSettings()));
    public static final Item RAW_MAGNESIUM = registerItem("raw_magnesium",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ForfeitedNature.MOD_ID, name), item);
    }
    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, MAGNESIUM_NUGGET);
        addToItemGroup(ItemGroups.INGREDIENTS, MAGNESIUM_INGOT);
        addToItemGroup(ItemGroups.INGREDIENTS, RAW_MAGNESIUM_NUGGET);
        addToItemGroup(ItemGroups.INGREDIENTS, RAW_MAGNESIUM);

        addToItemGroup(ModItemGroup.METALS, MAGNESIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALS, MAGNESIUM_INGOT);
        addToItemGroup(ModItemGroup.METALS, RAW_MAGNESIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALS, RAW_MAGNESIUM);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        ForfeitedNature.LOGGER.info("Registering Mod Items for " + ForfeitedNature.MOD_ID);

        addItemsToItemGroup();
    }
}

