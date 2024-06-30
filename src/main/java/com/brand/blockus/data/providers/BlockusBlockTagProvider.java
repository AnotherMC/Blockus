package com.brand.blockus.data.providers;

import com.brand.blockus.Blockus;
import com.brand.blockus.content.BlockusBlocks;
import com.brand.blockus.content.types.*;
import com.brand.blockus.utils.tags.BlockusBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static com.brand.blockus.content.BlockusBlocks.*;

public class BlockusBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public BlockusBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public FabricTagBuilder getOrCreateTagBuilder(Identifier id) {
        TagKey<Block> tag = TagKey.of(RegistryKeys.BLOCK, id);
        return this.getOrCreateTagBuilder(tag);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {
        this.getOrCreateTagBuilder(BlockusBlockTags.AMETHYST_BLOCKS)
            .add(BlockusBlocks.POLISHED_AMETHYST.block)


            .add(BlockusBlocks.AMETHYST_BRICKS.block)



            .add(BlockusBlocks.CHISELED_AMETHYST)
            .add(BlockusBlocks.AMETHYST_PILLAR);

        this.getOrCreateTagBuilder(BlockusBlockTags.ANDESITE_BLOCKS)
            .add(BlockusBlocks.ANDESITE_BRICKS.block)
            .add(BlockusBlocks.HERRINGBONE_ANDESITE_BRICKS)
            .add(BlockusBlocks.CHISELED_ANDESITE_BRICKS)
            .add(BlockusBlocks.CRACKED_ANDESITE_BRICKS)
            .add(BlockusBlocks.POLISHED_ANDESITE_PILLAR);

        this.getOrCreateTagBuilder(BlockTags.VIBRATION_RESONATORS)
            .addOptionalTag(BlockusBlockTags.AMETHYST_BLOCKS);

        for (AsphaltTypes asphaltType : AsphaltTypes.values()) {
            this.getOrCreateTagBuilder(BlockusBlockTags.ASPHALT)
                .add(asphaltType.block);


        }

        this.getOrCreateTagBuilder(BlockusBlockTags.ASPHALT)
            .add(BlockusBlocks.RAINBOW_ASPHALT);

        this.getOrCreateTagBuilder(BlockusBlockTags.BASALT_BLOCKS)
            .add(BlockusBlocks.ROUGH_BASALT.block)


            .add(BlockusBlocks.POLISHED_BASALT_BRICKS.block)


            .add(BlockusBlocks.CHISELED_POLISHED_BASALT)
            .add(BlockusBlocks.CRACKED_POLISHED_BASALT_BRICKS)
            .add(BlockusBlocks.POLISHED_BASALT_PILLAR)
            .add(BlockusBlocks.HERRINGBONE_POLISHED_BASALT_BRICKS);

        this.getOrCreateTagBuilder(BlockusBlockTags.BLACKSTONE_BLOCKS)
            .add(BlockusBlocks.POLISHED_BLACKSTONE_TILES.block)


            .add(BlockusBlocks.POLISHED_BLACKSTONE_PILLAR)
            .add(BlockusBlocks.HERRINGBONE_POLISHED_BLACKSTONE_BRICKS)
            .add(BlockusBlocks.CRIMSON_WARTY_BLACKSTONE_BRICKS.block)


            .add(BlockusBlocks.WARPED_WARTY_BLACKSTONE_BRICKS.block)


            .add(BlockusBlocks.GOLD_DECORATED_POLISHED_BLACKSTONE)
            .add(BlockusBlocks.STURDY_BLACKSTONE);

        this.getOrCreateTagBuilder(BlockusBlockTags.BLUESTONE)
            .add(BlockusBlocks.BLUESTONE.block)


            .add(BlockusBlocks.BLUESTONE_PILLAR)
            .add(BlockusBlocks.BLUESTONE_BRICKS.block)


            .add(BlockusBlocks.BLUESTONE_TILES.block)


            .add(BlockusBlocks.POLISHED_BLUESTONE.block)


            .add(BlockusBlocks.BLUESTONE_SQUARES)
            .add(BlockusBlocks.SMALL_BLUESTONE_BRICKS.block)


            .add(BlockusBlocks.CHISELED_BLUESTONE)
            .add(BlockusBlocks.CHISELED_BLUESTONE_PILLAR);

        this.getOrCreateTagBuilder(BlockusBlockTags.BRICKS_BLOCKS)
            .add(BlockusBlocks.LARGE_BRICKS.block)


            .add(BlockusBlocks.HERRINGBONE_BRICKS)
            .add(BlockusBlocks.SOAKED_BRICKS.block)


            .add(BlockusBlocks.HERRINGBONE_SOAKED_BRICKS)
            .add(BlockusBlocks.SANDY_BRICKS.block)


            .add(BlockusBlocks.HERRINGBONE_SANDY_BRICKS);

        this.getOrCreateTagBuilder(BlockusBlockTags.COLORED_TILES)
            .add(BlockusBlocks.WHITE_COLORED_TILES)
            .add(BlockusBlocks.ORANGE_COLORED_TILES)
            .add(BlockusBlocks.MAGENTA_COLORED_TILES)
            .add(BlockusBlocks.LIGHT_BLUE_COLORED_TILES)
            .add(BlockusBlocks.YELLOW_COLORED_TILES)
            .add(BlockusBlocks.LIME_COLORED_TILES)
            .add(BlockusBlocks.PINK_COLORED_TILES)
            .add(BlockusBlocks.GRAY_COLORED_TILES)
            .add(BlockusBlocks.LIGHT_GRAY_COLORED_TILES)
            .add(BlockusBlocks.CYAN_COLORED_TILES)
            .add(BlockusBlocks.PURPLE_COLORED_TILES)
            .add(BlockusBlocks.BLUE_COLORED_TILES)
            .add(BlockusBlocks.BROWN_COLORED_TILES)
            .add(BlockusBlocks.GREEN_COLORED_TILES)
            .add(BlockusBlocks.RED_COLORED_TILES)
            .add(BlockusBlocks.BLACK_COLORED_TILES)
            .add(BlockusBlocks.RAINBOW_COLORED_TILES);


        for (ConcreteTypes concreteType : ConcreteTypes.values()) {
            this.getOrCreateTagBuilder(BlockusBlockTags.CONCRETE_BLOCKS)
                .add(concreteType.block)


                .add(concreteType.chiseled)
                .add(concreteType.pillar);
        }

        this.getOrCreateTagBuilder(BlockTags.CRYSTAL_SOUND_BLOCKS)
            .addOptionalTag(BlockusBlockTags.AMETHYST_BLOCKS);

        this.getOrCreateTagBuilder(BlockusBlockTags.DEEPSLATE_BLOCKS)
            .add(BlockusBlocks.MOSSY_DEEPSLATE_BRICKS.block)


            .add(BlockusBlocks.HERRINGBONE_DEEPSLATE_BRICKS)
            .add(BlockusBlocks.DEEPSLATE_PILLAR)
            .add(BlockusBlocks.STURDY_DEEPSLATE);

        this.getOrCreateTagBuilder(BlockusBlockTags.DIORITE_BLOCKS)
            .add(BlockusBlocks.DIORITE_BRICKS.block)


            .add(BlockusBlocks.HERRINGBONE_DIORITE_BRICKS)
            .add(BlockusBlocks.CHISELED_DIORITE_BRICKS)
            .add(BlockusBlocks.CRACKED_DIORITE_BRICKS)
            .add(BlockusBlocks.POLISHED_DIORITE_PILLAR);

        this.getOrCreateTagBuilder(BlockusBlockTags.DRIPSTONE_BLOCKS)
            .add(BlockusBlocks.POLISHED_DRIPSTONE.block)


            .add(BlockusBlocks.DRIPSTONE_BRICKS.block)


            .add(BlockusBlocks.CRACKED_DRIPSTONE_BRICKS)
            .add(BlockusBlocks.CHISELED_DRIPSTONE)
            .add(BlockusBlocks.DRIPSTONE_PILLAR);

        this.getOrCreateTagBuilder(BlockusBlockTags.END_STONE_BLOCKS)
            .add(BlockusBlocks.CHISELED_END_STONE_BRICKS)
            .add(BlockusBlocks.HERRINGBONE_END_STONE_BRICKS)
            .add(BlockusBlocks.POLISHED_END_STONE.block)


            .add(BlockusBlocks.CRACKED_END_STONE_BRICKS)
            .add(BlockusBlocks.END_STONE_PILLAR)
            .add(BlockusBlocks.SMALL_END_STONE_BRICKS.block)


            .add(BlockusBlocks.PURPUR_DECORATED_END_STONE)
            .add(BlockusBlocks.PHANTOM_PURPUR_DECORATED_END_STONE);

        this.getOrCreateTagBuilder(BlockusBlockTags.FOOD_CRATES)
            .add(BlockusBlocks.SWEET_BERRIES_CRATE)
            .add(BlockusBlocks.SALMON_CRATE)
            .add(BlockusBlocks.PUFFERFISH_CRATE)
            .add(BlockusBlocks.TROPICAL_FISH_CRATE)
            .add(BlockusBlocks.COD_CRATE)
            .add(BlockusBlocks.POTATO_CRATE)
            .add(BlockusBlocks.APPLE_CRATE)
            .add(BlockusBlocks.BEETROOT_CRATE)
            .add(BlockusBlocks.CARROT_CRATE)
            .add(BlockusBlocks.BREAD_BOX)
            .add(BlockusBlocks.GOLDEN_APPLE_CRATE)
            .add(BlockusBlocks.GOLDEN_CARROT_CRATE)
            .add(BlockusBlocks.GLOW_BERRIES_CRATE)
            .addOptional(Blockus.id("blueberries_crate"));

        this.getOrCreateTagBuilder(BlockusBlockTags.FRAMED_PAPER_BLOCKS)
            .add(BlockusBlocks.FRAMED_PAPER_BLOCK);



        this.getOrCreateTagBuilder(BlockusBlockTags.GRANITE_BLOCKS)
            .add(BlockusBlocks.GRANITE_BRICKS.block)


            .add(BlockusBlocks.HERRINGBONE_GRANITE_BRICKS)
            .add(BlockusBlocks.CHISELED_GRANITE_BRICKS)
            .add(BlockusBlocks.CRACKED_GRANITE_BRICKS)
            .add(BlockusBlocks.POLISHED_GRANITE_PILLAR);

        this.getOrCreateTagBuilder(BlockusBlockTags.HONEYCOMB_BLOCKS)
            .add(BlockusBlocks.HONEYCOMB_BRICKS.block);



        this.getOrCreateTagBuilder(BlockusBlockTags.ICE_BRICKS)
            .add(BlockusBlocks.ICE_BRICKS)
            .add(BlockusBlocks.ICE_PILLAR);

        this.getOrCreateTagBuilder(BlockusBlockTags.LIMESTONE)
            .add(BlockusBlocks.LIMESTONE.block)


            .add(BlockusBlocks.POLISHED_LIMESTONE.block)


            .add(BlockusBlocks.LIMESTONE_BRICKS.block)


            .add(BlockusBlocks.LIMESTONE_TILES.block)


            .add(BlockusBlocks.LIMESTONE_PILLAR)
            .add(BlockusBlocks.LIMESTONE_SQUARES)
            .add(BlockusBlocks.SMALL_LIMESTONE_BRICKS.block)


            .add(BlockusBlocks.CHISELED_LIMESTONE)
            .add(BlockusBlocks.CHISELED_LIMESTONE_PILLAR);

        this.getOrCreateTagBuilder(BlockusBlockTags.VIRIDITE)
            .add(BlockusBlocks.VIRIDITE.block)


            .add(BlockusBlocks.POLISHED_VIRIDITE.block)


            .add(BlockusBlocks.VIRIDITE_BRICKS.block)


            .add(BlockusBlocks.VIRIDITE_TILES.block)


            .add(BlockusBlocks.VIRIDITE_PILLAR)
            .add(BlockusBlocks.VIRIDITE_SQUARES)
            .add(BlockusBlocks.SMALL_VIRIDITE_BRICKS.block)


            .add(BlockusBlocks.CHISELED_VIRIDITE)
            .add(BlockusBlocks.CHISELED_VIRIDITE_PILLAR);

        this.getOrCreateTagBuilder(BlockusBlockTags.MARBLE)
            .add(BlockusBlocks.MARBLE.block)


            .add(BlockusBlocks.POLISHED_MARBLE.block)


            .add(BlockusBlocks.MARBLE_BRICKS.block)


            .add(BlockusBlocks.MARBLE_TILES.block)


            .add(BlockusBlocks.MARBLE_PILLAR)
            .add(BlockusBlocks.MARBLE_SQUARES)
            .add(BlockusBlocks.SMALL_MARBLE_BRICKS.block)


            .add(BlockusBlocks.CHISELED_MARBLE_PILLAR)
            .add(BlockusBlocks.CHISELED_MARBLE);



        this.getOrCreateTagBuilder(BlockusBlockTags.OBSIDIAN)
            .add(BlockusBlocks.GLOWING_OBSIDIAN);

        this.getOrCreateTagBuilder(BlockusBlockTags.PHANTOM_PURPUR_BLOCKS)
            .add(BlockusBlocks.PHANTOM_PURPUR_BLOCK.block)


            .add(BlockusBlocks.PHANTOM_PURPUR_PILLAR)
            .add(BlockusBlocks.PHANTOM_PURPUR_BRICKS.block)


            .add(BlockusBlocks.POLISHED_PHANTOM_PURPUR.block)


            .add(BlockusBlocks.PHANTOM_PURPUR_SQUARES)
            .add(BlockusBlocks.SMALL_PHANTOM_PURPUR_BRICKS.block)


            .add(BlockusBlocks.CHISELED_PHANTOM_PURPUR);

        this.getOrCreateTagBuilder(BlockusBlockTags.PLATINGS)
            .add(BlockusBlocks.IRON_PLATING.block)


            .add(BlockusBlocks.GOLD_PLATING.block);



        this.getOrCreateTagBuilder(BlockusBlockTags.PRISMARINE_BLOCKS)
            .add(BlockusBlocks.CHISELED_DARK_PRISMARINE)
            .add(BlockusBlocks.DARK_PRISMARINE_PILLAR)
            .add(BlockusBlocks.CHISELED_PRISMARINE)
            .add(BlockusBlocks.PRISMARINE_PILLAR)
            .add(BlockusBlocks.PRISMARINE_TILES.block);




        this.getOrCreateTagBuilder(BlockusBlockTags.PURPUR_BLOCKS)
            .add(BlockusBlocks.PURPUR_BRICKS.block)


            .add(BlockusBlocks.POLISHED_PURPUR.block)


            .add(BlockusBlocks.PURPUR_SQUARES)
            .add(BlockusBlocks.SMALL_PURPUR_BRICKS.block)


            .add(BlockusBlocks.CHISELED_PURPUR)
            .addOptionalTag(BlockusBlockTags.PHANTOM_PURPUR_BLOCKS);


        this.getOrCreateTagBuilder(BlockusBlockTags.RAINBOW_BLOCKS)
            .add(BlockusBlocks.RAINBOW_BLOCK)
            .add(BlockusBlocks.RAINBOW_BRICKS.block);



        this.getOrCreateTagBuilder(BlockusBlockTags.RED_SANDSTONE)
            .add(BlockusBlocks.ROUGH_RED_SANDSTONE.block)


            .add(BlockusBlocks.RED_SANDSTONE_BRICKS.block)


            .add(BlockusBlocks.SMALL_RED_SANDSTONE_BRICKS.block)


            .add(BlockusBlocks.GOLD_DECORATED_RED_SANDSTONE)
            .add(BlockusBlocks.LAPIS_DECORATED_RED_SANDSTONE)
            .add(BlockusBlocks.RED_SANDSTONE_PILLAR);

        this.getOrCreateTagBuilder(BlockusBlockTags.SANDSTONE)
            .add(BlockusBlocks.ROUGH_SANDSTONE.block)


            .add(BlockusBlocks.SANDSTONE_BRICKS.block)


            .add(BlockusBlocks.SMALL_SANDSTONE_BRICKS.block)


            .add(BlockusBlocks.GOLD_DECORATED_SANDSTONE)
            .add(BlockusBlocks.LAPIS_DECORATED_SANDSTONE)
            .add(BlockusBlocks.SANDSTONE_PILLAR);

        this.getOrCreateTagBuilder(BlockusBlockTags.SCULK_BLOCKS)
            .add(BlockusBlocks.POLISHED_SCULK.block)


            .add(BlockusBlocks.SCULK_BRICKS.block)


            .add(BlockusBlocks.CHISELED_SCULK_BRICKS)
            .add(BlockusBlocks.SCULK_PILLAR);

        this.getOrCreateTagBuilder(BlockusBlockTags.SNOW_BRICKS)
            .add(BlockusBlocks.SNOW_BRICKS.block)


            .add(BlockusBlocks.SNOW_PILLAR);

        this.getOrCreateTagBuilder(BlockusBlockTags.SOUL_SOILS)
            .add(Blocks.SOUL_SAND)
            .add(Blocks.SOUL_SOIL);

        this.getOrCreateTagBuilder(BlockusBlockTags.STAINED_STONE_BRICKS)
            .add(BlockusBlocks.WHITE_STONE_BRICKS.block)
            .add(BlockusBlocks.ORANGE_STONE_BRICKS.block)
            .add(BlockusBlocks.MAGENTA_STONE_BRICKS.block)
            .add(BlockusBlocks.LIGHT_BLUE_STONE_BRICKS.block)
            .add(BlockusBlocks.YELLOW_STONE_BRICKS.block)
            .add(BlockusBlocks.LIME_STONE_BRICKS.block)
            .add(BlockusBlocks.PINK_STONE_BRICKS.block)
            .add(BlockusBlocks.GRAY_STONE_BRICKS.block)
            .add(BlockusBlocks.CYAN_STONE_BRICKS.block)
            .add(BlockusBlocks.PURPLE_STONE_BRICKS.block)
            .add(BlockusBlocks.BLUE_STONE_BRICKS.block)
            .add(BlockusBlocks.BROWN_STONE_BRICKS.block)
            .add(BlockusBlocks.GREEN_STONE_BRICKS.block)
            .add(BlockusBlocks.RED_STONE_BRICKS.block)
            .add(BlockusBlocks.BLACK_STONE_BRICKS.block);

        this.getOrCreateTagBuilder(BlockusBlockTags.STONE_BLOCKS)
            .add(BlockusBlocks.HERRINGBONE_STONE_BRICKS)
            .add(BlockusBlocks.STURDY_STONE);

        this.getOrCreateTagBuilder(BlockusBlockTags.THATCH)
            .add(BlockusBlocks.THATCH.block);




        for (TimberFrameTypes timberFrameType : TimberFrameTypes.values()) {
            this.getOrCreateTagBuilder(BlockusBlockTags.TIMBER_FRAMES)
                .add(timberFrameType.block)
                .add(timberFrameType.diagonal)
                .add(timberFrameType.cross);

            this.getOrCreateTagBuilder(BlockusBlockTags.WOODEN_LATTICES)
                .add(timberFrameType.lattice);

            this.getOrCreateTagBuilder(BlockusBlockTags.WOODEN_GRATES)
                .add(timberFrameType.grate);
        }

        this.getOrCreateTagBuilder(BlockusBlockTags.TUFF_BLOCKS)
            .add(MOSSY_TUFF_BRICKS.block)
            .add(CRACKED_TUFF_BRICKS)
            .add(CARVED_TUFF_BRICKS)
            .add(HERRINGBONE_TUFF_BRICKS)
            .add(TUFF_PILLAR)
            ;

        this.getOrCreateTagBuilder(BlockusBlockTags.WARPED_NETHER_GRASS)
            .add(Blocks.NETHER_SPROUTS)
            .add(Blocks.WARPED_ROOTS);


        this.getOrCreateTagBuilder(BlockusBlockTags.WHITE_OAK_LOGS)
            .add(BlockusBlocks.WHITE_OAK_LOG)
            .add(BlockusBlocks.WHITE_OAK_WOOD)
            .add(BlockusBlocks.STRIPPED_WHITE_OAK_LOG)
            .add(BlockusBlocks.STRIPPED_WHITE_OAK_WOOD);

        this.getOrCreateTagBuilder(BlockusBlockTags.ALL_WOODEN_MOSAICS)
            .add(BlockusBlocks.OAK_MOSAIC.block)
            .add(BlockusBlocks.BIRCH_MOSAIC.block)
            .add(BlockusBlocks.SPRUCE_MOSAIC.block)
            .add(BlockusBlocks.JUNGLE_MOSAIC.block)
            .add(BlockusBlocks.ACACIA_MOSAIC.block)
            .add(BlockusBlocks.DARK_OAK_MOSAIC.block)
            .add(BlockusBlocks.MANGROVE_MOSAIC.block)
            .add(BlockusBlocks.CHERRY_MOSAIC.block)
            .add(Blocks.BAMBOO_MOSAIC)
            .add(BlockusBlocks.WHITE_OAK_MOSAIC.block)
            .add(BlockusBlocks.CRIMSON_MOSAIC.block)
            .add(BlockusBlocks.WARPED_MOSAIC.block)
            .add(Blocks.BAMBOO_MOSAIC_STAIRS)
            .add(Blocks.BAMBOO_MOSAIC_SLAB);

        this.getOrCreateTagBuilder(BlockusBlockTags.ALL_MOSSY_PLANKS)
            .add(BlockusBlocks.MOSSY_OAK_PLANKS.block)
            .add(BlockusBlocks.MOSSY_BIRCH_PLANKS.block)
            .add(BlockusBlocks.MOSSY_SPRUCE_PLANKS.block)
            .add(BlockusBlocks.MOSSY_JUNGLE_PLANKS.block)
            .add(BlockusBlocks.MOSSY_ACACIA_PLANKS.block)
            .add(BlockusBlocks.MOSSY_DARK_OAK_PLANKS.block)
            .add(BlockusBlocks.MOSSY_MANGROVE_PLANKS.block)
            .add(BlockusBlocks.MOSSY_CHERRY_PLANKS.block)
            .add(BlockusBlocks.MOSSY_BAMBOO_PLANKS.block)
            .add(BlockusBlocks.MOSSY_WHITE_OAK_PLANKS.block)
            .add(BlockusBlocks.MOSSY_CRIMSON_PLANKS.block)
            .add(BlockusBlocks.MOSSY_WARPED_PLANKS.block)
           ;

        this.getOrCreateTagBuilder(Identifier.of("c", "planks_that_burn"))
            .add(Blocks.OAK_PLANKS)
            .add(Blocks.SPRUCE_PLANKS)
            .add(Blocks.BIRCH_PLANKS)
            .add(Blocks.JUNGLE_PLANKS)
            .add(Blocks.ACACIA_PLANKS)
            .add(Blocks.DARK_OAK_PLANKS)
            .add(Blocks.MANGROVE_PLANKS)
            .add(Blocks.CHERRY_PLANKS)
            .add(Blocks.BAMBOO_PLANKS)
            .add(BlockusBlocks.WHITE_OAK.planks)

            .add(BlockusBlocks.HERRINGBONE_OAK_PLANKS)
            .add(BlockusBlocks.HERRINGBONE_BIRCH_PLANKS)
            .add(BlockusBlocks.HERRINGBONE_SPRUCE_PLANKS)
            .add(BlockusBlocks.HERRINGBONE_JUNGLE_PLANKS)
            .add(BlockusBlocks.HERRINGBONE_ACACIA_PLANKS)
            .add(BlockusBlocks.HERRINGBONE_DARK_OAK_PLANKS)
            .add(BlockusBlocks.HERRINGBONE_MANGROVE_PLANKS)
            .add(BlockusBlocks.HERRINGBONE_CHERRY_PLANKS)
            .add(BlockusBlocks.HERRINGBONE_BAMBOO_PLANKS)
            .add(BlockusBlocks.HERRINGBONE_WHITE_OAK_PLANKS)

            .add(BlockusBlocks.OAK_MOSAIC.block)
            .add(BlockusBlocks.BIRCH_MOSAIC.block)
            .add(BlockusBlocks.SPRUCE_MOSAIC.block)
            .add(BlockusBlocks.JUNGLE_MOSAIC.block)
            .add(BlockusBlocks.ACACIA_MOSAIC.block)
            .add(BlockusBlocks.DARK_OAK_MOSAIC.block)
            .add(BlockusBlocks.MANGROVE_MOSAIC.block)
            .add(BlockusBlocks.CHERRY_MOSAIC.block)
            .add(Blocks.BAMBOO_MOSAIC)
            .add(BlockusBlocks.WHITE_OAK_MOSAIC.block)

            .add(BlockusBlocks.MOSSY_OAK_PLANKS.block)
            .add(BlockusBlocks.MOSSY_BIRCH_PLANKS.block)
            .add(BlockusBlocks.MOSSY_SPRUCE_PLANKS.block)
            .add(BlockusBlocks.MOSSY_JUNGLE_PLANKS.block)
            .add(BlockusBlocks.MOSSY_ACACIA_PLANKS.block)
            .add(BlockusBlocks.MOSSY_DARK_OAK_PLANKS.block)
            .add(BlockusBlocks.MOSSY_MANGROVE_PLANKS.block)
            .add(BlockusBlocks.MOSSY_CHERRY_PLANKS.block)
            .add(BlockusBlocks.MOSSY_BAMBOO_PLANKS.block)
            .add(BlockusBlocks.MOSSY_WHITE_OAK_PLANKS.block);

        this.getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
            .add(BlockusBlocks.SOUL_O_LANTERN)
            .addTag(BlockusBlockTags.FRAMED_PAPER_BLOCKS)
            //.addTag(BlockusBlockTags.TIMBER_FRAMES)
            .addTag(BlockusBlockTags.FOOD_CRATES)
            .addTag(BlockusBlockTags.ALL_WOODEN_MOSAICS)
            .addTag(BlockusBlockTags.ALL_MOSSY_PLANKS);

        this.getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
            .add(BlockusBlocks.ROTTEN_FLESH_BLOCK)
            .add(BlockusBlocks.CHORUS_BLOCK)
            .add(BlockusBlocks.WHITE_OAK_LEAVES)
            .addOptionalTag(BlockusBlockTags.THATCH);

        this.getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)


