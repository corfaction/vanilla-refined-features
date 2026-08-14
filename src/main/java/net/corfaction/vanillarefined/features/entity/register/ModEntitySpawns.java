package net.corfaction.vanillarefined.features.entity.register;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;

public class ModEntitySpawns {

    private static final ResourceKey<Biome> SWAMP = ResourceKey.create(
            Registries.BIOME,
            Identifier.fromNamespaceAndPath("minecraft", "swamp")
    );

    public static void register() {
        BiomeModifications.addSpawn(
                BiomeSelectors.includeByKey(SWAMP),
                MobCategory.MONSTER,
                ModEntityTypes.BOGROT,
                70,
                4,
                4
        );
    }
}