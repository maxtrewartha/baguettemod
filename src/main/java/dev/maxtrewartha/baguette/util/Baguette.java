package dev.maxtrewartha.baguette.util;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class Baguette extends Item {

    public Baguette() {
        super(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder()
                        .hunger(10).saturation(8.2F)
                        .build()));
    }

}

