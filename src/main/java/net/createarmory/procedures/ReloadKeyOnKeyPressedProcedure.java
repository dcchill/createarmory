package net.createarmory.procedures;

import net.minecraft.world.entity.Entity;

import net.createarmory.network.CreatearmoryModVariables;

public class ReloadKeyOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean toggle = false;
		{
			boolean _setval = true;
			entity.getCapability(CreatearmoryModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Reload = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