            .add(BlockusBlocks.CHARCOAL_BLOCK)
            .add(BlockusBlocks.NETHER_STAR_BLOCK)
            .add(BlockusBlocks.WEIGHT_STORAGE_CUBE)
            .add(BlockusBlocks.COMPANION_CUBE)
            .add(BlockusBlocks.CAUTION_BLOCK)
            .add(BlockusBlocks.STARS_BLOCK)
            .add(BlockusBlocks.LANTERN_BLOCK)
            .add(BlockusBlocks.SOUL_LANTERN_BLOCK)
            .add(BlockusBlocks.CRIMSON_WART_BRICKS.block)


            .add(BlockusBlocks.WARPED_WART_BRICKS.block)

            .add(BlockusBlocks.END_TILES.block)


            .add(BlockusBlocks.CHISELED_MUD_BRICKS)
            .add(BlockusBlocks.MUD_BRICK_PILLAR)

            .addOptionalTag(BlockusBlockTags.AMETHYST_BLOCKS)
            .addOptionalTag(BlockusBlockTags.OBSIDIAN)
            .addOptionalTag(BlockusBlockTags.STAINED_STONE_BRICKS)
            .addOptionalTag(BlockusBlockTags.MARBLE)
            .addOptionalTag(BlockusBlockTags.LIMESTONE)
            .addOptionalTag(BlockusBlockTags.BLUESTONE)
            .addOptionalTag(BlockusBlockTags.VIRIDITE)
            .addOptionalTag(BlockusBlockTags.PURPUR_BLOCKS)
            .addOptionalTag(BlockusBlockTags.QUARTZ_BLOCKS)
            .addOptionalTag(BlockusBlockTags.SANDSTONE)
            .addOptionalTag(BlockusBlockTags.RED_SANDSTONE)
            .addOptionalTag(BlockusBlockTags.SOUL_SANDSTONE)
            .addOptionalTag(BlockusBlockTags.STONE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.ANDESITE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.DIORITE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.GRANITE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.BLACKSTONE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.BASALT_BLOCKS)
            .addOptionalTag(BlockusBlockTags.LAVA_BRICKS)
            .addOptionalTag(BlockusBlockTags.LAVA_POLISHED_BLACKSTONE_BRICKS)
            .addOptionalTag(BlockusBlockTags.WATER_BRICKS)
            .addOptionalTag(BlockusBlockTags.SNOW_BRICKS)
            .addOptionalTag(BlockusBlockTags.ICE_BRICKS)
            .addOptionalTag(BlockusBlockTags.MAGMA_BRICKS)
            .addOptionalTag(BlockusBlockTags.BLAZE_BRICKS)
            .addOptionalTag(BlockusBlockTags.NETHERRACK_BLOCKS)
            .addOptionalTag(BlockusBlockTags.NETHER_BRICKS)
            .addOptionalTag(BlockusBlockTags.PRISMARINE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.BRICKS_BLOCKS)
            .addOptionalTag(BlockusBlockTags.HONEYCOMB_BLOCKS)
            .addOptionalTag(BlockusBlockTags.END_STONE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.RAINBOW_BLOCKS)
            .addOptionalTag(BlockusBlockTags.CONCRETE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.DEEPSLATE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.SCULK_BLOCKS)
            .addOptionalTag(BlockusBlockTags.TUFF_BLOCKS)
            .addOptionalTag(BlockusBlockTags.DRIPSTONE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.CHOCOLATE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.ASPHALT)
            .addOptionalTag(BlockusBlockTags.SHINGLES)
            .addOptionalTag(BlockusBlockTags.COLORED_TILES)
            .addOptionalTag(BlockusBlockTags.PLATINGS);

