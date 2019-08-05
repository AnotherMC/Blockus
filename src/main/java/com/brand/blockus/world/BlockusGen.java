package com.brand.blockus.world;

import com.brand.blockus.Blockus;
import com.brand.blockus.content.Bluestone;
import com.brand.blockus.content.Limestone;
import com.brand.blockus.content.Marble;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.decorator.CountDepthDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.Feature;

public class BlockusGen {
	public static void addLimestone() {
	if (Blockus.CONFIG.enableLimestoneGeneration) {
        for (Biome biome : Registry.BIOME) {
            biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, Limestone.LIMESTONE.getDefaultState(), 33), Decorator.COUNT_RANGE, new RangeDecoratorConfig(10, 0, 0, 120)));
       }
     }
   }
	public static void addMarble() {
		if (Blockus.CONFIG.enableMarbleGeneration) {
	        for (Biome biome : Registry.BIOME) {
	            biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, Marble.MARBLE.getDefaultState(), 70), Decorator.COUNT_RANGE, new RangeDecoratorConfig(1, 0, 0, 75)));
	   }
	 }
   }
	public static void addBluestone() {
		if (Blockus.CONFIG.enableBluestoneGeneration) {
	        for (Biome biome : Registry.BIOME) {
	            biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, Bluestone.BLUESTONE.getDefaultState(), 20), Decorator.COUNT_DEPTH_AVERAGE, new CountDepthDecoratorConfig(8, 16, 16)));
	   }
	 }
   }
}	