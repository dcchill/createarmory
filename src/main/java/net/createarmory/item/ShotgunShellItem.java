
package net.createarmory.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.createarmory.init.CreatearmoryModTabs;

public class ShotgunShellItem extends Item {
	public ShotgunShellItem() {
		super(new Item.Properties().tab(CreatearmoryModTabs.TAB_CREATE_ARMORY).stacksTo(64).rarity(Rarity.COMMON));
	}
}
