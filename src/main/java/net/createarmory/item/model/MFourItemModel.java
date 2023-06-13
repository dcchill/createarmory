package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.MFourItem;

public class MFourItemModel extends AnimatedGeoModel<MFourItem> {
	@Override
	public ResourceLocation getAnimationResource(MFourItem animatable) {
		return new ResourceLocation("createarmory", "animations/m4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MFourItem animatable) {
		return new ResourceLocation("createarmory", "geo/m4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MFourItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/m4texture.png");
	}
}
