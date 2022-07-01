package io.github.bluereflega.barrier.item;

import io.github.bluereflega.barrier.Barrier;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ItemGroups {
    public static final ItemGroup BARRIER = FabricItemGroupBuilder.create(
                    new Identifier(Barrier.MOD_ID, "barrier_mod"))
            .icon(() -> new ItemStack(Items.BARRIER_ITEM))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Items.BARRIER_ITEM));
            })
            .build();
}
