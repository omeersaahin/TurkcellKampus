package com.example.turkcellkampus.ui.refectory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.turkcellkampus.R
import com.example.turkcellkampus.base.BaseFragment

class RefectoryFragment : BaseFragment() {

    private lateinit var refectoryViewModel: RefectoryViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        refectoryViewModel =
                ViewModelProvider(this).get(RefectoryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_refectory, container, false)
        return root
    }
}