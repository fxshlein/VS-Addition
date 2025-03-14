package io.github.xiewuzhiying.vs_addition

import dev.architectury.platform.Platform
import io.github.xiewuzhiying.vs_addition.compats.computercraft.PeripheralCommon
import org.valkyrienskies.core.impl.config.VSConfigClass

object VSAdditionMod {
    const val MOD_ID = "vs_addition"

    @JvmStatic var CREATE_ACTIVE = false
    @JvmStatic var CC_ACTIVE = false
    @JvmStatic var CLOCKWORK_ACTIVE = false
    @JvmStatic var CBC_ACTIVE = false
    @JvmStatic var EUREKA_ACTIVE = false
    @JvmStatic var INTERACTIVE_ACTIVE = false
    @JvmStatic var COMPUTERCRAT_ACTIVE = false
    @JvmStatic var FRAMEDBLOCKS_ACTIVE = false
    @JvmStatic var CBCMW_ACTIVE = false

    @JvmStatic
    fun init() {
        CREATE_ACTIVE = Platform.isModLoaded("create")
        CC_ACTIVE = Platform.isModLoaded("computercraft")
        CLOCKWORK_ACTIVE = Platform.isModLoaded("vs_clockwork")
        CBC_ACTIVE = Platform.isModLoaded("createbigcannons")
        EUREKA_ACTIVE = Platform.isModLoaded("vs_eureka")
        INTERACTIVE_ACTIVE = Platform.isModLoaded("create_interactive")
        COMPUTERCRAT_ACTIVE = Platform.isModLoaded("computercraft")
        FRAMEDBLOCKS_ACTIVE = Platform.isModLoaded("framedblocks")
        CBCMW_ACTIVE = Platform.isModLoaded("cbcmodernwarfare")

        VSConfigClass.registerConfig("vs_addition", VSAdditionConfig::class.java)
    }

    @JvmStatic
    fun initClient() {
    }
}