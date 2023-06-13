package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.MingunBaseItem;

public class MingunBaseItemModel extends AnimatedGeoModel<MingunBaseItem> {
	@Override
	public ResourceLocation getAnimationResource(MingunBaseItem animatable) {
		return new ResourceLocation("createarmory", "animations/minigunbase.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MingunBaseItem animatable) {
		return new ResourceLocation("createarmory", "geo/minigunbase.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MingunBaseItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/mguntexture.png");
	}
}
