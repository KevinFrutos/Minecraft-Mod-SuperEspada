package com.kevinfrutos.superespada.item.custom;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.NonNullList;

public class MultitoolItem extends PickaxeItem {
    public MultitoolItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public void fillItemGroup(ItemGroup tab, NonNullList<ItemStack> list) {
        if (isInGroup(tab)) {
            ItemStack istack = new ItemStack(this);
            istack.addEnchantment(Enchantments.MENDING, 1);
            istack.addEnchantment(Enchantments.EFFICIENCY, 10);
            list.add(istack);
        }
    }
}
