package top.ilov.mcmods.cakedelight;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = CakeDelightMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {

    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static boolean enable_join_message;
    private static final ForgeConfigSpec.BooleanValue ENABLE_JOIN_MSG = BUILDER
            .comment("Enable the player to join the world welcome message (default: false)")
            .define("enable_join_message", false);


    static final ForgeConfigSpec SPEC = BUILDER.build();

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        enable_join_message = ENABLE_JOIN_MSG.get();
    }
}
