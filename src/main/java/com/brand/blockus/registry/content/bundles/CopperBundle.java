package com.brand.blockus.registry.content.bundles;

import com.brand.blockus.blocks.base.OxidizableWallBlock;
import com.brand.blockus.utils.BlockFactory;
import net.minecraft.block.Block;
import net.minecraft.block.Oxidizable.OxidationLevel;
import net.minecraft.block.OxidizableBlock;
import net.minecraft.block.OxidizableSlabBlock;
import net.minecraft.block.OxidizableStairsBlock;

import java.util.ArrayList;

public class CopperBundle {
    public static final ArrayList<CopperBundle> LIST = new ArrayList<>();
    public Block block;
    public Block blockWaxed;
    public final String type;
    public final Block base;

    public enum OxidationType {
        UNAFFECTED(OxidationLevel.UNAFFECTED, ""),
        EXPOSED(OxidationLevel.EXPOSED, "exposed_"),
        WEATHERED(OxidationLevel.WEATHERED, "weathered_"),
        OXIDIZED(OxidationLevel.OXIDIZED, "oxidized_");

        private final OxidationLevel oxidationLevel;
        private final String name;

        OxidationType(OxidationLevel oxidationLevel, String name) {
            this.oxidationLevel = oxidationLevel;
            this.name = name;
        }

        public OxidationLevel getLevel() {
            return oxidationLevel;
        }

        public String getName() {
            return name;
        }
    }

    public CopperBundle(String type, OxidationType oxidation, Block base) {
        this.type = type;
        this.base = base;
        this.block = BlockFactory.register(oxidation.getName() + type, (settings) -> new OxidizableBlock(oxidation.getLevel(), settings), BlockFactory.createCopy(base));
        this.blockWaxed = BlockFactory.register("waxed_" + oxidation.getName() + type, BlockFactory.createCopy(base));



        LIST.add(this);
    }

    public static ArrayList<CopperBundle> values() {
        return LIST;
    }

    public Block[] blocks() {
        return new Block[]{block, blockWaxed};
    }

    public Block[] unwaxed() {
        return new Block[]{block};
    }

    public Block[] waxed() {
        return new Block[]{blockWaxed};
    }

    public Block[] all() {
        return new Block[]{block, blockWaxed };
    }
}
