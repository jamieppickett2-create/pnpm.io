package com.stevenunmod;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(StevenUnMod.MOD_ID)
public class StevenUnMod {
    public static final String MOD_ID = "steven_un_mod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public StevenUnMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        LOGGER.info("Steven Un Mod loaded. Event bus: {}", modEventBus);
    }
}
