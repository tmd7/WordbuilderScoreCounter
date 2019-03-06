package com.mtlepberghenov.wordbuilderscorecounter.application.di

import android.content.Context
import com.mtlepberghenov.wordbuilderscorecounter.base.BaseApplication
import com.mtlepberghenov.wordbuilderscorecounter.coroutines.CoroutinesContextProvider
import com.mtlepberghenov.wordbuilderscorecounter.coroutines.DefaultCoroutinesContextProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [WordbuilderScoreCounterModuleBinding::class])
class WordbuilderScoreCounterModule(val application: BaseApplication) {

    //There are provide object on app level

    @Provides
    @Singleton
    fun provideAppContext(): Context = application

    @Provides
    @Singleton
    fun provideCoroutinesContextProvider(): CoroutinesContextProvider =
            DefaultCoroutinesContextProvider()
}