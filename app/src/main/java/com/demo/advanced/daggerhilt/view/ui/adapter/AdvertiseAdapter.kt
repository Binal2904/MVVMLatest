package com.demo.advanced.daggerhilt.view.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.demo.advanced.daggerhilt.BR
import com.demo.advanced.daggerhilt.R
import com.demo.advanced.daggerhilt.data.response.weather.SubCategory

class AdvertiseAdapter(private var items: ArrayList<SubCategory>) :
    RecyclerView.Adapter<AdvertiseAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ViewDataBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.weather_list_item, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])

    override fun getItemCount() = items.size


    class ViewHolder(private val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: SubCategory) = with(binding.root) {
            binding.setVariable(BR.viewModel, item)
            binding.executePendingBindings()
        }
    }
}