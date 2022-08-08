package com.nabeel.navhosttomovefromonefragmenttoanothe.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.nabeel.navhosttomovefromonefragmenttoanothe.R


class Fragmenttwo : Fragment() {

    private lateinit var btnNavigate2 : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
      val view: View =  inflater.inflate(R.layout.fragment_fragmenttwo, container, false)

        btnNavigate2 =view.findViewById(R.id.btnNavigate2)

        btnNavigate2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentone_to_fragmenttwo)

        }

        return view;
    }


}