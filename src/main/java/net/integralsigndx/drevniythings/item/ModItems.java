package net.integralsigndx.drevniythings.item;

import net.integralsigndx.drevniythings.Drevniythings;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Drevniythings.MODID);

    public static final DeferredItem<Item> AZURITE = ITEMS.registerSimpleItem("azurite");
    public static final DeferredItem<Item> RAW_AZURITE = ITEMS.registerSimpleItem("raw_azurite");
    public static final DeferredItem<Item> LITHERITE = ITEMS.registerSimpleItem("litherite");
    public static final DeferredItem<Item> ERODIUM = ITEMS.registerSimpleItem("erodium");
    public static final DeferredItem<Item> KYRONITE = ITEMS.registerSimpleItem("kyronite");
    public static final DeferredItem<Item> PLADIUM = ITEMS.registerSimpleItem("pladium");
    public static final DeferredItem<Item> IONITE = ITEMS.registerSimpleItem("ionite");
    public static final DeferredItem<Item> AETHIUM = ITEMS.registerSimpleItem("aethium");
    public static final DeferredItem<Item> NANORITE = ITEMS.registerSimpleItem("nanorite");
    public static final DeferredItem<Item> XEROTHIUM = ITEMS.registerSimpleItem("xerothium");
    public static final DeferredItem<Item> RAW_SILICON = ITEMS.registerSimpleItem("raw_silicon");
    public static final DeferredItem<Item> REINFORCED_CLOTH = ITEMS.registerSimpleItem("reinforced_cloth");
    public static final DeferredItem<Item> TIN_CANISTER = ITEMS.registerSimpleItem("tin_canister");
    public static final DeferredItem<Item> COPPER_CANISTER = ITEMS.registerSimpleItem("copper_canister");
    public static final DeferredItem<Item> RECORD_FRAGMENT = ITEMS.registerSimpleItem("record_fragment");
    public static final DeferredItem<Item> DIAMOND_LATTICE = ITEMS.registerSimpleItem("diamond_lattice");
    public static final DeferredItem<Item> CRYSTAL_MATRIX_INGOT = ITEMS.registerSimpleItem("crystal_matrix_ingot");
    public static final DeferredItem<Item> BLAZE_CUBE = ITEMS.registerSimpleItem("blaze_cube");
    public static final DeferredItem<Item> NEUTRON_INGOT = ITEMS.registerSimpleItem("neutron_ingot");
    public static final DeferredItem<Item> NEUTRON_GEAR = ITEMS.registerSimpleItem("neutron_gear");
    public static final DeferredItem<Item> NEUTRON_NUGGET = ITEMS.registerSimpleItem("neutron_nugget");
    public static final DeferredItem<Item> NEUTRON_PILE = ITEMS.registerSimpleItem("neutron_pile");
    public static final DeferredItem<Item> INFINITY_CATALYST = ITEMS.registerItem("infinity_catalyst", properties -> new Item(properties
            .rarity(Rarity.EPIC)
            .fireResistant()));
    public static final DeferredItem<Item> INFINITY_INGOT = ITEMS.registerItem("infinity_ingot", properties -> new Item(properties
            .rarity(Rarity.EPIC)
            .fireResistant()));
    public static final DeferredItem<Item> INFINITY_NUGGET = ITEMS.registerItem("infinity_nugget", properties -> new Item(properties.
            rarity(Rarity.EPIC)
            .fireResistant()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
