
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.createarmory.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.createarmory.CreatearmoryMod;

public class CreatearmoryModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CreatearmoryMod.MODID);
	public static final RegistryObject<SoundEvent> MAC10_FIRE = REGISTRY.register("mac10.fire", () -> new SoundEvent(new ResourceLocation("createarmory", "mac10.fire")));
	public static final RegistryObject<SoundEvent> MAC10_RELOAD = REGISTRY.register("mac10.reload", () -> new SoundEvent(new ResourceLocation("createarmory", "mac10.reload")));
	public static final RegistryObject<SoundEvent> MAC10_FIRE2 = REGISTRY.register("mac10.fire2", () -> new SoundEvent(new ResourceLocation("createarmory", "mac10.fire2")));
	public static final RegistryObject<SoundEvent> M16_FIRE = REGISTRY.register("m16.fire", () -> new SoundEvent(new ResourceLocation("createarmory", "m16.fire")));
	public static final RegistryObject<SoundEvent> M4_FIRE = REGISTRY.register("m4.fire", () -> new SoundEvent(new ResourceLocation("createarmory", "m4.fire")));
}
