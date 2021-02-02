package com.example.turkcellkampus.ui.flow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.turkcellkampus.R
import com.example.turkcellkampus.base.BaseFragment

class FlowFragment : BaseFragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_flow, container, false)
        return view
    }
}