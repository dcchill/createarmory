package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.EmptyRPGItem;

public class EmptyRPGItemModel extends AnimatedGeoModel<EmptyRPGItem> {
	@Override
	public ResourceLocation getAnimationResource(EmptyRPGItem animatable) {
		return new ResourceLocation("createarmory", "animations/rpg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EmptyRPGItem animatable) {
		return new ResourceLocation("createarmory", "geo/rpg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EmptyRPGItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/rpgtexture.png");
	}
}
