package top.ilov.mcmods.ekac.register;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.ilov.mcmods.ekac.blocks.ekaCBlock;
import top.ilov.mcmods.ekac.ekaC;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ekaCModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ekaC.MOD_ID);

    public static final RegistryObject<CakeBlock> ekac = registerBlock("ekac",
            () -> new ekaCBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)), ekaC.itemGroup);

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String string, RegistryObject<T> block, CreativeModeTab group) {

        return ekaCModItems.ITEMS.register(string, () -> new BlockItem(block.get(), new Item.Properties().tab(group)));

    }

    private static <T extends Block> RegistryObject<T> registerBlock(String string, Supplier<T> block, CreativeModeTab group) {

        RegistryObject<T> registryObject = BLOCKS.register(string, block);

        registerBlockItem(string, registryObject, group);
        return registryObject;

    }

    public static void register(IEventBus eventBus) {

        BLOCKS.register(eventBus);

    }

}
