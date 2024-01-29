package com.brand.blockus.data.providers;

import com.brand.blockus.content.BlockusBlocks;
import com.brand.blockus.content.BlockusEntities;
import com.brand.blockus.utils.tags.BlockusBlockTags;
import com.brand.blockus.utils.tags.BlockusItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class BlockusItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public BlockusItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture, BlockTagProvider blockTagProvider) {
        super(output, registriesFuture, blockTagProvider);
    }

    private FabricTagBuilder getOrCreateTagBuilder(Identifier id) {
        TagKey<Item> tag = TagKey.of(RegistryKeys.ITEM, id);
        return this.getOrCreateTagBuilder(tag);
    }

    private void copy(Identifier id) {
        TagKey<Block> blockTag = TagKey.of(RegistryKeys.BLOCK, id);
        TagKey<Item> itemTag = TagKey.of(RegistryKeys.ITEM, id);

        this.copy(blockTag, itemTag);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {

        this.copy(BlockusBlockTags.BARRIERS, BlockusItemTags.BARRIERS);

        this.copy(BlockTags.STONE_BUTTONS, ItemTags.STONE_BUTTONS);

        this.copy(BlockusBlockTags.PATTERNED_WOOL, BlockusItemTags.PATTERNED_WOOL);
        this.copy(BlockusBlockTags.PATTERNED_CARPETS, BlockusItemTags.PATTERNED_CARPETS);

        this.copy(BlockusBlockTags.SMALL_HEDGES, BlockusItemTags.SMALL_HEDGES);

        this.copy(BlockusBlockTags.SOUL_SOILS, BlockusItemTags.SOUL_SOILS);

        this.getOrCreateTagBuilder(BlockusItemTags.STAINED_STONE_BRICKS)
            .add(BlockusBlocks.WHITE_STONE_BRICKS.block.asItem())
            .add(BlockusBlocks.ORANGE_STONE_BRICKS.block.asItem())
            .add(BlockusBlocks.MAGENTA_STONE_BRICKS.block.asItem())
            .add(BlockusBlocks.LIGHT_BLUE_STONE_BRICKS.block.asItem())
            .add(BlockusBlocks.YELLOW_STONE_BRICKS.block.asItem())
            .add(BlockusBlocks.LIME_STONE_BRICKS.block.asItem())
            .add(BlockusBlocks.PINK_STONE_BRICKS.block.asItem())
            .add(BlockusBlocks.GRAY_STONE_BRICKS.block.asItem())
            .add(BlockusBlocks.GRAY_STONE_BRICKS.block.asItem())
            .add(Items.STONE_BRICKS)
            .add(BlockusBlocks.CYAN_STONE_BRICKS.block.asItem())
            .add(BlockusBlocks.PURPLE_STONE_BRICKS.block.asItem())
            .add(BlockusBlocks.BLUE_STONE_BRICKS.block.asItem())
            .add(BlockusBlocks.BROWN_STONE_BRICKS.block.asItem())
            .add(BlockusBlocks.GREEN_STONE_BRICKS.block.asItem())
            .add(BlockusBlocks.RED_STONE_BRICKS.block.asItem())
            .add(BlockusBlocks.BLACK_STONE_BRICKS.block.asItem());

        this.copy(BlockusBlockTags.WARPED_NETHER_GRASS, BlockusItemTags.WARPED_NETHER_GRASS);

        this.copy(BlockusBlockTags.WHITE_OAK_LOGS, BlockusItemTags.WHITE_OAK_LOGS);

        this.getOrCreateTagBuilder(BlockusItemTags.PLANKS_THAT_BURN)
            .add(Items.OAK_PLANKS)
            .add(Items.SPRUCE_PLANKS)
            .add(Items.BIRCH_PLANKS)
            .add(Items.JUNGLE_PLANKS)
            .add(Items.ACACIA_PLANKS)
            .add(Items.DARK_OAK_PLANKS)
            .add(Items.MANGROVE_PLANKS)
            .add(Items.CHERRY_PLANKS)
            .add(Items.BAMBOO_PLANKS)
            .add(BlockusBlocks.WHITE_OAK.planks.asItem());

        this.getOrCreateTagBuilder(BlockusItemTags.HERRINGBONE_PLANKS_THAT_BURN)
            .add(BlockusBlocks.HERRINGBONE_OAK_PLANKS.asItem())
            .add(BlockusBlocks.HERRINGBONE_BIRCH_PLANKS.asItem())
            .add(BlockusBlocks.HERRINGBONE_SPRUCE_PLANKS.asItem())
            .add(BlockusBlocks.HERRINGBONE_JUNGLE_PLANKS.asItem())
            .add(BlockusBlocks.HERRINGBONE_ACACIA_PLANKS.asItem())
            .add(BlockusBlocks.HERRINGBONE_DARK_OAK_PLANKS.asItem())
            .add(BlockusBlocks.HERRINGBONE_MANGROVE_PLANKS.asItem())
            .add(BlockusBlocks.HERRINGBONE_CHERRY_PLANKS.asItem())
            .add(BlockusBlocks.HERRINGBONE_BAMBOO_PLANKS.asItem())
            .add(BlockusBlocks.HERRINGBONE_WHITE_OAK_PLANKS.asItem());

        this.copy(new Identifier("c", "planks_that_burn"));

        this.copy(BlockTags.ACACIA_LOGS, ItemTags.ACACIA_LOGS);

        this.copy(BlockTags.BIRCH_LOGS, ItemTags.BIRCH_LOGS);


        this.copy(BlockTags.CHERRY_LOGS, ItemTags.CHERRY_LOGS);

        this.copy(BlockTags.CRIMSON_STEMS, ItemTags.CRIMSON_STEMS);

        this.copy(BlockTags.DARK_OAK_LOGS, ItemTags.DARK_OAK_LOGS);

        this.copy(BlockTags.FENCE_GATES, ItemTags.FENCE_GATES);


        this.copy(BlockTags.FLOWERS, ItemTags.FLOWERS);

        this.getOrCreateTagBuilder(BlockusItemTags.NATURAL_ICE)
            .add(Items.ICE)
            .add(Items.PACKED_ICE)
            .add(Items.BLUE_ICE);

        this.copy(BlockTags.JUNGLE_LOGS, ItemTags.JUNGLE_LOGS);

        this.copy(BlockTags.LEAVES, ItemTags.LEAVES);

        this.copy(BlockTags.LOGS_THAT_BURN, ItemTags.LOGS_THAT_BURN);

        this.copy(BlockTags.MANGROVE_LOGS, ItemTags.MANGROVE_LOGS);

        this.getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD)

            .add(BlockusBlocks.HERRINGBONE_CRIMSON_PLANKS.asItem())
            .add(BlockusBlocks.HERRINGBONE_WARPED_PLANKS.asItem())
            .add(BlockusBlocks.HERRINGBONE_CHARRED_PLANKS.asItem())
            .add(BlockusBlocks.MOSSY_CRIMSON_PLANKS.block.asItem())
            .add(BlockusBlocks.MOSSY_WARPED_PLANKS.block.asItem())
            .add(BlockusBlocks.MOSSY_CHARRED_PLANKS.block.asItem())
            .add(BlockusBlocks.MOSSY_CRIMSON_PLANKS.stairs.asItem())
            .add(BlockusBlocks.MOSSY_WARPED_PLANKS.stairs.asItem())
            .add(BlockusBlocks.MOSSY_CHARRED_PLANKS.stairs.asItem())
            .add(BlockusBlocks.MOSSY_CRIMSON_PLANKS.slab.asItem())
            .add(BlockusBlocks.MOSSY_WARPED_PLANKS.slab.asItem())
            .add(BlockusBlocks.MOSSY_CHARRED_PLANKS.slab.asItem())
            .add(BlockusBlocks.CRIMSON_MOSAIC.block.asItem())
            .add(BlockusBlocks.WARPED_MOSAIC.block.asItem())
            .add(BlockusBlocks.CHARRED_MOSAIC.block.asItem())
            .add(BlockusBlocks.CRIMSON_MOSAIC.stairs.asItem())
            .add(BlockusBlocks.WARPED_MOSAIC.stairs.asItem())
            .add(BlockusBlocks.CHARRED_MOSAIC.stairs.asItem())
            .add(BlockusBlocks.CRIMSON_MOSAIC.slab.asItem())
            .add(BlockusBlocks.WARPED_MOSAIC.slab.asItem())
            .add(BlockusBlocks.CHARRED_MOSAIC.slab.asItem())
            .add(BlockusEntities.CHARRED_BOAT.getItem())
            .add(BlockusEntities.CHARRED_BOAT.getChestItem())
            .add(BlockusBlocks.CHARRED.sign)
            .add(BlockusBlocks.CHARRED.hanging_sign);

        this.copy(BlockTags.OAK_LOGS, ItemTags.OAK_LOGS);

        this.getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED)
            .add(BlockusBlocks.GOLD_DECORATED_SANDSTONE.asItem())
            .add(BlockusBlocks.GOLD_DECORATED_RED_SANDSTONE.asItem())
            .add(BlockusBlocks.GOLD_DECORATED_POLISHED_BLACKSTONE.asItem())
            .add(BlockusBlocks.GOLD_PLATING.block.asItem())
            .add(BlockusBlocks.GOLDEN_APPLE_CRATE.asItem())
            .add(BlockusBlocks.GOLDEN_CARROT_CRATE.asItem());

        this.copy(BlockTags.PIGLIN_REPELLENTS, ItemTags.PIGLIN_REPELLENTS);

        this.copy(BlockTags.PLANKS, ItemTags.PLANKS);

        this.copy(BlockTags.SAPLINGS, ItemTags.SAPLINGS);

        this.copy(BlockTags.SMALL_FLOWERS, ItemTags.SMALL_FLOWERS);

        this.copy(BlockTags.SPRUCE_LOGS, ItemTags.SPRUCE_LOGS);

        this.copy(BlockTags.STAIRS, ItemTags.STAIRS);

        this.copy(BlockTags.SLABS, ItemTags.SLABS);

        this.copy(BlockTags.WALLS, ItemTags.WALLS);

        this.copy(BlockTags.WARPED_STEMS, ItemTags.WARPED_STEMS);

        this.copy(BlockTags.WOODEN_BUTTONS, ItemTags.WOODEN_BUTTONS);

        this.copy(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES);

        this.copy(BlockTags.WOODEN_PRESSURE_PLATES, ItemTags.WOODEN_PRESSURE_PLATES);

        this.copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);

        this.copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);

        this.copy(BlockTags.WOOL, ItemTags.WOOL);
        this.copy(BlockTags.WOOL_CARPETS, ItemTags.WOOL_CARPETS);
        this.copy(BlockTags.DAMPENS_VIBRATIONS, ItemTags.DAMPENS_VIBRATIONS);
        this.copy(BlockTags.DIRT, ItemTags.DIRT);


        this.copy(new Identifier("promenade", "cherry_oak_logs"));

        this.copy(new Identifier("promenade", "dark_amaranth_stems"));

        this.copy(new Identifier("promenade", "palm_logs"));
    }
}
