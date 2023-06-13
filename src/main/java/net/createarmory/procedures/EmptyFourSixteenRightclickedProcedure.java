package net.createarmory.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.createarmory.network.CreatearmoryModVariables;
import net.createarmory.item.EmptyFourSixteenItem;
import net.createarmory.init.CreatearmoryModItems;
import net.createarmory.CreatearmoryMod;

import java.util.concurrent.atomic.AtomicReference;

public class EmptyFourSixteenRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double diamonds = 0;
		double fivesixammo = 0;
		if (itemstack.getOrCreateTag().getBoolean("ammoState") == false || (entity.getCapability(CreatearmoryModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreatearmoryModVariables.PlayerVariables())).Reload == true) {
			if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CreatearmoryModItems.FIVE_FIVE_SIX.get())) : false) == true) {
				fivesixammo = 0;
				{
					AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _iitemhandlerref.set(capability));
					if (_iitemhandlerref.get() != null) {
						for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
							ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
							if (CreatearmoryModItems.FIVE_FIVE_SIX.get() == itemstackiterator.getItem()) {
								fivesixammo = fivesixammo + (itemstackiterator).getCount();
							}
						}
					}
				}
				if (fivesixammo >= 20) {
					itemstack.getOrCreateTag().putBoolean("fireState", (false));
					itemstack.getOrCreateTag().putBoolean("ammoState", (true));
					if (itemstack.getItem() instanceof EmptyFourSixteenItem)
						itemstack.getOrCreateTag().putString("geckoAnim", "reload");
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(CreatearmoryModItems.FIVE_FIVE_SIX.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 20, _player.inventoryMenu.getCraftSlots());
					}
					CreatearmoryMod.queueServerWork(15, () -> {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CreatearmoryModItems.EMPTY_FOUR_SIXTEEN.get()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(CreatearmoryModItems.FOUR_SIXTEEN.get());
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammoCount", 20);
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CreatearmoryModItems.EMPTY_FOUR_SIXTEEN.get()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(CreatearmoryModItems.FOUR_SIXTEEN.get());
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
							(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammoCount", 20);
						}
					});
				}
			}
		}
	}
}
