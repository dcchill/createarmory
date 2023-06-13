
package net.createarmory.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.createarmory.init.CreatearmoryModTabs;
import net.createarmory.init.CreatearmoryModFluids;

public class MoltenBrassItem extends BucketItem {
	public MoltenBrassItem() {
		super(CreatearmoryModFluids.MOLTEN_BRASS, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreatearmoryModTabs.TAB_CREATE_ARMORY));
	}
}
