package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.EmptyPipePistolItem;

public class EmptyPipePistolItemModel extends AnimatedGeoModel<EmptyPipePistolItem> {
	@Override
	public ResourceLocation getAnimationResource(EmptyPipePistolItem animatable) {
		return new ResourceLocation("createarmory", "animations/ppistol.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EmptyPipePistolItem animatable) {
		return new ResourceLocation("createarmory", "geo/ppistol.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EmptyPipePistolItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/ppistolfix.png");
	}
}
