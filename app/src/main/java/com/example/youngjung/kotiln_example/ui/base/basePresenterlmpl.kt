package com.example.youngjung.kotiln_example.ui.base

open class basePresenterlmpl<V : baseView > : basePresenter<V> {

    protected var mView : V ?= null

    override fun attachView(view: V) {
       mView = view
    }

    override fun detachView() {
       mView = null
    }
}