package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.DoubleBarrelItem;

public class DoubleBarrelItemModel extends AnimatedGeoModel<DoubleBarrelItem> {
	@Override
	public ResourceLocation getAnimationResource(DoubleBarrelItem animatable) {
		return new ResourceLocation("createarmory", "animations/db.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DoubleBarrelItem animatable) {
		return new ResourceLocation("createarmory", "geo/db.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DoubleBarrelItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/dbtexture.png");
	}
}
