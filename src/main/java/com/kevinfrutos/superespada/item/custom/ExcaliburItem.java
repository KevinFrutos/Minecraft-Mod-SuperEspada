package com.kevinfrutos.superespada.item.custom;

import com.kevinfrutos.superespada.item.ModItemTier;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.NonNullList;
import org.jetbrains.annotations.NotNull;

public class ExcaliburItem extends SwordItem {

    public ExcaliburItem(ModItemTier godGem, int i, float v, Properties group) { super(godGem, i, v, group); }

    @Override
    public boolean hitEntity(@NotNull ItemStack stack, @NotNull LivingEntity target, @NotNull LivingEntity attacker) {
        attacker.addPotionEffect(new EffectInstance(Effects.STRENGTH, 999, 9));
        attacker.addPotionEffect(new EffectInstance(Effects.REGENERATION, 999, 9));
        attacker.addPotionEffect(new EffectInstance(Effects.SPEED, 999, 2));
        target.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 99, 2));
        target.addPotionEffect(new EffectInstance(Effects.WITHER, 99, 2));
        return super.hitEntity(stack, target, attacker);
    }

    @Override
    public void fillItemGroup(ItemGroup tab, NonNullList<ItemStack> list) {
        if (isInGroup(tab)) {
            ItemStack istack = new ItemStack(this);
            istack.addEnchantment(Enchantments.MENDING, 1);
            istack.addEnchantment(Enchantments.SHARPNESS, 10);
            list.add(istack);
        }
    }
}
