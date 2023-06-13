
package net.createarmory.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.createarmory.init.CreatearmoryModTabs;

public class RPGRocketItem extends Item {
	public RPGRocketItem() {
		super(new Item.Properties().tab(CreatearmoryModTabs.TAB_CREATE_ARMORY).stacksTo(16).rarity(Rarity.COMMON));
	}
}
