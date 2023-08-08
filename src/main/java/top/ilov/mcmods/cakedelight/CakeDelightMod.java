package top.ilov.mcmods.cakedelight;

import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;
import top.ilov.mcmods.cakedelight.blocks.BlocksRegistry;
import top.ilov.mcmods.cakedelight.items.ItemsRegistry;


@Mod(CakeDelightMod.MOD_ID)
public class CakeDelightMod {

    public static final String MOD_ID = "cakedelight";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister<CreativeModeTab> itemGroup = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = itemGroup.register("tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .title(Component.translatable(MOD_ID + ".name"))
            .icon(() -> ItemsRegistry.ekac.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ItemsRegistry.ekac.get());
                output.accept(ItemsRegistry.ekac_hat.get());
                output.accept(ItemsRegistry.small_ekac.get());
                output.accept(ItemsRegistry.eggs_with_tomato.get());
            }).build());

    public CakeDelightMod() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);


        BlocksRegistry.register(modEventBus);
        ItemsRegistry.register(modEventBus);

        itemGroup.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

}
