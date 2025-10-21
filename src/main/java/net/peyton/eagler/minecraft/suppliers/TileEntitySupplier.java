package net.peyton.eagler.minecraft.suppliers;

import net.minecraft.game.level.block.tileentity.TileEntity;

public interface TileEntitySupplier<T extends TileEntity> {
	T createTileEntity();
}