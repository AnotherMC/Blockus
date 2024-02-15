package com.brand.blockus.data.providers;

import com.brand.blockus.content.BlockusBlocks;
import com.brand.blockus.content.BlockusEntities;
import com.brand.blockus.content.BlockusItems;
import com.brand.blockus.content.types.*;
import com.brand.blockus.data.family.BlockusWoodFamilies;
import com.brand.blockus.utils.tags.BlockusItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.resource.featuretoggle.FeatureSet;


public class BlockusRecipeProvider extends FabricRecipeProvider {
    public BlockusRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        for (BSSWTypes bsswType : BSSWTypes.values()) {
        }

        for (BSSTypes bssType : BSSTypes.values()) {
        }

        for (ConcreteTypes concreteType : ConcreteTypes.values()) {
            offerStonecuttingRecipe(exporter, concreteType.block, concreteType.base);
            offerStonecuttingRecipe(exporter, concreteType.chiseled, concreteType.base, concreteType.block);
            offerStonecuttingRecipe(exporter, concreteType.pillar, concreteType.base, concreteType.block);
            offerPolishedStoneRecipe(exporter, concreteType.block, concreteType.base);
        }

        for (TimberFrameTypes timberFrameType : TimberFrameTypes.values()) {
            createTimberFramesRecipes(exporter, timberFrameType.base, timberFrameType.block, timberFrameType.diagonal, timberFrameType.cross);
        }

        for (AsphaltTypes asphaltTypes : AsphaltTypes.values()) {

        }

        generateFamilies(exporter, FeatureSet.of(FeatureFlags.VANILLA));

