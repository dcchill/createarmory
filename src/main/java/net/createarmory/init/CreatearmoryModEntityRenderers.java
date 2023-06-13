
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.createarmory.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.createarmory.client.renderer.SmokeDebugRenderer;
import net.createarmory.client.renderer.RocketDebugRenderer;
import net.createarmory.client.renderer.NineDebugRenderer;
import net.createarmory.client.renderer.ImpactNadeDebugRenderer;
import net.createarmory.client.renderer.FiveFiveSixDebugRenderer;
import net.createarmory.client.renderer.FiftyDebugRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreatearmoryModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CreatearmoryModEntities.NINE_DEBUG.get(), NineDebugRenderer::new);
		event.registerEntityRenderer(CreatearmoryModEntities.FIFTY_DEBUG.get(), FiftyDebugRenderer::new);
		event.registerEntityRenderer(CreatearmoryModEntities.FIVE_FIVE_SIX_DEBUG.get(), FiveFiveSixDebugRenderer::new);
		event.registerEntityRenderer(CreatearmoryModEntities.ROCKET_DEBUG.get(), RocketDebugRenderer::new);
		event.registerEntityRenderer(CreatearmoryModEntities.SHOTGUN_DEBUG.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreatearmoryModEntities.IMPACT_NADE_DEBUG.get(), ImpactNadeDebugRenderer::new);
		event.registerEntityRenderer(CreatearmoryModEntities.SMOKE_DEBUG.get(), SmokeDebugRenderer::new);
	}
}
