package net.integralsigndx.drevniythings.item;

import net.integralsigndx.drevniythings.Drevniythings;
import net.minecraft.world.item.Item;
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


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
