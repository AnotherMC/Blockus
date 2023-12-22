package com.brand.blockus.itemgroups.content;

import com.brand.blockus.content.BlockusBlocks;
import com.brand.blockus.content.BlockusEntities;
import com.brand.blockus.itemgroups.BlockusItemGroups;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class FunctionalBlocksGroup {

    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(BlockusItemGroups.BLOCKUS_FUNCTIONAL_BLOCKS).register((entries) -> {

            entries.add(BlockusBlocks.LANTERN_BLOCK);
            entries.add(BlockusBlocks.SOUL_LANTERN_BLOCK);

            entries.add(BlockusBlocks.REDSTONE_SAND);

            entries.add(BlockusBlocks.RAINBOW_GLOWSTONE);
            entries.add(BlockusBlocks.GLOWING_OBSIDIAN);
        });
    }
}
