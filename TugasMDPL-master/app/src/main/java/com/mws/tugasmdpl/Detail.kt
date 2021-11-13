package com.mws.tugasmdpl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Detail : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnTambah : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        btnTambah = findViewById(R.id.btn_tambah)
        btnTambah.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent = Intent(this, Pembayaran :: class.java)
        startActivity(intent)
    }
}