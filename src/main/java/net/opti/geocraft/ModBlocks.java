package net.opti.geocraft;

import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import net.opti.geocraft.blocks.*;
import net.opti.geocraft.blocks.geode.GeodeAmethyst;
import net.opti.geocraft.blocks.geode.GeodeQuartz;
import net.opti.geocraft.blocks.geode.GeodeScories;
import net.opti.geocraft.utils.References;


@Mod.EventBusSubscriber(modid = References.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {


    @ObjectHolder(References.MODID + ":titanium_ore")
    public static final Block TITANIUM_ORE = null;
    @ObjectHolder(References.MODID + ":blasted_titanium_ore")
    public static final Block BLASTED_TITANIUM_ORE = null;
    @ObjectHolder(References.MODID + ":geode_block")
    public static final Block GEODE_BLOCK = null;
    @ObjectHolder(References.MODID + ":titanium_block")
    public static final Block TITANIUM_BLOCK = null;
    @ObjectHolder(References.MODID + ":amethyst_block")
    public static final Block AMETHYST_BLOCK = null;
    @ObjectHolder(References.MODID + ":scories_block")
    public static final Block SCORIES_BLOCK = null;
    @ObjectHolder(References.MODID + ":geode_sublimer")
    public static final Block GEODE_SUBLIMER = null;
    @ObjectHolder(References.MODID + ":raw_slate")
    public static final Block RAW_SLATE = null;
    @ObjectHolder(References.MODID + ":dark_slate")
    public static final Block DARK_SLATE = null;
    @ObjectHolder(References.MODID + ":slate_bricks")
    public static final Block SLATE_BRICKS = null;

    //public static final Block SLATE_BRICKS_STAIRS = null;

    @ObjectHolder(References.MODID + ":geode_scories")
    public static final Block GEODE_SCORIES = null;
    @ObjectHolder(References.MODID + ":geode_amethyst")
    public static final Block GEODE_AMETHYST = null;
    @ObjectHolder(References.MODID + ":geode_quartz")
    public static final Block GEODE_QUARTZ = null;

    @ObjectHolder(References.MODID + ":slate_bricks_stairs")
    public static final StairsBlock SLATE_BRICKS_STAIRS = new SlateBricksStairs(ModBlocks.SLATE_BRICKS.getDefaultState(), new Block.Properties.create(group(GeoMain.GEO_GROUP)));

    @SubscribeEvent
    public static void registerBlock(final RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new TitaniumOre(Block.Properties.create(Material.ROCK)).setRegistryName("titanium_ore"));
        event.getRegistry().register(new BlastedTitaniumOre(Block.Properties.create(Material.ROCK)).setRegistryName("blasted_titanium_ore"));
        event.getRegistry().register(new GeodeBlock(Block.Properties.create(Material.ROCK)).setRegistryName("geode_block"));
        event.getRegistry().register(new TitaniumBlock(Block.Properties.create(Material.ROCK)).setRegistryName("titanium_block"));
        event.getRegistry().register(new GeodeScories(Block.Properties.create(Material.ROCK)).setRegistryName("geode_scories"));
        event.getRegistry().register(new GeodeAmethyst(Block.Properties.create(Material.ROCK)).setRegistryName("geode_amethyst"));
        event.getRegistry().register(new GeodeQuartz(Block.Properties.create(Material.ROCK)).setRegistryName("geode_quartz"));
        event.getRegistry().register(new AmethystBlock(Block.Properties.create(Material.ROCK)).setRegistryName("amethyst_block"));
        event.getRegistry().register(new ScoriesBlock(Block.Properties.create(Material.ROCK)).setRegistryName("scories_block"));
        event.getRegistry().register(new GeodeSublimer(Block.Properties.create(Material.ROCK)).setRegistryName("geode_sublimer"));
        event.getRegistry().register(new RawSlate(Block.Properties.create(Material.ROCK)).setRegistryName("raw_slate"));
        event.getRegistry().register(new RawSlate(Block.Properties.create(Material.ROCK)).setRegistryName("dark_slate"));
        event.getRegistry().register(new SlateBricks(Block.Properties.create(Material.ROCK)).setRegistryName("slate_bricks"));

    }
    @SubscribeEvent
    public static void registerItem(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new BlockItem( TITANIUM_BLOCK, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName(TITANIUM_BLOCK.getRegistryName()));
        event.getRegistry().register(new BlockItem( RAW_SLATE, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName(RAW_SLATE.getRegistryName()));
        event.getRegistry().register(new BlockItem( DARK_SLATE, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName(DARK_SLATE.getRegistryName()));
        event.getRegistry().register(new BlockItem( SLATE_BRICKS, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName(SLATE_BRICKS.getRegistryName()));
        event.getRegistry().register(new BlockItem( TITANIUM_ORE, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName(TITANIUM_ORE.getRegistryName()));
        event.getRegistry().register(new BlockItem( BLASTED_TITANIUM_ORE, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName(BLASTED_TITANIUM_ORE.getRegistryName()));
        event.getRegistry().register(new BlockItem( GEODE_BLOCK, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName(GEODE_BLOCK.getRegistryName()));
        event.getRegistry().register(new BlockItem( GEODE_SCORIES, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName(GEODE_SCORIES.getRegistryName()));
        event.getRegistry().register(new BlockItem( GEODE_AMETHYST, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName(GEODE_AMETHYST.getRegistryName()));
        event.getRegistry().register(new BlockItem( GEODE_QUARTZ, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName(GEODE_QUARTZ.getRegistryName()));
        event.getRegistry().register(new BlockItem( AMETHYST_BLOCK, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName(AMETHYST_BLOCK.getRegistryName()));
        event.getRegistry().register(new BlockItem( SCORIES_BLOCK, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName(SCORIES_BLOCK.getRegistryName()));
        event.getRegistry().register(new BlockItem( GEODE_SUBLIMER, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName(GEODE_SUBLIMER.getRegistryName()));

    }



}
