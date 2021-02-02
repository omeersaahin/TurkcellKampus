package com.example.turkcellkampus.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(){

//    @LayoutRes
//    abstract fun getLayoutRes(): Int
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(getLayoutRes())
//    }

    override fun onPause() {
        super.onPause()
    }
}