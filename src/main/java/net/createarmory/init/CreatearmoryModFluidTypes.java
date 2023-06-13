
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.createarmory.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.createarmory.fluid.types.MoltenBrassFluidType;
import net.createarmory.CreatearmoryMod;

public class CreatearmoryModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreatearmoryMod.MODID);
	public static final RegistryObject<FluidType> MOLTEN_BRASS_TYPE = REGISTRY.register("molten_brass", () -> new MoltenBrassFluidType());
}
