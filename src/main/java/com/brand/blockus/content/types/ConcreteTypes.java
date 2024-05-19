package com.brand.blockus.content.types;

import com.brand.blockus.content.BlocksRegistration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;

import java.util.ArrayList;

public class ConcreteTypes {
    private static final ArrayList<ConcreteTypes> LIST = new ArrayList<>();

    public final Block block;
    public final Block base;
    public final Block chiseled;
    public final Block pillar;

    public ConcreteTypes(String type, Block base) {

        this.base = base;

        this.block = BlocksRegistration.register(type, new Block(Block.Settings.copy(base)));
        String replace = type.replace("_bricks", "");
        this.chiseled = BlocksRegistration.register("chiseled_" + replace, new Block(AbstractBlock.Settings.copy(base)));
        this.pillar = BlocksRegistration.register(replace + "_pillar", new PillarBlock(AbstractBlock.Settings.copy(base)));

        LIST.add(this);
    }


    public static ArrayList<ConcreteTypes> values() {
        return LIST;
    }
}
