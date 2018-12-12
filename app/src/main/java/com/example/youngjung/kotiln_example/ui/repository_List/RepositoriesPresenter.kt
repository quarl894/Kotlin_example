package com.example.youngjung.kotiln_example.ui.repository_List

import com.example.youngjung.kotiln_example.ui.base.basePresenterlmpl

class RepositoriesPresenter : basePresenterlmpl<RepositoriesContract.View>(), RepositoriesContract.Presenter {

    companion object {
        private val ORGANIZATION_NAME = "Yalantis"
        private val REPOS_TYPE = "public"
    }

    override fun loadRepositories() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}