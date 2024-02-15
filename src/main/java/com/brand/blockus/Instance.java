package com.brand.blockus;

import com.brand.blockus.content.BlockusBlocks;
import com.brand.blockus.content.BlockusItems;
import com.brand.blockus.content.types.TimberFrameTypes;
import com.brand.blockus.content.types.WoodTypes;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;

public class Instance {

    public static void init() {


// Burning

        // general
        FuelRegistry.INSTANCE.add(Items.DRIED_KELP, 200);
        FuelRegistry.INSTANCE.add(BlockusBlocks.CHARCOAL_BLOCK, 16000);

        // Paper
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.FRAMED_PAPER_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.PAPER_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BURNT_PAPER_BLOCK, 5, 60);
        FuelRegistry.INSTANCE.add(Items.PAPER, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.FRAMED_PAPER_BLOCK, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.PAPER_LAMP, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.PAPER_BLOCK, 400);

        // Thatch
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.THATCH.block, 60, 20);


        // Timber frames
        for (TimberFrameTypes timberFrameType : TimberFrameTypes.values()) {
            for (Block block : new Block[]{timberFrameType.block, timberFrameType.diagonal, timberFrameType.cross}) {
                if (!block.asItem().isFireproof()) {
                    FlammableBlockRegistry.getDefaultInstance().add(block, 5, 20);
                    FuelRegistry.INSTANCE.add(block, 300);
                }
            }
        }


        // Wood set
        for (WoodTypes woodType : WoodTypes.values()) {
            if (woodType.isBurnable()) {
                FlammableBlockRegistry.getDefaultInstance().add(woodType.planks, 5, 20);


            }
        }

        // White oak
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.STRIPPED_WHITE_OAK_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.STRIPPED_WHITE_OAK_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_LEAVES, 30, 60);

        // Wooden mosaic
        Block[][] woodenMosaics = {
            {BlockusBlocks.OAK_MOSAIC.block},
            {BlockusBlocks.BIRCH_MOSAIC.block},
            {BlockusBlocks.SPRUCE_MOSAIC.block},
            {BlockusBlocks.JUNGLE_MOSAIC.block},
            {BlockusBlocks.ACACIA_MOSAIC.block},
            {BlockusBlocks.DARK_OAK_MOSAIC.block},
            {BlockusBlocks.MANGROVE_MOSAIC.block},
            {BlockusBlocks.WHITE_OAK_MOSAIC.block},
            {BlockusBlocks.CHERRY_MOSAIC.block}
        };

        for (Block[] blocks : woodenMosaics) {
            Block block = blocks[0];

            FlammableBlockRegistry.getDefaultInstance().add(block, 5, 20);
            FuelRegistry.INSTANCE.add(block, 300);


        }

        // Mossy planks
        Block[][] mossyWood = {
            {BlockusBlocks.MOSSY_OAK_PLANKS.block},
            {BlockusBlocks.MOSSY_BIRCH_PLANKS.block},
            {BlockusBlocks.MOSSY_SPRUCE_PLANKS.block},
            {BlockusBlocks.MOSSY_JUNGLE_PLANKS.block},
            {BlockusBlocks.MOSSY_ACACIA_PLANKS.block},
            {BlockusBlocks.MOSSY_DARK_OAK_PLANKS.block},
            {BlockusBlocks.MOSSY_MANGROVE_PLANKS.block},
            {BlockusBlocks.MOSSY_WHITE_OAK_PLANKS.block},
            {BlockusBlocks.MOSSY_BAMBOO_PLANKS.block},
            {BlockusBlocks.MOSSY_CHERRY_PLANKS.block}
        };

        for (Block[] blocks : mossyWood) {
            Block block = blocks[0];

            FlammableBlockRegistry.getDefaultInstance().add(block, 5, 20);
            FuelRegistry.INSTANCE.add(block, 300);
        }

        // Herringbone planks
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.HERRINGBONE_OAK_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.HERRINGBONE_BIRCH_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.HERRINGBONE_SPRUCE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.HERRINGBONE_JUNGLE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.HERRINGBONE_ACACIA_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.HERRINGBONE_DARK_OAK_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.HERRINGBONE_MANGROVE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.HERRINGBONE_WHITE_OAK_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.HERRINGBONE_BAMBOO_PLANKS, 5, 20);

        // legacy


// Composting


        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_LEAVES, 0.30f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_SAPLING, 0.30f);

        CompostingChanceRegistry.INSTANCE.add(BlockusItems.RAINBOW_PETAL, 0.30f);
        CompostingChanceRegistry.INSTANCE.add(Items.BAMBOO, 0.50f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.SWEET_BERRIES_CRATE, 0.50f);


        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.RAINBOW_ROSE, 0.65f);

        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.THATCH.block, 0.75f);


        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.APPLE_CRATE, 0.95f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.BEETROOT_CRATE, 0.95f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.CARROT_CRATE, 0.95f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.POTATO_CRATE, 0.95f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.BREAD_BOX, 1.0f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.COOKIE_BLOCK, 1.0f);


// Other

        addStrippables();
        addPathBlocks();
        addTradeOffers();
    }

    public static void addStrippables() {
        StrippableBlockRegistry.register(BlockusBlocks.WHITE_OAK_LOG, BlockusBlocks.STRIPPED_WHITE_OAK_LOG);
        StrippableBlockRegistry.register(BlockusBlocks.WHITE_OAK_WOOD, BlockusBlocks.STRIPPED_WHITE_OAK_WOOD);
    }

    public static void addPathBlocks() {
        FlattenableBlockRegistry.register(Blocks.DIRT_PATH, BlockusBlocks.PATH.getDefaultState());
        FlattenableBlockRegistry.register(BlockusBlocks.PATH, Blocks.DIRT.getDefaultState());

    }

    public static void addTradeOffers() {
        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {

            factories.add(new SellItemFactory(BlockusBlocks.WHITE_OAK_SAPLING, 5, 1, 8));
            factories.add(new SellItemFactory(BlockusItems.RAINBOW_PETAL, 1, 3, 12));
            factories.add(new SellItemFactory(BlockusBlocks.RAINBOW_ROSE, 1, 1, 12));
        });
    }


    static class SellItemFactory implements TradeOffers.Factory {
        private final ItemStack sell;
        private final int price;
        private final int count;
        private final int maxUses;

        public SellItemFactory(ItemConvertible stack, int price, int count, int maxUses) {
            this.sell = new ItemStack(stack);
            this.price = price;
            this.count = count;
            this.maxUses = maxUses;
        }

        public TradeOffer create(Entity entity, Random random) {
            return new TradeOffer(new ItemStack(Items.EMERALD, this.price), new ItemStack(this.sell.getItem(), this.count), this.maxUses, 1, 0.05f);
        }
    }
}
