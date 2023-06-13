package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.SmokeNadeItem;

public class SmokeNadeItemModel extends AnimatedGeoModel<SmokeNadeItem> {
	@Override
	public ResourceLocation getAnimationResource(SmokeNadeItem animatable) {
		return new ResourceLocation("createarmory", "animations/smokenadegeo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SmokeNadeItem animatable) {
		return new ResourceLocation("createarmory", "geo/smokenadegeo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SmokeNadeItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/smoketexture.png");
	}
}
