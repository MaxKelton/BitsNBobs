package com.greenrazor.bitsnbobs.items;

import com.greenrazor.bitsnbobs.BitsNBobs;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class NiceCrispyBacon extends Item {

    public NiceCrispyBacon() {
        super(new Properties()
                .group(BitsNBobs.TAB)
                .food(new Food.Builder()
                        .hunger(5)
                        .saturation(7.0f)
                        .meat()
                        .build()
                )
        );
    }
}
