package net.opti.geocraft.world;


import com.google.common.collect.ImmutableSet;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;
import net.opti.geocraft.ModBlocks;

/*
5 : taille max d'une veine de minerais
4 : y minimum ou il y a le minerai
4: personne n'a jamais compris, laisse pareil que le premier 4
5 : y max ou y a le minerai
 */
public class    OreGeneration {
    static final ImmutableSet<Biome> validBiomes = ImmutableSet.of(Biomes.MOUNTAIN_EDGE, Biomes.MOUNTAINS,Biomes.GRAVELLY_MOUNTAINS,Biomes.SNOWY_MOUNTAINS,Biomes.WOODED_MOUNTAINS,Biomes.TAIGA_MOUNTAINS);
    public static void generateOre(){
        System.out.println("genevent gen starting");
        for(Biome biome : ForgeRegistries.BIOMES){
            ConfiguredPlacement TitaniumCustomConfig = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(2,4,4,13));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.TITANIUM_ORE.getDefaultState(),14)).func_227228_a_(TitaniumCustomConfig));


            ConfiguredPlacement GeodeCustomConfig = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(10,4,20,64));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.GEODE_BLOCK.getDefaultState(),14)).func_227228_a_(GeodeCustomConfig));

            if( validBiomes.contains(biome)){
                ConfiguredPlacement SlateCustomConfig = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(34,60,34,256));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.RAW_SLATE.getDefaultState(),14)).func_227228_a_(SlateCustomConfig));
            }
        }

    }

}
