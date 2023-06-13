package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.EmptyBarretItem;

public class EmptyBarretItemModel extends AnimatedGeoModel<EmptyBarretItem> {
	@Override
	public ResourceLocation getAnimationResource(EmptyBarretItem animatable) {
		return new ResourceLocation("createarmory", "animations/barret.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EmptyBarretItem animatable) {
		return new ResourceLocation("createarmory", "geo/barret.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EmptyBarretItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/barrettexture.png");
	}
}
