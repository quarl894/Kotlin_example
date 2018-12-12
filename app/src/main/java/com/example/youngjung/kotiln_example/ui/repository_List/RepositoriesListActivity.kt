package com.example.youngjung.kotiln_example.ui.repository_List

import android.content.Context
import android.os.Bundle
<<<<<<< HEAD
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import client.yalantis.com.githubclient.flow.repository.RepositoryDetailActivity
import client.yalantis.com.githubclient.model.Repository
import com.example.youngjung.kotiln_example.R
import com.example.youngjung.kotiln_example.ui.base.baseActivity
import kotlinx.android.synthetic.main.activity_organization.*
import java.util.ArrayList

class RepositoriesListActivity : baseActivity<RepositoriesContract.View,
        RepositoriesPresenter>(),
        RepositoriesContract.View {

    private var mAdapter: RepositoriesAdapter? = null
    override var mPresenter: RepositoriesPresenter = RepositoriesPresenter()

    override fun showOrganizations(repositories: MutableList<Repository>) {
        mAdapter?.addRepositories(repositories)
        mAdapter?.notifyDataSetChanged()
        hideProgress()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_organization)
        setUpRecyclerView()
        mPresenter.loadRepositories()

        toolbar.title = getString(R.string.title_activity_repositories)
        showProgress()
        fab.setOnClickListener {
            showProgress()
            mPresenter.loadRepositories()
        }
    }

    private fun setUpRecyclerView() {
        mAdapter = RepositoriesAdapter(ArrayList<Repository>(), {
            startActivity(RepositoryDetailActivity.newIntent(this, it.name))
        })
        recyclerViewRepositories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerViewRepositories.adapter = mAdapter
    }

    private fun showProgress() {
        recyclerViewRepositories.visibility = View.GONE
        progress_bar.visibility = View.VISIBLE
        fab.isEnabled = false
    }

    private fun hideProgress() {
        recyclerViewRepositories.visibility = View.VISIBLE
        progress_bar.visibility = View.GONE
        fab.isEnabled = true
    }

    override fun showError(error: String?) {
        super.showError(error)
        progress_bar.visibility = View.GONE
        fab.isEnabled = true
    }
}


=======
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
>>>>>>> bf40b3d78eb813fa8956bb3a5d86980e487e976b
