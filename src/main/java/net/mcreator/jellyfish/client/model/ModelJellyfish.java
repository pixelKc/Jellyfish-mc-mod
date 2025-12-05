package net.mcreator.jellyfish.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelJellyfish extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("jellyfish", "model_jellyfish"), "main");
	public final ModelPart bb_main;

	public ModelJellyfish(ModelPart root) {
		super(root);
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -18.0F, -8.0F, 15.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(-1.0F, -14.0F, -6.9F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 30)
						.addBox(-1.0F, -14.0F, -3.9F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 30).addBox(-1.0F, -14.0F, -0.9F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 30)
						.addBox(-1.0F, -14.0F, 2.1F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 30).addBox(-1.0F, -14.0F, 5.1F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 30)
						.addBox(-4.0F, -14.0F, 5.1F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 30).addBox(-4.0F, -14.0F, -6.9F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 30)
						.addBox(-4.0F, -14.0F, -3.9F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 30).addBox(-4.0F, -14.0F, -0.9F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 19)
						.addBox(-4.0F, -14.0F, 2.1F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 31).addBox(2.0F, -14.0F, 5.1F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 19)
						.addBox(2.0F, -14.0F, -6.9F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 31).addBox(2.0F, -14.0F, -3.9F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(2.0F, -14.0F, -0.9F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 42).addBox(2.0F, -14.0F, 2.1F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 42)
						.addBox(5.0F, -14.0F, 5.1F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 42).addBox(5.0F, -14.0F, -6.9F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 42)
						.addBox(5.0F, -14.0F, -3.9F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 42).addBox(5.0F, -14.0F, -0.9F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 42)
						.addBox(5.0F, -14.0F, 2.1F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 42).addBox(-7.0F, -14.0F, 5.1F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 42)
						.addBox(-7.0F, -14.0F, -6.9F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 43).addBox(-7.0F, -14.0F, -3.9F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 43)
						.addBox(-7.0F, -14.0F, -0.9F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 19).addBox(-7.0F, -14.0F, 2.1F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-5.0F, -20.0F, -5.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}

}