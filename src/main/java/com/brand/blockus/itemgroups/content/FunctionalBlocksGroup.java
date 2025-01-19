package com.brand.blockus.itemgroups.content;

import com.brand.blockus.itemgroups.BlockusItemGroups;
import com.brand.blockus.registry.content.BlockusEntities;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import static com.brand.blockus.registry.content.BlockusBlocks.*;

public class FunctionalBlocksGroup {

    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(BlockusItemGroups.BLOCKUS_FUNCTIONAL_BLOCKS).register((entries) -> {

            entries.add(LANTERN_BLOCK);
            entries.add(SOUL_LANTERN_BLOCK);

            entries.add(REDSTONE_SAND);

            entries.add(RAINBOW_GLOWSTONE);
            entries.add(GLOWING_OBSIDIAN);
        });
    }
}
