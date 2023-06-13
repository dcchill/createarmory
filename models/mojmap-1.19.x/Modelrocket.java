// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelrocket<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "rocket"), "main");
	private final ModelPart rocket;

	public Modelrocket(ModelPart root) {
		this.rocket = root.getChild("rocket");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rocket = partdefinition.addOrReplaceChild("rocket",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.5417F, -0.5F, 0.8646F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.5F)).texOffs(0, 0)
						.addBox(-0.5417F, -0.5F, -4.6354F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(0, 0)
						.addBox(-0.7917F, -0.75F, -2.0104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.5F)).texOffs(0, 2)
						.addBox(-0.9167F, -0.875F, -2.1354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.5F)).texOffs(6, 0)
						.addBox(-0.6667F, -0.625F, -1.1354F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.5F)).texOffs(0, 5)
						.addBox(-0.6667F, -0.625F, -3.6354F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-0.0208F, 20.0F, 0.2604F, 1.5708F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		rocket.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}