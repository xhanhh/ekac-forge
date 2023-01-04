package top.ilov.mcmods.ekac;

import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import top.ilov.mcmods.ekac.blocks.BlockInit;
import top.ilov.mcmods.ekac.blocks.BlockItemInit;

@Mod(ekaC.MOD_ID)
public class ekaC {

    public static final String MOD_ID = "ekac";
    private static final Logger LOGGER = LogManager.getLogger();

    public static final ItemGroup itemgroup = new ekaCItemGroup();

    public ekaC() {

        BlockInit.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }
}
