package net.createarmory.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.createarmory.item.EmptyRPGItem;
import net.createarmory.init.CreatearmoryModItems;
import net.createarmory.CreatearmoryMod;

import java.util.concurrent.atomic.AtomicReference;

public class EmptyRPGRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double fivesixammo = 0;
		boolean toggle = false;
		boolean reload = false;
		if (itemstack.getItem() instanceof EmptyRPGItem)
			itemstack.getOrCreateTag().putString("geckoAnim", "empty");
		if (itemstack.getOrCreateTag().getBoolean("ammoState") == false) {
			if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CreatearmoryModItems.RPG_ROCKET.get())) : false) == true) {
				itemstack.getOrCreateTag().putBoolean("fireState", (false));
				itemstack.getOrCreateTag().putBoolean("ammoState", (true));
				reload = true;
				fivesixammo = 0;
				{
					AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _iitemhandlerref.set(capability));
					if (_iitemhandlerref.get() != null) {
						for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
							ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
							if (CreatearmoryModItems.RPG_ROCKET.get() == itemstackiterator.getItem()) {
								fivesixammo = fivesixammo + (itemstackiterator).getCount();
							}
						}
					}
				}
				if (fivesixammo >= 1) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(CreatearmoryModItems.RPG_ROCKET.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (reload == true) {
						reload = false;
						if (itemstack.getItem() instanceof EmptyRPGItem)
							itemstack.getOrCreateTag().putString("geckoAnim", "reload");
						CreatearmoryMod.queueServerWork(25, () -> {
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CreatearmoryModItems.EMPTY_RPG.get()) {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack = new ItemStack(CreatearmoryModItems.RPG.get());
									_setstack.setCount(1);
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
								(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammoCount", 1);
							} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CreatearmoryModItems.EMPTY_RPG.get()) {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack = new ItemStack(CreatearmoryModItems.RPG.get());
									_setstack.setCount(1);
									_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
								(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammoCount", 1);
							}
						});
					}
				}
			}
		}
	}
}
