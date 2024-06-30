package com.brand.blockus.data.providers;

import com.brand.blockus.Blockus;
import com.brand.blockus.content.BlockusBlocks;
import com.brand.blockus.content.types.*;
import com.brand.blockus.data.family.BlockusWoodFamilies;
import com.brand.blockus.data.models.BlockusModels;
import com.brand.blockus.data.models.BlockusTextureKey;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.Item;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import static net.minecraft.registry.Registries.BLOCK;

public class BlockusModelProvider extends FabricModelProvider {

    public BlockusModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator modelGenerator) {

        BlockusWoodFamilies.getFamilies().filter(BlockFamily::shouldGenerateModels).forEach((family) -> {
            modelGenerator.registerCubeAllModelTexturePool(family.getBaseBlock()).family(family);
        });

        for (BSSWTypes bssType : BSSWTypes.values()) {
            if (bssType.type.contains("rough") && bssType.type.contains("sandstone")) {
                this.registerBlockStairsSlabWithBottom(modelGenerator, bssType.block, bssType.base);
            } else if (bssType.type.contains("smooth") && bssType.type.contains("sandstone") || bssType.type.contains("rough_basalt")) {
                this.registerBlockStairsSlabWithTop(modelGenerator, bssType.block,  bssType.base);
            } else {
                this.registerBlockStairsAndSlab(modelGenerator, bssType.block);
            }
        }

        for (ConcreteTypes concreteType : ConcreteTypes.values()) {
            this.registerBlockStairsSlabAndWall(modelGenerator, concreteType.block);
            modelGenerator.registerSimpleCubeAll(concreteType.chiseled);
            this.registerPillar(modelGenerator, concreteType.pillar);
        }

        for (TimberFrameTypes timberFrameType : TimberFrameTypes.values()) {
            modelGenerator.registerSimpleCubeAll(timberFrameType.block);
            modelGenerator.registerSimpleCubeAll(timberFrameType.cross);
            this.registerDiagonalTimberFrame(modelGenerator, timberFrameType.diagonal);
            modelGenerator.registerGlassPane(timberFrameType.grate, timberFrameType.lattice);
        }

        for (AsphaltTypes asphaltTypes : AsphaltTypes.values()) {
            this.registerBlockStairsAndSlab(modelGenerator, asphaltTypes.block);
        }

        // Stone
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_STONE_BRICKS);

        this.registerSturdyStone(modelGenerator);

        // Andesite

        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_ANDESITE_BRICKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CRACKED_ANDESITE_BRICKS);
        this.registerPillar(modelGenerator, BlockusBlocks.POLISHED_ANDESITE_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_ANDESITE_BRICKS);

        // Diorite
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_DIORITE_BRICKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CRACKED_DIORITE_BRICKS);

        this.registerPillar(modelGenerator, BlockusBlocks.POLISHED_DIORITE_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_DIORITE_BRICKS);

        // Granite
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_GRANITE_BRICKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CRACKED_GRANITE_BRICKS);

        this.registerPillar(modelGenerator, BlockusBlocks.POLISHED_GRANITE_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_GRANITE_BRICKS);

        // Mud
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_MUD_BRICKS);
        this.registerPillar(modelGenerator, BlockusBlocks.MUD_BRICK_PILLAR);

        // Dripstone
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_DRIPSTONE);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CRACKED_DRIPSTONE_BRICKS);
        this.registerPillar(modelGenerator, BlockusBlocks.DRIPSTONE_PILLAR);

        // Tuff
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CARVED_TUFF_BRICKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CRACKED_TUFF_BRICKS);
        this.registerPillar(modelGenerator, BlockusBlocks.TUFF_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_TUFF_BRICKS);

        // Deepslate

        this.registerPillar(modelGenerator, BlockusBlocks.DEEPSLATE_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.STURDY_DEEPSLATE);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_DEEPSLATE_BRICKS);

        // Sculk
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_SCULK_BRICKS);
        this.registerPillar(modelGenerator, BlockusBlocks.SCULK_PILLAR);

        // Amethyst
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_AMETHYST);
        this.registerPillar(modelGenerator, BlockusBlocks.AMETHYST_PILLAR);

        // Blackstone
        this.registerCubeColumnNoSuffix(modelGenerator, BlockusBlocks.GOLD_DECORATED_POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE);

        this.registerPillar(modelGenerator, BlockusBlocks.POLISHED_BLACKSTONE_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.STURDY_BLACKSTONE);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_POLISHED_BLACKSTONE_BRICKS);

        // Basalt
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_POLISHED_BASALT);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CRACKED_POLISHED_BASALT_BRICKS);

        this.registerPillar(modelGenerator, BlockusBlocks.POLISHED_BASALT_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_POLISHED_BASALT_BRICKS);

        // Limestone
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_LIMESTONE);
        this.registerAxisRotatedCubeColumn(modelGenerator, BlockusBlocks.CHISELED_LIMESTONE_PILLAR, BlockusBlocks.POLISHED_LIMESTONE.block);

        this.registerPillar(modelGenerator, BlockusBlocks.LIMESTONE_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.LIMESTONE_SQUARES);

        // Marble
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_MARBLE);
        this.registerAxisRotatedCubeColumn(modelGenerator, BlockusBlocks.CHISELED_MARBLE_PILLAR, BlockusBlocks.POLISHED_MARBLE.block);

        this.registerPillar(modelGenerator, BlockusBlocks.MARBLE_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.MARBLE_SQUARES);


        // Bluestone


        this.registerPillar(modelGenerator, BlockusBlocks.BLUESTONE_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.BLUESTONE_SQUARES);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_BLUESTONE);
        this.registerAxisRotatedCubeColumn(modelGenerator, BlockusBlocks.CHISELED_BLUESTONE_PILLAR, BlockusBlocks.POLISHED_BLUESTONE.block);


        // Viridite
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_VIRIDITE);
        this.registerAxisRotatedCubeColumn(modelGenerator, BlockusBlocks.CHISELED_VIRIDITE_PILLAR, BlockusBlocks.POLISHED_VIRIDITE.block);

        this.registerPillar(modelGenerator, BlockusBlocks.VIRIDITE_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.VIRIDITE_SQUARES);

        // Snow & Ice Bricks
        this.registerPillar(modelGenerator, BlockusBlocks.SNOW_PILLAR);
        modelGenerator.registerCubeAllModelTexturePool(BlockusBlocks.ICE_BRICKS);
        this.registerPillar(modelGenerator, BlockusBlocks.ICE_PILLAR);

        // Obsidian
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.GLOWING_OBSIDIAN);

        // Prismarine
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_DARK_PRISMARINE);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_PRISMARINE);
        this.registerPillar(modelGenerator, BlockusBlocks.DARK_PRISMARINE_PILLAR);

        this.registerPillar(modelGenerator, BlockusBlocks.PRISMARINE_PILLAR);

        // Bricks
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_BRICKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_SOAKED_BRICKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_SANDY_BRICKS);

        // Sandstone
        this.registerPillar(modelGenerator, BlockusBlocks.SANDSTONE_PILLAR);
        this.registerCubeColumn(modelGenerator, BlockusBlocks.GOLD_DECORATED_SANDSTONE, Blocks.SANDSTONE);
        this.registerCubeColumn(modelGenerator, BlockusBlocks.LAPIS_DECORATED_SANDSTONE, Blocks.SANDSTONE);

        this.registerPillar(modelGenerator, BlockusBlocks.RED_SANDSTONE_PILLAR);
        this.registerCubeColumn(modelGenerator, BlockusBlocks.GOLD_DECORATED_RED_SANDSTONE, Blocks.RED_SANDSTONE);
        this.registerCubeColumn(modelGenerator, BlockusBlocks.LAPIS_DECORATED_RED_SANDSTONE, Blocks.RED_SANDSTONE);

        // Rainbow
        this.registerLines(modelGenerator, BlockusBlocks.RAINBOW_BLOCK);
        this.registerAxisRotatedBlockTopBottom(modelGenerator, BlockusBlocks.RAINBOW_ASPHALT);
        modelGenerator.registerFlowerPotPlant(BlockusBlocks.RAINBOW_ROSE, BlockusBlocks.POTTED_RAINBOW_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);

        // Purpur Blocks
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_PURPUR);
        modelGenerator.registerSingleton(BlockusBlocks.PURPUR_DECORATED_END_STONE, TexturedModel.END_FOR_TOP_CUBE_COLUMN);

        modelGenerator.registerSimpleCubeAll(BlockusBlocks.PURPUR_SQUARES);

        // Phantom Purpur Blocks
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_PHANTOM_PURPUR);
        this.registerCubeColumn(modelGenerator, BlockusBlocks.PHANTOM_PURPUR_DECORATED_END_STONE, BlockusBlocks.PURPUR_DECORATED_END_STONE);

        this.registerPillar(modelGenerator, BlockusBlocks.PHANTOM_PURPUR_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.PHANTOM_PURPUR_SQUARES);


        // End Stone
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_END_STONE_BRICKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CRACKED_END_STONE_BRICKS);
        this.registerPillar(modelGenerator, BlockusBlocks.END_STONE_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_END_STONE_BRICKS);

        // White Oak Wood
        modelGenerator.registerLog(BlockusBlocks.WHITE_OAK_LOG).log(BlockusBlocks.WHITE_OAK_LOG).wood(BlockusBlocks.WHITE_OAK_WOOD);
        modelGenerator.registerSingleton(BlockusBlocks.WHITE_OAK_LEAVES, TexturedModel.LEAVES);
        modelGenerator.registerLog(BlockusBlocks.STRIPPED_WHITE_OAK_LOG).log(BlockusBlocks.STRIPPED_WHITE_OAK_LOG).wood(BlockusBlocks.STRIPPED_WHITE_OAK_WOOD);
        modelGenerator.registerFlowerPotPlant(BlockusBlocks.WHITE_OAK_SAPLING, BlockusBlocks.POTTED_WHITE_OAK_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        // Herringbone Planks
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_OAK_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_BIRCH_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_SPRUCE_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_JUNGLE_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_ACACIA_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_DARK_OAK_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_MANGROVE_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_CHERRY_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_BAMBOO_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_CRIMSON_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_WARPED_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_WHITE_OAK_PLANKS);

        // Food Blocks
        this.registerFishCrate(modelGenerator, BlockusBlocks.COD_CRATE);
        this.registerFishCrate(modelGenerator, BlockusBlocks.PUFFERFISH_CRATE);
        this.registerFishCrate(modelGenerator, BlockusBlocks.SALMON_CRATE);
        this.registerFishCrate(modelGenerator, BlockusBlocks.TROPICAL_FISH_CRATE);
        this.registerCrate(modelGenerator, BlockusBlocks.SWEET_BERRIES_CRATE);
        this.registerCrate(modelGenerator, BlockusBlocks.GLOW_BERRIES_CRATE);
        this.registerCrate(modelGenerator, BlockusBlocks.POTATO_CRATE);
        this.registerCrate(modelGenerator, BlockusBlocks.APPLE_CRATE);
        this.registerCrate(modelGenerator, BlockusBlocks.GOLDEN_APPLE_CRATE);
        this.registerCrate(modelGenerator, BlockusBlocks.BEETROOT_CRATE);
        this.registerCrate(modelGenerator, BlockusBlocks.CARROT_CRATE);
        this.registerCrate(modelGenerator, BlockusBlocks.GOLDEN_CARROT_CRATE);
        this.registerBreadBox(modelGenerator, BlockusBlocks.BREAD_BOX);
        this.registerAxisRotatedCubeColumn(modelGenerator, BlockusBlocks.CHORUS_BLOCK);


        // Paper
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.BURNT_PAPER_BLOCK);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.FRAMED_PAPER_BLOCK);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.PAPER_BLOCK);

        // Lantern Blocks
        this.registerCubeColumn(modelGenerator, BlockusBlocks.LANTERN_BLOCK, BlockusBlocks.LANTERN_BLOCK);
        this.registerCubeColumn(modelGenerator, BlockusBlocks.SOUL_LANTERN_BLOCK, BlockusBlocks.LANTERN_BLOCK);
        this.registerPumpkins(modelGenerator, BlockusBlocks.SOUL_O_LANTERN);


        // Colored Tiles
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.RAINBOW_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.BLACK_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.BLUE_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.BROWN_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.CYAN_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.GRAY_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.GREEN_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.LIGHT_BLUE_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.LIGHT_GRAY_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.LIME_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.MAGENTA_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.ORANGE_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.PINK_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.PURPLE_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.RED_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.WHITE_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.YELLOW_COLORED_TILES);

        // Other
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.NETHER_STAR_BLOCK);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.RAINBOW_GLOWSTONE);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CAUTION_BLOCK);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHARCOAL_BLOCK);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.COMPANION_CUBE);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.MEMBRANE_BLOCK);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.REDSTONE_SAND);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.ROTTEN_FLESH_BLOCK);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.STARS_BLOCK);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.SUGAR_BLOCK);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.WEIGHT_STORAGE_CUBE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator modelGenerator) {
    }

    public final void registerPillar(BlockStateModelGenerator modelGenerator, Block block) {
        modelGenerator.registerAxisRotated(block, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
    }

    public final void registerLines(BlockStateModelGenerator modelGenerator, Block block) {
        modelGenerator.registerAxisRotated(block, TexturedModel.CUBE_ALL);
    }

    public final void registerBlockStairsSlabAndWall(BlockStateModelGenerator modelGenerator, Block block) {
        modelGenerator.registerCubeAllModelTexturePool(block);
    }

    public final void registerBlockStairsAndSlab(BlockStateModelGenerator modelGenerator, Block block) {
        modelGenerator.registerCubeAllModelTexturePool(block);
    }

    public final void registerButtonAndPressurePlate(BlockStateModelGenerator modelGenerator, Block pressurePlateBlock, Block buttonBlock, Block textureID) {
        this.registerButton(modelGenerator, buttonBlock, TextureMap.getId(textureID));
        this.registerPressurePlate(modelGenerator, pressurePlateBlock, TextureMap.getId(textureID));
    }

    public final void registerButtonAndPressurePlate(BlockStateModelGenerator modelGenerator, Block pressurePlateBlock, Block buttonBlock, Identifier textureSource) {
        this.registerButton(modelGenerator, buttonBlock, textureSource);
        this.registerPressurePlate(modelGenerator, pressurePlateBlock, textureSource);
    }

    public final void registerSmallHedge(BlockStateModelGenerator modelGenerator, Block wallBlock, Block textureSource) {
        TextureMap textureMap = TextureMap.of(BlockusTextureKey.HEDGE, TextureMap.getId(textureSource));
        Identifier identifier = BlockusModels.TEMPLATE_SMALL_HEDGE_END.upload(wallBlock, textureMap, modelGenerator.modelCollector);
        Identifier identifier2 = BlockusModels.TEMPLATE_SMALL_HEDGE_SIDE.upload(wallBlock, textureMap, modelGenerator.modelCollector);
        Identifier identifier3 = BlockusModels.TEMPLATE_SMALL_HEDGE_SIDE_TALL.upload(wallBlock, textureMap, modelGenerator.modelCollector);
        modelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createWallBlockState(wallBlock, identifier, identifier2, identifier3));
        Identifier identifier4 = BlockusModels.TEMPLATE_SMALL_HEDGE_INVENTORY.upload(wallBlock, textureMap, modelGenerator.modelCollector);
        modelGenerator.registerParentedItemModel(wallBlock, identifier4);
    }

    public final void registerCarpet(BlockStateModelGenerator modelGenerator, Block wool, Block carpet) {
        Identifier identifier = TexturedModel.CARPET.get(wool).upload(carpet, modelGenerator.modelCollector);
        modelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(carpet, identifier));
    }

    public final void registerDirectionalCarpet(BlockStateModelGenerator modelGenerator, Block block, Block carpet) {
        TexturedModel.CARPET.get(block).upload(carpet, modelGenerator.modelCollector);
        modelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(carpet, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockModelId(carpet))).coordinate(createUpDefaultRotationStates()));
    }

    public final void registerBlockStairsSlabWithBottom(BlockStateModelGenerator modelGenerator, Block block, Block base) {
        Identifier textureID = TextureMap.getSubId(base, "_bottom");
        TextureMap blockTextureMap = TextureMap.of(TextureKey.ALL, textureID);
        TextureMap textureMap = sideTopBottom(textureID);
        this.createBlock(modelGenerator, block, blockTextureMap);
    }

    public final void registerBlockStairsSlabWithTop(BlockStateModelGenerator modelGenerator, Block block, Block base) {
        Identifier textureID = TextureMap.getSubId(base, "_top");
        TextureMap blockTextureMap = TextureMap.of(TextureKey.ALL, textureID);
        TextureMap textureMap = sideTopBottom(textureID);
        this.createBlock(modelGenerator, block, blockTextureMap);
    }

    public final void registerBlockStairsSlabwithTopBottom(BlockStateModelGenerator modelGenerator, Block block) {
        TextureMap textureMap = sideTopBottom(TextureMap.getId(block), TextureMap.getSubId(block, "_top"), TextureMap.getSubId(block, "_bottom"));
        this.createBlock(modelGenerator, block, Models.CUBE_BOTTOM_TOP, textureMap);
    }

    public final void registerStairs(BlockStateModelGenerator modelGenerator, Block block, Block textureSource) {
        TextureMap textureMap = sideTopBottom(TextureMap.getId(textureSource));
        this.createStairs(modelGenerator, block, textureMap);
    }

    public final void registerSlab(BlockStateModelGenerator modelGenerator, Block block, Block textureSource) {
        TextureMap textureMap = sideTopBottom(TextureMap.getId(textureSource));
        this.createSlab(modelGenerator, block, textureMap, TextureMap.getId(textureSource));
    }

    public final void registerSlabwithTop(BlockStateModelGenerator modelGenerator, Block block, Block textureSource, Block end) {
        TextureMap textureMap = sideTopBottom(TextureMap.getId(textureSource), TextureMap.getSubId(end, "_top"));
        this.createSlab(modelGenerator, block, textureMap, TextureMap.getId(textureSource));
    }

    public final void registerWall(BlockStateModelGenerator modelGenerator, Block block, Block textureSource) {
        TextureMap textureMap = TextureMap.of(TextureKey.WALL, TextureMap.getId(textureSource));
        this.createWall(modelGenerator, block, textureMap);
    }

    public final void registerButton(BlockStateModelGenerator modelGenerator, Block buttonBlock, Identifier textureSource) {
        TextureMap textureMap = TextureMap.texture(textureSource);
        Identifier identifier = Models.BUTTON.upload(buttonBlock, textureMap, modelGenerator.modelCollector);
        Identifier identifier2 = Models.BUTTON_PRESSED.upload(buttonBlock, textureMap, modelGenerator.modelCollector);
        Identifier identifier3 = Models.BUTTON_INVENTORY.upload(buttonBlock, textureMap, modelGenerator.modelCollector);
        modelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createButtonBlockState(buttonBlock, identifier, identifier2));
        modelGenerator.registerParentedItemModel(buttonBlock, identifier3);
    }

    public final void registerPressurePlate(BlockStateModelGenerator modelGenerator, Block pressurePlateBlock, Identifier textureSource) {
        TextureMap textureMap = TextureMap.texture(textureSource);
        Identifier identifier = Models.PRESSURE_PLATE_UP.upload(pressurePlateBlock, textureMap, modelGenerator.modelCollector);
        Identifier identifier2 = Models.PRESSURE_PLATE_DOWN.upload(pressurePlateBlock, textureMap, modelGenerator.modelCollector);
        modelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createPressurePlateBlockState(pressurePlateBlock, identifier, identifier2));
    }

    public final void registerRedstoneLamp(BlockStateModelGenerator modelGenerator, Block block, Block lit) {
        registerLitRedstoneLamp(modelGenerator, block, lit);
        Identifier identifier = TexturedModel.CUBE_ALL.upload(block, modelGenerator.modelCollector);
        Identifier identifier2 = modelGenerator.createSubModel(block, "_on", Models.CUBE_ALL, TextureMap::all);
        modelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block).coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, identifier2, identifier)));
    }

    public final void registerLitRedstoneLamp(BlockStateModelGenerator modelGenerator, Block block, Block lit) {
        TextureMap textureMap = TextureMap.of(TextureKey.ALL, TextureMap.getSubId(block, "_on"));
        this.createBlock(modelGenerator, lit, textureMap);
    }

    public void createAxisRotatedCubeColumn(BlockStateModelGenerator modelGenerator, Block block, TextureMap textureMap) {
        Identifier identifier = Models.CUBE_COLUMN.upload(block, textureMap, modelGenerator.modelCollector);
        Identifier identifier2 = Models.CUBE_COLUMN_HORIZONTAL.upload(block, textureMap, modelGenerator.modelCollector);
        modelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createAxisRotatedBlockState(block, identifier, identifier2));
    }

    public final void registerAxisRotatedCubeColumn(BlockStateModelGenerator modelGenerator, Block block) {
        TextureMap textureMap = TextureMap.sideAndEndForTop(block);
        this.createAxisRotatedCubeColumn(modelGenerator, block, textureMap);
    }

    public final void registerAxisRotatedCubeColumn(BlockStateModelGenerator modelGenerator, Block block, Block end) {
        TextureMap textureMap = TextureMap.sideEnd(TextureMap.getId(block), TextureMap.getId(end));
        this.createAxisRotatedCubeColumn(modelGenerator, block, textureMap);
    }

    public final void registerCubeColumn(BlockStateModelGenerator modelGenerator, Block block, Block end) {
        TextureMap textureMap = TextureMap.sideEnd(TextureMap.getId(block), TextureMap.getSubId(end, "_top"));
        this.createBlock(modelGenerator, block, Models.CUBE_COLUMN, textureMap);
    }

    public final void registerCubeColumnNoSuffix(BlockStateModelGenerator modelGenerator, Block block, Block end) {
        TextureMap textureMap = TextureMap.sideEnd(TextureMap.getId(block), TextureMap.getId(end));
        this.createBlock(modelGenerator, block, Models.CUBE_COLUMN, textureMap);
    }

    public final void registerCubeBottomTop(BlockStateModelGenerator modelGenerator, Block block) {
        TextureMap textureMap = sideTopBottom(TextureMap.getId(block), TextureMap.getSubId(block, "_top"), TextureMap.getSubId(block, "_bottom"));
        this.createBlock(modelGenerator, block, Models.CUBE_BOTTOM_TOP, textureMap);
    }

    public final void registerCubeBottomTop(BlockStateModelGenerator modelGenerator, Block block, Block bottom) {
        TextureMap textureMap = sideTopBottom(TextureMap.getId(block), TextureMap.getSubId(block, "_top"), TextureMap.getId(bottom));
        this.createBlock(modelGenerator, block, Models.CUBE_BOTTOM_TOP, textureMap);
    }

    public final void registerAxisRotatedBlockTopBottom(BlockStateModelGenerator modelGenerator, Block block) {
        TextureMap textureMap = sideTopBottom(TextureMap.getId(block), TextureMap.getSubId(block, "_top"), TextureMap.getSubId(block, "_bottom"));
        Identifier identifier = Models.CUBE_BOTTOM_TOP.upload(block, textureMap, modelGenerator.modelCollector);
        modelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block, BlockStateVariant.create().put(VariantSettings.MODEL, identifier)).coordinate(createUpDefaultRotationStates()));
    }

    public final void registerPumpkins(BlockStateModelGenerator modelGenerator, Block block) {
        TextureMap textureMap = TextureMap.sideEnd(Blocks.PUMPKIN);
        modelGenerator.registerNorthDefaultHorizontalRotatable(block, textureMap);
    }

    public final void registerSturdyStone(BlockStateModelGenerator modelGenerator) {
        Identifier identifier = TextureMap.getSubId(Blocks.FURNACE, "_top");
        this.createBlock(modelGenerator, BlockusBlocks.STURDY_STONE, TextureMap.of(TextureKey.ALL, identifier));
    }

    public final void registerNeonBlock(BlockStateModelGenerator modelGenerator, Block block) {
        TextureMap textureMap = TextureMap.of(TextureKey.ALL, TextureMap.getId(block));
        this.createBlock(modelGenerator, block, BlockusModels.NEON_BLOCK_TEMPLATE, textureMap);
    }

    public final void registerFishCrate(BlockStateModelGenerator modelGenerator, Block block) {
        TextureMap textureMap = sideTopBottom(getBlockId("fish_crate_side"), TextureMap.getId(block), getBlockId("fish_crate_bottom"));
        this.createBlock(modelGenerator, block, Models.CUBE_BOTTOM_TOP, textureMap);
    }

    public final void registerCrate(BlockStateModelGenerator modelGenerator, Block block) {
        TextureMap textureMap = sideTop(TextureMap.getSubId(block, "_side"), TextureMap.getId(block));
        this.createBlock(modelGenerator, block, BlockusModels.CRATE_TEMPLATE, textureMap);
    }

    public final void registerBreadBox(BlockStateModelGenerator modelGenerator, Block block) {
        TextureMap textureMap = frontTopSideBottom(block);
        Identifier identifier = Models.ORIENTABLE_WITH_BOTTOM.upload(block, textureMap, modelGenerator.modelCollector);
        modelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block, BlockStateVariant.create().put(VariantSettings.MODEL, identifier)).coordinate(BlockStateModelGenerator.createNorthDefaultHorizontalRotationStates()));
    }

    public void registerLegacyStonecutter(BlockStateModelGenerator modelGenerator, Block block) {
        TextureMap textureMap = (new TextureMap()).put(TextureKey.PARTICLE, TextureMap.getSubId(block, "_front")).put(TextureKey.DOWN, TextureMap.getSubId(block, "_bottom")).put(TextureKey.UP, TextureMap.getSubId(block, "_top")).put(TextureKey.NORTH, TextureMap.getSubId(block, "_front")).put(TextureKey.SOUTH, TextureMap.getSubId(block, "_front")).put(TextureKey.EAST, TextureMap.getSubId(block, "_side")).put(TextureKey.WEST, TextureMap.getSubId(block, "_side"));
        this.createBlock(modelGenerator, block, Models.CUBE, textureMap);
    }

    private void registerDiagonalTimberFrame(BlockStateModelGenerator modelGenerator, Block block) {
        Identifier identifier = ModelIds.getBlockModelId(block);
        Identifier identifier2 = TextureMap.getSubId(block, "_right");
        Identifier identifier3 = TextureMap.getSubId(block, "_left");
        TextureMap textureMap = (new TextureMap()).put(TextureKey.PARTICLE, identifier2).put(TextureKey.NORTH, identifier2).put(TextureKey.SOUTH, identifier2).put(TextureKey.EAST, identifier2).put(TextureKey.WEST, identifier3).put(TextureKey.DOWN, identifier3).put(TextureKey.UP, identifier3);
        Models.CUBE.upload(block, textureMap, modelGenerator.modelCollector);
        modelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block).coordinate(BlockStateVariantMap.create(Properties.HORIZONTAL_FACING)
            .register(Direction.NORTH, BlockStateVariant.create().put(VariantSettings.MODEL, identifier))
            .register(Direction.SOUTH, BlockStateVariant.create().put(VariantSettings.MODEL, identifier).put(VariantSettings.Y, VariantSettings.Rotation.R180))
            .register(Direction.WEST, BlockStateVariant.create().put(VariantSettings.MODEL, identifier).put(VariantSettings.Y, VariantSettings.Rotation.R270))
            .register(Direction.EAST, BlockStateVariant.create().put(VariantSettings.MODEL, identifier).put(VariantSettings.Y, VariantSettings.Rotation.R90))));
    }

    public static void registerColoredTiles(BlockStateModelGenerator modelGenerator, Block block, Block tile1, Block tile2) {
        TextureMap textures = tilesTextures(tile1, tile2);
        BlockusModels.CUBE_TILES.upload(block, textures, modelGenerator.modelCollector);
        BlockusModels.CUBE_TILES_2.upload(block, textures, modelGenerator.modelCollector);
        modelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block).coordinate(BlockStateVariantMap.create(Properties.HORIZONTAL_AXIS)
            .register(Direction.Axis.X, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockModelId(block)))
            .register(Direction.Axis.Z, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_2")))));
    }

    public final void registerColoredTilesSimple(BlockStateModelGenerator modelGenerator, Block block) {
        Identifier identifier = getModifiedBlockId(block,"_colored", "");
        this.createBlock(modelGenerator, block, TextureMap.of(TextureKey.ALL, identifier));
    }

    public final void createBlock(BlockStateModelGenerator modelGenerator, Block block, Model model, TextureMap textureMap) {
        modelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block, model.upload(block, textureMap, modelGenerator.modelCollector)));
    }

    public final void createBlock(BlockStateModelGenerator modelGenerator, Block block, TextureMap textureMap) {
        modelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block, Models.CUBE_ALL.upload(block, textureMap, modelGenerator.modelCollector)));
    }

    public final void createStairs(BlockStateModelGenerator modelGenerator, Block block, TextureMap textureMap) {
        Identifier identifier = Models.INNER_STAIRS.upload(block, textureMap, modelGenerator.modelCollector);
        Identifier identifier2 = Models.STAIRS.upload(block, textureMap, modelGenerator.modelCollector);
        Identifier identifier3 = Models.OUTER_STAIRS.upload(block, textureMap, modelGenerator.modelCollector);
        modelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createStairsBlockState(block, identifier, identifier2, identifier3));
        modelGenerator.registerParentedItemModel(block, identifier2);
    }

    public final void createSlab(BlockStateModelGenerator modelGenerator, Block block, TextureMap textureMap, Identifier doubleSlab) {
        Identifier identifier = Models.SLAB.upload(block, textureMap, modelGenerator.modelCollector);
        Identifier identifier2 = Models.SLAB_TOP.upload(block, textureMap, modelGenerator.modelCollector);
        modelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(block, identifier, identifier2, doubleSlab));
        modelGenerator.registerParentedItemModel(block, identifier);
    }

    public final void createWall(BlockStateModelGenerator modelGenerator, Block block, TextureMap textureMap) {
        Identifier identifier = Models.TEMPLATE_WALL_POST.upload(block, textureMap, modelGenerator.modelCollector);
        Identifier identifier2 = Models.TEMPLATE_WALL_SIDE.upload(block, textureMap, modelGenerator.modelCollector);
        Identifier identifier3 = Models.TEMPLATE_WALL_SIDE_TALL.upload(block, textureMap, modelGenerator.modelCollector);
        modelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createWallBlockState(block, identifier, identifier2, identifier3));
        Identifier identifier4 = Models.WALL_INVENTORY.upload(block, textureMap, modelGenerator.modelCollector);
        modelGenerator.registerParentedItemModel(block, identifier4);
    }

    public static BlockStateVariantMap createUpDefaultRotationStates() {
        return BlockStateVariantMap.create(Properties.FACING)
            .register(Direction.DOWN, BlockStateVariant.create().put(VariantSettings.X, VariantSettings.Rotation.R180))
            .register(Direction.UP, BlockStateVariant.create())
            .register(Direction.NORTH, BlockStateVariant.create().put(VariantSettings.X, VariantSettings.Rotation.R270).put(VariantSettings.Y, VariantSettings.Rotation.R180))
            .register(Direction.SOUTH, BlockStateVariant.create().put(VariantSettings.X, VariantSettings.Rotation.R270))
            .register(Direction.WEST, BlockStateVariant.create().put(VariantSettings.X, VariantSettings.Rotation.R270).put(VariantSettings.Y, VariantSettings.Rotation.R90))
            .register(Direction.EAST, BlockStateVariant.create().put(VariantSettings.X, VariantSettings.Rotation.R270).put(VariantSettings.Y, VariantSettings.Rotation.R270));
    }

    public static Identifier getTilesId(Block block) {
        return getModifiedBlockId(block, "_concrete", "_tiles");
    }

    public static Identifier getBlockId(String id) {
        return Blockus.id( "block/" + id);
    }

    public static Identifier getBlockId(Block block) {
        return Blockus.id( "block/" + BLOCK.getId(block).getPath());
    }

    public static Identifier getModifiedBlockId(Block block, String target, String replacement) {
        return Blockus.id( "block/" + BLOCK.getId(block).getPath().replace(target, replacement));
    }

