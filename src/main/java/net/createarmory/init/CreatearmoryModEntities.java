
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.createarmory.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.createarmory.entity.SmokeDebugEntity;
import net.createarmory.entity.ShotgunDebugEntity;
import net.createarmory.entity.RocketDebugEntity;
import net.createarmory.entity.NineDebugEntity;
import net.createarmory.entity.ImpactNadeDebugEntity;
import net.createarmory.entity.FiveFiveSixDebugEntity;
import net.createarmory.entity.FiftyDebugEntity;
import net.createarmory.CreatearmoryMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreatearmoryModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CreatearmoryMod.MODID);
	public static final RegistryObject<EntityType<NineDebugEntity>> NINE_DEBUG = register("projectile_nine_debug",
			EntityType.Builder.<NineDebugEntity>of(NineDebugEntity::new, MobCategory.MISC).setCustomClientFactory(NineDebugEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FiftyDebugEntity>> FIFTY_DEBUG = register("projectile_fifty_debug",
			EntityType.Builder.<FiftyDebugEntity>of(FiftyDebugEntity::new, MobCategory.MISC).setCustomClientFactory(FiftyDebugEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FiveFiveSixDebugEntity>> FIVE_FIVE_SIX_DEBUG = register("projectile_five_five_six_debug", EntityType.Builder.<FiveFiveSixDebugEntity>of(FiveFiveSixDebugEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FiveFiveSixDebugEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RocketDebugEntity>> ROCKET_DEBUG = register("projectile_rocket_debug",
			EntityType.Builder.<RocketDebugEntity>of(RocketDebugEntity::new, MobCategory.MISC).setCustomClientFactory(RocketDebugEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShotgunDebugEntity>> SHOTGUN_DEBUG = register("projectile_shotgun_debug",
			EntityType.Builder.<ShotgunDebugEntity>of(ShotgunDebugEntity::new, MobCategory.MISC).setCustomClientFactory(ShotgunDebugEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ImpactNadeDebugEntity>> IMPACT_NADE_DEBUG = register("projectile_impact_nade_debug", EntityType.Builder.<ImpactNadeDebugEntity>of(ImpactNadeDebugEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ImpactNadeDebugEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SmokeDebugEntity>> SMOKE_DEBUG = register("projectile_smoke_debug",
			EntityType.Builder.<SmokeDebugEntity>of(SmokeDebugEntity::new, MobCategory.MISC).setCustomClientFactory(SmokeDebugEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
