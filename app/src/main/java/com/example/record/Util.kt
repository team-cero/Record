package com.example.record

// useful processing class

class Util {
    companion object {
        fun getVersionCode() = BuildConfig.VERSION_CODE

        fun getVersionName() = BuildConfig.VERSION_NAME
    }
}