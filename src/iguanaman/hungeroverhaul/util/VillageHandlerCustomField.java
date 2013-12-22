package iguanaman.hungeroverhaul.util;

import iguanaman.hungeroverhaul.ComponentVillageCustomField;

import java.util.List;
import java.util.Random;

import net.minecraft.util.MathHelper;
import net.minecraft.world.gen.structure.ComponentVillageStartPiece;
import net.minecraft.world.gen.structure.StructureVillagePieceWeight;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageCreationHandler;

public class VillageHandlerCustomField implements IVillageCreationHandler {

	public VillageHandlerCustomField() {
	}

	@Override
	public StructureVillagePieceWeight getVillagePieceWeight(Random random,
			int i) {
		return new StructureVillagePieceWeight(ComponentVillageCustomField.class, 12, MathHelper.getRandomIntegerInRange(random, 1 + i, 2 + i));
	}

	@Override
	public Class<?> getComponentClass() {
		return ComponentVillageCustomField.class;
	}

	@Override
	public Object buildComponent(StructureVillagePieceWeight villagePiece,
			ComponentVillageStartPiece startPiece, List pieces, Random random,
			int p1, int p2, int p3, int p4, int p5) {
		return ComponentVillageCustomField.buildComponent(startPiece, pieces, random, p1, p2, p3, p4, p5);
	}

}
