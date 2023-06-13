package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.FourSixteenItem;

public class FourSixteenItemModel extends AnimatedGeoModel<FourSixteenItem> {
	@Override
	public ResourceLocation getAnimationResource(FourSixteenItem animatable) {
		return new ResourceLocation("createarmory", "animations/foursixteen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FourSixteenItem animatable) {
		return new ResourceLocation("createarmory", "geo/foursixteen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FourSixteenItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/m4texture.png");
	}
}
