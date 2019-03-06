package com.mtlepberghenov.wordbuilderscorecounter.screens.home.di

import com.mtlepberghenov.wordbuilderscorecounter.base.BasePresenter
import com.mtlepberghenov.wordbuilderscorecounter.coroutines.CoroutinesContextProvider
import com.mtlepberghenov.wordbuilderscorecounter.screens.home.*
import dagger.Module
import dagger.Provides

@Module
class HomeModule {
    @Provides
    fun providePresenter(
        router: HomeRouter,
        interactor: HomeInteractor,
        coroutinesContextProvider: CoroutinesContextProvider
    ): BasePresenter<HomeView, HomeRouter, HomeInteractor> =
        HomePresenter(
            router,
            interactor,
            coroutinesContextProvider
        )

    @Provides
    fun provideHomeRouter(activity: HomeActivity): HomeRouter = DefaultHomeRouter(activity)

    @Provides
    fun provideHomeInteractor(): HomeInteractor = DefaultHomeInteractor()
}