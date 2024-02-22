package com.uraneptus.pigsteel.data.client;

import com.uraneptus.pigsteel.PigsteelMod;
import com.uraneptus.pigsteel.core.registry.PigsteelBlocks;
import net.minecraft.client.renderer.block.model.BlockModel;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.function.Supplier;

import static com.uraneptus.pigsteel.data.PigsteelDatagenUtil.*;

@SuppressWarnings({"unused", "SameParameterValue"})
public class PigsteelItemModelProvider extends ItemModelProvider {

    public PigsteelItemModelProvider(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, PigsteelMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicBlockItem(PigsteelBlocks.PORKSLAG);
        basicBlockItem(PigsteelBlocks.PIGSTEEL_CHUNK_BLOCK);
        basicBlockItem(PigsteelBlocks.UNAFFECTED_REFINED_PIGSTEEL);
        basicBlockItem(PigsteelBlocks.INFECTED_REFINED_PIGSTEEL);
        basicBlockItem(PigsteelBlocks.CORRUPTED_REFINED_PIGSTEEL);
        basicBlockItem(PigsteelBlocks.ZOMBIFIED_REFINED_PIGSTEEL);
        basicBlockItem(PigsteelBlocks.WAXED_UNAFFECTED_REFINED_PIGSTEEL);
        basicBlockItem(PigsteelBlocks.WAXED_INFECTED_REFINED_PIGSTEEL);
        basicBlockItem(PigsteelBlocks.WAXED_CORRUPTED_REFINED_PIGSTEEL);
        basicBlockItem(PigsteelBlocks.WAXED_ZOMBIFIED_REFINED_PIGSTEEL);
        basicBlockItem(PigsteelBlocks.UNAFFECTED_CUT_PIGSTEEL);
        basicBlockItem(PigsteelBlocks.INFECTED_CUT_PIGSTEEL);
        basicBlockItem(PigsteelBlocks.CORRUPTED_CUT_PIGSTEEL);
        basicBlockItem(PigsteelBlocks.ZOMBIFIED_CUT_PIGSTEEL);
        basicBlockItem(PigsteelBlocks.WAXED_UNAFFECTED_CUT_PIGSTEEL);
        basicBlockItem(PigsteelBlocks.WAXED_INFECTED_CUT_PIGSTEEL);
        basicBlockItem(PigsteelBlocks.WAXED_CORRUPTED_CUT_PIGSTEEL);
        basicBlockItem(PigsteelBlocks.WAXED_ZOMBIFIED_CUT_PIGSTEEL);
        basicBlockItem(PigsteelBlocks.UNAFFECTED_CUT_PIGSTEEL_STAIRS);
        basicBlockItem(PigsteelBlocks.INFECTED_CUT_PIGSTEEL_STAIRS);
        basicBlockItem(PigsteelBlocks.CORRUPTED_CUT_PIGSTEEL_STAIRS);
        basicBlockItem(PigsteelBlocks.ZOMBIFIED_CUT_PIGSTEEL_STAIRS);
        basicBlockItem(PigsteelBlocks.WAXED_UNAFFECTED_CUT_PIGSTEEL_STAIRS);
        basicBlockItem(PigsteelBlocks.WAXED_INFECTED_CUT_PIGSTEEL_STAIRS);
        basicBlockItem(PigsteelBlocks.WAXED_CORRUPTED_CUT_PIGSTEEL_STAIRS);
        basicBlockItem(PigsteelBlocks.WAXED_ZOMBIFIED_CUT_PIGSTEEL_STAIRS);
        basicBlockItem(PigsteelBlocks.UNAFFECTED_CUT_PIGSTEEL_SLAB);
        basicBlockItem(PigsteelBlocks.INFECTED_CUT_PIGSTEEL_SLAB);
        basicBlockItem(PigsteelBlocks.CORRUPTED_CUT_PIGSTEEL_SLAB);
        basicBlockItem(PigsteelBlocks.ZOMBIFIED_CUT_PIGSTEEL_SLAB);
        basicBlockItem(PigsteelBlocks.WAXED_UNAFFECTED_CUT_PIGSTEEL_SLAB);
        basicBlockItem(PigsteelBlocks.WAXED_INFECTED_CUT_PIGSTEEL_SLAB);
        basicBlockItem(PigsteelBlocks.WAXED_CORRUPTED_CUT_PIGSTEEL_SLAB);
        basicBlockItem(PigsteelBlocks.WAXED_ZOMBIFIED_CUT_PIGSTEEL_SLAB);
    }

    private void basicBlockItem(Supplier<? extends Block> blockForItem) {
        withExistingParent(name(blockForItem.get()), modBlockLocation(name(blockForItem.get())));
    }

    private void basicItem(Supplier<? extends Item> item) {
        basicItem(item.get());
    }

    private void basicItemHandheld(Supplier<? extends Item> item) {
        withExistingParent(name(item.get()), HANDHELD)
                .texture(LAYER0, modItemLocation(name(item.get())));
    }

    private void blockItemWithItemTexture(Supplier<? extends Block> blockForItem) {
        basicItem(blockForItem.get().asItem());
    }

}