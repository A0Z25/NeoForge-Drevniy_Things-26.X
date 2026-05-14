package net.integralsigndx.drevniythings.datagen;

import net.integralsigndx.drevniythings.Drevniythings;
import net.integralsigndx.drevniythings.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Drevniythings.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.AZURITE_BLOCK.get())
                .add(ModBlocks.RAW_AZURITE_BLOCK.get())
                .add(ModBlocks.AZURITE_ORE.get())
                .add(ModBlocks.AZURITE_DEEPSLATE_ORE.get())
                .add(ModBlocks.AZURITE_NETHER_ORE.get())
                .add(ModBlocks.AZURITE_END_ORE.get())
                .add(ModBlocks.SILICON_ORE.get())
                .add(ModBlocks.SILICON_DEEPSLATE_ORE.get())
                .add(ModBlocks.CRYSTAL_MATRIX.get())
                .add(ModBlocks.BLAZE_CUBE_BLOCK.get())
                .add(ModBlocks.NEUTRON_BLOCK.get())
                .add(ModBlocks.INFINITY_BLOCK.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.AZURITE_ORE.get())
                .add(ModBlocks.AZURITE_DEEPSLATE_ORE.get())
                .add(ModBlocks.AZURITE_NETHER_ORE.get())
                .add(ModBlocks.SILICON_ORE.get())
                .add(ModBlocks.SILICON_DEEPSLATE_ORE.get());
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.AZURITE_END_ORE.get())
                .add(ModBlocks.CRYSTAL_MATRIX.get())
                .add(ModBlocks.BLAZE_CUBE_BLOCK.get());
        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.NEUTRON_BLOCK.get())
                .add(ModBlocks.INFINITY_BLOCK.get());
    }
}
