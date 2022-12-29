package tk.minersonline.CreateLogicals.forge;

import dev.architectury.platform.forge.EventBuses;
import tk.minersonline.CreateLogicals.CreateLogicals;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateLogicals.MOD_ID)
public class CreateLogicalsForge {
    public CreateLogicalsForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(CreateLogicals.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            CreateLogicals.init();
    }
}