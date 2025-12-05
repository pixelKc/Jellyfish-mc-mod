/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jellyfish.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.jellyfish.client.renderer.JellyfishRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class JellyfishModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(JellyfishModEntities.JELLYFISH.get(), JellyfishRenderer::new);
	}
}