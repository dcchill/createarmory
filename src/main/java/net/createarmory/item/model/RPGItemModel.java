package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.RPGItem;

public class RPGItemModel extends AnimatedGeoModel<RPGItem> {
	@Override
	public ResourceLocation getAnimationResource(RPGItem animatable) {
		return new ResourceLocation("createarmory", "animations/rpg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RPGItem animatable) {
		return new ResourceLocation("createarmory", "geo/rpg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RPGItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/rpgtexture.png");
	}
}
