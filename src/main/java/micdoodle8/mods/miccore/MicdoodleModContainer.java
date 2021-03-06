package micdoodle8.mods.miccore;

import com.google.common.eventbus.EventBus;
import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.MCVersion;

import java.util.Arrays;

@MCVersion("1.8.9")
public class MicdoodleModContainer extends DummyModContainer
{
	public MicdoodleModContainer()
	{
		super(new ModMetadata());
		ModMetadata meta = this.getMetadata();
		meta.modId = "Micdoodlecore";
		meta.name = "Micdoodle8 Core";
		meta.updateUrl = "http://www.micdoodle8.com/";
		meta.description = "Provides core features of Micdoodle8's mods";
		meta.authorList = Arrays.asList("micdoodle8, radfast");
		meta.url = "http://www.micdoodle8.com/";
	}
	
	@Override
	public boolean registerBus(EventBus bus, LoadController controller)
	{
		bus.register(this);
		return true;
	}
}
