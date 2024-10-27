package com.brand.blockus.registry.content.bundles;

import com.brand.blockus.registry.content.BlockusItems;
import com.brand.blockus.utils.BlockFactory;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.sound.BlockSoundGroup;

import java.util.ArrayList;

public class WoodBundle {

    public static final ArrayList<WoodBundle> LIST = new ArrayList<>();

    public final Block planks;
    public final Block stairs;
    public final Block slab;
    public final Block fence;
    public final Block fence_gate;
    public final Block door;
    public final Block trapdoor;
    public final Block base;
    public final Block pressure_plate;
    public final Block button;
    public final Block standing_sign;
    public final Block wall_sign;
    public final Item sign;
    public final Block ceiling_hanging_sign;
    public final Block wall_hanging_sign;
    public final Item hanging_sign;
    public boolean burnable;

    public WoodBundle(String type, Block base, MapColor color, BlockSoundGroup sound, WoodType woodtype, BlockSetType blocksettype, boolean burnable) {

        this.base = base;
        this.burnable = burnable;

        AbstractBlock.Settings blockSettings = AbstractBlock.Settings.create().mapColor(color).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(sound);
        AbstractBlock.Settings blockSettings2 = BlockFactory.createDoorTrapdoorBlockSettings(0.1f, 0.8f, sound, color, NoteBlockInstrument.BASS);
        AbstractBlock.Settings signSettings = AbstractBlock.Settings.create().mapColor(color).noCollision().strength(1.0F).sounds(sound);
        AbstractBlock.Settings hangingSignSettings = AbstractBlock.Settings.create().mapColor(color).noCollision().strength(1.0F).sounds(sound);

        if (burnable) {
            blockSettings = blockSettings.burnable();
            blockSettings2 = blockSettings2.burnable();
            signSettings = signSettings.burnable();
            hangingSignSettings = hangingSignSettings.burnable();
        }

        this.planks = BlockFactory.register(type + "_planks", blockSettings);
        this.stairs = BlockFactory.registerStairs(this.planks);
        this.slab = BlockFactory.registerSlab(this.planks);
        this.fence = BlockFactory.register(type + "_fence", FenceBlock::new, BlockFactory.createCopy(base));
        this.fence_gate = BlockFactory.register(type + "_fence_gate", (settings) -> new FenceGateBlock(woodtype, settings), BlockFactory.createCopy(base));
        this.door = BlockFactory.register(type + "_door", (settings) -> new DoorBlock(blocksettype, settings), blockSettings2);
        this.trapdoor = BlockFactory.register(type + "_trapdoor", (settings) -> new TrapdoorBlock(blocksettype, settings), blockSettings2);
        this.pressure_plate = BlockFactory.registerWoodenPressurePlate(this.planks);
        this.button = BlockFactory.register(type + "_button", (settings) -> new ButtonBlock(blocksettype, 30, settings), AbstractBlock.Settings.copy(planks).noCollision());

        // sign
//        Identifier signPath = Blockus.id("entity/signs/" + type);
//        this.standing_sign = BlockFactory.registerNoItem(type + "_sign", new TerraformSignBlock(signPath, signSettings));
//        this.wall_sign = BlockFactory.registerNoItem(type + "_wall_sign", new TerraformWallSignBlock(signPath, copyLootTable(standing_sign).mapColor(color).noCollision().strength(1.0F).sounds(sound)));
//        this.sign = BlockusItems.registerSign(standing_sign, wall_sign);
//
//        Identifier hangingSignPath = Blockus.id("entity/signs/hanging/" + type);
//        Identifier hangingSignGuiPath = Blockus.id("textures/gui/hanging_signs/" + type);
//        this.ceiling_hanging_sign = BlockFactory.registerNoItem(type + "_hanging_sign", new TerraformHangingSignBlock(hangingSignPath, hangingSignGuiPath, signSettings));
//        this.wall_hanging_sign = BlockFactory.registerNoItem(type + "_wall_hanging_sign", new TerraformWallHangingSignBlock(hangingSignPath, hangingSignGuiPath, copyLootTable(ceiling_hanging_sign).mapColor(color).noCollision().strength(1.0F).sounds(sound)));
//        this.hanging_sign = BlockusItems.registerHangingSign(ceiling_hanging_sign, wall_hanging_sign);

        this.standing_sign = BlockFactory.registerNoItem(type + "_sign_temp", Block::new, blockSettings);
        this.wall_sign = BlockFactory.registerNoItem(type + "_wall_sign_temp", Block::new, blockSettings);
        this.sign = BlockusItems.register(this.standing_sign, (block, settings) -> new SignItem(block, this.wall_sign, settings), (new Item.Settings()).maxCount(16));
        this.ceiling_hanging_sign = BlockFactory.registerNoItem(type + "_hanging_sign_temp", Block::new, blockSettings);
        this.wall_hanging_sign = BlockFactory.registerNoItem(type + "_wall_hanging_sign_temp", Block::new, blockSettings);
        this.hanging_sign = BlockusItems.register(this.ceiling_hanging_sign, (block, settings) -> new SignItem(block, this.wall_hanging_sign, settings), (new Item.Settings()).maxCount(16));


        LIST.add(this);

    }

    public WoodBundle(String type, Block base, MapColor color, BlockSoundGroup sound, net.minecraft.block.WoodType woodtype, BlockSetType blocksettype) {
        this(type, base, color, sound, woodtype, blocksettype, true);
    }

    public WoodBundle(String type, Block base, MapColor color, BlockSoundGroup sound) {
        this(type, base, color, sound, net.minecraft.block.WoodType.OAK, BlockSetType.OAK, true);
    }

    public WoodBundle(String type, Block base, MapColor color, BlockSoundGroup sound, boolean burnable) {
        this(type, base, color, sound, net.minecraft.block.WoodType.OAK, BlockSetType.OAK, burnable);
    }

    public static AbstractBlock.Settings copyLootTable(Block block) {
        AbstractBlock.Settings settings2 = AbstractBlock.Settings.create().lootTable(block.getLootTableKey()).overrideTranslationKey(block.getTranslationKey());
        return settings2;
    }

    public static ArrayList<WoodBundle> values() {
        return LIST;
    }

    public boolean isBurnable() {
        return this.burnable;
    }
}
