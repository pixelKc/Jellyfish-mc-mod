/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jellyfish.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;

import net.mcreator.jellyfish.JellyfishMod;

import java.util.function.Function;

public class JellyfishModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(JellyfishMod.MODID);
	public static final DeferredItem<Item> JELLYFISH_SPAWN_EGG;
	static {
		JELLYFISH_SPAWN_EGG = register("jellyfish_spawn_egg", properties -> new SpawnEggItem(JellyfishModEntities.JELLYFISH.get(), properties));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}