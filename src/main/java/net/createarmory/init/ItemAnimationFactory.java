package net.createarmory.init;

import software.bernie.geckolib3.item.GeoArmorItem;
import software.bernie.geckolib3.core.IAnimatable;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.client.Minecraft;

import net.createarmory.item.UpgradedMinigunBarrelItem;
import net.createarmory.item.UpgradedMiniGunItem;
import net.createarmory.item.SmokeNadeItem;
import net.createarmory.item.RPGItem;
import net.createarmory.item.PipePistolItem;
import net.createarmory.item.MinigunBarrelItem;
import net.createarmory.item.MiniGunItem;
import net.createarmory.item.MingunBaseItem;
import net.createarmory.item.MacTenItem;
import net.createarmory.item.MSixteenUpperItem;
import net.createarmory.item.MSixteenItem;
import net.createarmory.item.MFourUpperItem;
import net.createarmory.item.MFourLowerItem;
import net.createarmory.item.MFourItem;
import net.createarmory.item.ImpactNadeItem;
import net.createarmory.item.FourSixteenUpperItem;
import net.createarmory.item.FourSixteenItem;
import net.createarmory.item.EmptyRPGItem;
import net.createarmory.item.EmptyPipePistolItem;
import net.createarmory.item.EmptyMacTenItem;
import net.createarmory.item.EmptyMSixteenItem;
import net.createarmory.item.EmptyMFourItem;
import net.createarmory.item.EmptyFourSixteenItem;
import net.createarmory.item.EmptyDoubleBarrelItem;
import net.createarmory.item.EmptyBarretItem;
import net.createarmory.item.DoubleBarrelItem;
import net.createarmory.item.BarretUpperItem;
import net.createarmory.item.BarretLowerItem;
import net.createarmory.item.BarretItem;

import java.lang.reflect.Field;

@Mod.EventBusSubscriber
public class ItemAnimationFactory {
	public static void disableUseAnim() {
		try {
			ItemInHandRenderer renderer = Minecraft.getInstance().gameRenderer.itemInHandRenderer;
			float rot = 1F;
			if (renderer != null) {
				Field field = ItemInHandRenderer.class.getDeclaredField("mainHandHeight");
				field.setAccessible(true);
				field.setFloat(renderer, rot);
				Field field1 = ItemInHandRenderer.class.getDeclaredField("oMainHandHeight");
				field1.setAccessible(true);
				field1.setFloat(renderer, rot);
				Field field2 = ItemInHandRenderer.class.getDeclaredField("offHandHeight");
				field2.setAccessible(true);
				field2.setFloat(renderer, rot);
				Field field3 = ItemInHandRenderer.class.getDeclaredField("oOffHandHeight");
				field3.setAccessible(true);
				field3.setFloat(renderer, rot);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SubscribeEvent
	public static void animatedItems(TickEvent.PlayerTickEvent event) {
		String animation = "";
		if (event.phase == TickEvent.Phase.START && (event.player.getMainHandItem().getItem() instanceof IAnimatable || event.player.getOffhandItem().getItem() instanceof IAnimatable)) {
			if (!event.player.getMainHandItem().getOrCreateTag().getString("geckoAnim").equals("") && !(event.player.getMainHandItem().getItem() instanceof GeoArmorItem)) {
				animation = event.player.getMainHandItem().getOrCreateTag().getString("geckoAnim");
				event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
				if (event.player.getMainHandItem().getItem() instanceof PipePistolItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof MiniGunItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof BarretItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof MFourItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof MacTenItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof EmptyRPGItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof FourSixteenItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof MSixteenItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof DoubleBarrelItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof MFourUpperItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof MFourLowerItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof BarretLowerItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof BarretUpperItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof MinigunBarrelItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof MingunBaseItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof FourSixteenUpperItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof MSixteenUpperItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof EmptyPipePistolItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof EmptyBarretItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof EmptyMFourItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof EmptyMacTenItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof RPGItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof EmptyFourSixteenItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof EmptyMSixteenItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof EmptyDoubleBarrelItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof UpgradedMiniGunItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof UpgradedMinigunBarrelItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof ImpactNadeItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof SmokeNadeItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
			}
			if (!event.player.getOffhandItem().getOrCreateTag().getString("geckoAnim").equals("") && !(event.player.getOffhandItem().getItem() instanceof GeoArmorItem)) {
				animation = event.player.getOffhandItem().getOrCreateTag().getString("geckoAnim");
				event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
				if (event.player.getOffhandItem().getItem() instanceof PipePistolItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof MiniGunItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof BarretItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof MFourItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof MacTenItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof EmptyRPGItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof FourSixteenItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof MSixteenItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof DoubleBarrelItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof MFourUpperItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof MFourLowerItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof BarretLowerItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof BarretUpperItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof MinigunBarrelItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof MingunBaseItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof FourSixteenUpperItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof MSixteenUpperItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof EmptyPipePistolItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof EmptyBarretItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof EmptyMFourItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof EmptyMacTenItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof RPGItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof EmptyFourSixteenItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof EmptyMSixteenItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof EmptyDoubleBarrelItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof UpgradedMiniGunItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof UpgradedMinigunBarrelItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof ImpactNadeItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof SmokeNadeItem animatable)
					if (event.player.level.isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
			}
		}
	}
}
