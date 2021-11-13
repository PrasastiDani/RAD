package com.mws.tugasmdpl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Pembayaran : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnBayar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran)

        btnBayar = findViewById(R.id.btn_bayar)
        btnBayar.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent = Intent(this, PembayaranBerhasil :: class.java)
        startActivity(intent)
    }

}