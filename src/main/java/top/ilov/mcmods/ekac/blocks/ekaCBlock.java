package top.ilov.mcmods.ekac.blocks;

import net.minecraft.block.CakeBlock;
import net.minecraft.block.material.Material;

public class ekaCBlock extends CakeBlock {
    public ekaCBlock() {
        super(Properties.create(Material.CAKE).hardnessAndResistance(0.5F));
    }
}
