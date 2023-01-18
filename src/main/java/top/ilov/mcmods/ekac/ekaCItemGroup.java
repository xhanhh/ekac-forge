package top.ilov.mcmods.ekac;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import top.ilov.mcmods.ekac.register.ekaCModBlocks;

public class ekaCItemGroup extends CreativeModeTab {

    public ekaCItemGroup() {
        super("ekac_group");
    }

    @NotNull
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ekaCModBlocks.ekac.get());
    }
}
