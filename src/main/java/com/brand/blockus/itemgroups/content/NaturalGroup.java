package com.brand.blockus.itemgroups.content;

import com.brand.blockus.itemgroups.BlockusItemGroups;
import com.brand.blockus.registry.content.BlockusBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class NaturalGroup {

    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(BlockusItemGroups.BLOCKUS_NATURAL).register((entries) -> {
            entries.add(BlockusBlocks.PATH);
            entries.add(BlockusBlocks.LIMESTONE.block);
            entries.add(BlockusBlocks.MARBLE.block);
            entries.add(BlockusBlocks.BLUESTONE.block);
            entries.add(BlockusBlocks.VIRIDITE.block);

            entries.add(BlockusBlocks.WHITE_OAK_LOG);
            entries.add(BlockusBlocks.WHITE_OAK_SAPLING);
            entries.add(BlockusBlocks.WHITE_OAK_LEAVES);
        /*    if (FabricLoader.getInstance().isModLoaded("promenade")) {
                entries.add(BlockusPromenadeBlocks.WHITE_OAK_LEAF_PILE);
            }*/


/*            if (FabricLoader.getInstance().isModLoaded("promenade")) {
                entries.add(BlockusPromenadeBlocks.SAP_MAPLE_SMALL_HEDGE);
                entries.add(BlockusPromenadeBlocks.VERMILION_MAPLE_SMALL_HEDGE);
                entries.add(BlockusPromenadeBlocks.FULVOUS_MAPLE_SMALL_HEDGE);
                entries.add(BlockusPromenadeBlocks.MIKADO_MAPLE_SMALL_HEDGE);
                entries.add(BlockusPromenadeBlocks.BLUSH_SAKURA_SMALL_HEDGE);
                entries.add(BlockusPromenadeBlocks.COTTON_SAKURA_SMALL_HEDGE);
                entries.add(BlockusPromenadeBlocks.PALM_SMALL_HEDGE);
                entries.add(BlockusPromenadeBlocks.DARK_AMARANTH_SMALL_HEDGE);
            }*/

            entries.add(BlockusBlocks.SOUL_O_LANTERN);

            entries.add(BlockusBlocks.RAINBOW_ROSE);
            entries.add(BlockusBlocks.RAINBOW_PETALS);

        });
    }
}
