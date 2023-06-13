package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.EmptyMacTenItem;

public class EmptyMacTenItemModel extends AnimatedGeoModel<EmptyMacTenItem> {
	@Override
	public ResourceLocation getAnimationResource(EmptyMacTenItem animatable) {
		return new ResourceLocation("createarmory", "animations/macten.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EmptyMacTenItem animatable) {
		return new ResourceLocation("createarmory", "geo/macten.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EmptyMacTenItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/mazctexture.png");
	}
}
