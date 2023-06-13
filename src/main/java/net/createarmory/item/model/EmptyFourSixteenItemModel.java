package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.EmptyFourSixteenItem;

public class EmptyFourSixteenItemModel extends AnimatedGeoModel<EmptyFourSixteenItem> {
	@Override
	public ResourceLocation getAnimationResource(EmptyFourSixteenItem animatable) {
		return new ResourceLocation("createarmory", "animations/foursixteen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EmptyFourSixteenItem animatable) {
		return new ResourceLocation("createarmory", "geo/foursixteen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EmptyFourSixteenItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/m4texture.png");
	}
}
