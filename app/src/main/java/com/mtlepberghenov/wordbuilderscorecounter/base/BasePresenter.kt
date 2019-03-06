package com.mtlepberghenov.wordbuilderscorecounter.base

import com.mtlepberghenov.wordbuilderscorecounter.coroutines.CoroutinesContextProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job

abstract class BasePresenter<V : BaseView, R : Router, I : Interactor>(
    protected val router: R,
    protected val interactor: I,
    coroutinesContextProvider: CoroutinesContextProvider
) : CoroutineScope {
    protected var job = Job()
    protected val IOContext = coroutinesContextProvider.IOContext
    override val coroutineContext = coroutinesContextProvider.IOContext + job

    protected lateinit var view: V

    fun takeView(view: V) {
        this.view = view
        initJobIfNeeded()
        onCreate()
    }

    abstract fun onCreate()

    private fun initJobIfNeeded() {
        if (job.isCancelled) {
            job = Job()
        }
    }

    open fun onDestroy() {
        job.cancel()
    }
}