package io.github.bluereflega.barrier;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Barrier implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Barrier");

	public static final BarrierItem BARRIER_ITEM = new BarrierItem(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1));

	public static final ItemGroup BARRIER_GROUP = FabricItemGroupBuilder.create(
			new Identifier("barrier", "barrier"))
			.icon(() -> new ItemStack(BARRIER_ITEM))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(BARRIER_ITEM));
			})
			.build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Barrier mod initialized.");

		Registry.register(Registry.ITEM, new Identifier("barrier", "barrier"), BARRIER_ITEM);
	}
}
