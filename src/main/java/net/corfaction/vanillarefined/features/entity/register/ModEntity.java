package net.corfaction.vanillarefined.features.entity.register;

public class ModEntity {
    public static void register() {
        ModEntityTypes.registerModEntityTypes();
        ModEntityTypes.registerAttributes();
        ModEntityTypes.registerSpawnPlacements();
        ModEntitySpawns.register();
    }
}
