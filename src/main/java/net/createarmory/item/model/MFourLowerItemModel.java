package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.MFourLowerItem;

public class MFourLowerItemModel extends AnimatedGeoModel<MFourLowerItem> {
	@Override
	public ResourceLocation getAnimationResource(MFourLowerItem animatable) {
		return new ResourceLocation("createarmory", "animations/m4lowerrec.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MFourLowerItem animatable) {
		return new ResourceLocation("createarmory", "geo/m4lowerrec.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MFourLowerItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/m4texture.png");
	}
}
