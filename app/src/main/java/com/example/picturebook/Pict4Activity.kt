package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pict4Activity : AppCompatActivity() {
    lateinit var btnPrevious2:Button
    lateinit var btnNext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pict4)

        btnPrevious2=findViewById(R.id.btnPrevious2)
        btnPrevious2.setOnClickListener {
            var intent = Intent(this,picActivity3::class.java)
            startActivity(intent)
        }
        btnNext2 =findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
            var intent= Intent(this,Pict4Activity::class.java)
            startActivity(intent)

        }

}



    }

