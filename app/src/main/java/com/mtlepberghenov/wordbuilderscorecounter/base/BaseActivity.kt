package com.mtlepberghenov.wordbuilderscorecounter.base

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity<V : BaseView, R : Router, I : Interactor> : DaggerAppCompatActivity() {
    abstract val resId: Int
    abstract val view: V

    @Inject
    lateinit var presenter: BasePresenter<V, R, I>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(resId)
        presenter.takeView(view)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }
}