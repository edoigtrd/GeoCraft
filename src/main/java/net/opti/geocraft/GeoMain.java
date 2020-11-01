package net.opti.geocraft;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.opti.geocraft.utils.References;
import net.opti.geocraft.world.OreGeneration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

@Mod(GeoMain.MODID)
public class GeoMain {
    public static final String MODID = References.MODID;
    public static final Logger LOGGER = (Logger) LogManager.getLogger(MODID);

    public GeoMain() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::loadCompleteEvent);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Modtutorial setup");
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        LOGGER.info("Mod tutorial client setup");
    }

    private void serverSetup(final FMLDedicatedServerSetupEvent event) {
        LOGGER.info("Mod tutorial server setup");
    }

    public void loadCompleteEvent(FMLCommonSetupEvent event){
        //System.out.println("genevent gen starting");
        OreGeneration.generateOre();
    }

    public static final ItemGroup GEO_GROUP = new ItemGroup("Geocraft") {
        @OnlyIn(Dist.CLIENT)
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.GEODE_SUBLIMER);
        }
    };
}