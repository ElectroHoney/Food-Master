package net.electrohoney.foodmastermod;

import net.electrohoney.foodmastermod.block.ModBlocks;
import net.electrohoney.foodmastermod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodMaster implements ModInitializer {

	public static final String MOD_ID = "foodmastermod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlock();
	}
}
