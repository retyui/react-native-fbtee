package com.retyui.fbtee


import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import android.util.Log

import com.facebook.react.bridge.ReactApplicationContext

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Locale


class FbteeModuleImpl(private val reactContext: ReactApplicationContext) {

    fun readLocalizationFile(fileName: String, langCode: String?, countryCode: String?): String? {
        val locale: Locale? =
            if (langCode != null) {
                if (countryCode != null) Locale(langCode, countryCode) else Locale(langCode)
            } else {
                null
            }

        val resources: Resources =
            if (locale != null) {
                val config = Configuration(reactContext.resources.configuration)
                config.setLocale(locale)
                val localizedContext: Context = reactContext.createConfigurationContext(config)
                localizedContext.resources
            } else {
                reactContext.resources
            }

        val resId = resources.getIdentifier(fileName, "raw", reactContext.packageName)
        return readRawResource(resources, resId)
    }


    private fun readRawResource(resources: Resources, resId: Int): String? {
        if (resId == 0) return null

        return try {
            resources.openRawResource(resId).use { `is` ->
                BufferedReader(InputStreamReader(`is`)).use { reader ->
                    reader.readLines().joinToString("\n").trim()
                }
            }
        } catch (e: Exception) {
            Log.e(NAME, "Error reading raw resource", e)
            null
        }
    }

    companion object {
        const val NAME = "FbteeModule"
    }
}
