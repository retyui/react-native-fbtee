package com.retyui.fbtee


import android.content.ComponentName
import android.os.Build
import androidx.annotation.RequiresApi
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext

import com.facebook.react.bridge.Arguments

class FbteeModuleImpl(private val reactContext: ReactApplicationContext) {
    fun fun readLocalizationFile(langCode: String?, country: String?): String? {
       return null;
    }

    companion object {
        const val NAME = "FbteeModule"
    }
}
