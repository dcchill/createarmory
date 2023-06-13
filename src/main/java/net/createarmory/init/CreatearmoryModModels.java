
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.createarmory.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.createarmory.client.model.Modelsmokenade;
import net.createarmory.client.model.Modelrocket;
import net.createarmory.client.model.Modelimpactnade;
import net.createarmory.client.model.Modelfivefivesix;
import net.createarmory.client.model.Modelfiftycal;
import net.createarmory.client.model.Modelcustom_model;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CreatearmoryModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelfiftycal.LAYER_LOCATION, Modelfiftycal::createBodyLayer);
		event.registerLayerDefinition(Modelimpactnade.LAYER_LOCATION, Modelimpactnade::createBodyLayer);
		event.registerLayerDefinition(Modelfivefivesix.LAYER_LOCATION, Modelfivefivesix::createBodyLayer);
		event.registerLayerDefinition(Modelrocket.LAYER_LOCATION, Modelrocket::createBodyLayer);
		event.registerLayerDefinition(Modelsmokenade.LAYER_LOCATION, Modelsmokenade::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
	}
}
