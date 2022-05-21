package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pic5Activity : AppCompatActivity() {
    lateinit var btnPrevious3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic5)


        btnPrevious3=findViewById(R.id.btnPrevious3)
        btnPrevious3.setOnClickListener {
            val intent = Intent(this,Pict4Activity::class.java)
            startActivity(intent)
    }
}

}
