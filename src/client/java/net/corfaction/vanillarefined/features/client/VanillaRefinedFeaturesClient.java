package net.corfaction.vanillarefined.features.client;

import net.corfaction.vanillarefined.features.client.entity.bogrot.BogrotRenderer;
import net.corfaction.vanillarefined.features.entity.register.ModEntityTypes;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.entity.EntityRenderers;

public class VanillaRefinedFeaturesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		EntityRenderers.register(ModEntityTypes.BOGROT, BogrotRenderer::new);
	}
}