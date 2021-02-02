package com.example.turkcellkampus.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.findNavController
import com.example.turkcellkampus.R
import com.example.turkcellkampus.base.BaseFragment

class LoginFragment : BaseFragment() {

    private lateinit var loginVievModel: LoginVievModel
    var button : Button? = null
    var login_layout : ConstraintLayout? = null
    var signup_layout : ConstraintLayout? = null
    var turkcell_text : TextView? = null
    var signup_btn : Button? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        button = view.findViewById(R.id.button)
        login_layout = view.findViewById(R.id.verification_layout)
        signup_layout = view.findViewById(R.id.signup_layout)
        turkcell_text = view.findViewById(R.id.turkcell_text)
        signup_btn = view.findViewById(R.id.signup_btn)
        button?.setOnClickListener {
            login_layout?.visibility = View.INVISIBLE
            turkcell_text?.visibility = View.INVISIBLE
            signup_layout?.visibility = View.VISIBLE
            signup_btn?.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_nav_home)
            }

        }
        return view
    }
}