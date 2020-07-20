package com.greenrazor.bitsnbobs.items;

import com.greenrazor.bitsnbobs.BitsNBobs;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class RawBacon extends Item {

    public RawBacon() {
        super(new Item.Properties()
                .group(BitsNBobs.TAB)
                .food(new Food.Builder()
                        .hunger(2)
                        .saturation(0.4f)
                        .meat()
                        .build()
                )
        );
    }
}
