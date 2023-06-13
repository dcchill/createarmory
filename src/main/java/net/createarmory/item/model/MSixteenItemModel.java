package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.MSixteenItem;

public class MSixteenItemModel extends AnimatedGeoModel<MSixteenItem> {
	@Override
	public ResourceLocation getAnimationResource(MSixteenItem animatable) {
		return new ResourceLocation("createarmory", "animations/msixteen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MSixteenItem animatable) {
		return new ResourceLocation("createarmory", "geo/msixteen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MSixteenItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/m4texture.png");
	}
}
