package net.corfaction.vanillarefined.features.entity.register;

import net.corfaction.vanillarefined.features.VanillaRefinedFeatures;
import net.corfaction.vanillarefined.features.entity.bogrot.Bogrot;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.levelgen.Heightmap;

public class ModEntityTypes {
    public static final EntityType<Bogrot> BOGROT =
        register(
            "bogrot",
            EntityType.Builder.of(Bogrot::new, MobCategory.MONSTER).sized(0.75f, 1.75f)
        );

    private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
        ResourceKey<EntityType<?>> key = ResourceKey.create(Registries.ENTITY_TYPE, VanillaRefinedFeatures.id(name));
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, key, builder.build(key));
    }

    public static void registerModEntityTypes() {
        VanillaRefinedFeatures.LOGGER.info("Registering EntityTypes for " + VanillaRefinedFeatures.MOD_ID);
    }

    public static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(BOGROT, Bogrot.createAttributes());
    }

    public static void registerSpawnPlacements() {
        SpawnPlacements.register(
                BOGROT,
                SpawnPlacementTypes.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkSurfaceMonstersSpawnRules
        );
    }

}
