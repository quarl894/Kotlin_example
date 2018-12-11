package com.example.youngjung.kotiln_example.ui.base

interface basePresenter<in V : baseView> {

    fun attachView(view : V)

    fun detachView()
}