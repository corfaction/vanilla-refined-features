package net.corfaction.vanillarefined.features;

import net.corfaction.vanillarefined.features.entity.register.ModEntity;
import net.corfaction.vanillarefined.features.item.register.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaRefinedFeatures implements ModInitializer {
	public static final String MOD_ID = "vanilla-refined-features";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModEntity.register();
		ModItems.registerCreativeTabItems();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
