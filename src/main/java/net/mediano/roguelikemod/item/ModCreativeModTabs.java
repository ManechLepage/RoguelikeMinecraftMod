package net.mediano.roguelikemod.item;

import net.mediano.roguelikemod.RoguelikeMod;
import net.mediano.roguelikemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RoguelikeMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ROGUELIKE_TAB = CREATIVE_MODE_TABS.register("roguelike_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COIN.get()))
                    .title(Component.translatable("creativetab.roguelike_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        // ITEMS
                        pOutput.accept(ModItems.COIN.get());

                        // BLOCKS
                        pOutput.accept(ModBlocks.UPGRADER.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
