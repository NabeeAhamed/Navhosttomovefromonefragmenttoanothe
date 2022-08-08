package com.nabeel.navhosttomovefromonefragmenttoanothe.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.nabeel.navhosttomovefromonefragmenttoanothe.R

class Fragmentone : Fragment() {

    private lateinit var btnNavigate1 : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
       val view: View = inflater.inflate(R.layout.fragment_fragmentone, container, false)

        btnNavigate1 = view.findViewById(R.id.btnNavigate1)

        btnNavigate1.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentone_to_fragmenttwo)
        }
        return view;
        }
    }

