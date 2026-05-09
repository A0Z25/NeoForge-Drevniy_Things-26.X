package net.integralsigndx.drevniythings.datagen;

import net.integralsigndx.drevniythings.Drevniythings;
import net.integralsigndx.drevniythings.block.ModBlocks;
import net.integralsigndx.drevniythings.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, Drevniythings.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        /* ITEMS */
        itemModels.generateFlatItem(ModItems.AZURITE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_AZURITE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.LITHERITE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ERODIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.KYRONITE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.PLADIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.IONITE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.AETHIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.NANORITE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.XEROTHIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_SILICON.get(), ModelTemplates.FLAT_ITEM);
        /* BLOCKS */
        blockModels.createTrivialCube(ModBlocks.AZURITE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.RAW_AZURITE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.AZURITE_ORE.get());
        blockModels.createTrivialCube(ModBlocks.AZURITE_DEEPSLATE_ORE.get());
        blockModels.createTrivialCube(ModBlocks.AZURITE_NETHER_ORE.get());
        blockModels.createTrivialCube(ModBlocks.AZURITE_END_ORE.get());
        blockModels.createTrivialCube(ModBlocks.SILICON_ORE.get());
        blockModels.createTrivialCube(ModBlocks.SILICON_DEEPSLATE_ORE.get());
        blockModels.createTrivialCube(ModBlocks.BLAZE_CUBE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.CRYSTAL_MATRIX.get());
        blockModels.createTrivialCube(ModBlocks.NEUTRONIUM_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.INFINITY_BLOCK.get());
    }
}
