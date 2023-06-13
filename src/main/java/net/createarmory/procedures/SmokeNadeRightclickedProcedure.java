package net.createarmory.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.createarmory.item.SmokeNadeItem;
import net.createarmory.init.CreatearmoryModItems;
import net.createarmory.init.CreatearmoryModEntities;
import net.createarmory.entity.SmokeDebugEntity;
import net.createarmory.CreatearmoryMod;

public class SmokeNadeRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CreatearmoryModItems.SMOKE_NADE.get()) {
			if (itemstack.getItem() instanceof SmokeNadeItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "pin");
			if (itemstack.getOrCreateTag().getBoolean("cooldown") == false) {
				itemstack.getOrCreateTag().putBoolean("cooldown", (true));
				CreatearmoryMod.queueServerWork(10, () -> {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(CreatearmoryModItems.SMOKE_NADE.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback) {
								AbstractArrow entityToSpawn = new SmokeDebugEntity(CreatearmoryModEntities.SMOKE_DEBUG.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 0, 0);
						_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
						_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 1.5, 2);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.snowball.throw")), SoundSource.PLAYERS, (float) 0.8, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.snowball.throw")), SoundSource.PLAYERS, (float) 0.8, 1, false);
						}
					}
				});
				CreatearmoryMod.queueServerWork(12, () -> {
					itemstack.getOrCreateTag().putBoolean("cooldown", (false));
				});
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CreatearmoryModItems.SMOKE_NADE.get()) {
			if (itemstack.getItem() instanceof SmokeNadeItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "pin");
			if (itemstack.getOrCreateTag().getBoolean("cooldown") == false) {
				itemstack.getOrCreateTag().putBoolean("cooldown", (true));
				CreatearmoryMod.queueServerWork(10, () -> {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(CreatearmoryModItems.SMOKE_NADE.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback) {
								AbstractArrow entityToSpawn = new SmokeDebugEntity(CreatearmoryModEntities.SMOKE_DEBUG.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 0, 0);
						_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
						_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 1.5, 2);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.snowball.throw")), SoundSource.PLAYERS, (float) 0.8, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.snowball.throw")), SoundSource.PLAYERS, (float) 0.8, 1, false);
						}
					}
				});
				CreatearmoryMod.queueServerWork(12, () -> {
					itemstack.getOrCreateTag().putBoolean("cooldown", (false));
				});
			}
		}
	}
}
