package com.uraneptus.pigsteel.init;

import com.uraneptus.pigsteel.PigsteelMod;
import com.uraneptus.pigsteel.blocks.PigsteelBlock;
import com.uraneptus.pigsteel.blocks.PigsteelOre;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PigsteelMod.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> PIGSTEEL_ORE = BLOCKS.register("pigsteel_ore",
            () -> new PigsteelOre(AbstractBlock.Properties.copy(Blocks.NETHER_GOLD_ORE)));

    public static final RegistryObject<Block> PIGSTEEL_BLOCK = BLOCKS.register("pigsteel_block",
            () -> new PigsteelBlock(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> CUT_PIGSTEEL = BLOCKS.register("cut_pigsteel",
            () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> INFECTED_CUT_PIGSTEEL = BLOCKS.register("infected_cut_pigsteel",
            () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> CORRUPTED_CUT_PIGSTEEL = BLOCKS.register("corrupted_cut_pigsteel",
            () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> ZOMBIFIED_CUT_PIGSTEEL = BLOCKS.register("zombified_cut_pigsteel",
            () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> STONE_PIGSTEEL_ORE = BLOCKS.register("stone_pigsteel_ore",
            () -> new PigsteelOre(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));


}
