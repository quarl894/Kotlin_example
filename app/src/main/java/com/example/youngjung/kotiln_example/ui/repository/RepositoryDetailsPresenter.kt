package client.yalantis.com.githubclient.flow.repository

import com.example.youngjung.kotiln_example.api.GeneralErrorHandler
import com.example.youngjung.kotiln_example.manager.ApiManager
import com.example.youngjung.kotiln_example.ui.base.basePresenterlmpl
import rx.functions.Action1

/**
 * Created by Alexey on 07.10.2016.
 */
class RepositoryDetailsPresenter : basePresenterlmpl<RepositoryDetailsContract.View>(),
        RepositoryDetailsContract.Presenter {

    companion object {
        private const val ORGANIZATION_NAME = "Yalantis"
    }

    override fun loadRepository(name: String) {
        ApiManager.loadRepository(ORGANIZATION_NAME, name)
                .subscribe(Action1 { mView?.showRepository(it) },
                        GeneralErrorHandler(mView, true,
                                { throwable, errorBody, isNetwork -> mView?.showReloadButton() }))
    }
}