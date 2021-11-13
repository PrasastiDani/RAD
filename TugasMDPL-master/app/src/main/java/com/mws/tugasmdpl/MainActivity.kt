package com.mws.tugasmdpl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnSignIn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSignIn = findViewById(R.id.btnSignIn)
        btnSignIn.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        val intent = Intent(this, Dashboard :: class.java)
        startActivity(intent)
    }
}