package net.createarmory.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.createarmory.network.CreatearmoryModVariables;
import net.createarmory.init.CreatearmoryModItems;

import java.util.concurrent.atomic.AtomicReference;

public class DoubleBarrelItemInHandTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double reserve = 0;
		reserve = 0;
		{
			AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _iitemhandlerref.set(capability));
			if (_iitemhandlerref.get() != null) {
				for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
					ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
					if (CreatearmoryModItems.SHOTGUN_SHELL.get() == itemstackiterator.getItem()) {
						reserve = reserve + (itemstackiterator).getCount();
					}
				}
			}
		}
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal((Math.round(itemstack.getOrCreateTag().getDouble("ammoCount")) + "/" + Math.round(reserve))), (true));
		if (itemstack.getOrCreateTag().getBoolean("reloadKeyState") == false) {
			if ((entity.getCapability(CreatearmoryModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreatearmoryModVariables.PlayerVariables())).Reload == true) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CreatearmoryModItems.DOUBLE_BARREL.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(CreatearmoryModItems.EMPTY_DOUBLE_BARREL.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("fireState", (true));
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("ammoState", (false));
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("reloadKeyState", (true));
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(CreatearmoryModItems.SHOTGUN_SHELL.get());
						_setstack.setCount((int) itemstack.getOrCreateTag().getDouble("ammoCount"));
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CreatearmoryModItems.DOUBLE_BARREL.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(CreatearmoryModItems.EMPTY_DOUBLE_BARREL.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("fireState", (true));
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("ammoState", (false));
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("reloadKeyState", (true));
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(CreatearmoryModItems.SHOTGUN_SHELL.get());
						_setstack.setCount((int) itemstack.getOrCreateTag().getDouble("ammoCount"));
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
		}
	}
}
