package net.opti.geocraft;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.client.model.CompositeModel;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import net.opti.geocraft.blocks.TitaniumBlock;
import net.opti.geocraft.material.*;
import net.opti.geocraft.utils.References;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = References.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItem {
    static TitaniumMaterial TitaniumMaterialM = new TitaniumMaterial();
    static TitaniumToolsMaterial TitaniumMaterialT = new TitaniumToolsMaterial();
    static HammerToolsMaterial HammerToolsM = new HammerToolsMaterial();
    static HeaterToolMaterial HeaterToolM = new HeaterToolMaterial();
    static AmethystArmorMaterial AmethystArmorM = new AmethystArmorMaterial();

    @ObjectHolder(References.MODID + ":titanium_ingot")
    public static final Item TITANIUM_INGOT = null;
    @ObjectHolder(References.MODID + ":geode_hammer")
    public static final Item GEODE_HAMMER = null;
    @ObjectHolder(References.MODID + ":rake")
    public static final Item RAKE = null;
    @ObjectHolder(References.MODID + ":heater")
    public static final Item HEATER = null;
    @ObjectHolder(References.MODID + ":amethyst")
    public static final Item AMETHYST = null;
    @ObjectHolder(References.MODID + ":scories")
    public static final Item SCORIES = null;
    @ObjectHolder(References.MODID + ":slate_shard")
    public static final Item SLATE_SHARD = null;

    //titanium_armor
    public static final Item titanium_helmet = null;
    public static final Item titanium_chestplate = null;
    public static final Item titanium_leggings = null;
    public static final Item titanium_boots = null;

    //titanium tools
    public static final Item titanium_sword = null;
    public static final Item titanium_hoe = null;
    public static final Item titanium_axe = null;
    public static final Item titanium_pickaxe = null;
    public static final Item titanium_shovel = null;
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new Item(new Item.Properties().group(GeoMain.GEO_GROUP).maxStackSize(64)).setRegistryName("titanium_ingot"));
        //event.getRegistry().register(new Item(new Item.Properties().group(GeoMain.GEO_GROUP).maxStackSize(1)).setRegistryName("geode_hammer"));
        //event.getRegistry().register(new Item(new Item.Properties().group(GeoMain.GEO_GROUP).maxStackSize(1)).setRegistryName("rake"));
        //event.getRegistry().register(new Item(new Item.Properties().group(GeoMain.GEO_GROUP).maxStackSize(1)).setRegistryName("heater"));
        event.getRegistry().register(new PickaxeItem(HammerToolsM,5,4,new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName("geode_hammer"));
        event.getRegistry().register(new AxeItem(HeaterToolM,1,8,new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName("heater"));

        event.getRegistry().register(new ArmorItem(TitaniumMaterialM, EquipmentSlotType.HEAD, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName("titanium_helmet"));
        event.getRegistry().register(new ArmorItem(TitaniumMaterialM, EquipmentSlotType.CHEST, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName("titanium_chestplate"));
        event.getRegistry().register(new ArmorItem(TitaniumMaterialM, EquipmentSlotType.LEGS, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName("titanium_leggings"));
        event.getRegistry().register(new ArmorItem(TitaniumMaterialM, EquipmentSlotType.FEET, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName("titanium_boots"));

        event.getRegistry().register(new ArmorItem(AmethystArmorM, EquipmentSlotType.HEAD, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName("amethyst_helmet"));
        event.getRegistry().register(new ArmorItem(AmethystArmorM, EquipmentSlotType.CHEST, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName("amethyst_chestplate"));
        event.getRegistry().register(new ArmorItem(AmethystArmorM, EquipmentSlotType.LEGS, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName("amethyst_leggings"));
        event.getRegistry().register(new ArmorItem(AmethystArmorM, EquipmentSlotType.FEET, new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName("amethyst_boots"));

        //tools
        event.getRegistry().register(new SwordItem(TitaniumMaterialT,10,8,new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName("titanium_sword"));
        event.getRegistry().register(new PickaxeItem(TitaniumMaterialT,4,8,new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName("titanium_pickaxe"));
        event.getRegistry().register(new ShovelItem(TitaniumMaterialT,4,8,new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName("titanium_shovel"));
        event.getRegistry().register(new AxeItem(TitaniumMaterialT,10,1,new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName("titanium_axe"));
        event.getRegistry().register(new HoeItem(TitaniumMaterialT,8,new Item.Properties().group(GeoMain.GEO_GROUP)).setRegistryName("titanium_hoe"));

        //geode things
        event.getRegistry().register(new Item(new Item.Properties().group(GeoMain.GEO_GROUP).maxStackSize(64)).setRegistryName("amethyst"));
        event.getRegistry().register(new Item(new Item.Properties().group(GeoMain.GEO_GROUP).maxStackSize(64)).setRegistryName("scories"));
        //other
        event.getRegistry().register(new Item(new Item.Properties().group(GeoMain.GEO_GROUP).maxStackSize(64)).setRegistryName("slate_shard"));
    }


    }




