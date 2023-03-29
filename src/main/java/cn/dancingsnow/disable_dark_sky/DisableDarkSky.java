package cn.dancingsnow.disable_dark_sky;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DisableDarkSky.MODID)
public class DisableDarkSky {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "disable_dark_sky";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public DisableDarkSky() {

    }

}
