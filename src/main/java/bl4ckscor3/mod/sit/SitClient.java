package bl4ckscor3.mod.sit;

import net.minecraft.client.renderer.culling.ClippingHelperImpl;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(bus=Bus.MOD, value=Dist.CLIENT)
public class SitClient
{
	@SubscribeEvent
	public static void onFMLCLientSetup(FMLClientSetupEvent event)
	{
		RenderingRegistry.registerEntityRenderingHandler(Sit.SIT_ENTITY_TYPE, EmptyRenderer::new);
	}

	private static class EmptyRenderer extends EntityRenderer<SitEntity>
	{
		protected EmptyRenderer(EntityRendererManager renderManager)
		{
			super(renderManager);
		}

		@Override
		public boolean func_225626_a_(SitEntity p_225626_1_, ClippingHelperImpl p_225626_2_, double p_225626_3_, double p_225626_5_, double p_225626_7_) //shouldRender
		{
			return false;
		}

		@Override
		public ResourceLocation getEntityTexture(SitEntity entity)
		{
			return null;
		}
	}
}
