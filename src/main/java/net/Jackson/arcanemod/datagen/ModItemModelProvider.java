package net.Jackson.arcanemod.datagen;

import net.Jackson.arcanemod.ArcaneMod;
import net.Jackson.arcanemod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ArcaneMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.GEMSTONE);
        simpleItem(ModItems.GEMSTONE_SHARD);
        simpleItem(ModItems.GEMSTONE_SHARD_PILE);
        simpleItem(ModItems.REFINED_GEMSTONE);
        simpleItem(ModItems.SHIMMER_SYRINGE);
        simpleItem(ModItems.WORLD_RUNE_ACCELERATE);
        simpleItem(ModItems.WORLD_RUNE_DOMINATION);
        simpleItem(ModItems.WORLD_RUNE_PRECISION);
        simpleItem(ModItems.WORLD_RUNE_RESOLVE);
        simpleItem(ModItems.WORLD_RUNE_SORCERY);
    }

//  builds the pathing for items
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ArcaneMod.MOD_ID, "item/" + item.getId().getPath()));
    }

}
