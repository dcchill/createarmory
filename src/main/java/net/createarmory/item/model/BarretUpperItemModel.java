package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.BarretUpperItem;

public class BarretUpperItemModel extends AnimatedGeoModel<BarretUpperItem> {
	@Override
	public ResourceLocation getAnimationResource(BarretUpperItem animatable) {
		return new ResourceLocation("createarmory", "animations/sniperupper.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BarretUpperItem animatable) {
		return new ResourceLocation("createarmory", "geo/sniperupper.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BarretUpperItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/barrettexture.png");
	}
}
