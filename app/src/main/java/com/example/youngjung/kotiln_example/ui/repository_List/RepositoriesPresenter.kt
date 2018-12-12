package com.example.youngjung.kotiln_example.ui.repository_List

import com.example.youngjung.kotiln_example.api.GeneralErrorHandler
import com.example.youngjung.kotiln_example.manager.ApiManager
import com.example.youngjung.kotiln_example.ui.base.basePresenterlmpl
import rx.functions.Action1

class RepositoriesPresenter : basePresenterlmpl<RepositoriesContract.View>(), RepositoriesContract.Presenter {

    companion object {
        private val ORGANIZATION_NAME = "Yalantis"
        private val REPOS_TYPE = "public"
    }

    override fun loadRepositories() {
        ApiManager.loadOrganizationRepos(ORGANIZATION_NAME, REPOS_TYPE)
                .doOnError { mView?.showMessage(it.toString()) }
                .subscribe(Action1 { mView?.showOrganizations(it) },
                        GeneralErrorHandler(mView, true, { throwable, errorBody, isNetwork -> mView?.showError(throwable.message) }))
    }
}