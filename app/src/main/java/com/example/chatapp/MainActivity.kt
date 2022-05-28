package com.example.chatapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.chatapp.databinding.ActivityMainBinding
import com.example.chatapp.view.Fragments.ChatFragment
import com.example.chatapp.view.details.ChatDrawer

class MainActivity : AppCompatActivity() {

    private lateinit var navBinding: ActivityMainBinding
    private lateinit var navToolbar: Toolbar
    private lateinit var navChatDrawer: ChatDrawer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(navBinding.root)

    }

    override fun onStart() {
        super.onStart()
        navToolbar = navBinding.idToolbar
        navChatDrawer= ChatDrawer(this,navToolbar)
        setSupportActionBar(navToolbar)
        navChatDrawer.createDrawer()
        supportFragmentManager.beginTransaction()
            .replace(R.id.idContainer, ChatFragment()).commit()

    }


}