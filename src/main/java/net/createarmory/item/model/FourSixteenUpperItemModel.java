package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.FourSixteenUpperItem;

public class FourSixteenUpperItemModel extends AnimatedGeoModel<FourSixteenUpperItem> {
	@Override
	public ResourceLocation getAnimationResource(FourSixteenUpperItem animatable) {
		return new ResourceLocation("createarmory", "animations/foursixteenupper.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FourSixteenUpperItem animatable) {
		return new ResourceLocation("createarmory", "geo/foursixteenupper.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FourSixteenUpperItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/m4texture.png");
	}
}
