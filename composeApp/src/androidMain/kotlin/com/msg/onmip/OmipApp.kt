package com.msg.onmip

import android.app.Application
import com.msg.onmip.di.initKoin

class OnmipApp: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}