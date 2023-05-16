package net.lonald.testmod.item;

import net.lonald.testmod.TestMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

//    public static final RegistryObject<Item> RUBY =
//            ITEMS.register("ruby",()-> new Item(new Item.Properties().));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
