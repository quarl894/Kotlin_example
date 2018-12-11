package com.example.youngjung.kotiln_example.ui.repository_List

import android.content.Context
import android.os.Bundle
import client.yalantis.com.githubclient.model.Repository
import com.example.youngjung.kotiln_example.R
import com.example.youngjung.kotiln_example.ui.base.baseActivity

class RepositoriesListActivity : baseActivity<RepositoriesContract.View,
        RepositoriesPresenter>(),
        RepositoriesContract.View  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showOrganizations(repositories: MutableList<Repository>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override var mPresenter: RepositoriesPresenter
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}

}
