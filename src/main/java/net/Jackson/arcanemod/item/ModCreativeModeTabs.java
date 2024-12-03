package net.Jackson.arcanemod.item;


import net.Jackson.arcanemod.ArcaneMod;
import net.Jackson.arcanemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArcaneMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> ARCANE_TAB = CREATIVE_MODE_TABS.register("arcane_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GEMSTONE.get()))
                .title(Component.translatable("creativetab.arcane_tab"))
                .displayItems((pParameters, pOutput) -> {

                      pOutput.accept(ModBlocks.GEMSTONE_ORE.get());
                      pOutput.accept(ModBlocks.DEEPSLATE_GEMSTONE_ORE.get());
                      pOutput.accept(ModBlocks.GEMSTONE_BLOCK.get());
                      pOutput.accept(ModBlocks.PILTOVER_BLOCK.get());
                      pOutput.accept(ModBlocks.SOUND_BLOCK.get());

                      pOutput.accept(ModItems.GEMSTONE.get());
                      pOutput.accept(ModItems.REFINED_GEMSTONE.get());
                      pOutput.accept(ModItems.GEMSTONE_SHARD.get());
                      pOutput.accept(ModItems.GEMSTONE_SHARD_PILE.get());
                      pOutput.accept(ModItems.WORLD_RUNE_ACCELERATE.get());
                      pOutput.accept(ModItems.WORLD_RUNE_PRECISION.get());
                      pOutput.accept(ModItems.WORLD_RUNE_DOMINATION.get());
                      pOutput.accept(ModItems.WORLD_RUNE_SORCERY.get());
                      pOutput.accept(ModItems.WORLD_RUNE_RESOLVE.get());
                      pOutput.accept(ModItems.SHIMMER_SYRINGE.get());

                })
                .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
