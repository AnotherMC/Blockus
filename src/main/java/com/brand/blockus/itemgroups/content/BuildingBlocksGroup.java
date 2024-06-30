package com.brand.blockus.itemgroups.content;

import com.brand.blockus.content.BlockusBlocks;
import com.brand.blockus.content.types.TimberFrameTypes;
import com.brand.blockus.content.types.WoodTypes;
import com.brand.blockus.itemgroups.BlockusItemGroups;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class BuildingBlocksGroup {

    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(BlockusItemGroups.BLOCKUS_BUILDING_BLOCKS).register((entries) -> {
            entries.add(BlockusBlocks.WHITE_OAK_LOG);
            entries.add(BlockusBlocks.WHITE_OAK_WOOD);
            entries.add(BlockusBlocks.STRIPPED_WHITE_OAK_LOG);
            entries.add(BlockusBlocks.STRIPPED_WHITE_OAK_WOOD);

            for (WoodTypes woodType : WoodTypes.values()) {
                entries.add(woodType.planks);
            }

            entries.add(BlockusBlocks.MOSSY_OAK_PLANKS.block);
            entries.add(BlockusBlocks.MOSSY_BIRCH_PLANKS.block);
            entries.add(BlockusBlocks.MOSSY_SPRUCE_PLANKS.block);
            entries.add(BlockusBlocks.MOSSY_JUNGLE_PLANKS.block);
            entries.add(BlockusBlocks.MOSSY_ACACIA_PLANKS.block);
            entries.add(BlockusBlocks.MOSSY_DARK_OAK_PLANKS.block);
            entries.add(BlockusBlocks.MOSSY_MANGROVE_PLANKS.block);
            entries.add(BlockusBlocks.MOSSY_WHITE_OAK_PLANKS.block);
            entries.add(BlockusBlocks.MOSSY_CHERRY_PLANKS.block);
            entries.add(BlockusBlocks.MOSSY_BAMBOO_PLANKS.block);
            entries.add(BlockusBlocks.MOSSY_WARPED_PLANKS.block);
            entries.add(BlockusBlocks.MOSSY_CRIMSON_PLANKS.block);

            entries.add(BlockusBlocks.OAK_MOSAIC.block);
            entries.add(BlockusBlocks.BIRCH_MOSAIC.block);
            entries.add(BlockusBlocks.SPRUCE_MOSAIC.block);
            entries.add(BlockusBlocks.JUNGLE_MOSAIC.block);
            entries.add(BlockusBlocks.ACACIA_MOSAIC.block);
            entries.add(BlockusBlocks.DARK_OAK_MOSAIC.block);
            entries.add(BlockusBlocks.MANGROVE_MOSAIC.block);
            entries.add(BlockusBlocks.WHITE_OAK_MOSAIC.block);
            entries.add(BlockusBlocks.CHERRY_MOSAIC.block);
            entries.add(BlockusBlocks.WARPED_MOSAIC.block);

   /*         if (FabricLoader.getInstance().isModLoaded("promenade")) {
                entries.add(BlockusPromenadeBlocks.SAKURA_SMALL_LOGS);
                entries.add(BlockusPromenadeBlocks.MAPLE_SMALL_LOGS);
                entries.add(BlockusPromenadeBlocks.PALM_SMALL_LOGS);
                entries.add(BlockusPromenadeBlocks.DARK_AMARANTH_SMALL_STEMS);
            }*/

            entries.add(BlockusBlocks.HERRINGBONE_OAK_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_BIRCH_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_SPRUCE_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_JUNGLE_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_ACACIA_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_DARK_OAK_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_MANGROVE_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_CHERRY_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_BAMBOO_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_WHITE_OAK_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_CRIMSON_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_WARPED_PLANKS);

            for (TimberFrameTypes timberFrameType : TimberFrameTypes.values()) {
                entries.add(timberFrameType.lattice);
                entries.add(timberFrameType.grate);
            }

            for (TimberFrameTypes timberFrameType : TimberFrameTypes.values()) {
                entries.add(timberFrameType.cross);
                entries.add(timberFrameType.block);
                entries.add(timberFrameType.diagonal);
                entries.add(timberFrameType.cross);
            }

            entries.add(BlockusBlocks.CHISELED_MUD_BRICKS);
            entries.add(BlockusBlocks.MUD_BRICK_PILLAR);

            entries.add(BlockusBlocks.THATCH.block);

            entries.add(BlockusBlocks.PAPER_BLOCK);
            entries.add(BlockusBlocks.BURNT_PAPER_BLOCK);
            entries.add(BlockusBlocks.FRAMED_PAPER_BLOCK);
            entries.add(BlockusBlocks.PAPER_LAMP);

            entries.add(BlockusBlocks.SNOW_BRICKS.block);


            entries.add(BlockusBlocks.SNOW_PILLAR);

            entries.add(BlockusBlocks.ICE_BRICKS);

            entries.add(BlockusBlocks.ICE_PILLAR);


            entries.add(BlockusBlocks.HERRINGBONE_STONE_BRICKS);

            entries.add(BlockusBlocks.STURDY_STONE);

            entries.add(BlockusBlocks.GRANITE_BRICKS.block);


            entries.add(BlockusBlocks.HERRINGBONE_GRANITE_BRICKS);
            entries.add(BlockusBlocks.CHISELED_GRANITE_BRICKS);
            entries.add(BlockusBlocks.CRACKED_GRANITE_BRICKS);
            entries.add(BlockusBlocks.POLISHED_GRANITE_PILLAR);


            entries.add(BlockusBlocks.DIORITE_BRICKS.block);


            entries.add(BlockusBlocks.HERRINGBONE_DIORITE_BRICKS);
            entries.add(BlockusBlocks.CHISELED_DIORITE_BRICKS);
            entries.add(BlockusBlocks.CRACKED_DIORITE_BRICKS);
            entries.add(BlockusBlocks.POLISHED_DIORITE_PILLAR);


            entries.add(BlockusBlocks.ANDESITE_BRICKS.block);


            entries.add(BlockusBlocks.HERRINGBONE_ANDESITE_BRICKS);
            entries.add(BlockusBlocks.CHISELED_ANDESITE_BRICKS);
            entries.add(BlockusBlocks.CRACKED_ANDESITE_BRICKS);
            entries.add(BlockusBlocks.POLISHED_ANDESITE_PILLAR);

            entries.add(BlockusBlocks.LIMESTONE.block);


            entries.add(BlockusBlocks.POLISHED_LIMESTONE.block);


            entries.add(BlockusBlocks.LIMESTONE_BRICKS.block);


            entries.add(BlockusBlocks.SMALL_LIMESTONE_BRICKS.block);


            entries.add(BlockusBlocks.LIMESTONE_TILES.block);


            entries.add(BlockusBlocks.CHISELED_LIMESTONE);
            entries.add(BlockusBlocks.LIMESTONE_PILLAR);
            entries.add(BlockusBlocks.CHISELED_LIMESTONE_PILLAR);
            entries.add(BlockusBlocks.LIMESTONE_SQUARES);

            entries.add(BlockusBlocks.MARBLE.block);


            entries.add(BlockusBlocks.POLISHED_MARBLE.block);


            entries.add(BlockusBlocks.MARBLE_BRICKS.block);


            entries.add(BlockusBlocks.SMALL_MARBLE_BRICKS.block);


            entries.add(BlockusBlocks.MARBLE_TILES.block);


            entries.add(BlockusBlocks.CHISELED_MARBLE);
            entries.add(BlockusBlocks.MARBLE_PILLAR);
            entries.add(BlockusBlocks.CHISELED_MARBLE_PILLAR);
            entries.add(BlockusBlocks.MARBLE_SQUARES);


            entries.add(BlockusBlocks.POLISHED_DRIPSTONE.block);


            entries.add(BlockusBlocks.DRIPSTONE_BRICKS.block);


            entries.add(BlockusBlocks.CRACKED_DRIPSTONE_BRICKS);
            entries.add(BlockusBlocks.CHISELED_DRIPSTONE);
            entries.add(BlockusBlocks.DRIPSTONE_PILLAR);

            entries.add(BlockusBlocks.MOSSY_TUFF_BRICKS.block);
            entries.add(BlockusBlocks.CRACKED_TUFF_BRICKS);
            entries.add(BlockusBlocks.CARVED_TUFF_BRICKS);
            entries.add(BlockusBlocks.HERRINGBONE_TUFF_BRICKS);
            entries.add(BlockusBlocks.TUFF_PILLAR);

            entries.add(BlockusBlocks.MOSSY_DEEPSLATE_BRICKS.block);


            entries.add(BlockusBlocks.HERRINGBONE_DEEPSLATE_BRICKS);
            entries.add(BlockusBlocks.DEEPSLATE_PILLAR);
            entries.add(BlockusBlocks.STURDY_DEEPSLATE);

            entries.add(BlockusBlocks.BLUESTONE.block);


            entries.add(BlockusBlocks.POLISHED_BLUESTONE.block);


            entries.add(BlockusBlocks.BLUESTONE_BRICKS.block);


            entries.add(BlockusBlocks.SMALL_BLUESTONE_BRICKS.block);


            entries.add(BlockusBlocks.BLUESTONE_TILES.block);


            entries.add(BlockusBlocks.CHISELED_BLUESTONE);
            entries.add(BlockusBlocks.BLUESTONE_PILLAR);
            entries.add(BlockusBlocks.CHISELED_BLUESTONE_PILLAR);
            entries.add(BlockusBlocks.BLUESTONE_SQUARES);

            entries.add(BlockusBlocks.VIRIDITE.block);


            entries.add(BlockusBlocks.POLISHED_VIRIDITE.block);


            entries.add(BlockusBlocks.VIRIDITE_BRICKS.block);


            entries.add(BlockusBlocks.SMALL_VIRIDITE_BRICKS.block);


            entries.add(BlockusBlocks.VIRIDITE_TILES.block);


            entries.add(BlockusBlocks.CHISELED_VIRIDITE);
            entries.add(BlockusBlocks.VIRIDITE_PILLAR);
            entries.add(BlockusBlocks.CHISELED_VIRIDITE_PILLAR);
            entries.add(BlockusBlocks.VIRIDITE_SQUARES);

            entries.add(BlockusBlocks.POLISHED_SCULK.block);


            entries.add(BlockusBlocks.SCULK_BRICKS.block);


            entries.add(BlockusBlocks.CHISELED_SCULK_BRICKS);
            entries.add(BlockusBlocks.SCULK_PILLAR);

            entries.add(BlockusBlocks.HONEYCOMB_BRICKS.block);


            entries.add(BlockusBlocks.LARGE_BRICKS.block);


            entries.add(BlockusBlocks.HERRINGBONE_BRICKS);
            entries.add(BlockusBlocks.SOAKED_BRICKS.block);


            entries.add(BlockusBlocks.HERRINGBONE_SOAKED_BRICKS);
            entries.add(BlockusBlocks.SANDY_BRICKS.block);


            entries.add(BlockusBlocks.HERRINGBONE_SANDY_BRICKS);


            entries.add(BlockusBlocks.ROUGH_SANDSTONE.block);


            entries.add(BlockusBlocks.SANDSTONE_BRICKS.block);


            entries.add(BlockusBlocks.SMALL_SANDSTONE_BRICKS.block);


            entries.add(BlockusBlocks.SANDSTONE_PILLAR);
            entries.add(BlockusBlocks.GOLD_DECORATED_SANDSTONE);
            entries.add(BlockusBlocks.LAPIS_DECORATED_SANDSTONE);

            entries.add(BlockusBlocks.ROUGH_RED_SANDSTONE.block);


            entries.add(BlockusBlocks.RED_SANDSTONE_BRICKS.block);


            entries.add(BlockusBlocks.SMALL_RED_SANDSTONE_BRICKS.block);


            entries.add(BlockusBlocks.RED_SANDSTONE_PILLAR);
            entries.add(BlockusBlocks.GOLD_DECORATED_RED_SANDSTONE);
            entries.add(BlockusBlocks.LAPIS_DECORATED_RED_SANDSTONE);

            entries.add(BlockusBlocks.CHISELED_DARK_PRISMARINE);
            entries.add(BlockusBlocks.DARK_PRISMARINE_PILLAR);
            entries.add(BlockusBlocks.CHISELED_PRISMARINE);
            entries.add(BlockusBlocks.PRISMARINE_PILLAR);
            entries.add(BlockusBlocks.PRISMARINE_TILES.block);

            entries.add(BlockusBlocks.GLOWING_OBSIDIAN);


            entries.add(BlockusBlocks.CRIMSON_WART_BRICKS.block);


            entries.add(BlockusBlocks.WARPED_WART_BRICKS.block);


            entries.add(BlockusBlocks.ROUGH_BASALT.block);


            entries.add(BlockusBlocks.POLISHED_BASALT_BRICKS.block);


            entries.add(BlockusBlocks.CHISELED_POLISHED_BASALT);
            entries.add(BlockusBlocks.CRACKED_POLISHED_BASALT_BRICKS);
            entries.add(BlockusBlocks.POLISHED_BASALT_PILLAR);
            entries.add(BlockusBlocks.HERRINGBONE_POLISHED_BASALT_BRICKS);

            entries.add(BlockusBlocks.POLISHED_BLACKSTONE_TILES.block);


            entries.add(BlockusBlocks.POLISHED_BLACKSTONE_PILLAR);
            entries.add(BlockusBlocks.HERRINGBONE_POLISHED_BLACKSTONE_BRICKS);
            entries.add(BlockusBlocks.CRIMSON_WARTY_BLACKSTONE_BRICKS.block);


            entries.add(BlockusBlocks.WARPED_WARTY_BLACKSTONE_BRICKS.block);


            entries.add(BlockusBlocks.GOLD_DECORATED_POLISHED_BLACKSTONE);
            entries.add(BlockusBlocks.STURDY_BLACKSTONE);

            entries.add(BlockusBlocks.CHISELED_END_STONE_BRICKS);
            entries.add(BlockusBlocks.HERRINGBONE_END_STONE_BRICKS);
            entries.add(BlockusBlocks.POLISHED_END_STONE.block);


            entries.add(BlockusBlocks.CRACKED_END_STONE_BRICKS);
            entries.add(BlockusBlocks.END_STONE_PILLAR);
            entries.add(BlockusBlocks.SMALL_END_STONE_BRICKS.block);


            entries.add(BlockusBlocks.PURPUR_DECORATED_END_STONE);
            entries.add(BlockusBlocks.PHANTOM_PURPUR_DECORATED_END_STONE);

            entries.add(BlockusBlocks.END_TILES.block);


            entries.add(BlockusBlocks.PURPUR_BRICKS.block);


            entries.add(BlockusBlocks.POLISHED_PURPUR.block);


            entries.add(BlockusBlocks.PURPUR_SQUARES);
            entries.add(BlockusBlocks.SMALL_PURPUR_BRICKS.block);


            entries.add(BlockusBlocks.CHISELED_PURPUR);

            entries.add(BlockusBlocks.PHANTOM_PURPUR_BLOCK.block);


            entries.add(BlockusBlocks.PHANTOM_PURPUR_PILLAR);
            entries.add(BlockusBlocks.PHANTOM_PURPUR_BRICKS.block);


            entries.add(BlockusBlocks.POLISHED_PHANTOM_PURPUR.block);


            entries.add(BlockusBlocks.PHANTOM_PURPUR_SQUARES);
            entries.add(BlockusBlocks.SMALL_PHANTOM_PURPUR_BRICKS.block);


            entries.add(BlockusBlocks.CHISELED_PHANTOM_PURPUR);

            entries.add(BlockusBlocks.LANTERN_BLOCK);
            entries.add(BlockusBlocks.SOUL_LANTERN_BLOCK);

            entries.add(BlockusBlocks.CAUTION_BLOCK);

            entries.add(BlockusBlocks.IRON_PLATING.block);


            entries.add(BlockusBlocks.GOLD_PLATING.block);



            entries.add(BlockusBlocks.CHARCOAL_BLOCK);
            entries.add(BlockusBlocks.NETHER_STAR_BLOCK);

            entries.add(BlockusBlocks.POLISHED_AMETHYST.block);


            entries.add(BlockusBlocks.AMETHYST_BRICKS.block);


            entries.add(BlockusBlocks.CHISELED_AMETHYST);
            entries.add(BlockusBlocks.AMETHYST_PILLAR);

            entries.add(BlockusBlocks.ROTTEN_FLESH_BLOCK);
            entries.add(BlockusBlocks.CHORUS_BLOCK);
            entries.add(BlockusBlocks.SUGAR_BLOCK);
            entries.add(BlockusBlocks.COOKIE_BLOCK);
            entries.add(BlockusBlocks.SWEET_BERRIES_CRATE);
            entries.add(BlockusBlocks.SALMON_CRATE);
            entries.add(BlockusBlocks.PUFFERFISH_CRATE);
            entries.add(BlockusBlocks.TROPICAL_FISH_CRATE);
            entries.add(BlockusBlocks.COD_CRATE);
            entries.add(BlockusBlocks.POTATO_CRATE);
            entries.add(BlockusBlocks.APPLE_CRATE);
            entries.add(BlockusBlocks.BEETROOT_CRATE);
            entries.add(BlockusBlocks.CARROT_CRATE);
            entries.add(BlockusBlocks.BREAD_BOX);
            entries.add(BlockusBlocks.GOLDEN_APPLE_CRATE);
            entries.add(BlockusBlocks.GOLDEN_CARROT_CRATE);
            entries.add(BlockusBlocks.GLOW_BERRIES_CRATE);
           /* if (FabricLoader.getInstance().isModLoaded("promenade")) {
                entries.add(BlockusPromenadeBlocks.BLUEBERRIES_CRATE);
            }*/

            entries.add(BlockusBlocks.RAINBOW_BLOCK);
            entries.add(BlockusBlocks.RAINBOW_BRICKS.block);


            entries.add(BlockusBlocks.RAINBOW_GLOWSTONE);

            entries.add(BlockusBlocks.WEIGHT_STORAGE_CUBE);
            entries.add(BlockusBlocks.COMPANION_CUBE);
            entries.add(BlockusBlocks.STARS_BLOCK);
        });
    }
}
