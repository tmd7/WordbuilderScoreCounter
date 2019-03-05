package com.mtlepberghenov.wordbuilderscorecounter.base

import com.mtlepberghenov.wordbuilderscorecounter.application.di.DaggerWordbuilderScoreCounterComponent
import com.mtlepberghenov.wordbuilderscorecounter.application.di.WordbuilderScoreCounterModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

open class BaseApplication : DaggerApplication(){
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerWordbuilderScoreCounterComponent
            .builder()
            .addMainModule(WordbuilderScoreCounterModule(this))
            .create(this)
    }
}