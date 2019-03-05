package com.mtlepberghenov.wordbuilderscorecounter.application.di

import com.mtlepberghenov.wordbuilderscorecounter.screens.home.HomeActivity
import com.mtlepberghenov.wordbuilderscorecounter.screens.home.di.HomeScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class WordbuilderScoreCounterBinding {

    //There are provide Android staff

    //Ex.
    //@SomeScope
    //ContributesAndroidInjector(module = [SomeClass::class])
    //internal abstract fun someActivity() : SomeActivity

    @HomeScope
    @ContributesAndroidInjector(modules = [])
    internal abstract fun homeActivity(): HomeActivity
}