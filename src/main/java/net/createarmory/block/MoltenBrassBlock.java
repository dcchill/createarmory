
package net.createarmory.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.createarmory.procedures.MoltenBrassMobplayerCollidesBlockProcedure;
import net.createarmory.init.CreatearmoryModFluids;

public class MoltenBrassBlock extends LiquidBlock {
	public MoltenBrassBlock() {
		super(() -> CreatearmoryModFluids.MOLTEN_BRASS.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(100f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).noCollission().noLootTable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		MoltenBrassMobplayerCollidesBlockProcedure.execute(entity);
	}
}
