package net.mcreator.jellyfish.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jellyfish.entity.JellyfishEntity;
import net.mcreator.jellyfish.client.model.ModelJellyfish;

public class JellyfishRenderer extends MobRenderer<JellyfishEntity, LivingEntityRenderState, ModelJellyfish> {
	private JellyfishEntity entity = null;

	public JellyfishRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelJellyfish(context.bakeLayer(ModelJellyfish.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(JellyfishEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jellyfish:textures/entities/jellyfish.png");
	}
}