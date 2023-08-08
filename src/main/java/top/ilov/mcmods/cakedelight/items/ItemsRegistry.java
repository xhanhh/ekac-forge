package top.ilov.mcmods.cakedelight.items;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.ilov.mcmods.cakedelight.CakeDelightMod;
import top.ilov.mcmods.cakedelight.blocks.BlocksRegistry;

public class ItemsRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CakeDelightMod.MOD_ID);

    public static final RegistryObject<Item> ekac_hat = ITEMS.register("ekac_hat",
            () -> new ArmorItem(CDArmorMaterials.EKAC, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> small_ekac = ITEMS.register("small_ekac",
            () -> new Item(new Item.Properties().food(CDFoodComponents.small_ekac)));

    public static final RegistryObject<Item> eggs_with_tomato = ITEMS.register("eggs_with_tomato",
            () -> new Item(new Item.Properties().food(CDFoodComponents.eggs_with_tomato)));

    public static final RegistryObject<Item> ekac = ITEMS.register("ekac", () -> new BlockItem(BlocksRegistry.ekac.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }

}
