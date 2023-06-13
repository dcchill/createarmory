package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.UpgradedMiniGunItem;

public class UpgradedMiniGunItemModel extends AnimatedGeoModel<UpgradedMiniGunItem> {
	@Override
	public ResourceLocation getAnimationResource(UpgradedMiniGunItem animatable) {
		return new ResourceLocation("createarmory", "animations/upgradedminigun.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UpgradedMiniGunItem animatable) {
		return new ResourceLocation("createarmory", "geo/upgradedminigun.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UpgradedMiniGunItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/mguntexture.png");
	}
}
