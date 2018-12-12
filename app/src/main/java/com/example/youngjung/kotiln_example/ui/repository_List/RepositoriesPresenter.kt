package com.example.youngjung.kotiln_example.ui.repository_List

<<<<<<< HEAD
import com.example.youngjung.kotiln_example.api.GeneralErrorHandler
import com.example.youngjung.kotiln_example.manager.ApiManager
import com.example.youngjung.kotiln_example.ui.base.basePresenterlmpl
import rx.functions.Action1
=======
import com.example.youngjung.kotiln_example.ui.base.basePresenterlmpl
>>>>>>> bf40b3d78eb813fa8956bb3a5d86980e487e976b

class RepositoriesPresenter : basePresenterlmpl<RepositoriesContract.View>(), RepositoriesContract.Presenter {

    companion object {
        private val ORGANIZATION_NAME = "Yalantis"
        private val REPOS_TYPE = "public"
    }

    override fun loadRepositories() {
<<<<<<< HEAD
        ApiManager.loadOrganizationRepos(ORGANIZATION_NAME, REPOS_TYPE)
                .doOnError { mView?.showMessage(it.toString()) }
                .subscribe(Action1 { mView?.showOrganizations(it) },
                        GeneralErrorHandler(mView, true, { throwable, errorBody, isNetwork -> mView?.showError(throwable.message) }))
=======
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
>>>>>>> bf40b3d78eb813fa8956bb3a5d86980e487e976b
    }
}