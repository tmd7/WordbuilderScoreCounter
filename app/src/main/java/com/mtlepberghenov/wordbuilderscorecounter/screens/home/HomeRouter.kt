package com.mtlepberghenov.wordbuilderscorecounter.screens.home

import android.app.Activity
import com.mtlepberghenov.wordbuilderscorecounter.base.Router

interface HomeRouter : Router

class DefaultHomeRouter(private val activity: Activity) : HomeRouter