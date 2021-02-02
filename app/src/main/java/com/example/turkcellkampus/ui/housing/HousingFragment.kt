package com.example.turkcellkampus.ui.housing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.turkcellkampus.R
import com.example.turkcellkampus.base.BaseFragment

class HousingFragment : BaseFragment() {

    private lateinit var housingViewModel: HousingViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        housingViewModel =
                ViewModelProvider(this).get(HousingViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_housing, container, false)
        return root
    }
}