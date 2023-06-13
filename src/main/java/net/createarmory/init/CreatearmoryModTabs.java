
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.createarmory.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CreatearmoryModTabs {
	public static CreativeModeTab TAB_CREATE_ARMORY;
	public static CreativeModeTab TAB_CREATE_ARMORY_PARTS;

	public static void load() {
		TAB_CREATE_ARMORY = new CreativeModeTab("tabcreate_armory") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CreatearmoryModItems.PIPE_PISTOL.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_CREATE_ARMORY_PARTS = new CreativeModeTab("tabcreate_armory_parts") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CreatearmoryModItems.M_FOUR_LOWER.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
