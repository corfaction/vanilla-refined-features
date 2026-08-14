package net.corfaction.vanillarefined.features.entity.bogrot;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.monster.zombie.Zombie;
import net.minecraft.world.level.Level;

public class Bogrot extends Zombie {
    public Bogrot(EntityType<? extends Bogrot> type, Level level) {
        super(type, level);
    }

    public boolean doHurtTarget(final ServerLevel level, final Entity target) {
        boolean result = super.doHurtTarget(level, target);
        if (result && this.getMainHandItem().isEmpty() && target instanceof LivingEntity livingEntity) {
            float difficulty = level.getCurrentDifficultyAt(this.blockPosition()).getEffectiveDifficulty();
            livingEntity.addEffect(new MobEffectInstance(MobEffects.OOZING, 140 * (int)difficulty), this);
        }

        return result;
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Zombie.createAttributes();
    }
}
