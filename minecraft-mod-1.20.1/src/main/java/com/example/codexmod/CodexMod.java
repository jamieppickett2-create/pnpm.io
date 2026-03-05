package com.example.codexmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CodexMod implements ModInitializer {
    public static final String MOD_ID = "codexmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Item RUBY = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "ruby"),
            new Item(new Item.Settings())
    );

    @Override
    public void onInitialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.add(RUBY));
        LOGGER.info("Codex Mod initialized for Minecraft 1.20.1");
    }
}
