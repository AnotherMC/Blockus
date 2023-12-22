package com.brand.blockus.content;

import com.brand.blockus.blocks.base.*;
import com.brand.blockus.blocks.base.amethyst.AmethystPillarBlock;
import com.brand.blockus.blocks.base.asphalt.RainbowAsphalt;
import com.brand.blockus.blocks.base.redstone.FallingRedstoneBlock;
import com.brand.blockus.blocks.base.redstone.RedstoneLantern;
import com.brand.blockus.blocks.base.redstone.RedstonePumpkinBlock;
import com.brand.blockus.blocks.generator.BlockusSaplingGenerator;
import com.brand.blockus.content.types.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ColorCode;
import net.minecraft.util.DyeColor;

public class BlockusBlocks extends BlocksRegistration {

    // Stone
    public static final Block HERRINGBONE_STONE_BRICKS = register("herringbone_stone_bricks", createCopy(Blocks.STONE_BRICKS));

    public static final Block STURDY_STONE = register("sturdy_stone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).pistonBehavior(PistonBehavior.BLOCK)));

    // Andesite
    public static final BSSWTypes ANDESITE_BRICKS = new BSSWTypes("andesite_bricks", Blocks.POLISHED_ANDESITE);
    public static final Block CRACKED_ANDESITE_BRICKS = register("cracked_andesite_bricks", createCopy(BlockusBlocks.ANDESITE_BRICKS.block));
    public static final Block CHISELED_ANDESITE_BRICKS = register("chiseled_andesite_bricks", createCopy(BlockusBlocks.ANDESITE_BRICKS.block));
    public static final Block POLISHED_ANDESITE_PILLAR = registerPillar(Blocks.POLISHED_ANDESITE);
    public static final Block HERRINGBONE_ANDESITE_BRICKS = register("herringbone_andesite_bricks", createCopy(BlockusBlocks.ANDESITE_BRICKS.block));


    // Diorite
    public static final BSSWTypes DIORITE_BRICKS = new BSSWTypes("diorite_bricks", Blocks.POLISHED_DIORITE);
    public static final Block CRACKED_DIORITE_BRICKS = register("cracked_diorite_bricks", createCopy(BlockusBlocks.DIORITE_BRICKS.block));
    public static final Block CHISELED_DIORITE_BRICKS = register("chiseled_diorite_bricks", createCopy(BlockusBlocks.DIORITE_BRICKS.block));
    public static final Block POLISHED_DIORITE_PILLAR = registerPillar(Blocks.POLISHED_DIORITE);
    public static final Block HERRINGBONE_DIORITE_BRICKS = register("herringbone_diorite_bricks", createCopy(BlockusBlocks.DIORITE_BRICKS.block));


    // Granite
    public static final BSSWTypes GRANITE_BRICKS = new BSSWTypes("granite_bricks", Blocks.POLISHED_GRANITE);
    public static final Block CRACKED_GRANITE_BRICKS = register("cracked_granite_bricks", createCopy(BlockusBlocks.GRANITE_BRICKS.block));
    public static final Block CHISELED_GRANITE_BRICKS = register("chiseled_granite_bricks", createCopy(BlockusBlocks.GRANITE_BRICKS.block));
    public static final Block POLISHED_GRANITE_PILLAR = registerPillar(Blocks.POLISHED_GRANITE);
    public static final Block HERRINGBONE_GRANITE_BRICKS = register("herringbone_granite_bricks", createCopy(BlockusBlocks.GRANITE_BRICKS.block));


    // Mud
    public static final Block CHISELED_MUD_BRICKS = register("chiseled_mud_bricks", createCopy(Blocks.MUD_BRICKS));
    public static final Block MUD_BRICK_PILLAR = registerPillar(Blocks.MUD_BRICKS);

    // Dripstone
    public static final BSSTypes POLISHED_DRIPSTONE = new BSSTypes("polished_dripstone", Blocks.DRIPSTONE_BLOCK);
    public static final BSSWTypes DRIPSTONE_BRICKS = new BSSWTypes("dripstone_bricks", BlockusBlocks.POLISHED_DRIPSTONE.block);
    public static final Block CRACKED_DRIPSTONE_BRICKS = register("cracked_dripstone_bricks", createCopy(BlockusBlocks.DRIPSTONE_BRICKS.block));
    public static final Block CHISELED_DRIPSTONE = register("chiseled_dripstone", createCopy(BlockusBlocks.DRIPSTONE_BRICKS.block));
    public static final Block DRIPSTONE_PILLAR = createPillar("dripstone", BlockusBlocks.DRIPSTONE_BRICKS.block);

    // Deepslate
    public static final BSSWTypes MOSSY_DEEPSLATE_BRICKS = new BSSWTypes("mossy_deepslate_bricks", Blocks.DEEPSLATE_BRICKS);
    public static final Block DEEPSLATE_PILLAR = createPillar("deepslate", Blocks.POLISHED_DEEPSLATE);
    public static final Block HERRINGBONE_DEEPSLATE_BRICKS = register("herringbone_deepslate_bricks", createCopy(Blocks.DEEPSLATE_BRICKS));

    public static final Block STURDY_DEEPSLATE = register("sturdy_deepslate", new Block(FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE).pistonBehavior(PistonBehavior.BLOCK)));

