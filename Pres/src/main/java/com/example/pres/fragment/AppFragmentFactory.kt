package com.example.pres.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class AppFragmentFactory
@Inject
constructor(private val viewModelFactory: ViewModelProvider.Factory) : FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        when (className) {
            SwipeFragment::class.java.name -> return SwipeFragment(viewModelFactory)
        }
        return super.instantiate(classLoader, className)
    }
}