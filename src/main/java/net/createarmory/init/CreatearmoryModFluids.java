
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.createarmory.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.createarmory.fluid.MoltenBrassFluid;
import net.createarmory.CreatearmoryMod;

public class CreatearmoryModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, CreatearmoryMod.MODID);
	public static final RegistryObject<FlowingFluid> MOLTEN_BRASS = REGISTRY.register("molten_brass", () -> new MoltenBrassFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BRASS = REGISTRY.register("flowing_molten_brass", () -> new MoltenBrassFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(MOLTEN_BRASS.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MOLTEN_BRASS.get(), RenderType.translucent());
		}
	}
}
