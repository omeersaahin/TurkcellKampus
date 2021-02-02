package com.example.turkcellkampus.ui.splash

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.example.turkcellkampus.R
import com.example.turkcellkampus.base.BaseFragment


class SplashFragment : BaseFragment(){

    private var mHandler = Handler()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity?)!!.supportActionBar!!.setDisplayShowTitleEnabled(false)
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mHandler.postDelayed({
            findNavController().navigate(R.id.action_splashFragment_to_nav_home)
        }, 2000)
    }

    override fun onPause() {
        super.onPause()
        mHandler.removeMessages(2000)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mHandler.removeCallbacksAndMessages(2000)
    }
}