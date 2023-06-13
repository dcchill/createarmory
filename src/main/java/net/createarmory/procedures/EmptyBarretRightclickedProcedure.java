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
import net.createarmory.item.EmptyBarretItem;
import net.createarmory.init.CreatearmoryModItems;
import net.createarmory.CreatearmoryMod;

import java.util.concurrent.atomic.AtomicReference;

public class EmptyBarretRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double bullets = 0;
		double fivesixammo = 0;
		boolean reload = false;
		if (itemstack.getItem() instanceof EmptyBarretItem)
			itemstack.getOrCreateTag().putString("geckoAnim", "empty");
		if (itemstack.getOrCreateTag().getBoolean("ammoState") == false || (entity.getCapability(CreatearmoryModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreatearmoryModVariables.PlayerVariables())).Reload == true) {
			if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CreatearmoryModItems.FIFTY_CAL.get())) : false) == true) {
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
							if (CreatearmoryModItems.FIFTY_CAL.get() == itemstackiterator.getItem()) {
								fivesixammo = fivesixammo + (itemstackiterator).getCount();
							}
						}
					}
				}
				if (fivesixammo >= 4) {
					if (reload == true) {
						reload = false;
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(CreatearmoryModItems.FIFTY_CAL.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 4, _player.inventoryMenu.getCraftSlots());
						}
						if (itemstack.getItem() instanceof EmptyBarretItem)
							itemstack.getOrCreateTag().putString("geckoAnim", "reload");
						CreatearmoryMod.queueServerWork(35, () -> {
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CreatearmoryModItems.EMPTY_BARRET.get()) {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack = new ItemStack(CreatearmoryModItems.BARRET.get());
									_setstack.setCount(1);
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
								(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammoCount", 4);
								itemstack.getOrCreateTag().putBoolean("ammoState", (false));
							} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CreatearmoryModItems.EMPTY_BARRET.get()) {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack = new ItemStack(CreatearmoryModItems.BARRET.get());
									_setstack.setCount(1);
									_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
								(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammoCount", 4);
								itemstack.getOrCreateTag().putBoolean("ammoState", (false));
							}
						});
					}
				}
			}
		}
	}
}
