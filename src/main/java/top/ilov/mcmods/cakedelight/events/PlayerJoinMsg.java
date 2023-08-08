package top.ilov.mcmods.cakedelight.events;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import top.ilov.mcmods.cakedelight.Config;

@Mod.EventBusSubscriber
public class PlayerJoinMsg {

    @SubscribeEvent
    public static void onPlayerJoin(EntityJoinLevelEvent event) {

        Entity entity = event.getEntity();

        if (Config.enable_join_message) {
            if (!entity.level().isClientSide()) {

                entity.sendSystemMessage(Component.translatable("msg.cakedelight.join_world"));

            }
        }

    }

}
