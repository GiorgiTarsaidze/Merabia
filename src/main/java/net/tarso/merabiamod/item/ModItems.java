package net.tarso.merabiamod.item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tarso.merabiamod.MerabiaMod;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, MerabiaMod.MOD_ID);

    public static final RegistryObject<Item> MERABIUM = ITEMS.register("merabium",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MERABIA_TAB)));


    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}