        this.getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
            .add(BlockusBlocks.PATH)
            .add(BlockusBlocks.SUGAR_BLOCK)
            .add(BlockusBlocks.REDSTONE_SAND)
            .add(BlockusBlocks.SUGAR_BLOCK);

        this.getOrCreateTagBuilder(BlockTags.BASE_STONE_OVERWORLD)
            .add(BlockusBlocks.LIMESTONE.block)
            .add(BlockusBlocks.MARBLE.block)
            .add(BlockusBlocks.BLUESTONE.block)
            .add(BlockusBlocks.VIRIDITE.block);

        this.getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)


            .add(BlockusBlocks.NETHER_STAR_BLOCK);

        this.getOrCreateTagBuilder(BlockTags.DEEPSLATE_ORE_REPLACEABLES)
            .add(BlockusBlocks.BLUESTONE.block)
            .add(BlockusBlocks.VIRIDITE.block);

        this.getOrCreateTagBuilder(BlockTags.DRAGON_IMMUNE)
            .addOptionalTag(BlockusBlockTags.OBSIDIAN)
            .add(BlockusBlocks.NETHER_STAR_BLOCK);

        this.getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
            .add(BlockusBlocks.POTTED_WHITE_OAK_SAPLING)
            .add(BlockusBlocks.POTTED_RAINBOW_ROSE);

        this.getOrCreateTagBuilder(BlockTags.GUARDED_BY_PIGLINS)
            .add(BlockusBlocks.GOLD_DECORATED_SANDSTONE)
            .add(BlockusBlocks.GOLD_DECORATED_RED_SANDSTONE)
            .add(BlockusBlocks.GOLD_DECORATED_POLISHED_BLACKSTONE)
            .add(BlockusBlocks.GOLD_PLATING.block)
            .add(BlockusBlocks.GOLDEN_APPLE_CRATE)
            .add(BlockusBlocks.GOLDEN_CARROT_CRATE);

        this.getOrCreateTagBuilder(BlockTags.ICE)
            .addOptionalTag(BlockusBlockTags.ICE_BRICKS);


        this.getOrCreateTagBuilder(BlockTags.IMPERMEABLE)
            .addOptionalTag(BlockusBlockTags.NEON);

        this.getOrCreateTagBuilder(BlockTags.INFINIBURN_OVERWORLD)
            .addOptionalTag(BlockusBlockTags.NETHERRACK_BLOCKS)
            .addOptionalTag(BlockusBlockTags.MAGMA_BRICKS)
            .add(BlockusBlocks.CHARCOAL_BLOCK);

        this.getOrCreateTagBuilder(BlockTags.LEAVES)
            .add(BlockusBlocks.WHITE_OAK_LEAVES);

        this.getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
            .addOptionalTag(BlockusBlockTags.WHITE_OAK_LOGS);

        this.getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
            .addOptionalTag(BlockusBlockTags.OBSIDIAN);




        this.getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
            .add(BlockusBlocks.NETHER_STAR_BLOCK);


        this.getOrCreateTagBuilder(BlockTags.OVERWORLD_NATURAL_LOGS)
            .add(BlockusBlocks.WHITE_OAK_LOG);

        this.getOrCreateTagBuilder(BlockTags.PIGLIN_REPELLENTS)
            .add(BlockusBlocks.SOUL_LANTERN_BLOCK)
            .add(BlockusBlocks.SOUL_O_LANTERN);

        this.getOrCreateTagBuilder(BlockTags.PLANKS)
            .add(BlockusBlocks.WHITE_OAK.planks)
            .add(BlockusBlocks.HERRINGBONE_OAK_PLANKS)
            .add(BlockusBlocks.HERRINGBONE_BIRCH_PLANKS)
            .add(BlockusBlocks.HERRINGBONE_SPRUCE_PLANKS)
            .add(BlockusBlocks.HERRINGBONE_JUNGLE_PLANKS)
            .add(BlockusBlocks.HERRINGBONE_ACACIA_PLANKS)
            .add(BlockusBlocks.HERRINGBONE_DARK_OAK_PLANKS)
            .add(BlockusBlocks.HERRINGBONE_MANGROVE_PLANKS)
            .add(BlockusBlocks.HERRINGBONE_BAMBOO_PLANKS)
            .add(BlockusBlocks.HERRINGBONE_WHITE_OAK_PLANKS)
            .add(BlockusBlocks.HERRINGBONE_CRIMSON_PLANKS)
            .add(BlockusBlocks.HERRINGBONE_WARPED_PLANKS);

        this.getOrCreateTagBuilder(BlockTags.SAPLINGS)
            .add(BlockusBlocks.WHITE_OAK_SAPLING);

        this.getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
            .add(BlockusBlocks.RAINBOW_ROSE);

        this.getOrCreateTagBuilder(BlockTags.SOUL_FIRE_BASE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.SOUL_SANDSTONE)
            .addOptionalTag(BlockusBlockTags.PHANTOM_PURPUR_BLOCKS);

        this.getOrCreateTagBuilder(BlockTags.SOUL_SPEED_BLOCKS)
            .addOptionalTag(BlockusBlockTags.SOUL_SANDSTONE);


        this.getOrCreateTagBuilder(BlockTags.STONE_ORE_REPLACEABLES)
            .add(BlockusBlocks.LIMESTONE.block)
            .add(BlockusBlocks.MARBLE.block);

        // Conventional Block Tags
        this.getOrCreateTagBuilder(ConventionalBlockTags.GLASS_BLOCKS)
            .addOptionalTag(BlockusBlockTags.BEVELED_GLASS);
    }
}
