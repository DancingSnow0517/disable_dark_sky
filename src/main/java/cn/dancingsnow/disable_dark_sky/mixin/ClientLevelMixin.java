package cn.dancingsnow.disable_dark_sky.mixin;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.level.LevelHeightAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientLevel.ClientLevelData.class)
public class ClientLevelMixin {
    @Inject(
            method = "getHorizonHeight",
            at = @At("HEAD"),
            cancellable = true
    )
    private void disableDarkSkyRendering(LevelHeightAccessor p_171688_, CallbackInfoReturnable<Double> cir) {
        cir.setReturnValue(-Double.MAX_VALUE);
    }
}
