package net.corfaction.vanillarefined.features.client.entity.bogrot;

import net.corfaction.vanillarefined.features.VanillaRefinedFeatures;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ZombieRenderer;
import net.minecraft.client.renderer.entity.state.ZombieRenderState;
import net.minecraft.resources.Identifier;

public class BogrotRenderer extends ZombieRenderer {
    private static final Identifier TEXTURE = VanillaRefinedFeatures.id("textures/entity/bogrot.png");

    public BogrotRenderer(EntityRendererProvider.Context context) {
        super(context); // 0.375 shadow radius
    }

    @Override
    public Identifier getTextureLocation(ZombieRenderState state) {
        return TEXTURE;
    }
}
