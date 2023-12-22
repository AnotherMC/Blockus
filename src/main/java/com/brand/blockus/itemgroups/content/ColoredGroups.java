package com.brand.blockus.itemgroups.content;

import com.brand.blockus.content.BlockusBlocks;
import com.brand.blockus.content.types.AsphaltTypes;
import com.brand.blockus.content.types.ConcreteTypes;
import com.brand.blockus.itemgroups.BlockusItemGroups;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class ColoredGroups {

    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(BlockusItemGroups.BLOCKUS_COLORED_BLOCKS).register((entries) -> {
            for (AsphaltTypes asphaltTypes : AsphaltTypes.values()) {
                entries.add(asphaltTypes.block);
            }
            entries.add(BlockusBlocks.RAINBOW_ASPHALT);

            entries.add(BlockusBlocks.WHITE_STONE_BRICKS.block);
            entries.add(BlockusBlocks.GRAY_STONE_BRICKS.block);
            entries.add(BlockusBlocks.BLACK_STONE_BRICKS.block);
            entries.add(BlockusBlocks.BROWN_STONE_BRICKS.block);
            entries.add(BlockusBlocks.RED_STONE_BRICKS.block);
            entries.add(BlockusBlocks.ORANGE_STONE_BRICKS.block);
            entries.add(BlockusBlocks.YELLOW_STONE_BRICKS.block);
            entries.add(BlockusBlocks.LIME_STONE_BRICKS.block);
            entries.add(BlockusBlocks.GREEN_STONE_BRICKS.block);
            entries.add(BlockusBlocks.CYAN_STONE_BRICKS.block);
            entries.add(BlockusBlocks.LIGHT_BLUE_STONE_BRICKS.block);
            entries.add(BlockusBlocks.BLUE_STONE_BRICKS.block);
            entries.add(BlockusBlocks.PURPLE_STONE_BRICKS.block);
            entries.add(BlockusBlocks.MAGENTA_STONE_BRICKS.block);
            entries.add(BlockusBlocks.PINK_STONE_BRICKS.block);

            for (ConcreteTypes concreteTypes : ConcreteTypes.values()) {
                entries.add(concreteTypes.block);
                entries.add(concreteTypes.chiseled);
                entries.add(concreteTypes.pillar);
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
            entries.add(BlockusBlocks.RAINBOW_BRICKS.block);
            entries.add(BlockusBlocks.RAINBOW_GLOWSTONE);
        });

        ItemGroupEvents.modifyEntriesEvent(BlockusItemGroups.BLOCKUS_COLORED_TILES).register((entries) -> {
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
        });
    }
}
