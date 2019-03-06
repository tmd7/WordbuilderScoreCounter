package com.mtlepberghenov.wordbuilderscorecounter.screens.home

import com.google.android.material.bottomnavigation.BottomNavigationView
import com.mtlepberghenov.wordbuilderscorecounter.R
import com.mtlepberghenov.wordbuilderscorecounter.base.BaseActivity
import com.mtlepberghenov.wordbuilderscorecounter.base.BaseView
import kotlinx.android.synthetic.main.activity_main.*

interface HomeView : BaseView

class HomeActivity : BaseActivity<HomeView, HomeRouter, HomeInteractor>(), HomeView {
    override val resId = R.layout.activity_main
    override val view = this

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                message.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                message.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                message.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}
