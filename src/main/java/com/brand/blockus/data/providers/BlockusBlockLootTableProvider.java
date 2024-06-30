package com.brand.blockus.data.providers;

import com.brand.blockus.blocks.base.CookieBlock;
import com.brand.blockus.content.BlockusBlocks;
import com.brand.blockus.content.BlockusItems;
import com.brand.blockus.content.types.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.LimitCountLootFunction;
import net.minecraft.loot.function.LootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.operator.BoundedIntUnaryOperator;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import static com.brand.blockus.content.BlockusBlocks.*;

public class BlockusBlockLootTableProvider extends FabricBlockLootTableProvider {
    public final RegistryWrapper.WrapperLookup registryLookup;

    public BlockusBlockLootTableProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
        this.registryLookup = registryLookup.join();
    }

    @Override
    public void generate() {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);

        for (BSSWTypes bsswType : BSSWTypes.values()) {
            this.addBlockStairsandSlabDrops(bsswType.block);
        }

        for (ConcreteTypes concreteType : ConcreteTypes.values()) {
            this.addBlockStairsandSlabDrops(concreteType.block);
            this.addDrop(concreteType.chiseled);
            this.addDrop(concreteType.pillar);
        }

        for (WoodTypes woodType : WoodTypes.values()) {
            this.addWoodSetDrop(woodType.planks);
        }

        for (TimberFrameTypes timberFrameType : TimberFrameTypes.values()) {
            for (Block block : timberFrameType.all) {
                this.addDrops(block);
            }
        }

        for (AsphaltTypes asphaltTypes : AsphaltTypes.values()) {
            this.addBlockStairsandSlabDrops(asphaltTypes.block);
        }


        this.addDrops(CHISELED_MUD_BRICKS,
            MUD_BRICK_PILLAR);

        // Viridite
        this.addDrop(BlockusBlocks.CHISELED_VIRIDITE);
        this.addDrop(BlockusBlocks.CHISELED_VIRIDITE_PILLAR);
        this.addDrop(BlockusBlocks.VIRIDITE_PILLAR);
        this.addDrop(BlockusBlocks.VIRIDITE_SQUARES);

        // Amethyst
        this.addDrop(BlockusBlocks.CHISELED_AMETHYST);
        this.addDrop(BlockusBlocks.AMETHYST_PILLAR);

        // Sculk
        this.addDrop(BlockusBlocks.CHISELED_SCULK_BRICKS);
        this.addDrop(BlockusBlocks.SCULK_PILLAR);

        // Herringbone Planks
        this.addDrop(BlockusBlocks.HERRINGBONE_OAK_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_BIRCH_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_SPRUCE_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_JUNGLE_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_ACACIA_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_DARK_OAK_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_MANGROVE_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_CHERRY_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_BAMBOO_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_WHITE_OAK_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_CRIMSON_PLANKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_WARPED_PLANKS);

        // Other
        this.addDrop(BlockusBlocks.APPLE_CRATE);
        this.addDrop(BlockusBlocks.BEETROOT_CRATE);
        this.addDrop(BlockusBlocks.BLACK_COLORED_TILES);
        this.addDrop(BlockusBlocks.BLUE_COLORED_TILES);
        this.addDrop(BlockusBlocks.BLUESTONE_PILLAR);
        this.addDrop(BlockusBlocks.BLUESTONE_SQUARES);
        this.addDrop(BlockusBlocks.BREAD_BOX);
        this.addDrop(BlockusBlocks.BROWN_COLORED_TILES);
        this.addDrop(BlockusBlocks.CARROT_CRATE);
        this.addDrop(BlockusBlocks.CAUTION_BLOCK);
        this.addDrop(BlockusBlocks.CHARCOAL_BLOCK);
        this.addDrop(BlockusBlocks.CHISELED_ANDESITE_BRICKS);
        this.addDrop(BlockusBlocks.CHISELED_BLUESTONE);
        this.addDrop(BlockusBlocks.CHISELED_DARK_PRISMARINE);
        this.addDrop(BlockusBlocks.CHISELED_DIORITE_BRICKS);
        this.addDrop(BlockusBlocks.CHISELED_DRIPSTONE);
        this.addDrop(BlockusBlocks.CHISELED_END_STONE_BRICKS);
        this.addDrop(BlockusBlocks.CHISELED_GRANITE_BRICKS);
        this.addDrop(BlockusBlocks.CHISELED_LIMESTONE);
        this.addDrop(BlockusBlocks.CHISELED_MARBLE);
        this.addDrop(BlockusBlocks.CHISELED_MARBLE_PILLAR);
        this.addDrop(BlockusBlocks.CHISELED_LIMESTONE_PILLAR);
        this.addDrop(BlockusBlocks.CHISELED_BLUESTONE_PILLAR);
        this.addDrop(BlockusBlocks.CHISELED_PHANTOM_PURPUR);
        this.addDrop(BlockusBlocks.CHISELED_POLISHED_BASALT);
        this.addDrop(BlockusBlocks.CHISELED_PRISMARINE);
        this.addDrop(BlockusBlocks.CHISELED_PURPUR);
        this.addDrop(BlockusBlocks.CHORUS_BLOCK);
        this.addDrop(BlockusBlocks.COD_CRATE);
        this.addDrop(BlockusBlocks.COMPANION_CUBE);
        this.addDrop(BlockusBlocks.CRACKED_ANDESITE_BRICKS);
        this.addDrop(BlockusBlocks.CRACKED_DIORITE_BRICKS);
        this.addDrop(BlockusBlocks.CRACKED_DRIPSTONE_BRICKS);
        this.addDrop(BlockusBlocks.CRACKED_END_STONE_BRICKS);
        this.addDrop(BlockusBlocks.CRACKED_GRANITE_BRICKS);
        this.addDrop(BlockusBlocks.CRACKED_POLISHED_BASALT_BRICKS);
        this.addDrop(BlockusBlocks.CYAN_COLORED_TILES);
        this.addDrop(BlockusBlocks.DARK_PRISMARINE_PILLAR);
        this.addDrop(BlockusBlocks.DEEPSLATE_PILLAR);
        this.addDrop(BlockusBlocks.DRIPSTONE_PILLAR);
        this.addDrop(BlockusBlocks.END_STONE_PILLAR);
        this.addDrop(BlockusBlocks.FRAMED_PAPER_BLOCK);
        this.addDrop(BlockusBlocks.GLOW_BERRIES_CRATE);
        this.addDrop(BlockusBlocks.GLOWING_OBSIDIAN);
        this.addDrop(BlockusBlocks.GOLD_DECORATED_POLISHED_BLACKSTONE);
        this.addDrop(BlockusBlocks.GOLD_DECORATED_RED_SANDSTONE);
        this.addDrop(BlockusBlocks.GOLD_DECORATED_SANDSTONE);
        this.addDrop(BlockusBlocks.GOLDEN_APPLE_CRATE);
        this.addDrop(BlockusBlocks.GOLDEN_CARROT_CRATE);
        this.addDrop(BlockusBlocks.GRAY_COLORED_TILES);
        this.addDrop(BlockusBlocks.GREEN_COLORED_TILES);
        this.addDrop(BlockusBlocks.LANTERN_BLOCK);
        this.addDrop(BlockusBlocks.LAPIS_DECORATED_RED_SANDSTONE);
        this.addDrop(BlockusBlocks.LAPIS_DECORATED_SANDSTONE);
        this.addDrop(BlockusBlocks.LIGHT_BLUE_COLORED_TILES);
        this.addDrop(BlockusBlocks.LIGHT_GRAY_COLORED_TILES);
        this.addDrop(BlockusBlocks.LIME_COLORED_TILES);
        this.addDrop(BlockusBlocks.LIMESTONE_PILLAR);
        this.addDrop(BlockusBlocks.LIMESTONE_SQUARES);
        this.addDrop(BlockusBlocks.MAGENTA_COLORED_TILES);
        this.addDrop(BlockusBlocks.MARBLE_PILLAR);
        this.addDrop(BlockusBlocks.MARBLE_SQUARES);
        this.addDrop(BlockusBlocks.MEMBRANE_BLOCK);
        this.addDrop(BlockusBlocks.ORANGE_COLORED_TILES);
        this.addDrop(BlockusBlocks.PAPER_BLOCK);
        this.addDrop(BlockusBlocks.PAPER_LAMP);
        this.addDrop(BlockusBlocks.PATH);
        this.addDrop(BlockusBlocks.PHANTOM_PURPUR_DECORATED_END_STONE);
        this.addDrop(BlockusBlocks.PHANTOM_PURPUR_PILLAR);
        this.addDrop(BlockusBlocks.PHANTOM_PURPUR_SQUARES);
        this.addDrop(BlockusBlocks.PINK_COLORED_TILES);
        this.addDrop(BlockusBlocks.POLISHED_ANDESITE_PILLAR);
        this.addDrop(BlockusBlocks.POLISHED_BASALT_PILLAR);
        this.addDrop(BlockusBlocks.POLISHED_BLACKSTONE_PILLAR);
        this.addDrop(BlockusBlocks.POLISHED_DIORITE_PILLAR);
        this.addDrop(BlockusBlocks.POLISHED_GRANITE_PILLAR);
        this.addDrop(BlockusBlocks.POTATO_CRATE);
        this.addDrop(BlockusBlocks.PRISMARINE_PILLAR);
        this.addDrop(BlockusBlocks.PUFFERFISH_CRATE);
        this.addDrop(BlockusBlocks.PURPLE_COLORED_TILES);
        this.addDrop(BlockusBlocks.PURPUR_DECORATED_END_STONE);
        this.addDrop(BlockusBlocks.PURPUR_SQUARES);
        this.addDrop(BlockusBlocks.RAINBOW_ASPHALT);
        this.addDrop(BlockusBlocks.RAINBOW_BLOCK);
        this.addDrop(BlockusBlocks.RAINBOW_COLORED_TILES);
        this.addDrop(BlockusBlocks.RED_COLORED_TILES);
        this.addDrop(BlockusBlocks.RED_SANDSTONE_PILLAR);
        this.addDrop(BlockusBlocks.REDSTONE_SAND);
        this.addDrop(BlockusBlocks.ROTTEN_FLESH_BLOCK);
        this.addDrop(BlockusBlocks.SALMON_CRATE);
        this.addDrop(BlockusBlocks.SANDSTONE_PILLAR);
        this.addDrop(BlockusBlocks.SNOW_PILLAR);
        this.addDrop(BlockusBlocks.SOUL_LANTERN_BLOCK);
        this.addDrop(BlockusBlocks.SOUL_O_LANTERN);
        this.addDrop(BlockusBlocks.STARS_BLOCK);
        this.addDrop(BlockusBlocks.STRIPPED_WHITE_OAK_LOG);
        this.addDrop(BlockusBlocks.STRIPPED_WHITE_OAK_WOOD);
        this.addDrop(BlockusBlocks.STURDY_BLACKSTONE);
        this.addDrop(BlockusBlocks.STURDY_DEEPSLATE);
        this.addDrop(BlockusBlocks.STURDY_STONE);
        this.addDrop(BlockusBlocks.SUGAR_BLOCK);
        this.addDrop(BlockusBlocks.SWEET_BERRIES_CRATE);
        this.addDrop(BlockusBlocks.TROPICAL_FISH_CRATE);
        this.addDrop(BlockusBlocks.WEIGHT_STORAGE_CUBE);
        this.addDrop(BlockusBlocks.WHITE_COLORED_TILES);
        this.addDrop(BlockusBlocks.WHITE_OAK_LOG);
        this.addDrop(BlockusBlocks.WHITE_OAK_SAPLING);
        this.addDrop(BlockusBlocks.WHITE_OAK_WOOD);
        this.addDrop(BlockusBlocks.YELLOW_COLORED_TILES);
        this.addDrop(BlockusBlocks.HERRINGBONE_ANDESITE_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_DEEPSLATE_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_DIORITE_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_END_STONE_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_GRANITE_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_POLISHED_BASALT_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_POLISHED_BLACKSTONE_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_SANDY_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_SOAKED_BRICKS);
        this.addDrop(BlockusBlocks.HERRINGBONE_STONE_BRICKS);
        this.addDrop(BlockusBlocks.RAINBOW_ROSE);


        this.addPottedPlantDrops(BlockusBlocks.POTTED_WHITE_OAK_SAPLING);
        this.addPottedPlantDrops(BlockusBlocks.POTTED_RAINBOW_ROSE);


        this.addDropWithSilkTouch(BlockusBlocks.ICE_BRICKS);
        this.addDropWithSilkTouch(BlockusBlocks.ICE_PILLAR);

        this.addDrop(BlockusBlocks.WHITE_OAK_LEAVES, (block) -> this.oakLeavesDrops(block, BlockusBlocks.WHITE_OAK_SAPLING, SAPLING_DROP_CHANCE));
        this.addDrop(BlockusBlocks.BURNT_PAPER_BLOCK, (block) -> this.drops(block, Items.GUNPOWDER, ConstantLootNumberProvider.create(2.0F)));
        this.addDrop(NETHER_STAR_BLOCK, (block) -> dropsWithSilkTouch(block, this.applyExplosionDecay(block, ItemEntry.builder(Items.NETHER_STAR).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(8.0F, 9.0F))).apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 2)).apply(LimitCountLootFunction.builder(BoundedIntUnaryOperator.create(8, 9))))));
        this.addDrop(RAINBOW_GLOWSTONE, (block) -> glowstoneDrops(block).pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F)).conditionally(this.createWithoutSilkTouchCondition()).with((this.applyExplosionDecay(block, ItemEntry.builder(BlockusItems.RAINBOW_PETAL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1))).apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))).apply(LimitCountLootFunction.builder(BoundedIntUnaryOperator.create(1, 4))))))));

        this.addDrop(BlockusBlocks.COOKIE_BLOCK, (block) -> LootTable.builder().pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F)).with(this.applyExplosionDecay(block,
            ItemEntry.builder(Items.COOKIE).apply(setCookieCount(block, 9.0F, 0))
                .apply(setCookieCount(block, 8.0F, 1))
                .apply(setCookieCount(block, 7.0F, 2))
                .apply(setCookieCount(block, 6.0F, 3))
                .apply(setCookieCount(block, 5.0F, 4))
                .apply(setCookieCount(block, 4.0F, 5))
                .apply(setCookieCount(block, 3.0F, 6))
                .apply(setCookieCount(block, 2.0F, 7))
                .apply(setCookieCount(block, 1.0F, 8))))));
    }

    public void addBlockStairsandSlabDrops(Block block) {
        this.addDrop(block);
    }

    public void addDrops(Block... blocks) {
        for (Block block : blocks) this.addDrop(block);
    }

    public void addDrops(Function<Block, LootTable.Builder> lootTableFunction, Block... blocks) {
        for (Block block : blocks) this.addDrop(block, lootTableFunction.apply(block));
    }

    public void addDropsWithSilkTouch(Block... blocks) {
        for (Block block : blocks) this.addDropWithSilkTouch(block);
    }

    public void addPottedPlantDropsBatch(Block... blocks) {
        for (Block block : blocks) this.addPottedPlantDrops(block);
    }

    public void addBlockStairsandSlabDrops(Block block, Block stairs, Block slab) {
        this.addDrops(block, stairs);
        this.addDrop(slab, this::slabDrops);
    }

    public void addWoodSetDrop(Block planks) {
        this.addDrop(planks);
    }

    public LootFunction.Builder setCookieCount(Block block, float count, int bites) {
        return SetCountLootFunction.builder(ConstantLootNumberProvider.create(count)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(net.minecraft.predicate.StatePredicate.Builder.create().exactMatch(CookieBlock.BITES, bites)));
    }

    public LootTable.Builder glowstoneDrops(Block block) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return dropsWithSilkTouch(block, this.applyExplosionDecay(block, ItemEntry.builder(Items.GLOWSTONE_DUST).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 4.0F))).apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))).apply(LimitCountLootFunction.builder(BoundedIntUnaryOperator.create(1, 4)))));
    }

    public LootTable.Builder stickDrops(Block block) {
        return dropsWithSilkTouchOrShears(block, addSurvivesExplosionCondition(block, ItemEntry.builder(Items.STICK)));
    }
}
