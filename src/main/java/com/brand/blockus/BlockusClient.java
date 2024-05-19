package com.brand.blockus;

import com.brand.blockus.content.BlockusBlocks;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.util.Identifier;

public class BlockusClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(),
            BlockusBlocks.WHITE_OAK_LEAVES,
            BlockusBlocks.WHITE_OAK_SAPLING,
            BlockusBlocks.POTTED_WHITE_OAK_SAPLING,
            BlockusBlocks.RAINBOW_ROSE,
            BlockusBlocks.POTTED_RAINBOW_ROSE
        );

        TerraformBoatClientHelper.registerModelLayers(Blockus.id("raw_bamboo"), true);
        TerraformBoatClientHelper.registerModelLayers(Blockus.id("charred"), false);
        TerraformBoatClientHelper.registerModelLayers(Blockus.id("white_oak"), false);


        /*if (FabricLoader.getInstance().isModLoaded("promenade")) {
            BlockusPromenadeBlocks.initClient();
        }*/
    }

    public void registerBlockColor(Block block, Block templateBlock) {
        ColorProviderRegistry.BLOCK.register((block1, pos, world, layer) -> {
            BlockColorProvider provider = ColorProviderRegistry.BLOCK.get(templateBlock);
            return provider == null ? -1 : provider.getColor(block1, pos, world, layer);
        }, block);

        ColorProviderRegistry.ITEM.register((item, layer) -> {
            ItemColorProvider provider = ColorProviderRegistry.ITEM.get(templateBlock);
            return provider == null ? -1 : provider.getColor(item, layer);
        }, block.asItem());
    }
}
