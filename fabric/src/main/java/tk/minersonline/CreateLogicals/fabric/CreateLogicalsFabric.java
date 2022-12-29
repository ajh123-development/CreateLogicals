package tk.minersonline.CreateLogicals.fabric;

import tk.minersonline.CreateLogicals.CreateLogicals;
import net.fabricmc.api.ModInitializer;

public class CreateLogicalsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CreateLogicals.init();
    }
}