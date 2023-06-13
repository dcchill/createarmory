
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.createarmory.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.createarmory.block.MoltenBrassBlock;
import net.createarmory.CreatearmoryMod;

public class CreatearmoryModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CreatearmoryMod.MODID);
	public static final RegistryObject<Block> MOLTEN_BRASS = REGISTRY.register("molten_brass", () -> new MoltenBrassBlock());
}
