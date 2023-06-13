
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.createarmory.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.createarmory.network.ReloadKeyMessage;
import net.createarmory.CreatearmoryMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CreatearmoryModKeyMappings {
	public static final KeyMapping RELOAD_KEY = new KeyMapping("key.createarmory.reload_key", GLFW.GLFW_KEY_R, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CreatearmoryMod.PACKET_HANDLER.sendToServer(new ReloadKeyMessage(0, 0));
				ReloadKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				RELOAD_KEY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - RELOAD_KEY_LASTPRESS);
				CreatearmoryMod.PACKET_HANDLER.sendToServer(new ReloadKeyMessage(1, dt));
				ReloadKeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long RELOAD_KEY_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(RELOAD_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				RELOAD_KEY.consumeClick();
			}
		}
	}
}
