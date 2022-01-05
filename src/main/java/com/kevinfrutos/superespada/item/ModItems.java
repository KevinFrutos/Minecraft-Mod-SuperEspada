package com.kevinfrutos.superespada.item;

import com.kevinfrutos.superespada.SuperEspada;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SuperEspada.MOD_ID);

    public static final RegistryObject<Item> EXCALIBUR = ITEMS.register("excalibur",
            () -> new SwordItem(ModItemTier.GOD_GEM, 5, 5f,
                    new Item.Properties().group(ModItemGroup.SUPERESPADA_GROUP)));

    public static final RegistryObject<Item> GOD_GEM = ITEMS.register("god_gem",
            () -> new Item(new Item.Properties().group(ModItemGroup.SUPERESPADA_GROUP)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
