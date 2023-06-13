package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.BarretItem;

public class BarretItemModel extends AnimatedGeoModel<BarretItem> {
	@Override
	public ResourceLocation getAnimationResource(BarretItem animatable) {
		return new ResourceLocation("createarmory", "animations/barret.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BarretItem animatable) {
		return new ResourceLocation("createarmory", "geo/barret.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BarretItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/barrettexture.png");
	}
}
