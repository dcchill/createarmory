package net.createarmory.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.createarmory.item.MSixteenItem;
import net.createarmory.init.CreatearmoryModItems;
import net.createarmory.init.CreatearmoryModEntities;
import net.createarmory.entity.FiveFiveSixDebugEntity;
import net.createarmory.CreatearmoryMod;

public class MSixteenRigthclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getBoolean("fireState") == false) {
			if (itemstack.getOrCreateTag().getDouble("ammoCount") <= 30) {
				if (itemstack.getOrCreateTag().getBoolean("gunCooldown") == false) {
					itemstack.getOrCreateTag().putBoolean("gunCooldown", (true));
					CreatearmoryMod.queueServerWork(4, () -> {
						itemstack.getOrCreateTag().putDouble("ammoCount", (itemstack.getOrCreateTag().getDouble("ammoCount") - 3));
						if (itemstack.getItem() instanceof MSixteenItem)
							itemstack.getOrCreateTag().putString("geckoAnim", "fire");
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.PLAYERS, 1, Mth.nextInt(RandomSource.create(), (int) 1.7, (int) 1.8));
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.PLAYERS, 1, Mth.nextInt(RandomSource.create(), (int) 1.7, (int) 1.8), false);
							}
						}
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new FiveFiveSixDebugEntity(CreatearmoryModEntities.FIVE_FIVE_SIX_DEBUG.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, (float) 1.25, 1, (byte) 6);
							_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1), (entity.getZ()));
							_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 9.2, 1);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(CreatearmoryModItems.FIVE_FIVE_SIX_CASING.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, (y + 1), z, (entity.getLookAngle().x / 5), (entity.getLookAngle().y / 7), (entity.getLookAngle().z / 5));
						{
							Entity _ent = entity;
							_ent.setYRot((float) (entity.getYRot() + Mth.nextDouble(RandomSource.create(), -0.2, 0.2)));
							_ent.setXRot((float) (entity.getXRot() - Mth.nextDouble(RandomSource.create(), 0.1, 0.2)));
							_ent.setYBodyRot(_ent.getYRot());
							_ent.setYHeadRot(_ent.getYRot());
							_ent.yRotO = _ent.getYRot();
							_ent.xRotO = _ent.getXRot();
							if (_ent instanceof LivingEntity _entity) {
								_entity.yBodyRotO = _entity.getYRot();
								_entity.yHeadRotO = _entity.getYRot();
							}
						}
						CreatearmoryMod.queueServerWork(4, () -> {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.PLAYERS, 1,
											Mth.nextInt(RandomSource.create(), (int) 1.7, (int) 1.8));
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.PLAYERS, 1, Mth.nextInt(RandomSource.create(), (int) 1.7, (int) 1.8), false);
								}
							}
							if (itemstack.getItem() instanceof MSixteenItem)
								itemstack.getOrCreateTag().putString("geckoAnim", "fire");
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new FiveFiveSixDebugEntity(CreatearmoryModEntities.FIVE_FIVE_SIX_DEBUG.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.setPierceLevel(piercing);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, (float) 1.25, 1, (byte) 6);
								_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1), (entity.getZ()));
								_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 9.2, 1);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(CreatearmoryModItems.FIVE_FIVE_SIX_CASING.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
							world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, (y + 1), z, (entity.getLookAngle().x / 5), (entity.getLookAngle().y / 7), (entity.getLookAngle().z / 5));
							{
								Entity _ent = entity;
								_ent.setYRot((float) (entity.getYRot() + Mth.nextDouble(RandomSource.create(), -0.2, 0.2)));
								_ent.setXRot((float) (entity.getXRot() - Mth.nextDouble(RandomSource.create(), 0.1, 0.2)));
								_ent.setYBodyRot(_ent.getYRot());
								_ent.setYHeadRot(_ent.getYRot());
								_ent.yRotO = _ent.getYRot();
								_ent.xRotO = _ent.getXRot();
								if (_ent instanceof LivingEntity _entity) {
									_entity.yBodyRotO = _entity.getYRot();
									_entity.yHeadRotO = _entity.getYRot();
								}
							}
							CreatearmoryMod.queueServerWork(4, () -> {
								if (itemstack.getItem() instanceof MSixteenItem)
									itemstack.getOrCreateTag().putString("geckoAnim", "fire");
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.PLAYERS, 1,
												Mth.nextInt(RandomSource.create(), (int) 1.7, (int) 1.8));
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.PLAYERS, 1, Mth.nextInt(RandomSource.create(), (int) 1.7, (int) 1.8), false);
									}
								}
								if (world instanceof ServerLevel projectileLevel) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
											AbstractArrow entityToSpawn = new FiveFiveSixDebugEntity(CreatearmoryModEntities.FIVE_FIVE_SIX_DEBUG.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											entityToSpawn.setPierceLevel(piercing);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, (float) 1.25, 1, (byte) 6);
									_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1), (entity.getZ()));
									_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 9.2, 1);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(CreatearmoryModItems.FIVE_FIVE_SIX_CASING.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, (y + 1), z, (entity.getLookAngle().x / 5), (entity.getLookAngle().y / 7), (entity.getLookAngle().z / 5));
								{
									Entity _ent = entity;
									_ent.setYRot((float) (entity.getYRot() + Mth.nextDouble(RandomSource.create(), -0.2, 0.2)));
									_ent.setXRot((float) (entity.getXRot() - Mth.nextDouble(RandomSource.create(), 0.1, 0.2)));
									_ent.setYBodyRot(_ent.getYRot());
									_ent.setYHeadRot(_ent.getYRot());
									_ent.yRotO = _ent.getYRot();
									_ent.xRotO = _ent.getXRot();
									if (_ent instanceof LivingEntity _entity) {
										_entity.yBodyRotO = _entity.getYRot();
										_entity.yHeadRotO = _entity.getYRot();
									}
								}
							});
						});
					});
					CreatearmoryMod.queueServerWork(14, () -> {
						itemstack.getOrCreateTag().putBoolean("gunCooldown", (false));
					});
				}
			}
			if (itemstack.getOrCreateTag().getDouble("ammoCount") <= 0) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CreatearmoryModItems.M_SIXTEEN.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(CreatearmoryModItems.EMPTY_M_SIXTEEN.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("fireState", (true));
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("ammoState", (false));
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CreatearmoryModItems.M_SIXTEEN.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(CreatearmoryModItems.EMPTY_M_SIXTEEN.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("fireState", (true));
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("ammoState", (false));
				}
			}
		}
	}
}
