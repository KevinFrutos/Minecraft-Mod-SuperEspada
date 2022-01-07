package com.kevinfrutos.superespada.item;

import com.kevinfrutos.superespada.SuperEspada;
import com.kevinfrutos.superespada.item.custom.ExcaliburItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SuperEspada.MOD_ID);

    // ITEMS
    public static final RegistryObject<Item> GOD_GEM = ITEMS.register("god_gem",
            () -> new Item(new Item.Properties().group(ModItemGroup.SUPERESPADA_GROUP)));

    // WEAPONS
    public static final RegistryObject<Item> EXCALIBUR = ITEMS.register("excalibur",
            () -> new ExcaliburItem(ModItemTier.GOD_GEM, 5, 5f,
                    new Item.Properties().maxStackSize(1).group(ModItemGroup.SUPERESPADA_GROUP)));

    //ARMOR
    public static final RegistryObject<Item> GOD_GEM_HELMET = ITEMS.register("god_gem_helmet",
            () -> new ArmorItem(ModArmorMaterial.GOD_GEM, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.SUPERESPADA_GROUP)));

    public static final RegistryObject<Item> GOD_GEM_CHESTPLATE = ITEMS.register("god_gem_chestplate",
            () -> new ArmorItem(ModArmorMaterial.GOD_GEM, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.SUPERESPADA_GROUP)));

    public static final RegistryObject<Item> GOD_GEM_LEGGINGS = ITEMS.register("god_gem_leggings",
            () -> new ArmorItem(ModArmorMaterial.GOD_GEM, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.SUPERESPADA_GROUP)));

    public static final RegistryObject<Item> GOD_GEM_BOOTS = ITEMS.register("god_gem_boots",
            () -> new ArmorItem(ModArmorMaterial.GOD_GEM, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.SUPERESPADA_GROUP)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
