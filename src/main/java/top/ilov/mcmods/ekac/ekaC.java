package top.ilov.mcmods.ekac;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import top.ilov.mcmods.ekac.register.ekaCModBlocks;
import top.ilov.mcmods.ekac.register.ekaCModItems;

@Mod(ekaC.MOD_ID)
public class ekaC {

    public static final String MOD_ID = "ekac";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final CreativeModeTab itemGroup = new ekaCItemGroup();

    public ekaC() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ekaCModBlocks.register(eventBus);
        ekaCModItems.register(eventBus);

        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);

    }

    private void setup(final FMLCommonSetupEvent event) {

        LOGGER.debug("Loading ekac mod.");

    }

}
