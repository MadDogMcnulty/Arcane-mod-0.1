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
                      pOutput.accept(ModItems.GEMSTONE.get());
                      pOutput.accept(ModItems.REFINED_GEMSTONE.get());

                      pOutput.accept(ModBlocks.GEMSTONE_BLOCK.get());
                      pOutput.accept(ModBlocks.PILTOVER_BLOCK.get());
                })
                .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
