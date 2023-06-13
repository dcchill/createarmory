package net.createarmory.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;

public class ImpactNadeDebugWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double tickCounter = 0;
		if (tickCounter < 100) {
			tickCounter = tickCounter + 1;
		} else if (tickCounter >= 100) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 3, Explosion.BlockInteraction.BREAK);
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
