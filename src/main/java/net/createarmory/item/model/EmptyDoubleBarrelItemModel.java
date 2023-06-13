package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.EmptyDoubleBarrelItem;

public class EmptyDoubleBarrelItemModel extends AnimatedGeoModel<EmptyDoubleBarrelItem> {
	@Override
	public ResourceLocation getAnimationResource(EmptyDoubleBarrelItem animatable) {
		return new ResourceLocation("createarmory", "animations/db.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EmptyDoubleBarrelItem animatable) {
		return new ResourceLocation("createarmory", "geo/db.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EmptyDoubleBarrelItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/dbtexture.png");
	}
}
