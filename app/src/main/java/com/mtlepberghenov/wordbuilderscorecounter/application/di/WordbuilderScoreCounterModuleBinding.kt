package com.mtlepberghenov.wordbuilderscorecounter.application.di

import com.mtlepberghenov.wordbuilderscorecounter.screens.home.HomeActivity
import com.mtlepberghenov.wordbuilderscorecounter.screens.home.di.HomeModule
import com.mtlepberghenov.wordbuilderscorecounter.screens.home.di.HomeScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class WordbuilderScoreCounterModuleBinding {

    //There are provide Android staff

    //Ex.
    //@SomeScope
    //ContributesAndroidInjector(module = [SomeClass::class])
    //internal abstract fun someActivity() : SomeActivity

    @HomeScope
    @ContributesAndroidInjector(modules = [HomeModule::class])
    internal abstract fun homeActivity(): HomeActivity
}