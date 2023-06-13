package net.createarmory.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.createarmory.init.CreatearmoryModEntities;
import net.createarmory.entity.SmokeDebugEntity;
import net.createarmory.CreatearmoryMod;

public class SmokeDebugProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if ((world.getBlockState(new BlockPos(immediatesourceentity.getX(), immediatesourceentity.getY() - 1, immediatesourceentity.getZ()))).getBlock() == Blocks.AIR) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new SmokeDebugEntity(CreatearmoryModEntities.SMOKE_DEBUG.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, immediatesourceentity, 0, 1);
				_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ()));
				_entityToSpawn.shoot(((immediatesourceentity.getDeltaMovement().x() - immediatesourceentity.getDeltaMovement().x() * 2) / 20), (immediatesourceentity.getDeltaMovement().y() / 2),
						((immediatesourceentity.getDeltaMovement().z() - immediatesourceentity.getDeltaMovement().z() * 2) / 20), (float) 0.15, 10);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (!immediatesourceentity.level.isClientSide())
				immediatesourceentity.discard();
		} else {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (immediatesourceentity.getX()), (immediatesourceentity.getY() + 1), (immediatesourceentity.getZ()), 120, 2, 1, 2, 0.005);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (immediatesourceentity.getX()), (immediatesourceentity.getY() + 1), (immediatesourceentity.getZ()), 120, 2, 1, 2, 0.005);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (immediatesourceentity.getX()), (immediatesourceentity.getY() + 1), (immediatesourceentity.getZ()), 120, 2, 1, 2, 0.01);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (immediatesourceentity.getX()), (immediatesourceentity.getY() + 1), (immediatesourceentity.getZ()), 120, 2, 1, 2, 0.01);
			CreatearmoryMod.queueServerWork(20, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (immediatesourceentity.getX()), (immediatesourceentity.getY() + 1), (immediatesourceentity.getZ()), 120, 2, 1, 2, 0.005);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (immediatesourceentity.getX()), (immediatesourceentity.getY() + 1), (immediatesourceentity.getZ()), 120, 2, 1, 2, 0.005);
				CreatearmoryMod.queueServerWork(20, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (immediatesourceentity.getX()), (immediatesourceentity.getY() + 1), (immediatesourceentity.getZ()), 120, 2, 2, 2, 0.005);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (immediatesourceentity.getX()), (immediatesourceentity.getY() + 1), (immediatesourceentity.getZ()), 120, 2, 2, 2, 0.005);
					CreatearmoryMod.queueServerWork(20, () -> {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (immediatesourceentity.getX()), (immediatesourceentity.getY() + 1), (immediatesourceentity.getZ()), 120, 2, 2, 2, 0.005);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (immediatesourceentity.getX()), (immediatesourceentity.getY() + 1), (immediatesourceentity.getZ()), 120, 2, 2, 2, 0.005);
					});
				});
			});
		}
	}
}
