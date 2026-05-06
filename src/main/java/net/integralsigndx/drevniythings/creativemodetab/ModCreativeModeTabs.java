package net.integralsigndx.drevniythings.creativemodetab;

import net.integralsigndx.drevniythings.Drevniythings;
import net.integralsigndx.drevniythings.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Drevniythings.MODID);

    public static final Supplier<CreativeModeTab> AZURITE_ITEMS_TAB = CREATIVE_MODE_TABS.register("azurite_items_tab",
            ()-> CreativeModeTab.builder()
                    .icon(()->new ItemStack(ModItems.AZURITE.get()))
                    .title(Component.translatable("creativetab.drevniythings.azurite_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.AZURITE);
                        output.accept(ModItems.RAW_AZURITE);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> DREVNIY_THINGS_ITEMS_TAB = CREATIVE_MODE_TABS.register("drevniy_things_items_tab",
            ()-> CreativeModeTab.builder()
                    .icon(()->new ItemStack(ModItems.XEROTHIUM.get()))
                    .title(Component.translatable("creativetab.drevniythings.drevniy_things"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.LITHERITE);
                        output.accept(ModItems.ERODIUM);
                        output.accept(ModItems.KYRONITE);
                        output.accept(ModItems.PLADIUM);
                        output.accept(ModItems.IONITE);
                        output.accept(ModItems.AETHIUM);
                        output.accept(ModItems.NANORITE);
                        output.accept(ModItems.XEROTHIUM);
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
