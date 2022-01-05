package com.kevinfrutos.superespada.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup SUPERESPADA_GROUP = new ItemGroup("superEspadaTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.EXCALIBUR.get());
        }
    };

}