    // Sculk
    public static final BSSTypes POLISHED_SCULK = new BSSTypes("polished_sculk", Blocks.POLISHED_DEEPSLATE, MapColor.CYAN);
    public static final BSSWTypes SCULK_BRICKS = new BSSWTypes("sculk_bricks", BlockusBlocks.POLISHED_SCULK.block);
    public static final Block CHISELED_SCULK_BRICKS = register("chiseled_sculk_bricks", createCopy(BlockusBlocks.SCULK_BRICKS.block));
    public static final Block SCULK_PILLAR = createPillar("sculk", BlockusBlocks.SCULK_BRICKS.block);

    // Amethyst
    public static final BSSTypes POLISHED_AMETHYST = new BSSTypes("polished_amethyst", Blocks.AMETHYST_BLOCK);
    public static final BSSWTypes AMETHYST_BRICKS = new BSSWTypes("amethyst_bricks", POLISHED_AMETHYST.block);
    public static final Block CHISELED_AMETHYST = register("chiseled_amethyst", new AmethystBlock(FabricBlockSettings.copy(AMETHYST_BRICKS.block)));
    public static final Block AMETHYST_PILLAR = register("amethyst_pillar", new AmethystPillarBlock(FabricBlockSettings.copy(AMETHYST_BRICKS.block)));

    // Blackstone
    public static final BSSWTypes POLISHED_BLACKSTONE_TILES = new BSSWTypes("polished_blackstone_tiles", Blocks.POLISHED_BLACKSTONE_BRICKS);
    public static final BSSWTypes CRIMSON_WARTY_BLACKSTONE_BRICKS = new BSSWTypes("crimson_warty_blackstone_bricks", Blocks.POLISHED_BLACKSTONE);
    public static final BSSWTypes WARPED_WARTY_BLACKSTONE_BRICKS = new BSSWTypes("warped_warty_blackstone_bricks", Blocks.POLISHED_BLACKSTONE);
    public static final Block POLISHED_BLACKSTONE_PILLAR = registerPillar(Blocks.POLISHED_BLACKSTONE);
    public static final Block HERRINGBONE_POLISHED_BLACKSTONE_BRICKS = register("herringbone_polished_blackstone_bricks", createCopy(Blocks.POLISHED_BLACKSTONE));

    public static final Block GOLD_DECORATED_POLISHED_BLACKSTONE = register("gold_decorated_polished_blackstone", createCopy(Blocks.POLISHED_BLACKSTONE));
    public static final Block STURDY_BLACKSTONE = register("sturdy_blackstone", new Block(FabricBlockSettings.copyOf(Blocks.BLACKSTONE).pistonBehavior(PistonBehavior.BLOCK)));



    // Basalt
    public static final BSSTypes ROUGH_BASALT = new BSSTypes("rough_basalt", Blocks.BASALT);
    public static final BSSWTypes POLISHED_BASALT_BRICKS = new BSSWTypes("polished_basalt_bricks", Blocks.POLISHED_BASALT);
    public static final Block CRACKED_POLISHED_BASALT_BRICKS = register("cracked_polished_basalt_bricks", createCopy(BlockusBlocks.POLISHED_BASALT_BRICKS.block));
    public static final Block CHISELED_POLISHED_BASALT = register("chiseled_polished_basalt", createCopy(BlockusBlocks.POLISHED_BASALT_BRICKS.block));
    public static final Block POLISHED_BASALT_PILLAR = createPillar("polished_basalt", BlockusBlocks.POLISHED_BASALT_BRICKS.block);
    public static final Block HERRINGBONE_POLISHED_BASALT_BRICKS = register("herringbone_polished_basalt_bricks", createCopy(BlockusBlocks.POLISHED_BASALT_BRICKS.block));


    // Wart Blocks
    public static final BSSWTypes CRIMSON_WART_BRICKS = new BSSWTypes("crimson_wart_bricks", Blocks.NETHER_WART_BLOCK, BlockSoundGroup.NETHER_BRICKS);
    public static final BSSWTypes WARPED_WART_BRICKS = new BSSWTypes("warped_wart_bricks", Blocks.WARPED_WART_BLOCK, BlockSoundGroup.NETHER_BRICKS);