// TextureMaps

    private static TextureMap tilesTextures(Block tile1, Block tile2) {
        return (new TextureMap()).put(BlockusTextureKey.TILE_1, getTilesId(tile1)).put(BlockusTextureKey.TILE_2, getTilesId(tile2));
    }

    public static TextureMap sideTop(Identifier block, Identifier top) {
        return (new TextureMap()).put(TextureKey.SIDE, block).put(TextureKey.TOP, top);
    }

    public static TextureMap sideTopBottom(Identifier block, Identifier top, Identifier bottom) {
        return (new TextureMap()).put(TextureKey.SIDE, block).put(TextureKey.TOP, top).put(TextureKey.BOTTOM, bottom);
    }

    public static TextureMap sideTopBottom(Identifier block, Identifier end) {
        return (new TextureMap()).put(TextureKey.SIDE, block).put(TextureKey.TOP, end).put(TextureKey.BOTTOM, end);
    }

    public static TextureMap sideTopBottom(Identifier block) {
        return (new TextureMap()).put(TextureKey.SIDE, block).put(TextureKey.TOP, block).put(TextureKey.BOTTOM, block);
    }

    public static TextureMap frontTopSideBottom(Block block) {
        return (new TextureMap()).put(TextureKey.FRONT, TextureMap.getId(block)).put(TextureKey.TOP, TextureMap.getSubId(block, "_top")).put(TextureKey.SIDE, TextureMap.getSubId(block, "_side")).put(TextureKey.BOTTOM, TextureMap.getSubId(block, "_side"));
    }
}
