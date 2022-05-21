package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnAn1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAn1=findViewById(R.id.btnAn1)
        btnAn1.setOnClickListener {
            val intent =Intent(this,pic2Activity::class.java)
            startActivity(intent)
        }


    }
}