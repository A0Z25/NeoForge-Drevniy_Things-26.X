package net.integralsigndx.drevniythings.block;

import net.integralsigndx.drevniythings.Drevniythings;
import net.integralsigndx.drevniythings.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Drevniythings.MODID);
    public static final DeferredBlock<Block> AZURITE_BLOCK = registerBlock("azurite_block",
            properties -> new Block(properties
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> RAW_AZURITE_BLOCK = registerBlock("raw_azurite_block",
            properties -> new Block(properties
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> AZURITE_ORE = registerBlock("azurite_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3,5), properties
                    .strength(3.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final DeferredBlock<Block> AZURITE_DEEPSLATE_ORE = registerBlock("azurite_deepslate_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3,6),properties
                    .strength(4.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> AZURITE_NETHER_ORE = registerBlock("azurite_nether_ore",
            properties -> new DropExperienceBlock(UniformInt.of(1,3),properties
                    .strength(3.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_ORE)));
    public static final DeferredBlock<Block> AZURITE_END_ORE = registerBlock("azurite_end_ore",
            properties -> new DropExperienceBlock(UniformInt.of(5,8),properties
                    .strength(4.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SILICON_ORE = registerBlock("silicon_ore",
            properties -> new DropExperienceBlock(UniformInt.of(1,5),properties
                    .strength(3.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SILICON_DEEPSLATE_ORE = registerBlock("silicon_deepslate_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2,5),properties
                    .strength(4.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> CRYSTAL_MATRIX = registerBlock("crystal_matrix",
            properties -> new Block(properties
                    .strength(7.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));
    public static final DeferredBlock<Block> BLAZE_CUBE_BLOCK = registerBlock("blaze_cube_block",
            properties -> new Block(properties
                    .strength(5.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));
    public static final DeferredBlock<Block> NEUTRON_BLOCK = registerBlock("neutron_block",
            properties -> new Block(properties
                    .strength(10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> INFINITY_BLOCK = registerBlock("infinity_block",
            properties -> new Block(properties
                    .strength(55.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function){
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name,function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
        ModItems.ITEMS.registerItem(name,properties -> new BlockItem(block.get(),properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
