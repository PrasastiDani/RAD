package com.mws.tugasmdpl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Dashboard : AppCompatActivity(), View.OnClickListener {

    private lateinit var ig_laki_1 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        ig_laki_1 = findViewById(R.id.ig_laki1)
        ig_laki_1.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        val intent = Intent(this, Pembayaran :: class.java)
        startActivity(intent)
    }
}