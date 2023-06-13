package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.MSixteenUpperItem;

public class MSixteenUpperItemModel extends AnimatedGeoModel<MSixteenUpperItem> {
	@Override
	public ResourceLocation getAnimationResource(MSixteenUpperItem animatable) {
		return new ResourceLocation("createarmory", "animations/msixteenupper.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MSixteenUpperItem animatable) {
		return new ResourceLocation("createarmory", "geo/msixteenupper.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MSixteenUpperItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/m4texture.png");
	}
}
