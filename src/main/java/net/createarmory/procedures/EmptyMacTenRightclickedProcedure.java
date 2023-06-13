package net.createarmory.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.createarmory.network.CreatearmoryModVariables;
import net.createarmory.item.EmptyMacTenItem;
import net.createarmory.init.CreatearmoryModItems;
import net.createarmory.CreatearmoryMod;

import java.util.concurrent.atomic.AtomicReference;

public class EmptyMacTenRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double fivesixammo = 0;
		if (itemstack.getOrCreateTag().getBoolean("ammoState") == false || (entity.getCapability(CreatearmoryModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreatearmoryModVariables.PlayerVariables())).Reload == true) {
			if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CreatearmoryModItems.NINE_MM.get())) : false) == true) {
				fivesixammo = 0;
				{
					AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _iitemhandlerref.set(capability));
					if (_iitemhandlerref.get() != null) {
						for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
							ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
							if (CreatearmoryModItems.NINE_MM.get() == itemstackiterator.getItem()) {
								fivesixammo = fivesixammo + (itemstackiterator).getCount();
							}
						}
					}
				}
				if (fivesixammo >= 20) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("createarmory:mac10.reload")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("createarmory:mac10.reload")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					itemstack.getOrCreateTag().putBoolean("fireState", (false));
					itemstack.getOrCreateTag().putBoolean("ammoState", (true));
					if (itemstack.getItem() instanceof EmptyMacTenItem)
						itemstack.getOrCreateTag().putString("geckoAnim", "reload");
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(CreatearmoryModItems.NINE_MM.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 20, _player.inventoryMenu.getCraftSlots());
					}
					CreatearmoryMod.queueServerWork(20, () -> {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CreatearmoryModItems.EMPTY_MAC_TEN.get()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(CreatearmoryModItems.MAC_TEN.get());
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammoCount", 20);
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CreatearmoryModItems.EMPTY_MAC_TEN.get()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(CreatearmoryModItems.MAC_TEN.get());
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
