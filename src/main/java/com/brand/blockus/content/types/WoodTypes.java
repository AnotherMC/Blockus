package com.brand.blockus.content.types;

import com.brand.blockus.Blockus;
import com.brand.blockus.content.BlocksRegistration;
import com.brand.blockus.content.BlockusItems;
import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class WoodTypes {

    private static final ArrayList<WoodTypes> LIST = new ArrayList<>();

    public final Block planks;
    public final Block base;
    public boolean burnable;

    public WoodTypes(String type, Block base, MapColor color, BlockSoundGroup sound, WoodType woodtype, BlockSetType blocksettype, boolean burnable) {

        this.base = base;
        this.burnable = burnable;

        FabricBlockSettings blockSettings = FabricBlockSettings.create().mapColor(color).instrument(Instrument.BASS).strength(2.0F, 3.0F).sounds(sound).burnable();

        if (burnable) {
            blockSettings = blockSettings.burnable();
        }

        this.planks = BlocksRegistration.register(type + "_planks", new Block(blockSettings));

        // sign
        LIST.add(this);

    }

    public WoodTypes(String type, Block base, MapColor color, BlockSoundGroup sound, WoodType woodtype, BlockSetType blocksettype) {
        this(type, base, color, sound, woodtype, blocksettype, true);
    }

    public WoodTypes(String type, Block base, MapColor color, BlockSoundGroup sound) {
        this(type, base, color, sound, WoodType.OAK, BlockSetType.OAK, true);
    }

    public WoodTypes(String type, Block base, MapColor color, BlockSoundGroup sound, boolean burnable) {
        this(type, base, color, sound, WoodType.OAK, BlockSetType.OAK, burnable);
    }

    public static ArrayList<WoodTypes> values() {
        return LIST;
    }

    public boolean isBurnable() {
        return this.burnable;
    }
}
