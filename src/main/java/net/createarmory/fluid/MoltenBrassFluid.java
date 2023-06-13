
package net.createarmory.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.createarmory.init.CreatearmoryModItems;
import net.createarmory.init.CreatearmoryModFluids;
import net.createarmory.init.CreatearmoryModFluidTypes;
import net.createarmory.init.CreatearmoryModBlocks;

public abstract class MoltenBrassFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> CreatearmoryModFluidTypes.MOLTEN_BRASS_TYPE.get(), () -> CreatearmoryModFluids.MOLTEN_BRASS.get(),
			() -> CreatearmoryModFluids.FLOWING_MOLTEN_BRASS.get()).explosionResistance(100f).bucket(() -> CreatearmoryModItems.MOLTEN_BRASS_BUCKET.get()).block(() -> (LiquidBlock) CreatearmoryModBlocks.MOLTEN_BRASS.get());

	private MoltenBrassFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MoltenBrassFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MoltenBrassFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
