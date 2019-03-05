package com.mtlepberghenov.wordbuilderscorecounter.application.di

import com.mtlepberghenov.wordbuilderscorecounter.base.BaseApplication
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
    WordbuilderScoreCounterModule::class,
    AndroidSupportInjectionModule::class
    ]
)
interface WordbuilderScoreCounterComponent : AndroidInjector<BaseApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<BaseApplication>() {
        internal abstract fun addMainModule(module: WordbuilderScoreCounterModule): Builder
    }
}