    // Limestone
    public static final BSSWTypes LIMESTONE = new BSSWTypes("limestone", Blocks.STONE, MapColor.OAK_TAN);
    public static final BSSTypes POLISHED_LIMESTONE = new BSSTypes("polished_limestone", BlockusBlocks.LIMESTONE.block);
    public static final BSSWTypes LIMESTONE_BRICKS = new BSSWTypes("limestone_bricks", LIMESTONE.block);
    public static final BSSWTypes SMALL_LIMESTONE_BRICKS = new BSSWTypes("small_limestone_bricks", LIMESTONE_BRICKS.block);
    public static final BSSWTypes LIMESTONE_TILES = new BSSWTypes("limestone_tiles", LIMESTONE_BRICKS.block);
    public static final Block CHISELED_LIMESTONE = register("chiseled_limestone", createCopy(BlockusBlocks.LIMESTONE_BRICKS.block));
    public static final Block CHISELED_LIMESTONE_PILLAR = registerPillar(BlockusBlocks.CHISELED_LIMESTONE);
    public static final Block LIMESTONE_SQUARES = register("limestone_squares", createCopy(BlockusBlocks.LIMESTONE_BRICKS.block));

    public static final Block LIMESTONE_PILLAR = registerPillar(BlockusBlocks.LIMESTONE.block);
    // Marble
    public static final BSSWTypes MARBLE = new BSSWTypes("marble", Blocks.STONE, MapColor.OFF_WHITE);
    public static final BSSTypes POLISHED_MARBLE = new BSSTypes("polished_marble", BlockusBlocks.MARBLE.block);
    public static final BSSWTypes MARBLE_BRICKS = new BSSWTypes("marble_bricks", MARBLE.block);
    public static final BSSWTypes SMALL_MARBLE_BRICKS = new BSSWTypes("small_marble_bricks", MARBLE_BRICKS.block);
    public static final BSSWTypes MARBLE_TILES = new BSSWTypes("marble_tiles", MARBLE_BRICKS.block);
    public static final Block CHISELED_MARBLE = register("chiseled_marble", createCopy(BlockusBlocks.MARBLE_BRICKS.block));
    public static final Block CHISELED_MARBLE_PILLAR = registerPillar(BlockusBlocks.CHISELED_MARBLE);
    public static final Block MARBLE_SQUARES = register("marble_squares", createCopy(BlockusBlocks.MARBLE_BRICKS.block));

    public static final Block MARBLE_PILLAR = registerPillar(BlockusBlocks.MARBLE.block);
    // Bluestone
    public static final BSSWTypes BLUESTONE = new BSSWTypes("bluestone", Blocks.STONE, MapColor.CYAN);
    public static final BSSTypes POLISHED_BLUESTONE = new BSSTypes("polished_bluestone", BlockusBlocks.BLUESTONE.block);
    public static final BSSWTypes BLUESTONE_BRICKS = new BSSWTypes("bluestone_bricks", BLUESTONE.block);
    public static final BSSWTypes SMALL_BLUESTONE_BRICKS = new BSSWTypes("small_bluestone_bricks", BLUESTONE_BRICKS.block);
    public static final BSSWTypes BLUESTONE_TILES = new BSSWTypes("bluestone_tiles", BLUESTONE_BRICKS.block);
    public static final Block CHISELED_BLUESTONE = register("chiseled_bluestone", createCopy(BlockusBlocks.BLUESTONE_BRICKS.block));
    public static final Block CHISELED_BLUESTONE_PILLAR = registerPillar(BlockusBlocks.CHISELED_BLUESTONE);
    public static final Block BLUESTONE_SQUARES = register("bluestone_squares", createCopy(BlockusBlocks.BLUESTONE_BRICKS.block));

    public static final Block BLUESTONE_PILLAR = registerPillar(BlockusBlocks.BLUESTONE.block);
    // Viridite
    public static final BSSWTypes VIRIDITE = new BSSWTypes("viridite", Blocks.DEEPSLATE, MapColor.DARK_GREEN);
    public static final BSSTypes POLISHED_VIRIDITE = new BSSTypes("polished_viridite", BlockusBlocks.VIRIDITE.block);
    public static final BSSWTypes VIRIDITE_BRICKS = new BSSWTypes("viridite_bricks", VIRIDITE.block);
    public static final BSSWTypes SMALL_VIRIDITE_BRICKS = new BSSWTypes("small_viridite_bricks", VIRIDITE_BRICKS.block);
    public static final BSSWTypes VIRIDITE_TILES = new BSSWTypes("viridite_tiles", VIRIDITE_BRICKS.block);
    public static final Block CHISELED_VIRIDITE = register("chiseled_viridite", createCopy(BlockusBlocks.VIRIDITE_BRICKS.block));
    public static final Block CHISELED_VIRIDITE_PILLAR = registerPillar(BlockusBlocks.CHISELED_VIRIDITE);
    public static final Block VIRIDITE_SQUARES = register("viridite_squares", createCopy(BlockusBlocks.VIRIDITE_BRICKS.block));

    public static final Block VIRIDITE_PILLAR = registerPillar(BlockusBlocks.VIRIDITE.block);

