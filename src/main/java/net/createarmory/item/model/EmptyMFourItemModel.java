package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.EmptyMFourItem;

public class EmptyMFourItemModel extends AnimatedGeoModel<EmptyMFourItem> {
	@Override
	public ResourceLocation getAnimationResource(EmptyMFourItem animatable) {
		return new ResourceLocation("createarmory", "animations/m4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EmptyMFourItem animatable) {
		return new ResourceLocation("createarmory", "geo/m4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EmptyMFourItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/m4texture.png");
	}
}