        offerPillarRecipe(exporter, BlockusBlocks.MUD_BRICK_PILLAR, Blocks.MUD_BRICKS);
        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_MUD_BRICKS, Blocks.MUD_BRICKS);

        // Stone

        offerStonecuttingRecipe(exporter, BlockusBlocks.HERRINGBONE_STONE_BRICKS, Blocks.STONE, Blocks.STONE_BRICKS);



        offerSturdyRecipe(exporter, BlockusBlocks.STURDY_STONE, Blocks.STONE, Blocks.COBBLESTONE);




        // Andesite
        offerStonecuttingRecipe(exporter, BlockusBlocks.ANDESITE_BRICKS.block, Blocks.ANDESITE, Blocks.POLISHED_ANDESITE);



        offerPolishedStoneRecipe(exporter, BlockusBlocks.ANDESITE_BRICKS.block, Blocks.POLISHED_ANDESITE);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(BlockusBlocks.ANDESITE_BRICKS.block), RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.CRACKED_ANDESITE_BRICKS.asItem(), 0.1F, 200).criterion(hasItem(BlockusBlocks.ANDESITE_BRICKS.block), conditionsFromItem(BlockusBlocks.ANDESITE_BRICKS.block)).offerTo(exporter);

        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_ANDESITE_BRICKS, Blocks.ANDESITE, Blocks.POLISHED_ANDESITE, BlockusBlocks.ANDESITE_BRICKS.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.POLISHED_ANDESITE_PILLAR, Blocks.ANDESITE, Blocks.POLISHED_ANDESITE, BlockusBlocks.ANDESITE_BRICKS.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.HERRINGBONE_ANDESITE_BRICKS, Blocks.ANDESITE, Blocks.POLISHED_ANDESITE, BlockusBlocks.ANDESITE_BRICKS.block);




        // Diorite
        offerStonecuttingRecipe(exporter, BlockusBlocks.DIORITE_BRICKS.block, Blocks.DIORITE, Blocks.POLISHED_DIORITE);



        offerPolishedStoneRecipe(exporter, BlockusBlocks.DIORITE_BRICKS.block, Blocks.POLISHED_DIORITE);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(BlockusBlocks.DIORITE_BRICKS.block), RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.CRACKED_DIORITE_BRICKS.asItem(), 0.1F, 200).criterion(hasItem(BlockusBlocks.DIORITE_BRICKS.block), conditionsFromItem(BlockusBlocks.DIORITE_BRICKS.block)).offerTo(exporter);


        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_DIORITE_BRICKS, Blocks.DIORITE, Blocks.POLISHED_DIORITE, BlockusBlocks.DIORITE_BRICKS.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.POLISHED_DIORITE_PILLAR, Blocks.DIORITE, Blocks.POLISHED_DIORITE, BlockusBlocks.DIORITE_BRICKS.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.HERRINGBONE_DIORITE_BRICKS, Blocks.DIORITE, Blocks.POLISHED_DIORITE, BlockusBlocks.DIORITE_BRICKS.block);




        // Granite
        offerStonecuttingRecipe(exporter, BlockusBlocks.GRANITE_BRICKS.block, Blocks.GRANITE, Blocks.POLISHED_GRANITE);



        offerPolishedStoneRecipe(exporter, BlockusBlocks.GRANITE_BRICKS.block, Blocks.POLISHED_GRANITE);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(BlockusBlocks.GRANITE_BRICKS.block), RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.CRACKED_GRANITE_BRICKS.asItem(), 0.1F, 200).criterion(hasItem(BlockusBlocks.GRANITE_BRICKS.block), conditionsFromItem(BlockusBlocks.GRANITE_BRICKS.block)).offerTo(exporter);

        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_GRANITE_BRICKS, Blocks.GRANITE, Blocks.POLISHED_GRANITE, BlockusBlocks.GRANITE_BRICKS.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.POLISHED_GRANITE_PILLAR, Blocks.GRANITE, Blocks.POLISHED_GRANITE, BlockusBlocks.GRANITE_BRICKS.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.HERRINGBONE_GRANITE_BRICKS, Blocks.GRANITE, Blocks.POLISHED_GRANITE, BlockusBlocks.GRANITE_BRICKS.block);




        // Dripstone
        offerStonecuttingRecipe(exporter, BlockusBlocks.POLISHED_DRIPSTONE.block, Blocks.DRIPSTONE_BLOCK);


        offerPolishedStoneRecipe(exporter, BlockusBlocks.POLISHED_DRIPSTONE.block, Blocks.DRIPSTONE_BLOCK);

        offerStonecuttingRecipe(exporter, BlockusBlocks.DRIPSTONE_BRICKS.block, Blocks.DRIPSTONE_BLOCK, BlockusBlocks.POLISHED_DRIPSTONE.block);



        offerPolishedStoneRecipe(exporter, BlockusBlocks.DRIPSTONE_BRICKS.block, BlockusBlocks.POLISHED_DRIPSTONE.block);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(BlockusBlocks.DRIPSTONE_BRICKS.block), RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.CRACKED_DRIPSTONE_BRICKS.asItem(), 0.1F, 200).criterion(hasItem(BlockusBlocks.DRIPSTONE_BRICKS.block), conditionsFromItem(BlockusBlocks.DRIPSTONE_BRICKS.block)).offerTo(exporter);

        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_DRIPSTONE, Blocks.DRIPSTONE_BLOCK, BlockusBlocks.POLISHED_DRIPSTONE.block, BlockusBlocks.DRIPSTONE_BRICKS.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.DRIPSTONE_PILLAR, Blocks.DRIPSTONE_BLOCK, BlockusBlocks.POLISHED_DRIPSTONE.block, BlockusBlocks.DRIPSTONE_BRICKS.block);


        // Amethyst
        offerStonecuttingRecipe(exporter, BlockusBlocks.POLISHED_AMETHYST.block, Blocks.AMETHYST_BLOCK);


        offerPolishedStoneRecipe(exporter, BlockusBlocks.POLISHED_AMETHYST.block, Blocks.AMETHYST_BLOCK);

        offerStonecuttingRecipe(exporter, BlockusBlocks.AMETHYST_BRICKS.block, Blocks.AMETHYST_BLOCK, BlockusBlocks.POLISHED_AMETHYST.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.AMETHYST_BRICKS.block);



        offerPolishedStoneRecipe(exporter, BlockusBlocks.AMETHYST_BRICKS.block, BlockusBlocks.POLISHED_AMETHYST.block);

        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_AMETHYST, Blocks.AMETHYST_BLOCK, BlockusBlocks.POLISHED_AMETHYST.block, BlockusBlocks.AMETHYST_BRICKS.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.AMETHYST_PILLAR, Blocks.AMETHYST_BLOCK, BlockusBlocks.POLISHED_AMETHYST.block, BlockusBlocks.AMETHYST_BRICKS.block);

        // Deepslate
        offerMossyRecipe(exporter, BlockusBlocks.MOSSY_DEEPSLATE_BRICKS.block, Blocks.DEEPSLATE_BRICKS);

        offerStonecuttingRecipe(exporter, BlockusBlocks.DEEPSLATE_PILLAR, Blocks.COBBLED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE, Blocks.DEEPSLATE_BRICKS);
        offerStonecuttingRecipe(exporter, BlockusBlocks.HERRINGBONE_DEEPSLATE_BRICKS, Blocks.COBBLED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE, Blocks.DEEPSLATE_BRICKS);


        offerSturdyRecipe(exporter, BlockusBlocks.STURDY_DEEPSLATE, Blocks.DEEPSLATE, Blocks.COBBLED_DEEPSLATE);




        // Sculk
        offerStonecuttingRecipe(exporter, BlockusBlocks.POLISHED_SCULK.block, Blocks.SCULK);


        offerPolishedStoneRecipe(exporter, BlockusBlocks.POLISHED_SCULK.block, Blocks.SCULK);

        offerStonecuttingRecipe(exporter, BlockusBlocks.SCULK_BRICKS.block, Blocks.SCULK, BlockusBlocks.POLISHED_SCULK.block);




        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_SCULK_BRICKS, Blocks.SCULK, BlockusBlocks.POLISHED_SCULK.block, BlockusBlocks.SCULK_BRICKS.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.SCULK_PILLAR, Blocks.SCULK, BlockusBlocks.POLISHED_SCULK.block, BlockusBlocks.SCULK_BRICKS.block);

        offerPolishedStoneRecipe(exporter, BlockusBlocks.SCULK_BRICKS.block, BlockusBlocks.POLISHED_SCULK.block);


        // Blackstone
        offerStonecuttingRecipe(exporter, BlockusBlocks.POLISHED_BLACKSTONE_TILES.block, Blocks.BLACKSTONE, Blocks.POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE_BRICKS);



        offerPolishedStoneRecipe(exporter, BlockusBlocks.POLISHED_BLACKSTONE_TILES.block, Blocks.POLISHED_BLACKSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, BlockusBlocks.POLISHED_BLACKSTONE_PILLAR, Blocks.BLACKSTONE, Blocks.POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, BlockusBlocks.HERRINGBONE_POLISHED_BLACKSTONE_BRICKS, Blocks.BLACKSTONE, Blocks.POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE_BRICKS);


        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.CRIMSON_WARTY_BLACKSTONE_BRICKS.block).input(Blocks.POLISHED_BLACKSTONE_BRICKS).input(Blocks.CRIMSON_ROOTS).criterion("has_roots", conditionsFromItem(Blocks.CRIMSON_ROOTS)).offerTo(exporter);




        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.WARPED_WARTY_BLACKSTONE_BRICKS.block).input(Blocks.POLISHED_BLACKSTONE_BRICKS).input(BlockusItemTags.WARPED_NETHER_GRASS).criterion("has_roots", conditionsFromTag(BlockusItemTags.WARPED_NETHER_GRASS)).offerTo(exporter);




        offerSturdyRecipe(exporter, BlockusBlocks.STURDY_BLACKSTONE, Blocks.POLISHED_BLACKSTONE, Blocks.BLACKSTONE);
        offerDecoratedRecipe(exporter, BlockusBlocks.GOLD_DECORATED_POLISHED_BLACKSTONE, Items.GOLD_INGOT, Blocks.POLISHED_BLACKSTONE);




        // Basalt


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.ROUGH_BASALT.block, 2).input('#', Blocks.BASALT).pattern("#").pattern("#").criterion("has_basalt", conditionsFromItem(Blocks.BASALT)).offerTo(exporter);

        offerStonecuttingRecipe(exporter, BlockusBlocks.POLISHED_BASALT_BRICKS.block, Blocks.BASALT, Blocks.POLISHED_BASALT);



        offerPolishedStoneRecipe(exporter, BlockusBlocks.POLISHED_BASALT_BRICKS.block, Blocks.POLISHED_BASALT);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(BlockusBlocks.POLISHED_BASALT_BRICKS.block), RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.CRACKED_POLISHED_BASALT_BRICKS.asItem(), 0.1F, 200).criterion(hasItem(BlockusBlocks.POLISHED_BASALT_BRICKS.block), conditionsFromItem(BlockusBlocks.POLISHED_BASALT_BRICKS.block)).offerTo(exporter);

        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_POLISHED_BASALT, Blocks.BASALT, Blocks.POLISHED_BASALT, BlockusBlocks.POLISHED_BASALT_BRICKS.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.POLISHED_BASALT_PILLAR, Blocks.BASALT, Blocks.POLISHED_BASALT, BlockusBlocks.POLISHED_BASALT_BRICKS.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.HERRINGBONE_POLISHED_BASALT_BRICKS, Blocks.BASALT, Blocks.POLISHED_BASALT, BlockusBlocks.POLISHED_BASALT_BRICKS.block);





        // Wart Blocks
        offerStonecuttingRecipe(exporter, BlockusBlocks.CRIMSON_WART_BRICKS.block, Blocks.NETHER_WART_BLOCK);



        offerPolishedStoneRecipe(exporter, BlockusBlocks.CRIMSON_WART_BRICKS.block, Blocks.NETHER_WART_BLOCK);

        offerStonecuttingRecipe(exporter, BlockusBlocks.WARPED_WART_BRICKS.block, Blocks.WARPED_WART_BLOCK);



        offerPolishedStoneRecipe(exporter, BlockusBlocks.WARPED_WART_BRICKS.block, Blocks.WARPED_WART_BLOCK);

        // Limestone



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.LIMESTONE.block).input('#', Blocks.COBBLESTONE).input('X', Items.BONE_MEAL).pattern("#X").pattern("X#").criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE)).offerTo(exporter);

        offerStonecuttingRecipe(exporter, BlockusBlocks.POLISHED_LIMESTONE.block, BlockusBlocks.LIMESTONE.block);


        offerPolishedStoneRecipe(exporter, BlockusBlocks.POLISHED_LIMESTONE.block, BlockusBlocks.LIMESTONE.block);

        offerStonecuttingRecipe(exporter, BlockusBlocks.LIMESTONE_BRICKS.block, BlockusBlocks.LIMESTONE.block, BlockusBlocks.POLISHED_LIMESTONE.block);



        offerPolishedStoneRecipe(exporter, BlockusBlocks.LIMESTONE_BRICKS.block, BlockusBlocks.POLISHED_LIMESTONE.block);

        offerStonecuttingRecipe(exporter, BlockusBlocks.SMALL_LIMESTONE_BRICKS.block, BlockusBlocks.LIMESTONE.block, BlockusBlocks.POLISHED_LIMESTONE.block, BlockusBlocks.LIMESTONE_BRICKS.block);




        offerStonecuttingRecipe(exporter, BlockusBlocks.LIMESTONE_TILES.block, BlockusBlocks.LIMESTONE.block, BlockusBlocks.POLISHED_LIMESTONE.block, BlockusBlocks.LIMESTONE_BRICKS.block);



        offerPolishedStoneRecipe(exporter, BlockusBlocks.LIMESTONE_TILES.block, BlockusBlocks.LIMESTONE_BRICKS.block);

        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_LIMESTONE, BlockusBlocks.LIMESTONE.block, BlockusBlocks.POLISHED_LIMESTONE.block, BlockusBlocks.LIMESTONE_BRICKS.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_LIMESTONE_PILLAR, BlockusBlocks.LIMESTONE.block, BlockusBlocks.POLISHED_LIMESTONE.block, BlockusBlocks.LIMESTONE_BRICKS.block, BlockusBlocks.LIMESTONE_PILLAR);
        offerStonecuttingRecipe(exporter, BlockusBlocks.LIMESTONE_PILLAR, BlockusBlocks.LIMESTONE.block, BlockusBlocks.POLISHED_LIMESTONE.block, BlockusBlocks.LIMESTONE_BRICKS.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.LIMESTONE_SQUARES, BlockusBlocks.LIMESTONE.block, BlockusBlocks.POLISHED_LIMESTONE.block, BlockusBlocks.LIMESTONE_BRICKS.block);




        // Marble




        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.MARBLE.block).input('#', BlockusBlocks.LIMESTONE.block).input('X', Items.BONE_MEAL).pattern("#X").pattern("X#").group("marble").criterion(hasItem(BlockusBlocks.LIMESTONE.block), conditionsFromItem(BlockusBlocks.LIMESTONE.block)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.MARBLE.block).input(Blocks.CALCITE).input(BlockusBlocks.LIMESTONE.block).group("marble").criterion(hasItem(Blocks.CALCITE), conditionsFromItem(Blocks.CALCITE)).offerTo(exporter, convertBetween(BlockusBlocks.MARBLE.block, Blocks.CALCITE));
        offerPolishedStoneRecipe(exporter, BlockusBlocks.POLISHED_MARBLE.block, BlockusBlocks.MARBLE.block);

        offerStonecuttingRecipe(exporter, BlockusBlocks.POLISHED_MARBLE.block, BlockusBlocks.MARBLE.block);



        offerStonecuttingRecipe(exporter, BlockusBlocks.MARBLE_BRICKS.block, BlockusBlocks.MARBLE.block, BlockusBlocks.POLISHED_MARBLE.block);



        offerPolishedStoneRecipe(exporter, BlockusBlocks.MARBLE_BRICKS.block, BlockusBlocks.POLISHED_MARBLE.block);

        offerStonecuttingRecipe(exporter, BlockusBlocks.SMALL_MARBLE_BRICKS.block, BlockusBlocks.MARBLE.block, BlockusBlocks.POLISHED_MARBLE.block, BlockusBlocks.MARBLE_BRICKS.block);




        offerStonecuttingRecipe(exporter, BlockusBlocks.MARBLE_TILES.block, BlockusBlocks.MARBLE.block, BlockusBlocks.POLISHED_MARBLE.block, BlockusBlocks.MARBLE_BRICKS.block);



        offerPolishedStoneRecipe(exporter, BlockusBlocks.MARBLE_TILES.block, BlockusBlocks.MARBLE_BRICKS.block);

        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_MARBLE, BlockusBlocks.MARBLE.block, BlockusBlocks.POLISHED_MARBLE.block, BlockusBlocks.MARBLE_BRICKS.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_MARBLE_PILLAR, BlockusBlocks.MARBLE.block, BlockusBlocks.POLISHED_MARBLE.block, BlockusBlocks.MARBLE_BRICKS.block, BlockusBlocks.MARBLE_PILLAR);
        offerStonecuttingRecipe(exporter, BlockusBlocks.MARBLE_PILLAR, BlockusBlocks.MARBLE.block, BlockusBlocks.POLISHED_MARBLE.block, BlockusBlocks.MARBLE_BRICKS.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.MARBLE_SQUARES, BlockusBlocks.MARBLE.block, BlockusBlocks.POLISHED_MARBLE.block, BlockusBlocks.MARBLE_BRICKS.block);




        // Bluestone




        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.BLUESTONE.block, 4).input('S', Blocks.STONE).input('#', Items.BLUE_DYE).pattern(" S ").pattern("S#S").pattern(" S ").criterion(hasItem(Items.BLUE_DYE), conditionsFromItem(Items.BLUE_DYE)).criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE)).offerTo(exporter);
        offerPolishedStoneRecipe(exporter, BlockusBlocks.POLISHED_BLUESTONE.block, BlockusBlocks.BLUESTONE.block);

        offerStonecuttingRecipe(exporter, BlockusBlocks.POLISHED_BLUESTONE.block, BlockusBlocks.BLUESTONE.block);



        offerStonecuttingRecipe(exporter, BlockusBlocks.BLUESTONE_BRICKS.block, BlockusBlocks.BLUESTONE.block, BlockusBlocks.POLISHED_BLUESTONE.block);



        offerPolishedStoneRecipe(exporter, BlockusBlocks.BLUESTONE_BRICKS.block, BlockusBlocks.POLISHED_BLUESTONE.block);

        offerStonecuttingRecipe(exporter, BlockusBlocks.SMALL_BLUESTONE_BRICKS.block, BlockusBlocks.BLUESTONE.block, BlockusBlocks.POLISHED_BLUESTONE.block, BlockusBlocks.BLUESTONE_BRICKS.block);




        offerStonecuttingRecipe(exporter, BlockusBlocks.BLUESTONE_TILES.block, BlockusBlocks.BLUESTONE.block, BlockusBlocks.POLISHED_BLUESTONE.block, BlockusBlocks.BLUESTONE_BRICKS.block);



        offerPolishedStoneRecipe(exporter, BlockusBlocks.BLUESTONE_TILES.block, BlockusBlocks.BLUESTONE_BRICKS.block);

        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_BLUESTONE, BlockusBlocks.BLUESTONE.block, BlockusBlocks.POLISHED_BLUESTONE.block, BlockusBlocks.BLUESTONE_BRICKS.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.BLUESTONE_PILLAR, BlockusBlocks.BLUESTONE.block, BlockusBlocks.POLISHED_BLUESTONE.block, BlockusBlocks.BLUESTONE_BRICKS.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_BLUESTONE_PILLAR, BlockusBlocks.BLUESTONE.block, BlockusBlocks.POLISHED_BLUESTONE.block, BlockusBlocks.BLUESTONE_BRICKS.block, BlockusBlocks.BLUESTONE_PILLAR);
        offerStonecuttingRecipe(exporter, BlockusBlocks.BLUESTONE_SQUARES, BlockusBlocks.BLUESTONE.block, BlockusBlocks.POLISHED_BLUESTONE.block, BlockusBlocks.BLUESTONE_BRICKS.block);





        // Viridite




        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.VIRIDITE.block, 4).input('S', Blocks.DEEPSLATE).input('#', Blocks.SCULK).pattern(" S ").pattern("S#S").pattern(" S ").criterion(hasItem(Blocks.SCULK), conditionsFromItem(Blocks.SCULK)).criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.VIRIDITE.block, 4).input('S', Blocks.DEEPSLATE).input('#', Items.GREEN_DYE).pattern(" S ").pattern("S#S").pattern(" S ").criterion(hasItem(Items.GREEN_DYE), conditionsFromItem(Items.GREEN_DYE)).criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE)).offerTo(exporter, convertBetween(BlockusBlocks.VIRIDITE.block, Items.GREEN_DYE));
        offerPolishedStoneRecipe(exporter, BlockusBlocks.POLISHED_VIRIDITE.block, BlockusBlocks.VIRIDITE.block);

        offerStonecuttingRecipe(exporter, BlockusBlocks.POLISHED_VIRIDITE.block, BlockusBlocks.VIRIDITE.block);



        offerStonecuttingRecipe(exporter, BlockusBlocks.VIRIDITE_BRICKS.block, BlockusBlocks.VIRIDITE.block, BlockusBlocks.POLISHED_VIRIDITE.block);



        offerPolishedStoneRecipe(exporter, BlockusBlocks.VIRIDITE_BRICKS.block, BlockusBlocks.POLISHED_VIRIDITE.block);

        offerStonecuttingRecipe(exporter, BlockusBlocks.SMALL_VIRIDITE_BRICKS.block, BlockusBlocks.VIRIDITE.block, BlockusBlocks.POLISHED_VIRIDITE.block, BlockusBlocks.VIRIDITE_BRICKS.block);




        offerStonecuttingRecipe(exporter, BlockusBlocks.VIRIDITE_TILES.block, BlockusBlocks.VIRIDITE.block, BlockusBlocks.POLISHED_VIRIDITE.block, BlockusBlocks.VIRIDITE_BRICKS.block);



        offerPolishedStoneRecipe(exporter, BlockusBlocks.VIRIDITE_TILES.block, BlockusBlocks.VIRIDITE_BRICKS.block);

        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_VIRIDITE, BlockusBlocks.VIRIDITE.block, BlockusBlocks.POLISHED_VIRIDITE.block, BlockusBlocks.VIRIDITE_BRICKS.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.VIRIDITE_PILLAR, BlockusBlocks.VIRIDITE.block, BlockusBlocks.POLISHED_VIRIDITE.block, BlockusBlocks.VIRIDITE_BRICKS.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_VIRIDITE_PILLAR, BlockusBlocks.VIRIDITE.block, BlockusBlocks.POLISHED_VIRIDITE.block, BlockusBlocks.VIRIDITE_BRICKS.block, BlockusBlocks.VIRIDITE_PILLAR);
        offerStonecuttingRecipe(exporter, BlockusBlocks.VIRIDITE_SQUARES, BlockusBlocks.VIRIDITE.block, BlockusBlocks.POLISHED_VIRIDITE.block, BlockusBlocks.VIRIDITE_BRICKS.block);



        // Snow Bricks



        offerStonecuttingRecipe(exporter, BlockusBlocks.SNOW_PILLAR, BlockusBlocks.SNOW_BRICKS.block);
        offerPolishedStoneRecipe(exporter, BlockusBlocks.SNOW_BRICKS.block, Blocks.SNOW_BLOCK);

        // Ice Bricks
        offerStonecuttingRecipe(exporter, BlockusBlocks.ICE_PILLAR, BlockusBlocks.ICE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.ICE_BRICKS, 4).input('#', BlockusItemTags.NATURAL_ICE).pattern("##").pattern("##").criterion("has_ice", conditionsFromTag(BlockusItemTags.NATURAL_ICE)).offerTo(exporter);



        // Charred Nether Bricks

        // Teal Nether Bricks



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.GLOWING_OBSIDIAN, 4).input('S', Blocks.OBSIDIAN).input('#', Blocks.SHROOMLIGHT).pattern(" S ").pattern("S#S").pattern(" S ").criterion(hasItem(Blocks.SHROOMLIGHT), conditionsFromItem(Blocks.SHROOMLIGHT)).offerTo(exporter);




        // Prismarine
        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_PRISMARINE, Blocks.PRISMARINE_BRICKS);
        offerStonecuttingRecipe(exporter, BlockusBlocks.PRISMARINE_PILLAR, Blocks.PRISMARINE_BRICKS);

        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_DARK_PRISMARINE, Blocks.DARK_PRISMARINE);
        offerStonecuttingRecipe(exporter, BlockusBlocks.DARK_PRISMARINE_PILLAR, Blocks.DARK_PRISMARINE);




        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.PRISMARINE_TILES.block, 4).input('#', Blocks.DARK_PRISMARINE).input('X', Items.PRISMARINE_SHARD).pattern("#X").pattern("X#").criterion(hasItem(Blocks.DARK_PRISMARINE), conditionsFromItem(Blocks.DARK_PRISMARINE)).offerTo(exporter);

        // Bricks
        offerStonecuttingRecipe(exporter, BlockusBlocks.LARGE_BRICKS.block, Blocks.BRICKS);



        offerPolishedStoneRecipe(exporter, BlockusBlocks.LARGE_BRICKS.block, Blocks.BRICKS);

        offerStonecuttingRecipe(exporter, BlockusBlocks.HERRINGBONE_BRICKS, Blocks.BRICKS);

        // Soaked Bricks



        offerStonecuttingRecipe(exporter, BlockusBlocks.HERRINGBONE_SOAKED_BRICKS, BlockusBlocks.SOAKED_BRICKS.block);
        createEnclosedRecipe(BlockusBlocks.SOAKED_BRICKS.block, Ingredient.ofItems(Blocks.BRICKS), Items.WATER_BUCKET).criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET)).criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS)).offerTo(exporter);

        // Sandy Bricks



        offerStonecuttingRecipe(exporter, BlockusBlocks.HERRINGBONE_SANDY_BRICKS, BlockusBlocks.SANDY_BRICKS.block);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.SANDY_BRICKS.block, 2).input('S', Blocks.SAND).input('#', Blocks.BRICKS).pattern(" S ").pattern("S#S").pattern(" S ").criterion("has_sand", conditionsFromItem(Blocks.SAND)).criterion("has_bricks", conditionsFromItem(Blocks.BRICKS)).offerTo(exporter);

        // Charred Bricks



        // Sandstone



        offerStonecuttingRecipe(exporter, BlockusBlocks.SANDSTONE_BRICKS.block, Blocks.SANDSTONE);




        offerStonecuttingRecipe(exporter, BlockusBlocks.SMALL_SANDSTONE_BRICKS.block, Blocks.SANDSTONE, BlockusBlocks.SANDSTONE_BRICKS.block);




        offerStonecuttingRecipe(exporter, BlockusBlocks.SANDSTONE_PILLAR, Blocks.SANDSTONE, BlockusBlocks.SANDSTONE_BRICKS.block);

        offerDecoratedRecipe(exporter, BlockusBlocks.GOLD_DECORATED_SANDSTONE, Items.GOLD_INGOT, Blocks.CUT_SANDSTONE);
        offerDecoratedRecipe(exporter, BlockusBlocks.LAPIS_DECORATED_SANDSTONE, Items.LAPIS_LAZULI, Blocks.CUT_SANDSTONE);

        // Red Sandstone


        offerStonecuttingRecipe(exporter, BlockusBlocks.RED_SANDSTONE_BRICKS.block, Blocks.RED_SANDSTONE);




        offerStonecuttingRecipe(exporter, BlockusBlocks.SMALL_RED_SANDSTONE_BRICKS.block, Blocks.RED_SANDSTONE, BlockusBlocks.RED_SANDSTONE_BRICKS.block);




        offerStonecuttingRecipe(exporter, BlockusBlocks.RED_SANDSTONE_PILLAR, Blocks.RED_SANDSTONE, BlockusBlocks.RED_SANDSTONE_BRICKS.block);

        offerDecoratedRecipe(exporter, BlockusBlocks.GOLD_DECORATED_RED_SANDSTONE, Items.GOLD_INGOT, Blocks.CUT_RED_SANDSTONE);
        offerDecoratedRecipe(exporter, BlockusBlocks.LAPIS_DECORATED_RED_SANDSTONE, Items.LAPIS_LAZULI, Blocks.CUT_RED_SANDSTONE);

        // Honeycomb Bricks
        offerStonecuttingRecipe(exporter, BlockusBlocks.HONEYCOMB_BRICKS.block, Blocks.HONEYCOMB_BLOCK);



        offerPolishedStoneRecipe(exporter, BlockusBlocks.HONEYCOMB_BRICKS.block, Blocks.HONEYCOMB_BLOCK);

        // Purpur Blocks
        offerStonecuttingRecipe(exporter, BlockusBlocks.POLISHED_PURPUR.block, Blocks.PURPUR_BLOCK);


        offerPolishedStoneRecipe(exporter, BlockusBlocks.POLISHED_PURPUR.block, Blocks.PURPUR_BLOCK);

        offerStonecuttingRecipe(exporter, BlockusBlocks.PURPUR_BRICKS.block, Blocks.PURPUR_BLOCK, BlockusBlocks.POLISHED_PURPUR.block);




        offerStonecuttingRecipe(exporter, BlockusBlocks.SMALL_PURPUR_BRICKS.block, Blocks.PURPUR_BLOCK, BlockusBlocks.POLISHED_PURPUR.block, BlockusBlocks.PURPUR_BRICKS.block);




        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_PURPUR, Blocks.PURPUR_BLOCK, BlockusBlocks.POLISHED_PURPUR.block, BlockusBlocks.PURPUR_BRICKS.block);
        offerStonecuttingRecipe(exporter, Blocks.PURPUR_PILLAR, BlockusBlocks.POLISHED_PURPUR.block, BlockusBlocks.PURPUR_BRICKS.block);
        offerStonecuttingRecipe(exporter, BlockusBlocks.PURPUR_SQUARES, Blocks.PURPUR_BLOCK, BlockusBlocks.POLISHED_PURPUR.block, BlockusBlocks.PURPUR_BRICKS.block);


        // Phantom Purpur Blocks



        offerPhantomPurpurRecipe(exporter, BlockusBlocks.PHANTOM_PURPUR_BLOCK.block, Blocks.PURPUR_BLOCK);
        offerPolishedStoneRecipe(exporter, BlockusBlocks.POLISHED_PHANTOM_PURPUR.block, BlockusBlocks.PHANTOM_PURPUR_BLOCK.block);

        offerStonecuttingRecipe(exporter, BlockusBlocks.POLISHED_PHANTOM_PURPUR.block, BlockusBlocks.PHANTOM_PURPUR_BLOCK.block);


        offerPhantomPurpurRecipe(exporter, BlockusBlocks.POLISHED_PHANTOM_PURPUR.block, BlockusBlocks.POLISHED_PURPUR.block);

        offerStonecuttingRecipe(exporter, BlockusBlocks.PHANTOM_PURPUR_BRICKS.block, BlockusBlocks.PHANTOM_PURPUR_BLOCK.block, BlockusBlocks.POLISHED_PHANTOM_PURPUR.block);



        offerPhantomPurpurRecipe(exporter, BlockusBlocks.PHANTOM_PURPUR_BRICKS.block, BlockusBlocks.PURPUR_BRICKS.block);
        offerPolishedStoneRecipe(exporter, BlockusBlocks.PHANTOM_PURPUR_BRICKS.block, BlockusBlocks.POLISHED_PHANTOM_PURPUR.block);

        offerStonecuttingRecipe(exporter, BlockusBlocks.SMALL_PHANTOM_PURPUR_BRICKS.block, BlockusBlocks.PHANTOM_PURPUR_BLOCK.block, BlockusBlocks.POLISHED_PHANTOM_PURPUR.block, BlockusBlocks.PHANTOM_PURPUR_BRICKS.block);



        offerPhantomPurpurRecipe(exporter, BlockusBlocks.SMALL_PHANTOM_PURPUR_BRICKS.block, BlockusBlocks.PHANTOM_PURPUR_BRICKS.block);

        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_PHANTOM_PURPUR, BlockusBlocks.PHANTOM_PURPUR_BLOCK.block, BlockusBlocks.POLISHED_PHANTOM_PURPUR.block, BlockusBlocks.PHANTOM_PURPUR_BRICKS.block);
        offerPhantomPurpurRecipe(exporter, BlockusBlocks.CHISELED_PHANTOM_PURPUR, BlockusBlocks.CHISELED_PURPUR);

        offerStonecuttingRecipe(exporter, BlockusBlocks.PHANTOM_PURPUR_PILLAR, BlockusBlocks.PHANTOM_PURPUR_BLOCK.block, BlockusBlocks.POLISHED_PHANTOM_PURPUR.block, BlockusBlocks.PHANTOM_PURPUR_BRICKS.block);
        offerPhantomPurpurRecipe(exporter, BlockusBlocks.PHANTOM_PURPUR_PILLAR, Blocks.PURPUR_PILLAR);

        offerStonecuttingRecipe(exporter, BlockusBlocks.PHANTOM_PURPUR_SQUARES, BlockusBlocks.PHANTOM_PURPUR_BLOCK.block, BlockusBlocks.POLISHED_PHANTOM_PURPUR.block, BlockusBlocks.PHANTOM_PURPUR_BRICKS.block);
        offerPhantomPurpurRecipe(exporter, BlockusBlocks.PHANTOM_PURPUR_SQUARES, BlockusBlocks.PURPUR_SQUARES);




        // End Stone
        offerStonecuttingRecipe(exporter, BlockusBlocks.POLISHED_END_STONE.block, Blocks.END_STONE);


        offerPolishedStoneRecipe(exporter, BlockusBlocks.POLISHED_END_STONE.block, Blocks.END_STONE);

        offerStonecuttingRecipe(exporter, Blocks.END_STONE_BRICKS, BlockusBlocks.POLISHED_END_STONE.block);


        offerStonecuttingRecipe(exporter, Blocks.END_STONE_BRICK_WALL, BlockusBlocks.POLISHED_END_STONE.block);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Blocks.END_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.CRACKED_END_STONE_BRICKS.asItem(), 0.1F, 200).criterion("has_end_stone_bricks", conditionsFromItem(Blocks.END_STONE_BRICKS)).offerTo(exporter);

        offerStonecuttingRecipe(exporter, BlockusBlocks.SMALL_END_STONE_BRICKS.block, Blocks.END_STONE, BlockusBlocks.POLISHED_END_STONE.block, Blocks.END_STONE_BRICKS);




        offerStonecuttingRecipe(exporter, BlockusBlocks.CHISELED_END_STONE_BRICKS, Blocks.END_STONE, BlockusBlocks.POLISHED_END_STONE.block, Blocks.END_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, BlockusBlocks.END_STONE_PILLAR, Blocks.END_STONE, BlockusBlocks.POLISHED_END_STONE.block, Blocks.END_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, BlockusBlocks.HERRINGBONE_END_STONE_BRICKS, Blocks.END_STONE, BlockusBlocks.POLISHED_END_STONE.block, Blocks.END_STONE_BRICKS);

        offerDecoratedRecipe(exporter, BlockusBlocks.PURPUR_DECORATED_END_STONE, Items.POPPED_CHORUS_FRUIT, Blocks.END_STONE_BRICKS);
        offerPhantomPurpurRecipe(exporter, BlockusBlocks.PHANTOM_PURPUR_DECORATED_END_STONE, BlockusBlocks.PURPUR_DECORATED_END_STONE);




        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.END_TILES.block, 4).input('#', Blocks.END_STONE).input('X', Blocks.PURPUR_BLOCK).pattern("#X").pattern("X#").criterion(hasItem(Blocks.PURPUR_BLOCK), conditionsFromItem(Blocks.PURPUR_BLOCK)).offerTo(exporter);



        // Wood
        offerPlanksRecipe(exporter, BlockusBlocks.WHITE_OAK.planks, BlockusItemTags.WHITE_OAK_LOGS, 4);

        offerBarkBlockRecipe(exporter, BlockusBlocks.WHITE_OAK_WOOD, BlockusBlocks.WHITE_OAK_LOG);


        offerMosaicRecipe(exporter, RecipeCategory.DECORATIONS, BlockusBlocks.OAK_MOSAIC.block, Blocks.OAK_SLAB);
        offerMosaicRecipe(exporter, RecipeCategory.DECORATIONS, BlockusBlocks.BIRCH_MOSAIC.block, Blocks.BIRCH_SLAB);
        offerMosaicRecipe(exporter, RecipeCategory.DECORATIONS, BlockusBlocks.SPRUCE_MOSAIC.block, Blocks.SPRUCE_SLAB);
        offerMosaicRecipe(exporter, RecipeCategory.DECORATIONS, BlockusBlocks.JUNGLE_MOSAIC.block, Blocks.JUNGLE_SLAB);
        offerMosaicRecipe(exporter, RecipeCategory.DECORATIONS, BlockusBlocks.ACACIA_MOSAIC.block, Blocks.ACACIA_SLAB);
        offerMosaicRecipe(exporter, RecipeCategory.DECORATIONS, BlockusBlocks.DARK_OAK_MOSAIC.block, Blocks.DARK_OAK_SLAB);
        offerMosaicRecipe(exporter, RecipeCategory.DECORATIONS, BlockusBlocks.MANGROVE_MOSAIC.block, Blocks.MANGROVE_SLAB);
        offerMosaicRecipe(exporter, RecipeCategory.DECORATIONS, BlockusBlocks.CHERRY_MOSAIC.block, Blocks.CHERRY_SLAB);
        offerMosaicRecipe(exporter, RecipeCategory.DECORATIONS, BlockusBlocks.CRIMSON_MOSAIC.block, Blocks.CRIMSON_SLAB);
        offerMosaicRecipe(exporter, RecipeCategory.DECORATIONS, BlockusBlocks.WARPED_MOSAIC.block, Blocks.WARPED_SLAB);


        offerHerringBoneRecipe(exporter, BlockusBlocks.HERRINGBONE_OAK_PLANKS, Blocks.OAK_PLANKS);
        offerHerringBoneRecipe(exporter, BlockusBlocks.HERRINGBONE_BIRCH_PLANKS, Blocks.BIRCH_PLANKS);
        offerHerringBoneRecipe(exporter, BlockusBlocks.HERRINGBONE_SPRUCE_PLANKS, Blocks.SPRUCE_PLANKS);
        offerHerringBoneRecipe(exporter, BlockusBlocks.HERRINGBONE_JUNGLE_PLANKS, Blocks.JUNGLE_PLANKS);
        offerHerringBoneRecipe(exporter, BlockusBlocks.HERRINGBONE_ACACIA_PLANKS, Blocks.ACACIA_PLANKS);
        offerHerringBoneRecipe(exporter, BlockusBlocks.HERRINGBONE_DARK_OAK_PLANKS, Blocks.DARK_OAK_PLANKS);
        offerHerringBoneRecipe(exporter, BlockusBlocks.HERRINGBONE_MANGROVE_PLANKS, Blocks.MANGROVE_PLANKS);
        offerHerringBoneRecipe(exporter, BlockusBlocks.HERRINGBONE_CHERRY_PLANKS, Blocks.CHERRY_PLANKS);
        offerHerringBoneRecipe(exporter, BlockusBlocks.HERRINGBONE_WHITE_OAK_PLANKS, BlockusBlocks.WHITE_OAK.planks);
        offerHerringBoneRecipe(exporter, BlockusBlocks.HERRINGBONE_BAMBOO_PLANKS, Blocks.BAMBOO_PLANKS);
        offerHerringBoneRecipe(exporter, BlockusBlocks.HERRINGBONE_CRIMSON_PLANKS, Blocks.CRIMSON_PLANKS);
        offerHerringBoneRecipe(exporter, BlockusBlocks.HERRINGBONE_WARPED_PLANKS, Blocks.WARPED_PLANKS);

        offerMossyRecipe(exporter, BlockusBlocks.MOSSY_OAK_PLANKS.block, Blocks.OAK_PLANKS);
        offerMossyRecipe(exporter, BlockusBlocks.MOSSY_BIRCH_PLANKS.block, Blocks.BIRCH_PLANKS);
        offerMossyRecipe(exporter, BlockusBlocks.MOSSY_SPRUCE_PLANKS.block, Blocks.SPRUCE_PLANKS);
        offerMossyRecipe(exporter, BlockusBlocks.MOSSY_JUNGLE_PLANKS.block, Blocks.JUNGLE_PLANKS);
        offerMossyRecipe(exporter, BlockusBlocks.MOSSY_ACACIA_PLANKS.block, Blocks.ACACIA_PLANKS);
        offerMossyRecipe(exporter, BlockusBlocks.MOSSY_DARK_OAK_PLANKS.block, Blocks.DARK_OAK_PLANKS);
        offerMossyRecipe(exporter, BlockusBlocks.MOSSY_MANGROVE_PLANKS.block, Blocks.MANGROVE_PLANKS);
        offerMossyRecipe(exporter, BlockusBlocks.MOSSY_CHERRY_PLANKS.block, Blocks.CHERRY_PLANKS);
        offerMossyRecipe(exporter, BlockusBlocks.MOSSY_WHITE_OAK_PLANKS.block, BlockusBlocks.WHITE_OAK.planks);
        offerMossyRecipe(exporter, BlockusBlocks.MOSSY_BAMBOO_PLANKS.block, Blocks.BAMBOO_PLANKS);
        offerMossyRecipe(exporter, BlockusBlocks.MOSSY_CRIMSON_PLANKS.block, Blocks.CRIMSON_PLANKS);
        offerMossyRecipe(exporter, BlockusBlocks.MOSSY_WARPED_PLANKS.block, Blocks.WARPED_PLANKS);

        // Large Flower Pots

        // Chocolate

        // Food Blocks
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.SWEET_BERRIES, RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.SWEET_BERRIES_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.GLOW_BERRIES, RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.GLOW_BERRIES_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.SALMON, RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.SALMON_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.PUFFERFISH, RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.PUFFERFISH_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.TROPICAL_FISH, RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.TROPICAL_FISH_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.COD, RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.COD_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.COOKIE, RecipeCategory.FOOD, BlockusBlocks.COOKIE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.CHORUS_FRUIT, RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.CHORUS_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.POTATO, RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.POTATO_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.APPLE, RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.APPLE_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.GOLDEN_APPLE, RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.GOLDEN_APPLE_CRATE);
        createEnclosedRecipe2(BlockusBlocks.GOLDEN_APPLE_CRATE, Ingredient.ofItems(Blocks.GOLD_BLOCK), BlockusBlocks.APPLE_CRATE).criterion(hasItem(Items.GOLDEN_APPLE), conditionsFromItem(Items.GOLDEN_APPLE)).offerTo(exporter, convertBetween(BlockusBlocks.GOLDEN_APPLE_CRATE, BlockusBlocks.APPLE_CRATE));
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.BEETROOT, RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.BEETROOT_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.CARROT, RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.CARROT_CRATE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.GOLDEN_CARROT, RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.GOLDEN_CARROT_CRATE);
        createEnclosedRecipe2(BlockusBlocks.GOLDEN_CARROT_CRATE, Ingredient.ofItems(Items.GOLD_INGOT), BlockusBlocks.CARROT_CRATE).criterion(hasItem(Items.GOLDEN_CARROT), conditionsFromItem(Items.GOLDEN_CARROT)).offerTo(exporter, convertBetween(BlockusBlocks.GOLDEN_CARROT_CRATE, BlockusBlocks.CARROT_CRATE));
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.BREAD, RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.BREAD_BOX);


        // Rainbow
        offerShapelessRecipe(exporter, BlockusItems.RAINBOW_PETAL, BlockusBlocks.RAINBOW_ROSE, "rainbow_petal", 2);
        offerShapelessRecipe(exporter, BlockusItems.RAINBOW_PETAL, BlockusBlocks.RAINBOW_BLOCK, "rainbow_petal", 4);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.RAINBOW_BLOCK).input('#', BlockusItems.RAINBOW_PETAL).pattern("##").pattern("##").criterion(hasItem(BlockusItems.RAINBOW_PETAL), conditionsFromItem(BlockusItems.RAINBOW_PETAL)).offerTo(exporter);
        offerStonecuttingRecipe(exporter, BlockusBlocks.RAINBOW_BRICKS.block, BlockusBlocks.RAINBOW_BLOCK);




        offerPolishedStoneRecipe(exporter, BlockusBlocks.RAINBOW_BRICKS.block, BlockusBlocks.RAINBOW_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.RAINBOW_GLOWSTONE, 4).input('S', BlockusItems.RAINBOW_PETAL).input('#', Blocks.GLOWSTONE).pattern(" S ").pattern("S#S").pattern(" S ").criterion(hasItem(BlockusItems.RAINBOW_PETAL), conditionsFromItem(BlockusItems.RAINBOW_PETAL)).offerTo(exporter);
        // Asphalt
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.ASPHALT.block, 8).input('X', Blocks.GRAVEL).input('#', ItemTags.COALS).pattern("XXX").pattern("X#X").pattern("XXX").group("asphalt").criterion(hasItem(Blocks.GRAVEL), conditionsFromItem(Blocks.GRAVEL)).offerTo(exporter);
        createEnclosedRecipe(BlockusBlocks.RAINBOW_ASPHALT, Ingredient.ofItems(BlockusBlocks.ASPHALT.block), BlockusItems.RAINBOW_PETAL).criterion(hasItem(BlockusBlocks.ASPHALT.block), conditionsFromItem(BlockusBlocks.ASPHALT.block)).offerTo(exporter);

        offerAsphaltRecipe(exporter, Items.WHITE_DYE, BlockusBlocks.WHITE_ASPHALT.block);
        offerAsphaltRecipe(exporter, Items.ORANGE_DYE, BlockusBlocks.ORANGE_ASPHALT.block);
        offerAsphaltRecipe(exporter, Items.MAGENTA_DYE, BlockusBlocks.MAGENTA_ASPHALT.block);
        offerAsphaltRecipe(exporter, Items.LIGHT_BLUE_DYE, BlockusBlocks.LIGHT_BLUE_ASPHALT.block);
        offerAsphaltRecipe(exporter, Items.YELLOW_DYE, BlockusBlocks.YELLOW_ASPHALT.block);
        offerAsphaltRecipe(exporter, Items.LIME_DYE, BlockusBlocks.LIME_ASPHALT.block);
        offerAsphaltRecipe(exporter, Items.PINK_DYE, BlockusBlocks.PINK_ASPHALT.block);
        offerAsphaltRecipe(exporter, Items.LIGHT_GRAY_DYE, BlockusBlocks.LIGHT_GRAY_ASPHALT.block);
        offerAsphaltRecipe(exporter, Items.GRAY_DYE, BlockusBlocks.GRAY_ASPHALT.block);
        offerAsphaltRecipe(exporter, Items.CYAN_DYE, BlockusBlocks.CYAN_ASPHALT.block);
        offerAsphaltRecipe(exporter, Items.PURPLE_DYE, BlockusBlocks.PURPLE_ASPHALT.block);
        offerAsphaltRecipe(exporter, Items.BLUE_DYE, BlockusBlocks.BLUE_ASPHALT.block);
        offerAsphaltRecipe(exporter, Items.BROWN_DYE, BlockusBlocks.BROWN_ASPHALT.block);
        offerAsphaltRecipe(exporter, Items.GREEN_DYE, BlockusBlocks.GREEN_ASPHALT.block);
        offerAsphaltRecipe(exporter, Items.RED_DYE, BlockusBlocks.RED_ASPHALT.block);

        // Colored Tiles
        offerUnicolorColoredTilesRecipe(exporter, BlockusBlocks.WHITE_COLORED_TILES, Blocks.WHITE_CONCRETE);
        offerUnicolorColoredTilesRecipe(exporter, BlockusBlocks.ORANGE_COLORED_TILES, Blocks.ORANGE_CONCRETE);
        offerUnicolorColoredTilesRecipe(exporter, BlockusBlocks.MAGENTA_COLORED_TILES, Blocks.MAGENTA_CONCRETE);
        offerUnicolorColoredTilesRecipe(exporter, BlockusBlocks.LIGHT_BLUE_COLORED_TILES, Blocks.LIGHT_BLUE_CONCRETE);
        offerUnicolorColoredTilesRecipe(exporter, BlockusBlocks.YELLOW_COLORED_TILES, Blocks.YELLOW_CONCRETE);
        offerUnicolorColoredTilesRecipe(exporter, BlockusBlocks.LIME_COLORED_TILES, Blocks.LIME_CONCRETE);
        offerUnicolorColoredTilesRecipe(exporter, BlockusBlocks.PINK_COLORED_TILES, Blocks.PINK_CONCRETE);
        offerUnicolorColoredTilesRecipe(exporter, BlockusBlocks.LIGHT_GRAY_COLORED_TILES, Blocks.LIGHT_GRAY_CONCRETE);
        offerUnicolorColoredTilesRecipe(exporter, BlockusBlocks.GRAY_COLORED_TILES, Blocks.GRAY_CONCRETE);
        offerUnicolorColoredTilesRecipe(exporter, BlockusBlocks.CYAN_COLORED_TILES, Blocks.CYAN_CONCRETE);
        offerUnicolorColoredTilesRecipe(exporter, BlockusBlocks.PURPLE_COLORED_TILES, Blocks.PURPLE_CONCRETE);
        offerUnicolorColoredTilesRecipe(exporter, BlockusBlocks.BLUE_COLORED_TILES, Blocks.BLUE_CONCRETE);
        offerUnicolorColoredTilesRecipe(exporter, BlockusBlocks.BROWN_COLORED_TILES, Blocks.BROWN_CONCRETE);
        offerUnicolorColoredTilesRecipe(exporter, BlockusBlocks.GREEN_COLORED_TILES, Blocks.GREEN_CONCRETE);
        offerUnicolorColoredTilesRecipe(exporter, BlockusBlocks.RED_COLORED_TILES, Blocks.RED_CONCRETE);
        offerUnicolorColoredTilesRecipe(exporter, BlockusBlocks.BLACK_COLORED_TILES, Blocks.BLACK_CONCRETE);
        offerUnicolorColoredTilesRecipe(exporter, BlockusBlocks.RAINBOW_COLORED_TILES, BlockusBlocks.RAINBOW_BLOCK);

        // Thatch
        offerPolishedStoneRecipe(exporter, BlockusBlocks.THATCH.block, Items.WHEAT);

        // Paper
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.PAPER, RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.PAPER_BLOCK);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(BlockusBlocks.PAPER_BLOCK), RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.BURNT_PAPER_BLOCK.asItem(), 0.1F, 200).criterion("has_paper_block", conditionsFromItem(BlockusBlocks.PAPER_BLOCK)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.FRAMED_PAPER_BLOCK, 4).input('X', Items.PAPER).input('#', Items.STICK).pattern("###").pattern("XXX").pattern("###").criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER)).offerTo(exporter);

        createEnclosedRecipe2(BlockusBlocks.PAPER_LAMP, Ingredient.ofItems(Items.PAPER), Items.TORCH).criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER)).offerTo(exporter);
        offerShapelessRecipe2(exporter, Items.GUNPOWDER, BlockusBlocks.BURNT_PAPER_BLOCK, 2);


        // Plating


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.IRON_PLATING.block, 24).input('X', Items.IRON_INGOT).pattern("XXX").pattern("X X").pattern("XXX").criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.GOLD_PLATING.block, 24).input('X', Items.GOLD_INGOT).pattern("XXX").pattern("X X").pattern("XXX").criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT)).offerTo(exporter);

        // Lantern Blocks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.LANTERN_BLOCK).input('X', Blocks.LANTERN).input('#', Items.IRON_NUGGET).pattern(" # ").pattern("#X#").pattern(" # ").criterion(hasItem(Blocks.LANTERN), conditionsFromItem(Blocks.LANTERN)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.SOUL_LANTERN_BLOCK).input('X', Blocks.SOUL_LANTERN).input('#', Items.IRON_NUGGET).pattern(" # ").pattern("#X#").pattern(" # ").criterion(hasItem(Blocks.SOUL_LANTERN), conditionsFromItem(Blocks.SOUL_LANTERN)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.SOUL_O_LANTERN).input('X', Blocks.CARVED_PUMPKIN).input('#', Blocks.SOUL_TORCH).pattern("X").pattern("#").criterion(hasItem(Blocks.CARVED_PUMPKIN), conditionsFromItem(Blocks.CARVED_PUMPKIN)).offerTo(exporter);

        // Netherite Blocks





        // Other

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CHARCOAL, RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.CHARCOAL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SUGAR, RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.SUGAR_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.ROTTEN_FLESH, RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.ROTTEN_FLESH_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.PHANTOM_MEMBRANE, RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.MEMBRANE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.NETHER_STAR, RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.NETHER_STAR_BLOCK);

        createEnclosedRecipe2(BlockusBlocks.REDSTONE_SAND, Ingredient.ofItems(Items.REDSTONE), Items.SAND).criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.REDSTONE, 8).input(BlockusBlocks.REDSTONE_SAND).criterion(hasItem(BlockusBlocks.REDSTONE_SAND), conditionsFromItem(BlockusBlocks.REDSTONE_SAND)).offerTo(exporter, convertBetween(Items.REDSTONE, BlockusBlocks.REDSTONE_SAND));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.WEIGHT_STORAGE_CUBE).input(Blocks.STONE).input(Items.IRON_NUGGET).criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.COMPANION_CUBE).input(BlockusBlocks.WEIGHT_STORAGE_CUBE).input(Items.POPPY).criterion(hasItem(BlockusBlocks.WEIGHT_STORAGE_CUBE), conditionsFromItem(BlockusBlocks.WEIGHT_STORAGE_CUBE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.CAUTION_BLOCK, 6).input('A', Blocks.STONE).input('B', Items.BLACK_DYE).input('C', Items.YELLOW_DYE).pattern(" C ").pattern("BAB").pattern(" C ").criterion(hasItem(Items.BLACK_DYE), conditionsFromItem(Items.BLACK_DYE)).criterion(hasItem(Items.YELLOW_DYE), conditionsFromItem(Items.YELLOW_DYE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockusBlocks.STARS_BLOCK, 3).input('#', Items.ENDER_PEARL).input('X', Items.CHORUS_FRUIT).pattern("X#X").pattern("###").pattern("X#X").criterion(hasItem(Items.CHORUS_FRUIT), conditionsFromItem(Items.CHORUS_FRUIT)).offerTo(exporter);
    }

    public static void offerCharredSmeltingRecipe(RecipeExporter exporter, TagKey<Item> input, ItemConvertible output, String hasitem) {
        CookingRecipeJsonBuilder.createSmelting(Ingredient.fromTag(input), RecipeCategory.BUILDING_BLOCKS, output, 0.1F, 200).criterion("has_" + hasitem, conditionsFromTag(input)).offerTo(exporter, getRecipeName(output) + "_from_smelting");
    }
    public static void offerMossyRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output).input(input).input(Blocks.VINE).group(Registries.BLOCK.getId((Block) output).getPath()).criterion("has_vine", conditionsFromItem(Blocks.VINE)).offerTo(exporter, convertBetween(output, Blocks.VINE));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output).input(input).input(Blocks.MOSS_BLOCK).group(Registries.BLOCK.getId((Block) output).getPath()).criterion("has_moss_block", conditionsFromItem(Blocks.MOSS_BLOCK)).offerTo(exporter, convertBetween(output, Blocks.MOSS_BLOCK));
    }

    public static void offerPolishedStoneRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }

    public static CraftingRecipeJsonBuilder createCondensingRecipe(RecipeCategory category, ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(category, output, 4).input('S', input).pattern("SS").pattern("SS");
    }

    public static void offerShapelessRecipe2(RecipeExporter exporter, ItemConvertible output, ItemConvertible input, int outputCount) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, outputCount).input(input).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }

    public static void offerSturdyRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input1, ItemConvertible input2) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 2).input('#', input1).input('X', input2).pattern("X#X").pattern("# #").pattern("X#X").criterion(hasItem(input1), conditionsFromItem(input1)).criterion(hasItem(input2), conditionsFromItem(input2)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 2).input('#', input1).input('X', input2).pattern("#X#").pattern("X X").pattern("#X#").criterion(hasItem(input1), conditionsFromItem(input1)).criterion(hasItem(input2), conditionsFromItem(input2)).offerTo(exporter, getRecipeName(output) + "_alt");

    }

    public static void offerDecoratedRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible decoration, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4).input('#', decoration).input('X', input).pattern("##").pattern("XX").criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }

    public static void offerPhantomPurpurRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output).input(input).input(BlockusItemTags.SOUL_SOILS).criterion("has_purpur", conditionsFromItem(input)).offerTo(exporter, convertBetween(output, Blocks.SOUL_SAND));

    }

    public static void offerColoredTilesRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible color1, ItemConvertible color2) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 2).input(color1).input(color2).group("colored_tiles").criterion(hasItem(color1), conditionsFromItem(color1)).criterion(hasItem(color2), conditionsFromItem(color2)).offerTo(exporter);

    }

    public static void offerUnicolorColoredTilesRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible color) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 2).input(color).input(color).group("colored_tiles").criterion(hasItem(color), conditionsFromItem(color)).offerTo(exporter);
        offerStonecuttingRecipe(exporter, output, color);

    }

    public static void offerSmallLogsRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 3).input(input).input(input).input(input).group("small_logs").criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);

    }

    public static void offerSmallHedgesRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6).input('#', input).pattern("###").pattern("###").group("small_hedge").criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }


    public static void offerHerringBoneRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 5).input('#', input).pattern("#  ").pattern("###").pattern("  #").group("herringbone_planks").criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }

    public static CraftingRecipeJsonBuilder createEnclosedRecipe(ItemConvertible output, Ingredient input, ItemConvertible center) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 8).input('X', input).input('#', center).pattern("XXX").pattern("X#X").pattern("XXX");
    }

    public static CraftingRecipeJsonBuilder createEnclosedRecipe2(ItemConvertible output, Ingredient input, ItemConvertible center) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output).input('X', input).input('#', center).pattern("XXX").pattern("X#X").pattern("XXX");
    }

    public static void offerDoorTrapdoorRecipe(RecipeExporter exporter, ItemConvertible door, ItemConvertible trapdoor, ItemConvertible input) {
        createDoorRecipe(door, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
        createTrapdoorRecipe(trapdoor, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }

    public static void offerPressurePlateButtonRecipe(RecipeExporter exporter, ItemConvertible pressureplate, ItemConvertible button, ItemConvertible input) {
        createPressurePlateRecipe(RecipeCategory.REDSTONE, pressureplate, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, button).input(input).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }

    public static void offerOreBricksRecipe(RecipeExporter exporter, BSSWTypes ore_bricks, ItemConvertible ore_block, ItemConvertible ore) {
        offerStonecuttingRecipe(exporter, ore_bricks.block, ore_block);

        offerPolishedStoneRecipe(exporter, ore_bricks.block, ore_block);
        offerShapelessRecipe(exporter, ore, ore_bricks.block, ore.toString(), 9);




    }

    public static void createTimberFramesRecipes(RecipeExporter exporter, ItemConvertible base, ItemConvertible block, ItemConvertible diagonal, ItemConvertible cross) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, block, 2).input('#', Items.PAPER).input('X', base).pattern("#X").pattern("X#").group("timber_frame").criterion(hasItem(base), conditionsFromItem(base)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, diagonal, 4).input('#', block).pattern("##").pattern("##").group("diagonal_timber_frame").criterion(hasItem(block), conditionsFromItem(block)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, cross, 4).input('#', diagonal).pattern("##").pattern("##").group("cross_timber_frame").criterion(hasItem(diagonal), conditionsFromItem(diagonal)).offerTo(exporter);
    }

    public static void offerAsphaltRecipe(RecipeExporter exporter, ItemConvertible center, ItemConvertible output) {
        createEnclosedRecipe(output, Ingredient.ofItems(BlockusBlocks.ASPHALT.block), center).group("asphalt").criterion(hasItem(BlockusBlocks.ASPHALT.block), conditionsFromItem(BlockusBlocks.ASPHALT.block)).offerTo(exporter);
    }

    public static void offerPatternedWoolRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible wool, ItemConvertible output_carpet, ItemConvertible carpet) {
        offerPolishedStoneRecipe(exporter, output, wool);
        createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, output_carpet, Ingredient.ofItems(carpet)).group("patterned_carpet").criterion(hasItem(carpet), conditionsFromItem(carpet)).offerTo(exporter, convertBetween(output_carpet, carpet));
    }

    public static void offerGinghamWoolRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible wool) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4).input('#', wool).pattern(" # ").pattern("# #").pattern(" # ").group("gingham_wool").criterion(hasItem(wool), conditionsFromItem(wool)).offerTo(exporter);
    }


    public static void offerStairsRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        createStairsRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }



    public static void offerNeonRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible dye) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 8).input('A', dye).input('B', Items.GLOW_INK_SAC).input('C', Items.AMETHYST_SHARD).pattern("CAC").pattern("ABA").pattern("CAC").group("neon_blocks").criterion(hasItem(Items.GLOW_INK_SAC), conditionsFromItem(Items.GLOW_INK_SAC)).offerTo(exporter);
    }

    public static void offerFuturneoRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible glass) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6).input('A', Items.BLACK_DYE).input('B', glass).input('C', Blocks.TORCH).pattern("ABA").pattern("BCB").pattern("ABA").group("futurneo_blocks").criterion(hasItem(glass), conditionsFromItem(glass)).offerTo(exporter);

    }

    public static void offerBoatsRecipe(RecipeExporter exporter, ItemConvertible output1, ItemConvertible output2, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output1).input('#', input).pattern("# #").pattern("###").group("boat").criterion("in_water", requireEnteringFluid(Blocks.WATER)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output2).input(Blocks.CHEST).input(output1).group("chest_boat").criterion("has_boat", conditionsFromTag(ItemTags.BOATS)).offerTo(exporter);

    }

    public static void offerPillarRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 2).input('#', input).pattern("#").pattern("#").criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
        offerStonecuttingRecipe(exporter, output, 1, input);
    }

    public static void offerStonecuttingRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible... ingredients) {
        offerStonecuttingRecipe(exporter, output, 1, ingredients);
    }

    public static void offerStonecuttingRecipe(RecipeExporter exporter, ItemConvertible output, int count, ItemConvertible... ingredients) {

        for (ItemConvertible itemConvertible : ingredients) {
            SingleItemRecipeJsonBuilder var10000 = SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(itemConvertible), RecipeCategory.BUILDING_BLOCKS, output, count).criterion(hasItem(itemConvertible), conditionsFromItem(itemConvertible));
            String var10002 = convertBetween(output, itemConvertible);
            var10000.offerTo(exporter, var10002 + "_stonecutting");
        }
    }

    public static void generateFamilies(RecipeExporter exporter, FeatureSet enabledFeatures) {
        BlockusWoodFamilies.getFamilies().filter(BlockFamily::shouldGenerateRecipes).forEach((family) -> {
            generateFamily(exporter, family, enabledFeatures);
        });
    }
}