    // Snow Bricks
    public static final BSSWTypes SNOW_BRICKS = new BSSWTypes("snow_bricks", Blocks.STONE_BRICKS, 1.0f, 3.0f, MapColor.WHITE);
    public static final Block SNOW_PILLAR = createPillar("snow", SNOW_BRICKS.block);

    // Ice Bricks
    public static final Block ICE_BRICKS = register("ice_bricks", new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_PURPLE).slipperiness(0.98F).strength(0.5F).sounds(BlockSoundGroup.GLASS)));

    public static final Block ICE_PILLAR = createPillar("ice", ICE_BRICKS);

    public static final Block GLOWING_OBSIDIAN = register("glowing_obsidian", createGlowingObsidian(Blocks.OBSIDIAN, 15, PistonBehavior.BLOCK));

    // Prismarine
    public static final Block CHISELED_PRISMARINE = register("chiseled_prismarine", createCopy(Blocks.PRISMARINE_BRICKS));
    public static final Block PRISMARINE_PILLAR = createPillar("prismarine", Blocks.PRISMARINE_BRICKS);
    public static final Block CHISELED_DARK_PRISMARINE = register("chiseled_dark_prismarine", new OrientableBlockBase(FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_PILLAR = createPillar("dark_prismarine", Blocks.DARK_PRISMARINE);
    public static final BSSWTypes PRISMARINE_TILES = new BSSWTypes("prismarine_tiles", Blocks.DARK_PRISMARINE);

    // Bricks
    public static final BSSWTypes LARGE_BRICKS = new BSSWTypes("large_bricks", Blocks.BRICKS);
    public static final Block HERRINGBONE_BRICKS = register("herringbone_bricks", createCopy(Blocks.BRICKS));

    // Soaked Bricks
    public static final BSSWTypes SOAKED_BRICKS = new BSSWTypes("soaked_bricks", Blocks.BRICKS);
    public static final Block HERRINGBONE_SOAKED_BRICKS = register("herringbone_soaked_bricks", createCopy(BlockusBlocks.SOAKED_BRICKS.block));

    //



    // Sandy Bricks
    public static final BSSWTypes SANDY_BRICKS = new BSSWTypes("sandy_bricks", Blocks.BRICKS);
    public static final Block HERRINGBONE_SANDY_BRICKS = register("herringbone_sandy_bricks", createCopy(BlockusBlocks.SANDY_BRICKS.block));

    // Sandstone
    public static final BSSTypes ROUGH_SANDSTONE = new BSSTypes("rough_sandstone", Blocks.SANDSTONE);
    public static final BSSWTypes SANDSTONE_BRICKS = new BSSWTypes("sandstone_bricks", Blocks.SANDSTONE);
    public static final BSSWTypes SMALL_SANDSTONE_BRICKS = new BSSWTypes("small_sandstone_bricks", Blocks.SANDSTONE);
    public static final Block SANDSTONE_PILLAR = createPillar("sandstone", Blocks.SANDSTONE);
    public static final Block GOLD_DECORATED_SANDSTONE = register("gold_decorated_sandstone", createCopy(Blocks.SANDSTONE));
    public static final Block LAPIS_DECORATED_SANDSTONE = register("lapis_decorated_sandstone", createCopy(Blocks.SANDSTONE));

    // Red Sandstone
    public static final BSSTypes ROUGH_RED_SANDSTONE = new BSSTypes("rough_red_sandstone", Blocks.RED_SANDSTONE);
    public static final BSSWTypes RED_SANDSTONE_BRICKS = new BSSWTypes("red_sandstone_bricks", Blocks.RED_SANDSTONE);
    public static final BSSWTypes SMALL_RED_SANDSTONE_BRICKS = new BSSWTypes("small_red_sandstone_bricks", Blocks.RED_SANDSTONE);
    public static final Block RED_SANDSTONE_PILLAR = createPillar("red_sandstone", Blocks.RED_SANDSTONE);
    public static final Block GOLD_DECORATED_RED_SANDSTONE = register("gold_decorated_red_sandstone", createCopy(Blocks.RED_SANDSTONE));
    public static final Block LAPIS_DECORATED_RED_SANDSTONE = register("lapis_decorated_red_sandstone", createCopy(Blocks.RED_SANDSTONE));

    // Rainbow
    public static final Block RAINBOW_ROSE = register("rainbow_rose", new FertilizableFlowerBlock(StatusEffects.GLOWING, 8, FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ)));
    public static final Block POTTED_RAINBOW_ROSE = registerNoItem("potted_rainbow_rose", createPottedPlant(RAINBOW_ROSE));
    public static final Block RAINBOW_BLOCK = register("rainbow_block", new PillarBlock(FabricBlockSettings.create().mapColor(MapColor.LIGHT_BLUE).strength(5.0f, 6.0f).requiresTool()));
    public static final BSSWTypes RAINBOW_BRICKS = new BSSWTypes("rainbow_bricks", Blocks.BRICKS);
    public static final Block RAINBOW_GLOWSTONE = register("rainbow_glowstone", createCopy(Blocks.GLOWSTONE));

    // Honeycomb Bricks
    public static final BSSWTypes HONEYCOMB_BRICKS = new BSSWTypes("honeycomb_bricks", Blocks.BRICKS);

    // Purpur Blocks
    public static final BSSWTypes PURPUR_BRICKS = new BSSWTypes("purpur_bricks", Blocks.PURPUR_BLOCK);
    public static final BSSWTypes SMALL_PURPUR_BRICKS = new BSSWTypes("small_purpur_bricks", Blocks.PURPUR_BLOCK);
    public static final BSSTypes POLISHED_PURPUR = new BSSTypes("polished_purpur", Blocks.PURPUR_BLOCK);
    public static final Block CHISELED_PURPUR = register("chiseled_purpur", createCopy(BlockusBlocks.PURPUR_BRICKS.block));
    public static final Block PURPUR_SQUARES = register("purpur_squares", createCopy(BlockusBlocks.PURPUR_BRICKS.block));

    // Phantom Purpur Blocks
    public static final BSSWTypes PHANTOM_PURPUR_BRICKS = new BSSWTypes("phantom_purpur_bricks", Blocks.PURPUR_BLOCK);
    public static final BSSWTypes SMALL_PHANTOM_PURPUR_BRICKS = new BSSWTypes("small_phantom_purpur_bricks", Blocks.PURPUR_BLOCK);
    public static final BSSTypes PHANTOM_PURPUR_BLOCK = new BSSTypes("phantom_purpur_block", Blocks.PURPUR_BLOCK);
    public static final BSSTypes POLISHED_PHANTOM_PURPUR = new BSSTypes("polished_phantom_purpur", Blocks.PURPUR_BLOCK);
    public static final Block PHANTOM_PURPUR_PILLAR = createPillar("phantom_purpur", Blocks.PURPUR_PILLAR);
    public static final Block CHISELED_PHANTOM_PURPUR = register("chiseled_phantom_purpur", createCopy(BlockusBlocks.PHANTOM_PURPUR_BRICKS.block));
    public static final Block PHANTOM_PURPUR_SQUARES = register("phantom_purpur_squares", createCopy(BlockusBlocks.PHANTOM_PURPUR_BRICKS.block));

    // End Stone
    public static final BSSTypes POLISHED_END_STONE = new BSSTypes("polished_end_stone", Blocks.END_STONE);
    public static final BSSWTypes SMALL_END_STONE_BRICKS = new BSSWTypes("small_end_stone_bricks", Blocks.END_STONE);
    public static final Block CHISELED_END_STONE_BRICKS = register("chiseled_end_stone_bricks", createCopy(Blocks.END_STONE_BRICKS));
    public static final Block HERRINGBONE_END_STONE_BRICKS = register("herringbone_end_stone_bricks", createCopy(Blocks.END_STONE_BRICKS));
    public static final Block CRACKED_END_STONE_BRICKS = register("cracked_end_stone_bricks", createCopy(Blocks.END_STONE_BRICKS));
    public static final Block END_STONE_PILLAR = createPillar("end_stone", Blocks.END_STONE_BRICKS);
    public static final Block PURPUR_DECORATED_END_STONE = register("purpur_decorated_end_stone", createCopy(Blocks.END_STONE_BRICKS));
    public static final Block PHANTOM_PURPUR_DECORATED_END_STONE = register("phantom_purpur_decorated_end_stone", createCopy(Blocks.END_STONE_BRICKS));
    public static final BSSWTypes END_TILES = new BSSWTypes("end_tiles", Blocks.END_STONE_BRICKS);

    // White Oak Wood
    public static final Block WHITE_OAK_SAPLING = register("white_oak_sapling", new SaplingBlock(BlockusSaplingGenerator.WHITE_OAK, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_WHITE_OAK_SAPLING = registerNoItem("potted_white_oak_sapling", createPottedPlant(WHITE_OAK_SAPLING));
    public static final Block WHITE_OAK_LOG = register("white_oak_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block STRIPPED_WHITE_OAK_LOG = register("stripped_white_oak_log", createPillarCopy(WHITE_OAK_LOG));
    public static final Block WHITE_OAK_WOOD = register("white_oak_wood", createPillarCopy(WHITE_OAK_LOG));
    public static final Block STRIPPED_WHITE_OAK_WOOD = register("stripped_white_oak_wood", createPillarCopy(WHITE_OAK_LOG));
    public static final Block WHITE_OAK_LEAVES = register("white_oak_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).mapColor(MapColor.ORANGE).pistonBehavior(PistonBehavior.DESTROY).allowsSpawning(BlockusBlocks::canSpawnOnLeaves).suffocates(BlockusBlocks::never).blockVision(BlockusBlocks::never)));
    public static final WoodTypes WHITE_OAK = new WoodTypes("white_oak", Blocks.OAK_PLANKS, MapColor.OFF_WHITE, BlockSoundGroup.WOOD);

    // Herringbone Planks
    public static final Block HERRINGBONE_OAK_PLANKS = register("herringbone_oak_planks", createCopy(Blocks.OAK_PLANKS));
    public static final Block HERRINGBONE_SPRUCE_PLANKS = register("herringbone_spruce_planks", createCopy(Blocks.SPRUCE_PLANKS));
    public static final Block HERRINGBONE_BIRCH_PLANKS = register("herringbone_birch_planks", createCopy(Blocks.BIRCH_PLANKS));
    public static final Block HERRINGBONE_JUNGLE_PLANKS = register("herringbone_jungle_planks", createCopy(Blocks.JUNGLE_PLANKS));
    public static final Block HERRINGBONE_ACACIA_PLANKS = register("herringbone_acacia_planks", createCopy(Blocks.ACACIA_PLANKS));
    public static final Block HERRINGBONE_DARK_OAK_PLANKS = register("herringbone_dark_oak_planks", createCopy(Blocks.DARK_OAK_PLANKS));
    public static final Block HERRINGBONE_CHERRY_PLANKS = register("herringbone_cherry_planks", createCopy(Blocks.MANGROVE_PLANKS));
    public static final Block HERRINGBONE_MANGROVE_PLANKS = register("herringbone_mangrove_planks", createCopy(Blocks.MANGROVE_PLANKS));
    public static final Block HERRINGBONE_BAMBOO_PLANKS = register("herringbone_bamboo_planks", createCopy(Blocks.BAMBOO_PLANKS));
    public static final Block HERRINGBONE_WHITE_OAK_PLANKS = register("herringbone_white_oak_planks", createCopy(WHITE_OAK.planks));
    public static final Block HERRINGBONE_WARPED_PLANKS = register("herringbone_warped_planks", createCopy(Blocks.WARPED_PLANKS));
    public static final Block HERRINGBONE_CRIMSON_PLANKS = register("herringbone_crimson_planks", createCopy(Blocks.CRIMSON_PLANKS));

    // Food Blocks
    public static final Block SWEET_BERRIES_CRATE = register("sweet_berries_crate", createCrates());
    public static final Block GLOW_BERRIES_CRATE = register("glow_berries_crate", createLightCrate());
    public static final Block SALMON_CRATE = register("salmon_crate", createCrates());
    public static final Block PUFFERFISH_CRATE = register("pufferfish_crate", createCrates());
    public static final Block TROPICAL_FISH_CRATE = register("tropical_fish_crate", createCrates());
    public static final Block COD_CRATE = register("cod_crate", createCrates());
    public static final Block COOKIE_BLOCK = register("cookie_block", new CookieBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(0.5F).sounds(BlockSoundGroup.GRASS)));
    public static final Block CHORUS_BLOCK = register("chorus_block", new PillarBlock(FabricBlockSettings.create().mapColor(MapColor.PURPLE).strength(0.5f).sounds(BlockSoundGroup.GRASS)));
    public static final Block POTATO_CRATE = register("potato_crate", createCrates());
    public static final Block APPLE_CRATE = register("apple_crate", createCrates());
    public static final Block GOLDEN_APPLE_CRATE = register("golden_apple_crate", createCrates());
    public static final Block BEETROOT_CRATE = register("beetroot_crate", createCrates());
    public static final Block CARROT_CRATE = register("carrot_crate", createCrates());
    public static final Block GOLDEN_CARROT_CRATE = register("golden_carrot_crate", createCrates());
    public static final Block BREAD_BOX = register("bread_box", new OrientableBlockBase(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.5f)));

    // Stained Stone Bricks
    public static final BSSWTypes WHITE_STONE_BRICKS = new BSSWTypes("white_stone_bricks", Blocks.STONE_BRICKS, MapColor.WHITE);
    public static final BSSWTypes GRAY_STONE_BRICKS = new BSSWTypes("gray_stone_bricks", Blocks.STONE_BRICKS, MapColor.GRAY);
    public static final BSSWTypes BLACK_STONE_BRICKS = new BSSWTypes("black_stone_bricks", Blocks.STONE_BRICKS, MapColor.BLACK);
    public static final BSSWTypes BROWN_STONE_BRICKS = new BSSWTypes("brown_stone_bricks", Blocks.STONE_BRICKS, MapColor.BROWN);
    public static final BSSWTypes RED_STONE_BRICKS = new BSSWTypes("red_stone_bricks", Blocks.STONE_BRICKS, MapColor.RED);
    public static final BSSWTypes ORANGE_STONE_BRICKS = new BSSWTypes("orange_stone_bricks", Blocks.STONE_BRICKS, MapColor.ORANGE);
    public static final BSSWTypes YELLOW_STONE_BRICKS = new BSSWTypes("yellow_stone_bricks", Blocks.STONE_BRICKS, MapColor.YELLOW);
    public static final BSSWTypes LIME_STONE_BRICKS = new BSSWTypes("lime_stone_bricks", Blocks.STONE_BRICKS, MapColor.LIME);
    public static final BSSWTypes GREEN_STONE_BRICKS = new BSSWTypes("green_stone_bricks", Blocks.STONE_BRICKS, MapColor.GREEN);
    public static final BSSWTypes CYAN_STONE_BRICKS = new BSSWTypes("cyan_stone_bricks", Blocks.STONE_BRICKS, MapColor.CYAN);
    public static final BSSWTypes LIGHT_BLUE_STONE_BRICKS = new BSSWTypes("light_blue_stone_bricks", Blocks.STONE_BRICKS, MapColor.LIGHT_BLUE);
    public static final BSSWTypes BLUE_STONE_BRICKS = new BSSWTypes("blue_stone_bricks", Blocks.STONE_BRICKS, MapColor.BLUE);
    public static final BSSWTypes PURPLE_STONE_BRICKS = new BSSWTypes("purple_stone_bricks", Blocks.STONE_BRICKS, MapColor.PURPLE);
    public static final BSSWTypes MAGENTA_STONE_BRICKS = new BSSWTypes("magenta_stone_bricks", Blocks.STONE_BRICKS, MapColor.MAGENTA);
    public static final BSSWTypes PINK_STONE_BRICKS = new BSSWTypes("pink_stone_bricks", Blocks.STONE_BRICKS, MapColor.PINK);

    // Asphalt
    public static final AsphaltTypes ASPHALT = new AsphaltTypes(DyeColor.BLACK);
    public static final AsphaltTypes WHITE_ASPHALT = new AsphaltTypes(DyeColor.WHITE);
    public static final AsphaltTypes LIGHT_GRAY_ASPHALT = new AsphaltTypes(DyeColor.LIGHT_GRAY);
    public static final AsphaltTypes GRAY_ASPHALT = new AsphaltTypes(DyeColor.GRAY);
    public static final AsphaltTypes BROWN_ASPHALT = new AsphaltTypes(DyeColor.BROWN);
    public static final AsphaltTypes RED_ASPHALT = new AsphaltTypes(DyeColor.RED);
    public static final AsphaltTypes ORANGE_ASPHALT = new AsphaltTypes(DyeColor.ORANGE);
    public static final AsphaltTypes YELLOW_ASPHALT = new AsphaltTypes(DyeColor.YELLOW);
    public static final AsphaltTypes LIME_ASPHALT = new AsphaltTypes(DyeColor.LIME);
    public static final AsphaltTypes GREEN_ASPHALT = new AsphaltTypes(DyeColor.GREEN);
    public static final AsphaltTypes CYAN_ASPHALT = new AsphaltTypes(DyeColor.CYAN);
    public static final AsphaltTypes LIGHT_BLUE_ASPHALT = new AsphaltTypes(DyeColor.LIGHT_BLUE);
    public static final AsphaltTypes BLUE_ASPHALT = new AsphaltTypes(DyeColor.BLUE);
    public static final AsphaltTypes PURPLE_ASPHALT = new AsphaltTypes(DyeColor.PURPLE);
    public static final AsphaltTypes MAGENTA_ASPHALT = new AsphaltTypes(DyeColor.MAGENTA);
    public static final AsphaltTypes PINK_ASPHALT = new AsphaltTypes(DyeColor.PINK);
    public static final Block RAINBOW_ASPHALT = register("rainbow_asphalt", new RainbowAsphalt(FabricBlockSettings.create().mapColor(DyeColor.BLUE).instrument(Instrument.BASEDRUM).strength(1.5f, 6.0f).requiresTool()));

    // Thatch
    public static final BSSTypes THATCH = new BSSTypes("thatch", Blocks.HAY_BLOCK);

    // Paper
    public static final Block PAPER_BLOCK = register("paper_block", new Block(FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).strength(0.1f, 0.8f).sounds(BlockSoundGroup.GRASS)));
    public static final Block BURNT_PAPER_BLOCK = register("burnt_paper_block", new Block(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).strength(0.1f, 0.8f).sounds(BlockSoundGroup.GRASS)));
    public static final Block FRAMED_PAPER_BLOCK = register("framed_paper_block", new Block(FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).instrument(Instrument.BASS).strength(0.1f, 0.8f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block PAPER_LAMP = register("paper_lamp", new PaperLampBlock(FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).strength(0.1f, 0.8f).sounds(BlockSoundGroup.GRASS).luminance(15).instrument(Instrument.BASS)));

    // Plating
    public static final BSSTypes IRON_PLATING = new BSSTypes("iron_plating", Blocks.IRON_BLOCK, MapColor.STONE_GRAY);
    public static final BSSTypes GOLD_PLATING = new BSSTypes("gold_plating", Blocks.GOLD_BLOCK);
    
    // Lantern Blocks
    public static final Block LANTERN_BLOCK = register("lantern_block", createCopy(Blocks.LANTERN));
    public static final Block SOUL_LANTERN_BLOCK = register("soul_lantern_block", createCopy(Blocks.SOUL_LANTERN));
    public static final Block SOUL_O_LANTERN = register("soul_o_lantern", new CarvedPumpkinBlock(FabricBlockSettings.copyOf(Blocks.JACK_O_LANTERN).luminance(10).pistonBehavior(PistonBehavior.DESTROY)));

    // Other
    public static final Block PATH = register("path", new DirtPathBlock(FabricBlockSettings.copyOf(Blocks.DIRT_PATH)));
    public static final Block CHARCOAL_BLOCK = register("charcoal_block", createCopy(Blocks.COAL_BLOCK));
    public static final Block SUGAR_BLOCK = register("sugar_block", createFallingBlock(0.5f, 0.5f, BlockSoundGroup.SAND, MapColor.OFF_WHITE));
    public static final Block ROTTEN_FLESH_BLOCK = register("rotten_flesh_block", new Block(FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_RED).strength(0.5f).sounds(BlockSoundGroup.SLIME)));
    public static final Block MEMBRANE_BLOCK = register("membrane_block", new Block(FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_WHITE).strength(0.5f).sounds(BlockSoundGroup.SLIME)));
    public static final Block NETHER_STAR_BLOCK = registerGlint("nether_stars_block", new NetherStarBlock(FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).strength(5.0f, 6.0f).requiresTool()));
    public static final Block REDSTONE_SAND = register("redstone_sand", new FallingRedstoneBlock(FabricBlockSettings.copyOf(Blocks.SAND).mapColor(MapColor.BRIGHT_RED)));
    public static final Block WEIGHT_STORAGE_CUBE = register("weight_storage_cube", new WeightStorageCubeBlock(FabricBlockSettings.create().mapColor(MapColor.IRON_GRAY).strength(0.1f, 6.0f)));
    public static final Block COMPANION_CUBE = register("companion_cube", createFallingBlock(0.1f, 6.0f, BlockSoundGroup.STONE, MapColor.IRON_GRAY));
    public static final Block CAUTION_BLOCK = register("caution_block", new Block(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(1.5f, 1200.0f).requiresTool()));
    public static final Block STARS_BLOCK = register("stars_block", new Block(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(5.0f, 6.0f)));
    
    // Colored Tiles
    /**
     * <p>Bicolor variants in {@link ColoredTilesTypes}.
     */
    public static final Block WHITE_COLORED_TILES = register("white_colored_tiles", createCopy(Blocks.WHITE_CONCRETE));
    public static final Block ORANGE_COLORED_TILES = register("orange_colored_tiles", createCopy(Blocks.ORANGE_CONCRETE));
    public static final Block MAGENTA_COLORED_TILES = register("magenta_colored_tiles", createCopy(Blocks.MAGENTA_CONCRETE));
    public static final Block LIGHT_BLUE_COLORED_TILES = register("light_blue_colored_tiles", createCopy(Blocks.LIGHT_BLUE_CONCRETE));
    public static final Block YELLOW_COLORED_TILES = register("yellow_colored_tiles", createCopy(Blocks.YELLOW_CONCRETE));
    public static final Block LIME_COLORED_TILES = register("lime_colored_tiles", createCopy(Blocks.LIME_CONCRETE));
    public static final Block PINK_COLORED_TILES = register("pink_colored_tiles", createCopy(Blocks.PINK_CONCRETE));
    public static final Block GRAY_COLORED_TILES = register("gray_colored_tiles", createCopy(Blocks.GRAY_CONCRETE));
    public static final Block LIGHT_GRAY_COLORED_TILES = register("light_gray_colored_tiles", createCopy(Blocks.LIGHT_GRAY_CONCRETE));
    public static final Block CYAN_COLORED_TILES = register("cyan_colored_tiles", createCopy(Blocks.CYAN_CONCRETE));
    public static final Block PURPLE_COLORED_TILES = register("purple_colored_tiles", createCopy(Blocks.PURPLE_CONCRETE));
    public static final Block BLUE_COLORED_TILES = register("blue_colored_tiles", createCopy(Blocks.BLUE_CONCRETE));
    public static final Block BROWN_COLORED_TILES = register("brown_colored_tiles", createCopy(Blocks.BROWN_CONCRETE));
    public static final Block GREEN_COLORED_TILES = register("green_colored_tiles", createCopy(Blocks.GREEN_CONCRETE));
    public static final Block RED_COLORED_TILES = register("red_colored_tiles", createCopy(Blocks.RED_CONCRETE));
    public static final Block BLACK_COLORED_TILES = register("black_colored_tiles", createCopy(Blocks.BLACK_CONCRETE));
    public static final Block RAINBOW_COLORED_TILES = register("rainbow_colored_tiles", new HorizontalAxisBlockBase(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_CONCRETE)));

}
