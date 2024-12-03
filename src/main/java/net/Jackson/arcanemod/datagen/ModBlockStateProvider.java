package net.Jackson.arcanemod.datagen;

import net.Jackson.arcanemod.ArcaneMod;
import net.Jackson.arcanemod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ArcaneMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //custom models
        blockWithItem(ModBlocks.GEMSTONE_BLOCK);
        blockWithItem(ModBlocks.PILTOVER_BLOCK);
        blockWithItem(ModBlocks.GEMSTONE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_GEMSTONE_ORE);

        //custom blocks
        blockWithItem(ModBlocks.SOUND_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll((blockRegistryObject.get())));
    }



}
