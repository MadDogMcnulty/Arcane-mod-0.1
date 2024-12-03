package net.Jackson.arcanemod.item;

import net.Jackson.arcanemod.ArcaneMod;
import net.Jackson.arcanemod.item.custom.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ArcaneMod.MOD_ID);

    public static final RegistryObject<Item> GEMSTONE_SHARD = ITEMS.register("gemstone_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEMSTONE_SHARD_PILE = ITEMS.register("gemstone_shard_pile",
            () -> new FuelItem(new Item.Properties(), 4000));

    public static final RegistryObject<Item> GEMSTONE = ITEMS.register("gemstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REFINED_GEMSTONE = ITEMS.register("refined_gemstone",
            () -> new RefinedGemstoneItem(new Item.Properties()));

    public static final RegistryObject<Item> WORLD_RUNE_ACCELERATE = ITEMS.register("world_rune_accelerate",
            () -> new AccelerateRuneItem(new Item.Properties()));

    public static final RegistryObject<Item> WORLD_RUNE_PRECISION = ITEMS.register("world_rune_precision",
            () -> new PrecisionRuneItem(new Item.Properties()));

    public static final RegistryObject<Item> WORLD_RUNE_DOMINATION = ITEMS.register("world_rune_domination",
            () -> new DominationRuneItem(new Item.Properties()));

    public static final RegistryObject<Item> WORLD_RUNE_SORCERY = ITEMS.register("world_rune_sorcery",
            () -> new SorceryRuneItem(new Item.Properties()));

    public static final RegistryObject<Item> WORLD_RUNE_RESOLVE = ITEMS.register("world_rune_resolve",
            () -> new ResolveRuneItem(new Item.Properties()));

    public static final RegistryObject<Item> SHIMMER_SYRINGE = ITEMS.register("shimmer_syringe",
            () -> new Item(new Item.Properties().food(ModFoods.SHIMMER_SYRINGE)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
