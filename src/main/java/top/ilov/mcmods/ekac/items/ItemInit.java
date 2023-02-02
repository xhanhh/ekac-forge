package top.ilov.mcmods.ekac.items;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import top.ilov.mcmods.ekac.blocks.BlockInit;
import top.ilov.mcmods.ekac.ekaC;
import top.ilov.mcmods.ekac.items.materials.ekaCHatMaterial;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ekaC.MOD_ID);

    public static final RegistryObject<Item> ekac = ITEMS.register("ekac", () -> new BlockItem(BlockInit.ekac.get(),
            new Item.Properties().group(ekaC.ekaCItemGroup)));

    public static final RegistryObject<Item> ekac_hat = ITEMS.register("ekac_hat", () -> new ArmorItem(ekaCHatMaterial.EKAC_HAT, EquipmentSlotType.HEAD,
            new Item.Properties().group(ekaC.ekaCItemGroup)));

}
