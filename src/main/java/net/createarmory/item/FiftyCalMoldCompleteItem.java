
package net.createarmory.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.createarmory.init.CreatearmoryModTabs;

public class FiftyCalMoldCompleteItem extends Item {
	public FiftyCalMoldCompleteItem() {
		super(new Item.Properties().tab(CreatearmoryModTabs.TAB_CREATE_ARMORY_PARTS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
