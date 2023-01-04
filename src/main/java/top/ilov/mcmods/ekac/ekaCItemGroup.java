package top.ilov.mcmods.ekac;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import top.ilov.mcmods.ekac.blocks.BlockItemInit;

public class ekaCItemGroup extends ItemGroup {
    public ekaCItemGroup() {
        super("ekac_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(BlockItemInit.ekac.get());
    }
}
