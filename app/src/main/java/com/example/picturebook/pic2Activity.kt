package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pic2Activity : AppCompatActivity() {
    lateinit var btnPrevious: Button
    lateinit var btnNext:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic2)

        btnPrevious=findViewById(R.id.btnPrevious)
        btnPrevious.setOnClickListener {
            var intent= Intent(this,MainActivity::class.java)

        }
        btnNext=findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            var intent= Intent(this,picActivity3::class.java)

    }
}
}