package io.github.bluereflega.barrier.item;

import io.github.bluereflega.barrier.Barrier;
import io.github.bluereflega.barrier.item.custom.BarrierItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {

    public static final Item BARRIER_ITEM = registerItem("barrier",
            new BarrierItem(new FabricItemSettings().group(ItemGroups.BARRIER).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Barrier.MOD_ID, name), item);
    }
    public static void registerItems() {
        Barrier.LOGGER.debug("Registering items for " + Barrier.MOD_ID + "...");
    }
}
