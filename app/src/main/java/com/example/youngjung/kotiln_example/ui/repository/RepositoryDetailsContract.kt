package client.yalantis.com.githubclient.flow.repository

import client.yalantis.com.githubclient.model.RepositoryDetail
import com.example.youngjung.kotiln_example.ui.base.basePresenter
import com.example.youngjung.kotiln_example.ui.base.baseView

/**
 * Created by Alexey on 07.10.2016.
 */
object RepositoryDetailsContract {

    interface View : baseView {
        fun showRepository(repositoryDetail: RepositoryDetail)

        fun showReloadButton()
    }

    interface Presenter : basePresenter<View> {
        fun loadRepository(name: String)
    }


}