package bl4ckscor3.mod.sit;

import java.util.Arrays;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@Mod(modid=Sit.modid, name=Sit.name, version=Sit.version, acceptedMinecraftVersions="[" + Sit.mcVersion + "]")
public class Sit
{
	public static final String modid = "sit";
	public static final String name = "Sit";
	public static final String version = "v1.1.2";
	public static final String mcVersion = "1.11.2";
	@Instance(modid)
	public Sit instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModMetadata meta = event.getModMetadata();

		meta.authorList = Arrays.asList(new String[]{"bl4ckscor3"});
		meta.autogenerated = false;
		meta.description = "Adds the ability to sit on slabs and stairs.";
		meta.modId = modid;
		meta.name = name;
		meta.version = version;
		MinecraftForge.EVENT_BUS.register(new SitHandler());
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(modid, "entity_sit"), EntitySit.class, "entity_sit", 0, instance, 256, 20, false);
	}
}
