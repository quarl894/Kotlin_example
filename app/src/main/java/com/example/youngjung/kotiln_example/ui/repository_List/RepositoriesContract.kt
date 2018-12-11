package com.example.youngjung.kotiln_example.ui.repository_List

import client.yalantis.com.githubclient.model.Repository
import com.example.youngjung.kotiln_example.ui.base.basePresenter
import com.example.youngjung.kotiln_example.ui.base.baseView

object RepositoriesContract {

    interface View : baseView {
        fun showOrganizations(repositories: MutableList<Repository>)

    }

    interface Presenter : basePresenter<View> {
        fun loadRepositories()

    }
}