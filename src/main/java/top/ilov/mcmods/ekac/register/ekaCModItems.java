package top.ilov.mcmods.ekac.register;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.ilov.mcmods.ekac.ekaCMod;
import top.ilov.mcmods.ekac.items.armor.ekaCArmorMaterials;
import top.ilov.mcmods.ekac.items.ekaCFoodComponents;

public class ekaCModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ekaCMod.MOD_ID);

    public static final RegistryObject<Item> ekac_hat = ITEMS.register("ekac_hat",
            () -> new ArmorItem(ekaCArmorMaterials.ekac, EquipmentSlot.HEAD, new Item.Properties().tab(ekaCMod.itemGroup)));

    public static final RegistryObject<Item> portable_ekac = ITEMS.register("portable_ekac",
            () -> new Item(new Item.Properties().food(ekaCFoodComponents.portable_ekac).tab(ekaCMod.itemGroup)));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }

}
