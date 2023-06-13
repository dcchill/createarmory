package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.UpgradedMinigunBarrelItem;

public class UpgradedMinigunBarrelItemModel extends AnimatedGeoModel<UpgradedMinigunBarrelItem> {
	@Override
	public ResourceLocation getAnimationResource(UpgradedMinigunBarrelItem animatable) {
		return new ResourceLocation("createarmory", "animations/upgradedminigunbarrel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UpgradedMinigunBarrelItem animatable) {
		return new ResourceLocation("createarmory", "geo/upgradedminigunbarrel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UpgradedMinigunBarrelItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/mguntexture.png");
	}
}
