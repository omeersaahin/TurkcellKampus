package com.example.turkcellkampus.base

import android.os.Bundle
import androidx.fragment.app.Fragment

open class BaseFragment : Fragment() {
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

    override fun onPause() {
        super.onPause()
    }

}