package com.example.pres.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.pres.R
import com.example.pres.viewmodel.SwipeFragmentViewModel

class SwipeFragment(private val viewModelFactory: ViewModelProvider.Factory) : Fragment() {

    private val viewModel: SwipeFragmentViewModel by viewModels { viewModelFactory }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_swipe, null)
    }

}