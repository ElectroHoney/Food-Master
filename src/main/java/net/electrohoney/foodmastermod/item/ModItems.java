package net.electrohoney.foodmastermod.item;

import net.electrohoney.foodmastermod.FoodMaster;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item FOOD_ITEM = registerItem("food_item",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD)));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(FoodMaster.MOD_ID, name), item);
    }
    public static void registerModItems(){

        FoodMaster.LOGGER.info("Registering Mod Items for " + FoodMaster.MOD_ID);
    }

}
