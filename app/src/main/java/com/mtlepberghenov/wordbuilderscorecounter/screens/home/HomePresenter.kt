package com.mtlepberghenov.wordbuilderscorecounter.screens.home

import com.mtlepberghenov.wordbuilderscorecounter.base.BasePresenter
import com.mtlepberghenov.wordbuilderscorecounter.coroutines.CoroutinesContextProvider

class HomePresenter(
    router: HomeRouter,
    interactor: HomeInteractor,
    coroutinesContextProvider: CoroutinesContextProvider
) : BasePresenter<HomeView, HomeRouter, HomeInteractor>(
    router,
    interactor,
    coroutinesContextProvider
) {
    override fun onCreate() {

    }
}
