package com.stevenun.mod;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, StevenUnMod.MOD_ID);

    public static final RegistryObject<Item> COOKIE_CAT = ITEMS.register("cookie_cat", () ->
        new Item(new Item.Properties()
            .stacksTo(16)
            .rarity(Rarity.UNCOMMON)
            .food(new FoodProperties.Builder()
                .nutrition(6)
                .saturationMod(0.8f)
                .alwaysEat()
                .build())));

    private ModItems() {}

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
