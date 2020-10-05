package com.codinginflow.navigationcomponenttutorial

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_welcome.*

class WelcomeFragment : Fragment(R.layout.fragment_welcome) {

    private val args: WelcomeFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        text_view_username.text = args.username
        text_view_password.text = args.password

        button_ok.setOnClickListener {
            val action = WelcomeFragmentDirections.actionWelcomeFragmentToHomeFragment()
            findNavController().navigate(action)
        }
    }
}