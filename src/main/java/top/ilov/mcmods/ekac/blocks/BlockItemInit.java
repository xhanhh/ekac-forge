package top.ilov.mcmods.ekac.blocks;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import top.ilov.mcmods.ekac.ekaC;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ekaC.MOD_ID);

    public static final RegistryObject<Item> ekac = ITEMS.register("ekac", () -> new BlockItem(BlockInit.ekac.get(), new Item.Properties().group(ekaC.itemgroup)));





}
