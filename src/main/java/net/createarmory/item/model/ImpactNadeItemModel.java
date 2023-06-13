package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.ImpactNadeItem;

public class ImpactNadeItemModel extends AnimatedGeoModel<ImpactNadeItem> {
	@Override
	public ResourceLocation getAnimationResource(ImpactNadeItem animatable) {
		return new ResourceLocation("createarmory", "animations/impactnadegeo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ImpactNadeItem animatable) {
		return new ResourceLocation("createarmory", "geo/impactnadegeo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ImpactNadeItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/impactnade.png");
	}
}
