package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.MacTenItem;

public class MacTenItemModel extends AnimatedGeoModel<MacTenItem> {
	@Override
	public ResourceLocation getAnimationResource(MacTenItem animatable) {
		return new ResourceLocation("createarmory", "animations/macten.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MacTenItem animatable) {
		return new ResourceLocation("createarmory", "geo/macten.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MacTenItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/mazctexture.png");
	}
}
