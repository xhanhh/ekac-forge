package top.ilov.mcmods.ekac;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import top.ilov.mcmods.ekac.items.ItemInit;

import javax.annotation.Nonnull;

public class ekaCItemGroup extends ItemGroup {
    public ekaCItemGroup() {
        super("ekac_group");
    }

    @Nonnull
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemInit.ekac.get());
    }
}
