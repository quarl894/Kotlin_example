package com.example.youngjung.kotiln_example.ui.repository_List

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import client.yalantis.com.githubclient.model.Repository
import com.example.youngjung.kotiln_example.R
import com.example.youngjung.kotiln_example.R.id.text_view_description
import com.example.youngjung.kotiln_example.R.id.text_view_title
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_repository.*


class RepositoriesAdapter(private val repositories: MutableList<Repository>,
                          private val onClick: (Repository) -> Unit)
    : RecyclerView.Adapter<RepositoriesAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(repositories[position])
    }

    override fun getItemCount(): Int = repositories.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return LayoutInflater.from(parent.context)
                .inflate(R.layout.item_repository, parent, false).let {
                    ViewHolder(it, onClick)
                }
    }

    class ViewHolder(override val containerView: View, private val onClick: (Repository) -> Unit) : RecyclerView.ViewHolder(containerView), LayoutContainer {

        fun bindData(repository: Repository) {
            with(repository) {
                text_view_title.text = name
                text_view_description.text = description
                containerView.setOnClickListener { onClick(this) }
            }
        }
    }


    fun addRepositories(newRepositories: List<Repository>) {
        repositories.addAll(newRepositories)
    }
}