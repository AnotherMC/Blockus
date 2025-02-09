package com.brand.blockus.registry.content;

import com.brand.blockus.Blockus;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerbedBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BlockusItems {

    public static Item register(RegistryKey<Item> key, Function<Item.Settings, Item> factory, Item.Settings settings) {
        Item item = factory.apply(settings.registryKey(key));
        return Registry.register(Registries.ITEM, key, item);
    }

    public static Item register(String id, Function<Item.Settings, Item> factory, Item.Settings settings) {
        Item item = factory.apply(settings.registryKey(RegistryKey.of(RegistryKeys.ITEM, Blockus.id(id))));
        return Registry.register(Registries.ITEM, Blockus.id(id), item);
    }

    public static Item register(Block block, BiFunction<Block, Item.Settings, Item> factory, Item.Settings settings) {
        return register(keyOf(block.getRegistryEntry().registryKey()), (itemSettings) -> factory.apply(block, itemSettings), settings.useBlockPrefixedTranslationKey());
    }

    private static RegistryKey<Item> keyOf(RegistryKey<Block> blockKey) {
        return RegistryKey.of(RegistryKeys.ITEM, blockKey.getValue());
    }

    public static Item register(String id) {
        return register(id, Item::new, new Item.Settings());
    }

//    public static Item registerSign(Block standingBlock, Block wallBlock) {
//        return Registry.register(Registries.ITEM, Registries.BLOCK.getId(standingBlock), new SignItem(standingBlock, wallBlock, new Item.Settings().maxCount(16)));
//    }
//
//    public static Item registerHangingSign(Block hangingSign, Block wallHangingSign) {
//        return Registry.register(Registries.ITEM, Registries.BLOCK.getId(hangingSign), new HangingSignItem(hangingSign, wallHangingSign, new Item.Settings().maxCount(16)));
//    }
}
