package net.peyton.eagler.minecraft.suppliers;

import net.minecraft.game.entity.Entity;
import net.minecraft.game.level.World;

public interface EntitySupplier <T extends Entity> {

	T createEntity(World world);
	
}
