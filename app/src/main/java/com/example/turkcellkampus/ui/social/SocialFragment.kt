package com.example.turkcellkampus.ui.social

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.turkcellkampus.R
import com.example.turkcellkampus.base.BaseFragment

class SocialFragment : BaseFragment() {

    private lateinit var socialViewModel: SocialViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        socialViewModel =
                ViewModelProvider(this).get(SocialViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_social, container, false)
        return root
    }
}