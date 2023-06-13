package net.createarmory.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createarmory.item.EmptyMSixteenItem;

public class EmptyMSixteenItemModel extends AnimatedGeoModel<EmptyMSixteenItem> {
	@Override
	public ResourceLocation getAnimationResource(EmptyMSixteenItem animatable) {
		return new ResourceLocation("createarmory", "animations/msixteen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EmptyMSixteenItem animatable) {
		return new ResourceLocation("createarmory", "geo/msixteen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EmptyMSixteenItem animatable) {
		return new ResourceLocation("createarmory", "textures/items/m4texture.png");
	}
}
