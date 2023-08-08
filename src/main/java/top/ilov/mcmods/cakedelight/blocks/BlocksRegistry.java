package top.ilov.mcmods.cakedelight.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.ilov.mcmods.cakedelight.CakeDelightMod;

public class BlocksRegistry {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CakeDelightMod.MOD_ID);

    public static final RegistryObject<CakeBlock> ekac = BLOCKS.register("ekac",
            () -> new EkacBlock(BlockBehaviour.Properties.of().strength(0.5F).sound(SoundType.WOOL)));


    public static void register(IEventBus eventBus) {

        BLOCKS.register(eventBus);

    }

}
