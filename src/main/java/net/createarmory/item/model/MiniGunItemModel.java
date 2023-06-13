package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.MiniGunItem;

public class MiniGunItemModel extends AnimatedGeoModel<MiniGunItem> {
	@Override
	public ResourceLocation getAnimationResource(MiniGunItem animatable) {
		return new ResourceLocation("createarmory", "animations/mgun.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MiniGunItem animatable) {
		return new ResourceLocation("createarmory", "geo/mgun.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MiniGunItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/mguntexture.png");
	}
}
