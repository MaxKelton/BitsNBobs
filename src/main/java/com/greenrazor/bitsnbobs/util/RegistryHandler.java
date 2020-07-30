package com.greenrazor.bitsnbobs.util;

import com.greenrazor.bitsnbobs.BitsNBobs;
import com.greenrazor.bitsnbobs.blocks.WitchOven;
import com.greenrazor.bitsnbobs.items.NiceCrispyBacon;
import com.greenrazor.bitsnbobs.items.PoisonApple;
import com.greenrazor.bitsnbobs.items.RawBacon;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.rmi.registry.Registry;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BitsNBobs.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BitsNBobs.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<RawBacon> RAW_BACON = ITEMS.register("raw_bacon", RawBacon::new);
    public static final RegistryObject<PoisonApple> POISON_APPLE = ITEMS.register("poison_apple", PoisonApple::new);
    public static final RegistryObject<NiceCrispyBacon> NICE_CRISPY_BACON = ITEMS.register("nice_crispy_bacon", NiceCrispyBacon::new);

    // Blocks
    public static final RegistryObject<Block> WITCH_OVEN = BLOCKS.register("witch_oven", WitchOven::new);
    public static final RegistryObject<Block> WHITE_WOOL_STAIRS = BLOCKS.register("white_wool_stairs",
            () -> new StairsBlock(() -> Blocks.WHITE_WOOL.getDefaultState(),
                    Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH)));

    // Block Items
    public static final RegistryObject<Item> WITCH_OVEN_ITEM = ITEMS.register("witch_oven",
            () -> new BlockItem(WITCH_OVEN.get(), new Item.Properties().group(BitsNBobs.TAB)));
    public static final RegistryObject<Item> WHITE_WOOL_STAIRS_ITEM = ITEMS.register("white_wool_stairs",
            () -> new BlockItem(WHITE_WOOL_STAIRS.get(), new Item.Properties().group(BitsNBobs.TAB)));
}
