package net.createarmory.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.phys.Vec3;
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

import net.createarmory.item.BarretItem;
import net.createarmory.init.CreatearmoryModItems;
import net.createarmory.init.CreatearmoryModEntities;
import net.createarmory.entity.FiftyDebugEntity;
import net.createarmory.CreatearmoryMod;

public class BarretRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean wait = false;
		if (itemstack.getOrCreateTag().getBoolean("fireState") == false) {
			if (itemstack.getOrCreateTag().getBoolean("wait") == false) {
				if (itemstack.getOrCreateTag().getDouble("ammoCount") <= 4) {
					if (itemstack.getItem() instanceof BarretItem)
						itemstack.getOrCreateTag().putString("geckoAnim", "fire");
					itemstack.getOrCreateTag().putDouble("ammoCount", (itemstack.getOrCreateTag().getDouble("ammoCount") - 1));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.PLAYERS, 1, 2);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.PLAYERS, 1, 2, false);
						}
					}
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
								AbstractArrow entityToSpawn = new FiftyDebugEntity(CreatearmoryModEntities.FIFTY_DEBUG.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setPierceLevel(piercing);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 4, 1, (byte) 10);
						_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1), (entity.getZ()));
						_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 16, 1);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					entity.setDeltaMovement(new Vec3((entity.getLookAngle().x - entity.getLookAngle().x * 1.8), (entity.getLookAngle().y - entity.getLookAngle().y * 1.4), (entity.getLookAngle().z - entity.getLookAngle().z * 1.8)));
					{
						Entity _ent = entity;
						_ent.setYRot((float) (entity.getYRot() + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)));
						_ent.setXRot((float) (entity.getXRot() - Mth.nextDouble(RandomSource.create(), 1, 2)));
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(CreatearmoryModItems.FIFTY_CAL_CASING.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, (y + 1), z, (entity.getLookAngle().x / 5), (entity.getLookAngle().y / 7), (entity.getLookAngle().z / 5));
					world.addParticle(ParticleTypes.LARGE_SMOKE, x, (y + 1), z, (entity.getLookAngle().x / 5), (entity.getLookAngle().y / 7), (entity.getLookAngle().z / 5));
					itemstack.getOrCreateTag().putBoolean("wait", (true));
					CreatearmoryMod.queueServerWork(15, () -> {
						itemstack.getOrCreateTag().putBoolean("wait", (false));
					});
				}
				if (itemstack.getOrCreateTag().getDouble("ammoCount") <= 0) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CreatearmoryModItems.BARRET.get()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(CreatearmoryModItems.EMPTY_BARRET.get());
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("fireState", (true));
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("ammoState", (false));
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CreatearmoryModItems.BARRET.get()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(CreatearmoryModItems.EMPTY_BARRET.get());
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
}
