package com.brand.blockus.itemgroups.content;

import com.brand.blockus.itemgroups.BlockusItemGroups;
import com.brand.blockus.registry.content.BlockusBlocks;
import com.brand.blockus.registry.content.bundles.*;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class ColoredGroups {

    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(BlockusItemGroups.BLOCKUS_COLORED_BLOCKS).register((entries) -> {
            for (AsphaltBundle asphaltBundle : AsphaltBundle.values()) {
                entries.add(asphaltBundle.block);
            }
            entries.add(BlockusBlocks.RAINBOW_ASPHALT);

            for (WoolBundle woolBundle : WoolBundle.values()) {
                entries.add(woolBundle.block);
                entries.add(woolBundle.stairs);
                entries.add(woolBundle.slab);
                entries.add(woolBundle.carpet);
            }

            addBSSW(entries, BlockusBlocks.WHITE_STONE_BRICKS);
            addBSSW(entries, BlockusBlocks.GRAY_STONE_BRICKS);
            addBSSW(entries, BlockusBlocks.BLACK_STONE_BRICKS);
            addBSSW(entries, BlockusBlocks.BROWN_STONE_BRICKS);
            addBSSW(entries, BlockusBlocks.RED_STONE_BRICKS);
            addBSSW(entries, BlockusBlocks.ORANGE_STONE_BRICKS);
            addBSSW(entries, BlockusBlocks.YELLOW_STONE_BRICKS);
            addBSSW(entries, BlockusBlocks.LIME_STONE_BRICKS);
            addBSSW(entries, BlockusBlocks.GREEN_STONE_BRICKS);
            addBSSW(entries, BlockusBlocks.CYAN_STONE_BRICKS);
            addBSSW(entries, BlockusBlocks.LIGHT_BLUE_STONE_BRICKS);
            addBSSW(entries, BlockusBlocks.BLUE_STONE_BRICKS);
            addBSSW(entries, BlockusBlocks.PURPLE_STONE_BRICKS);
            addBSSW(entries, BlockusBlocks.MAGENTA_STONE_BRICKS);
            addBSSW(entries, BlockusBlocks.PINK_STONE_BRICKS);

            for (ConcreteBundle concreteBundle : ConcreteBundle.values()) {
                entries.add(concreteBundle.block);
            }

            entries.add(BlockusBlocks.WHITE_COLORED_TILES);
            entries.add(BlockusBlocks.LIGHT_GRAY_COLORED_TILES);
            entries.add(BlockusBlocks.GRAY_COLORED_TILES);
            entries.add(BlockusBlocks.BLACK_COLORED_TILES);
            entries.add(BlockusBlocks.BROWN_COLORED_TILES);
            entries.add(BlockusBlocks.RED_COLORED_TILES);
            entries.add(BlockusBlocks.ORANGE_COLORED_TILES);
            entries.add(BlockusBlocks.YELLOW_COLORED_TILES);
            entries.add(BlockusBlocks.LIME_COLORED_TILES);
            entries.add(BlockusBlocks.GREEN_COLORED_TILES);
            entries.add(BlockusBlocks.CYAN_COLORED_TILES);
            entries.add(BlockusBlocks.LIGHT_BLUE_COLORED_TILES);
            entries.add(BlockusBlocks.BLUE_COLORED_TILES);
            entries.add(BlockusBlocks.PURPLE_COLORED_TILES);
            entries.add(BlockusBlocks.MAGENTA_COLORED_TILES);
            entries.add(BlockusBlocks.PINK_COLORED_TILES);
            entries.add(BlockusBlocks.RAINBOW_COLORED_TILES);


            entries.add(BlockusBlocks.RAINBOW_BLOCK);
            addBSSW(entries, BlockusBlocks.RAINBOW_BRICKS);

            entries.add(BlockusBlocks.RAINBOW_GLOWSTONE);
        });
    }

    public static void addBSSW(FabricItemGroupEntries entries, BSSWBundle BSSWBundle) {
        entries.add(BSSWBundle.block);
    }
}
