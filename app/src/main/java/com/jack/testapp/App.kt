package com.jack.testapp

import android.app.Application
import android.content.res.Resources
import com.jack.lib.core.ui.JAuto
import me.jessyan.autosize.AutoSizeConfig
import me.jessyan.autosize.unit.Subunits

/**
 * author : chong.huang
 * create : 2022/3/16
 * desc   :
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        AutoSizeConfig.getInstance()
            .unitsManager
            .setSupportDP(false)
            .setSupportSP(false)
            .setDesignSize(750f, 1334f)
            .supportSubunits = Subunits.MM
    }

    override fun getResources(): Resources {
        return JAuto.autoXDpi(750f, super.getResources())
    }
}