package net.createarmory.procedures;

import net.minecraft.world.entity.Entity;

import net.createarmory.network.CreatearmoryModVariables;

public class ReloadKeyOnKeyReleasedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = false;
			entity.getCapability(CreatearmoryModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Reload = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
