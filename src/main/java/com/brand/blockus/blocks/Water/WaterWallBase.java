package com.brand.blockus.blocks.Water;

import com.brand.blockus.Blockus;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.BlockRenderLayer;
import net.minecraft.block.Material;
import net.minecraft.block.WallBlock;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WaterWallBase extends WallBlock {

	public WaterWallBase(String name, float hardness, float resistance) {
		super(FabricBlockSettings.of(Material.STONE).strength(hardness, resistance).build());
		Registry.register(Registry.BLOCK, new Identifier(Blockus.MOD_ID, name), this);
		Registry.register(Registry.ITEM,new Identifier(Blockus.MOD_ID, name), new BlockItem(this, new Item.Settings().maxCount(64).group(Blockus.BLOCKUS_DECORATIONS)));
	}
	public BlockRenderLayer getRenderLayer() {
	      return BlockRenderLayer.CUTOUT_MIPPED;
  }
}