package com.zarinpal.test.presentation.repositories

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.zarinpal.test.R
import com.zarinpal.test.databinding.ItemRepositoryBinding
import com.zarinpal.test.domain.models.SingleRepositoryModel

class RepositoriesAdapter(
    private val list: List<SingleRepositoryModel>,
) :
    RecyclerView.Adapter<RepositoriesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        ItemRepositoryBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindTo(list[position])
    }

    override fun getItemCount() = list.size

    inner class ViewHolder(private val view: ItemRepositoryBinding) :
        RecyclerView.ViewHolder(view.root) {
        init {
        }

        fun bindTo(singleRepositoryModel: SingleRepositoryModel) {
            with(view) {
                singleRepositoryModel.apply {
                    tvRow.text = name
                    imgRow.load(image) {
                        crossfade(true)
                        placeholder(R.drawable.ic_baseline_filter_hdr_24)
                    }
                }
            }
        }
    }
}