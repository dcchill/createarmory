package net.createarmory.procedures;

import net.minecraftforge.registries.ForgeRegistries;

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
import net.createarmory.item.EmptyPipePistolItem;
import net.createarmory.init.CreatearmoryModItems;
import net.createarmory.CreatearmoryMod;

public class EmptyPipePistolRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(CreatearmoryModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreatearmoryModVariables.PlayerVariables())).AmmoState == false) {
			if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CreatearmoryModItems.NINE_MM.get())) : false) == true) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(CreatearmoryModItems.NINE_MM.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (itemstack.getItem() instanceof EmptyPipePistolItem)
					itemstack.getOrCreateTag().putString("geckoAnim", "charge");
				{
					boolean _setval = false;
					entity.getCapability(CreatearmoryModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FireState = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = true;
					entity.getCapability(CreatearmoryModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AmmoState = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.crossbow.loading_middle")), SoundSource.PLAYERS, 1, (float) 0.75);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.crossbow.loading_middle")), SoundSource.PLAYERS, 1, (float) 0.75, false);
					}
				}
				CreatearmoryMod.queueServerWork(20, () -> {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CreatearmoryModItems.EMPTY_PIPE_PISTOL.get()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(CreatearmoryModItems.PIPE_PISTOL.get());
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CreatearmoryModItems.EMPTY_PIPE_PISTOL.get()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(CreatearmoryModItems.PIPE_PISTOL.get());
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				});
			}
		}
	}
}
