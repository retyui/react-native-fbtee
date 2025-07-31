package com.retyui.fbtee

import android.os.Build
import androidx.annotation.RequiresApi
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = FbteeModule.NAME)
class FbteeModule(
    // Each native module class consumes react application context
    reactContext: ReactApplicationContext
) : ReactContextBaseJavaModule(reactContext) {
    // Use shared module implementation and forward react application context
    private val moduleImpl = FbteeModuleImpl(reactContext)

    // Return the name of the module - it should match the name provided in JS specification
    override fun getName() = NAME

    @ReactMethod(isBlockingSynchronousMethod = true)
    fun readLocalizationFile(fileName: String, langCode: String?, countryCode: String?) = moduleImpl.readLocalizationFile(fileName, langCode, countryCode)

    companion object {
        const val NAME = FbteeModuleImpl.NAME
    }
}
