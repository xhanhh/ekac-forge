package top.ilov.mcmods.ekac.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.CakeBlock;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import top.ilov.mcmods.ekac.ekaC;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ekaC.MOD_ID);

    public static final RegistryObject<CakeBlock> ekac = BLOCKS.register("ekac", ekaCBlock::new);

}
