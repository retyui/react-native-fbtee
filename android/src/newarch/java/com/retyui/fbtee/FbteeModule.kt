package com.retyui.fbtee

import android.os.Build
import androidx.annotation.RequiresApi
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = FbteeModule.NAME)
class FbteeModule(
        // Each native module class consumes react application context
        reactContext: ReactApplicationContext
) : NativeFbteeModuleSpec(reactContext) {
    // Use shared module implementation and forward react application context
    private val moduleImpl = FbteeModuleImpl(reactContext)

    // Return the name of the module - it should match the name provided in JS specification
    override fun getName() = NAME

    // Exported methods are overridden - based on the spec class
    override fun readLocalizationFile(langCode: String?, country: String?) = moduleImpl.readLocalizationFile(langCode, country)

    companion object {
        const val NAME = FbteeModuleImpl.NAME
    }
}
