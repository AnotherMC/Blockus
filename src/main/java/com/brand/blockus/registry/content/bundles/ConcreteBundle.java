package com.brand.blockus.registry.content.bundles;

import com.brand.blockus.utils.BlockFactory;
import net.minecraft.block.Block;

import java.util.ArrayList;

public class ConcreteBundle {
    private static final ArrayList<ConcreteBundle> LIST = new ArrayList<>();

    public final Block block;


    public ConcreteBundle(String type, Block base) {
        this.block = BlockFactory.register(type, BlockFactory.createCopy(base));
        LIST.add(this);
    }


    public static ArrayList<ConcreteBundle> values() {
        return LIST;
    }
}
