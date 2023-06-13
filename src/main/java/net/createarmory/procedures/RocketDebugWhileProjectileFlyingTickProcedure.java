package net.createarmory.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.ParticleTypes;

public class RocketDebugWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		random = Mth.nextInt(RandomSource.create(), 1, 5);
		if (random == 1) {
			world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 0, 0, 0);
		}
		if (random == 2) {
			world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, y, z, 0, 0, 0);
		}
	}
}
