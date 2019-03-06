package com.mtlepberghenov.wordbuilderscorecounter.screens.home.di

import com.mtlepberghenov.wordbuilderscorecounter.base.BasePresenter
import com.mtlepberghenov.wordbuilderscorecounter.coroutines.CoroutinesContextProvider
import com.mtlepberghenov.wordbuilderscorecounter.screens.home.HomeInteractor
import com.mtlepberghenov.wordbuilderscorecounter.screens.home.HomePresenter
import com.mtlepberghenov.wordbuilderscorecounter.screens.home.HomeRouter
import com.mtlepberghenov.wordbuilderscorecounter.screens.home.HomeView
import dagger.Provides

class HomeModule {
    @Provides
    fun providePresenter(
        router: HomeRouter,
        interactor: HomeInteractor,
        coroutinesContextProvider: CoroutinesContextProvider
    ) : BasePresenter<HomeView, HomeRouter, HomeInteractor> =
        HomePresenter(
            router,
            interactor,
            coroutinesContextProvider
        )
}