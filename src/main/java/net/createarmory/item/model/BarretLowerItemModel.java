package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.BarretLowerItem;

public class BarretLowerItemModel extends AnimatedGeoModel<BarretLowerItem> {
	@Override
	public ResourceLocation getAnimationResource(BarretLowerItem animatable) {
		return new ResourceLocation("createarmory", "animations/sniperlower.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BarretLowerItem animatable) {
		return new ResourceLocation("createarmory", "geo/sniperlower.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BarretLowerItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/barrettexture.png");
	}
}
