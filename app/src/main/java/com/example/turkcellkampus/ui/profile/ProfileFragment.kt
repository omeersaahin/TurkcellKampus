package com.example.turkcellkampus.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.turkcellkampus.R
import com.example.turkcellkampus.base.BaseFragment

class ProfileFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_connect, container, false)
        return view
    }
}