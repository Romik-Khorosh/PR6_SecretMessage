package com.hfad.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class WelcomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)
        val startButton = view.findViewById<Button>(R.id.start)
        startButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_blankFragment_to_messageFragment)
        }
        return view
    }
}