package io.github.xiewuzhiying.vs_addition.mixin.valkyrienskies.disableLogs;

import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import io.github.xiewuzhiying.vs_addition.VSAdditionConfig;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.valkyrienskies.core.impl.shadow.Ay;

@Pseudo
@Mixin(Ay.class)
public abstract class MixinAy {
    @WrapWithCondition(
            method = "a(Lorg/valkyrienskies/core/impl/shadow/Ak;)V",
            at = @At(
                    value = "INVOKE",
                    target = "Lorg/apache/logging/log4j/Logger;warn(Ljava/lang/String;)V"
            ),
            require = 0,
            remap = false
    )
    private boolean cancelLogging1(Logger instance, String s) {
        return !VSAdditionConfig.SERVER.getDisableSomeWarnings();
    }
}
