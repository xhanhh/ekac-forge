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

@Mod(ekaCMod.MOD_ID)
public class ekaCMod {

    public static final String MOD_ID = "ekac";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final CreativeModeTab itemGroup = new ekaCItemGroup();

    public ekaCMod() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);

        ekaCModItems.register(modEventBus);
        ekaCModBlocks.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

        LOGGER.info("Loading ekaC Mod.");

    }

}
