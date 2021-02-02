package com.example.turkcellkampus.ui.connect

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.turkcellkampus.R
import com.example.turkcellkampus.base.BaseFragment

class ConnectFragment : BaseFragment() {

    private lateinit var connectViewModel: ConnectViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        connectViewModel =
                ViewModelProvider(this).get(ConnectViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_connect, container, false)
        return root
    }
}