package com.example.davaleba3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val firstfragment = home()
        val fm: FragmentManager = supportFragmentManager
        fm.beginTransaction().add(R.id.mainlayout, firstfragment).commit()
    }
}