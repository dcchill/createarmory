package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.MFourUpperItem;

public class MFourUpperItemModel extends AnimatedGeoModel<MFourUpperItem> {
	@Override
	public ResourceLocation getAnimationResource(MFourUpperItem animatable) {
		return new ResourceLocation("createarmory", "animations/m4upper.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MFourUpperItem animatable) {
		return new ResourceLocation("createarmory", "geo/m4upper.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MFourUpperItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/m4texture.png");
	}
}
