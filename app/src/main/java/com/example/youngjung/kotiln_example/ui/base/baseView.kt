package com.example.youngjung.kotiln_example.ui.base

import android.content.Context
import android.support.annotation.StringRes

interface baseView {

    fun getContext(): Context

    fun showError(error: String?)

    fun showError(@StringRes stringResId: Int)

    fun showMessage(@StringRes srtResId: Int)

    fun showMessage(message: String)

}