package net.tarso.merabiamod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MERABIA_TAB = new CreativeModeTab("merabiatab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MERABIUM.get());
        }
    };
}
