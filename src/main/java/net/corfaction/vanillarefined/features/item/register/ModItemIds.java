package net.corfaction.vanillarefined.features.item.register;

import net.corfaction.vanillarefined.features.VanillaRefinedFeatures;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class ModItemIds {

    public static final ResourceKey<Item> BOGROT_SPAWN_EGG = create("bogrot_egg");

    public static ResourceKey<Item> create(String name) {
        return ResourceKey.create(Registries.ITEM, VanillaRefinedFeatures.id(name));
    }
}
