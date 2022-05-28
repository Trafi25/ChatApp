package com.example.chatapp.view.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup



open class InitFragment(val frag: Int) : Fragment() {

    private lateinit var mainView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainView=inflater.inflate(frag, container, false)
        return mainView
       }

    override fun onStart() {
        super.onStart()

    }



}