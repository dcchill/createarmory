package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.PipePistolItem;

public class PipePistolItemModel extends AnimatedGeoModel<PipePistolItem> {
	@Override
	public ResourceLocation getAnimationResource(PipePistolItem animatable) {
		return new ResourceLocation("createarmory", "animations/ppistol.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PipePistolItem animatable) {
		return new ResourceLocation("createarmory", "geo/ppistol.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PipePistolItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/ppistolfix.png");
	}
}
