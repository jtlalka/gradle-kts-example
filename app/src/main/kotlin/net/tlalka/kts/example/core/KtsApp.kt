package net.tlalka.kts.example.core

import android.app.Application
import com.squareup.leakcanary.LeakCanary

@Suppress("unused")
class KtsApp : Application() {

    override fun onCreate() {
        super.onCreate()

        if (LeakCanary.isInAnalyzerProcess(this)) return
        LeakCanary.install(this)

        DiModel.init()
    }
}