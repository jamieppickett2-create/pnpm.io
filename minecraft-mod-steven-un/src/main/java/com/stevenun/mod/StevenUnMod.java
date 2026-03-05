package com.stevenun.mod;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(StevenUnMod.MOD_ID)
public class StevenUnMod {
    public static final String MOD_ID = "stevenun";
    public static final Logger LOGGER = LogUtils.getLogger();

    public StevenUnMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(eventBus);
        LOGGER.info("Steven UN mod loaded. You're made o-o-o-o-of love!");
    }
}
