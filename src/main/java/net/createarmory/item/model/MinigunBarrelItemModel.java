package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.MinigunBarrelItem;

public class MinigunBarrelItemModel extends AnimatedGeoModel<MinigunBarrelItem> {
	@Override
	public ResourceLocation getAnimationResource(MinigunBarrelItem animatable) {
		return new ResourceLocation("createarmory", "animations/minigunbarrel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MinigunBarrelItem animatable) {
		return new ResourceLocation("createarmory", "geo/minigunbarrel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MinigunBarrelItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/mguntexture.png");
	}
}
