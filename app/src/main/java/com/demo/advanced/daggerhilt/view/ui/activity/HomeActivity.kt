package com.demo.advanced.daggerhilt.view.ui.activity

import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.demo.advanced.daggerhilt.databinding.ActivityHomeBinding
import com.demo.advanced.daggerhilt.enum.ApiStatus
import com.demo.advanced.daggerhilt.view.base.BaseActivity
import com.demo.advanced.daggerhilt.view.ui.adapter.AdvertiseAdapter
import com.demo.advanced.daggerhilt.view.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeActivity : BaseActivity<ActivityHomeBinding>() {


    private val mainViewModel: MainViewModel by viewModels()
    var advertiseAdapter: AdvertiseAdapter? = null


    override fun setBinding(layoutInflater: LayoutInflater): ActivityHomeBinding {
        return ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun initView() {
        mainViewModel.fetchPokemons()
        initAdapter()
        setLiveDataListeners()
    }

    private fun initAdapter() {
        advertiseAdapter = AdvertiseAdapter(arrayListOf())
        binding.rvHomeItems.layoutManager = LinearLayoutManager(this)
        binding.rvHomeItems.adapter = advertiseAdapter
    }

    private fun setLiveDataListeners() {
        lifecycleScope.launch {
            mainViewModel.pokemonsState.collect {
                when (it.status) {
                    ApiStatus.SUCCESS -> {
                        it.data?.let { user ->
                        }
                    }

                    ApiStatus.LOADING -> {
                    }

                    ApiStatus.ERROR -> {
                    }
                }
            }
        }
    }


}