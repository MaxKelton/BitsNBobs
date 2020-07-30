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
            () -> new StairsBlock(Blocks.WHITE_WOOL::getDefaultState,
                    Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> ORANGE_WOOL_STAIRS = BLOCKS.register("orange_wool_stairs",
            () -> new StairsBlock(Blocks.ORANGE_WOOL::getDefaultState,
                    Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> MAGENTA_WOOL_STAIRS = BLOCKS.register("magenta_wool_stairs",
            () -> new StairsBlock(Blocks.MAGENTA_WOOL::getDefaultState,
                    Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_STAIRS = BLOCKS.register("light_blue_wool_stairs",
            () -> new StairsBlock(Blocks.LIGHT_BLUE_WOOL::getDefaultState,
                    Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> YELLOW_WOOL_STAIRS = BLOCKS.register("yellow_wool_stairs",
            () -> new StairsBlock(Blocks.YELLOW_WOOL::getDefaultState,
                    Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> LIME_WOOL_STAIRS = BLOCKS.register("lime_wool_stairs",
            () -> new StairsBlock(Blocks.LIME_WOOL::getDefaultState,
                    Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> PINK_WOOL_STAIRS = BLOCKS.register("pink_wool_stairs",
            () -> new StairsBlock(Blocks.PINK_WOOL::getDefaultState,
                    Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> GRAY_WOOL_STAIRS = BLOCKS.register("gray_wool_stairs",
            () -> new StairsBlock(Blocks.GRAY_WOOL::getDefaultState,
                    Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_STAIRS = BLOCKS.register("light_gray_wool_stairs",
            () -> new StairsBlock(Blocks.LIGHT_GRAY_WOOL::getDefaultState,
                    Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> CYAN_WOOL_STAIRS = BLOCKS.register("cyan_wool_stairs",
            () -> new StairsBlock(Blocks.CYAN_WOOL::getDefaultState,
                    Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> PURPLE_WOOL_STAIRS = BLOCKS.register("purple_wool_stairs",
            () -> new StairsBlock(Blocks.PURPLE_WOOL::getDefaultState,
                    Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> BLUE_WOOL_STAIRS = BLOCKS.register("blue_wool_stairs",
            () -> new StairsBlock(Blocks.BLUE_WOOL::getDefaultState,
                    Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> BROWN_WOOL_STAIRS = BLOCKS.register("brown_wool_stairs",
            () -> new StairsBlock(Blocks.BROWN_WOOL::getDefaultState,
                    Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> GREEN_WOOL_STAIRS = BLOCKS.register("green_wool_stairs",
            () -> new StairsBlock(Blocks.GREEN_WOOL::getDefaultState,
                    Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> RED_WOOL_STAIRS = BLOCKS.register("red_wool_stairs",
            () -> new StairsBlock(Blocks.RED_WOOL::getDefaultState,
                    Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> BLACK_WOOL_STAIRS = BLOCKS.register("black_wool_stairs",
            () -> new StairsBlock(Blocks.BLACK_WOOL::getDefaultState,
                    Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH)));

    // Block Items
    public static final RegistryObject<Item> WITCH_OVEN_ITEM = ITEMS.register("witch_oven",
            () -> new BlockItem(WITCH_OVEN.get(), new Item.Properties().group(BitsNBobs.TAB)));
    public static final RegistryObject<Item> WHITE_WOOL_STAIRS_ITEM = ITEMS.register("white_wool_stairs",
            () -> new BlockItem(WHITE_WOOL_STAIRS.get(), new Item.Properties().group(BitsNBobs.TAB)));
    public static final RegistryObject<Item> ORANGE_WOOL_STAIRS_ITEM = ITEMS.register("orange_wool_stairs",
            () -> new BlockItem(ORANGE_WOOL_STAIRS.get(), new Item.Properties().group(BitsNBobs.TAB)));
    public static final RegistryObject<Item> MAGENTA_WOOL_STAIRS_ITEM = ITEMS.register("magenta_wool_stairs",
            () -> new BlockItem(MAGENTA_WOOL_STAIRS.get(), new Item.Properties().group(BitsNBobs.TAB)));
    public static final RegistryObject<Item> LIGHT_BLUE_WOOL_STAIRS_ITEM = ITEMS.register("light_blue_wool_stairs",
            () -> new BlockItem(LIGHT_BLUE_WOOL_STAIRS.get(), new Item.Properties().group(BitsNBobs.TAB)));
    public static final RegistryObject<Item> YELLOW_WOOL_STAIRS_ITEM = ITEMS.register("yellow_wool_stairs",
            () -> new BlockItem(YELLOW_WOOL_STAIRS.get(), new Item.Properties().group(BitsNBobs.TAB)));
    public static final RegistryObject<Item> LIME_WOOL_STAIRS_ITEM = ITEMS.register("lime_wool_stairs",
            () -> new BlockItem(LIME_WOOL_STAIRS.get(), new Item.Properties().group(BitsNBobs.TAB)));
    public static final RegistryObject<Item> PINK_WOOL_STAIRS_ITEM = ITEMS.register("pink_wool_stairs",
            () -> new BlockItem(PINK_WOOL_STAIRS.get(), new Item.Properties().group(BitsNBobs.TAB)));
    public static final RegistryObject<Item> GRAY_WOOL_STAIRS_ITEM = ITEMS.register("gray_wool_stairs",
            () -> new BlockItem(GRAY_WOOL_STAIRS.get(), new Item.Properties().group(BitsNBobs.TAB)));
    public static final RegistryObject<Item> LIGHT_GRAY_WOOL_STAIRS_ITEM = ITEMS.register("light_gray_wool_stairs",
            () -> new BlockItem(LIGHT_GRAY_WOOL_STAIRS.get(), new Item.Properties().group(BitsNBobs.TAB)));
    public static final RegistryObject<Item> CYAN_WOOL_STAIRS_ITEM = ITEMS.register("cyan_wool_stairs",
            () -> new BlockItem(CYAN_WOOL_STAIRS.get(), new Item.Properties().group(BitsNBobs.TAB)));
    public static final RegistryObject<Item> PURPLE_WOOL_STAIRS_ITEM = ITEMS.register("purple_wool_stairs",
            () -> new BlockItem(PURPLE_WOOL_STAIRS.get(), new Item.Properties().group(BitsNBobs.TAB)));
    public static final RegistryObject<Item> BLUE_WOOL_STAIRS_ITEM = ITEMS.register("blue_wool_stairs",
            () -> new BlockItem(BLUE_WOOL_STAIRS.get(), new Item.Properties().group(BitsNBobs.TAB)));
    public static final RegistryObject<Item> BROWN_WOOL_STAIRS_ITEM = ITEMS.register("brown_wool_stairs",
            () -> new BlockItem(BROWN_WOOL_STAIRS.get(), new Item.Properties().group(BitsNBobs.TAB)));
    public static final RegistryObject<Item> GREEN_WOOL_STAIRS_ITEM = ITEMS.register("green_wool_stairs",
            () -> new BlockItem(GREEN_WOOL_STAIRS.get(), new Item.Properties().group(BitsNBobs.TAB)));
    public static final RegistryObject<Item> RED_WOOL_STAIRS_ITEM = ITEMS.register("red_wool_stairs",
            () -> new BlockItem(RED_WOOL_STAIRS.get(), new Item.Properties().group(BitsNBobs.TAB)));
    public static final RegistryObject<Item> BLACK_WOOL_STAIRS_ITEM = ITEMS.register("black_wool_stairs",
            () -> new BlockItem(BLACK_WOOL_STAIRS.get(), new Item.Properties().group(BitsNBobs.TAB)));
}
