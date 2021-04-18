package com.uraneptus.pigsteel.init;

import com.uraneptus.pigsteel.PigsteelMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PigsteelMod.MOD_ID);

    //Items
    public static final RegistryObject<Item> PIGSTEEL_INGOT = ITEMS.register("pigsteel_ingot",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> PIGSTEEL_NUGGET = ITEMS.register("pigsteel_nugget",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));


    //Block Items
    public static final RegistryObject<BlockItem> PIG_STEEL_ORE = ITEMS.register("pigsteel_ore",
            () -> new BlockItem(BlockInit.PIGSTEEL_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> PIGSTEEL_BLOCK = ITEMS.register("pigsteel_block",
            () -> new BlockItem(BlockInit.PIGSTEEL_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> CUT_PIGSTEEL = ITEMS.register("cut_pigsteel",
            () -> new BlockItem(BlockInit.CUT_PIGSTEEL.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> INFECTED_CUT_PIGSTEEL = ITEMS.register("infected_cut_pigsteel",
            () -> new BlockItem(BlockInit.INFECTED_CUT_PIGSTEEL.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> CORRUPTED_CUT_PIGSTEEL = ITEMS.register("corrupted_cut_pigsteel",
            () -> new BlockItem(BlockInit.CORRUPTED_CUT_PIGSTEEL.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> ZOMBIFIED_CUT_PIGSTEEL = ITEMS.register("zombified_cut_pigsteel",
            () -> new BlockItem(BlockInit.ZOMBIFIED_CUT_PIGSTEEL.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> STONE_PIGSTEEL_ORE = ITEMS.register("stone_pigsteel_ore",
            () -> new BlockItem(BlockInit.STONE_PIGSTEEL_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));


}