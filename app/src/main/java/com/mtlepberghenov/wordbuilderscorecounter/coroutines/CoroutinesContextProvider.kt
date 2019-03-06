package com.mtlepberghenov.wordbuilderscorecounter.coroutines

import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

interface CoroutinesContextProvider {
    val UIContext: CoroutineContext
    val IOContext: CoroutineContext
}

class DefaultCoroutinesContextProvider : CoroutinesContextProvider {
    override val UIContext: CoroutineContext = Dispatchers.Main
    override val IOContext: CoroutineContext = Dispatchers.IO
}