package com.brand.blockus.registry.content.bundles;

import com.brand.blockus.blocks.base.OxidizableWallBlock;
import com.brand.blockus.utils.BlockFactory;
import net.minecraft.block.*;
import net.minecraft.block.Oxidizable.OxidationLevel;

import java.util.ArrayList;

public class CopperBundle {
    public static final ArrayList<CopperBundle> LIST = new ArrayList<>();
    public Block block;
    public Block slab;
    public Block stairs;
    public Block wall;
    public Block blockWaxed;
    public Block slabWaxed;
    public Block stairsWaxed;
    public Block wallWaxed;
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
        this.slab = BlockFactory.register(oxidation.getName() + BlockFactory.replaceId(type) + "_slab", (settings) -> new OxidizableSlabBlock(oxidation.getLevel(), settings), BlockFactory.createCopy(base));
        this.stairs = BlockFactory.register(oxidation.getName() + BlockFactory.replaceId(type) + "_stairs", (settings) -> new OxidizableStairsBlock(oxidation.getLevel(), base.getDefaultState(), settings), BlockFactory.createCopy(base));
        this.wall = BlockFactory.register(oxidation.getName() + BlockFactory.replaceId(type) + "_wall", (settings) -> new OxidizableWallBlock(oxidation.getLevel(), settings), BlockFactory.createCopy(base));
        this.blockWaxed = BlockFactory.register("waxed_" + oxidation.getName() + type, BlockFactory.createCopy(base));
        this.slabWaxed = BlockFactory.registerSlab(blockWaxed);
        this.stairsWaxed = BlockFactory.registerStairs(blockWaxed);
        this.wallWaxed = BlockFactory.registerWall(blockWaxed);


        LIST.add(this);
    }

    public static ArrayList<CopperBundle> values() {
        return LIST;
    }

    public Block[] blocks() {
        return new Block[]{block, blockWaxed};
    }

    public Block[] slabs() {
        return new Block[]{slab, slabWaxed};
    }

    public Block[] stairs() {
        return new Block[]{stairs, stairsWaxed};
    }

    public Block[] walls() {
        return new Block[]{wall, wallWaxed};
    }

    public Block[] unwaxed() {
        return new Block[]{block, stairs, slab, wall};
    }

    public Block[] waxed() {
        return new Block[]{blockWaxed, stairsWaxed, slabWaxed, wallWaxed};
    }

    public Block[] all() {
        return new Block[]{block, stairs, slab, wall, blockWaxed, stairsWaxed, slabWaxed, wallWaxed};
    }
}
