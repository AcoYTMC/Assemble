package net.acoyt.assemble;

import eu.midnightdust.lib.config.MidnightConfig;
import net.acoyt.acornlib.api.ALib;
import net.acoyt.assemble.compat.ModConfig;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assemble implements ModInitializer {
	public static final String MOD_ID = "assemble";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public void onInitialize() {
		ALib.registerModMenu(MOD_ID, 0xFFe99c50);
		MidnightConfig.init(MOD_ID, ModConfig.class);
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}