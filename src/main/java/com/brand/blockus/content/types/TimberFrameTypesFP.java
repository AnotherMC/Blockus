package com.brand.blockus.content.types;

import com.brand.blockus.blocks.base.OrientableBlockBase;
import com.brand.blockus.content.BlocksRegistration;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;

import java.util.ArrayList;

public class TimberFrameTypesFP {

    private static final ArrayList<TimberFrameTypesFP> LIST = new ArrayList<>();

    public final Block block;
    public final Block diagonal;
    public final Block cross;
    public final Block base;

    public TimberFrameTypesFP(String type, Block base) {

        this.base = base;

        this.block = BlocksRegistration.register(type + "_timber_frame", new Block(FabricBlockSettings.copyOf(base)));
        this.diagonal = BlocksRegistration.register(type + "_diagonal_timber_frame", new OrientableBlockBase(FabricBlockSettings.copyOf(base)));
        this.cross = BlocksRegistration.register(type + "_cross_timber_frame", new Block(FabricBlockSettings.copyOf(base)));

        LIST.add(this);

    }

    public static ArrayList<TimberFrameTypesFP> values() {
        return LIST;
    }
}