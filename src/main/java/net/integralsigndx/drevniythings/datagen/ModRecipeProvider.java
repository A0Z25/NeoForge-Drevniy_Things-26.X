package net.integralsigndx.drevniythings.datagen;

import net.integralsigndx.drevniythings.Drevniythings;
import net.integralsigndx.drevniythings.block.ModBlocks;
import net.integralsigndx.drevniythings.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner{
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new ModRecipeProvider(registries,output);
        }

        @Override
        public String getName() {
            return "Drevniy Things Recipes";
        }
    }

    @Override
    protected void buildRecipes() {
        shaped(RecipeCategory.MISC, ModItems.DIAMOND_LATTICE.get())
                .pattern("A A")
                .pattern(" A ")
                .pattern("A A")
                .define('A', Items.DIAMOND)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(output);
        shaped(RecipeCategory.MISC, ModItems.CRYSTAL_MATRIX_INGOT.get())
                .pattern("ASA")
                .pattern("ASA")
                .define('A', ModItems.DIAMOND_LATTICE)
                .define('S', Items.NETHER_STAR)
                .unlockedBy(getHasName(ModItems.DIAMOND_LATTICE), has(ModItems.DIAMOND_LATTICE))
                .save(output);
        /* 4/9 x SAME ITEMS -> 1 x ITEM */
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZURITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A',ModItems.AZURITE.get())
                .unlockedBy(getHasName(ModItems.AZURITE.get()), has(ModItems.AZURITE))
                .group("azurite")
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRYSTAL_MATRIX.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A',ModItems.CRYSTAL_MATRIX_INGOT.get())
                .unlockedBy(getHasName(ModItems.CRYSTAL_MATRIX_INGOT.get()), has(ModItems.CRYSTAL_MATRIX_INGOT))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLAZE_CUBE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A',ModItems.BLAZE_CUBE.get())
                .unlockedBy(getHasName(ModItems.BLAZE_CUBE.get()), has(ModItems.BLAZE_CUBE))
                .save(output);
        shaped(RecipeCategory.MISC, ModItems.NEUTRON_NUGGET.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A',ModItems.NEUTRON_PILE.get())
                .unlockedBy(getHasName(ModItems.NEUTRON_PILE.get()), has(ModItems.NEUTRON_PILE))
                .save(output);
        shaped(RecipeCategory.MISC, ModItems.NEUTRON_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A',ModItems.NEUTRON_NUGGET.get())
                .unlockedBy(getHasName(ModItems.NEUTRON_NUGGET.get()), has(ModItems.NEUTRON_NUGGET))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NEUTRON_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A',ModItems.NEUTRON_INGOT.get())
                .unlockedBy(getHasName(ModItems.NEUTRON_INGOT.get()), has(ModItems.NEUTRON_INGOT))
                .save(output);
        shaped(RecipeCategory.MISC, ModItems.INFINITY_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A',ModItems.INFINITY_NUGGET.get())
                .unlockedBy(getHasName(ModItems.NEUTRON_NUGGET.get()), has(ModItems.INFINITY_NUGGET))
                .save(output,"drevniythings:infinity_ingot_recraft");
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.INFINITY_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A',ModItems.INFINITY_INGOT.get())
                .unlockedBy(getHasName(ModItems.NEUTRON_INGOT.get()), has(ModItems.INFINITY_INGOT))
                .save(output);
        /* 1 x ITEM -> 4/9 x ITEMS */
        shapeless(RecipeCategory.MISC, ModItems.AZURITE.get(), 9)
                .requires(ModBlocks.AZURITE_BLOCK)
                .unlockedBy(getHasName(ModBlocks.AZURITE_BLOCK.get()), has(ModBlocks.AZURITE_BLOCK))
                .group("azurite")
                .save(output, "drevniythings:azurite_block_uncraft");
        shapeless(RecipeCategory.MISC, ModItems.CRYSTAL_MATRIX_INGOT.get(), 9)
                .requires(ModBlocks.CRYSTAL_MATRIX)
                .unlockedBy(getHasName(ModBlocks.CRYSTAL_MATRIX.get()), has(ModBlocks.CRYSTAL_MATRIX))
                .save(output, "drevniythings:crystal_matrix_uncraft");
        shapeless(RecipeCategory.MISC, ModItems.BLAZE_CUBE.get(), 9)
                .requires(ModBlocks.BLAZE_CUBE_BLOCK)
                .unlockedBy(getHasName(ModBlocks.BLAZE_CUBE_BLOCK.get()), has(ModBlocks.BLAZE_CUBE_BLOCK))
                .save(output, "drevniythings:blaze_cube_block_uncraft");
        shapeless(RecipeCategory.MISC, ModItems.NEUTRON_PILE.get(), 9)
                .requires(ModItems.NEUTRON_NUGGET)
                .unlockedBy(getHasName(ModItems.NEUTRON_NUGGET.get()), has(ModItems.NEUTRON_NUGGET))
                .save(output, "drevniythings:neutron_nugget_uncraft");
        shapeless(RecipeCategory.MISC, ModItems.NEUTRON_NUGGET.get(), 9)
                .requires(ModItems.NEUTRON_INGOT)
                .unlockedBy(getHasName(ModItems.NEUTRON_INGOT.get()), has(ModItems.NEUTRON_INGOT))
                .save(output, "drevniythings:neutron_ingot_uncraft");
        shapeless(RecipeCategory.MISC, ModItems.NEUTRON_INGOT.get(), 9)
                .requires(ModBlocks.NEUTRON_BLOCK)
                .unlockedBy(getHasName(ModBlocks.NEUTRON_BLOCK.get()), has(ModBlocks.NEUTRON_BLOCK))
                .save(output, "drevniythings:neutron_block_uncraft");
        shapeless(RecipeCategory.MISC, ModItems.INFINITY_NUGGET.get(), 9)
                .requires(ModItems.INFINITY_INGOT)
                .unlockedBy(getHasName(ModItems.INFINITY_INGOT.get()), has(ModItems.INFINITY_INGOT))
                .save(output, "drevniythings:infinity_ingot_uncraft");
        shapeless(RecipeCategory.MISC, ModItems.INFINITY_INGOT.get(), 9)
                .requires(ModBlocks.INFINITY_BLOCK)
                .unlockedBy(getHasName(ModBlocks.INFINITY_BLOCK.get()), has(ModBlocks.INFINITY_BLOCK))
                .save(output, "drevniythings:infinity_block_uncraft");
        /* GROUP SMELTING */
        List<ItemLike> AZURITE_SMELTABLE = List.of(ModItems.AZURITE, ModBlocks.AZURITE_ORE,
                ModBlocks.AZURITE_DEEPSLATE_ORE, ModBlocks.AZURITE_NETHER_ORE, ModBlocks.AZURITE_END_ORE);
        oreSmelting(AZURITE_SMELTABLE, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.AZURITE.get(), 0.25f, 200, "azurite");
        oreBlasting(AZURITE_SMELTABLE, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.AZURITE.get(), 0.25f, 100, "azurite");
    }

    @Override
    protected <T extends AbstractCookingRecipe> void oreCooking(AbstractCookingRecipe.Factory<T> factory, List<ItemLike> smeltables,
                                                                RecipeCategory craftingCategory, CookingBookCategory cookingCategory, ItemLike result,
                                                                float experience, int cookingTime, String group, String fromDesc) {
        for (ItemLike itemlike : smeltables) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), craftingCategory, cookingCategory, result, experience, cookingTime, factory).group(group).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(output, Drevniythings.MODID + ":" + getItemName(result) + fromDesc + "_" + getItemName(itemlike));
        }
    }
}
