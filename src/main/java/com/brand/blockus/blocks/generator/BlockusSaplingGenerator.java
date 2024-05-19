package com.brand.blockus.blocks.generator;

import com.brand.blockus.worldgen.BlockusWorldgenFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public final class BlockusSaplingGenerator {
    public static final SaplingGenerator WHITE_OAK;

    static {
        WHITE_OAK = new SaplingGenerator("white_oak", Optional.empty(), Optional.of(BlockusWorldgenFeatures.WHITE_OAK), Optional.empty());
    }
}
