package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnandroid= findViewById<Button>(R.id.btnandroid)
        val btnkotlin=findViewById<Button>(R.id.btnkotlin)

        btnandroid.setOnClickListener {
          val  intent = Intent(this, AndroidAct::class.java)
            startActivity(intent) }
        btnkotlin.setOnClickListener {
            val intent = Intent(this, KotlinAct::class.java)
            startActivity(intent)  }
    }
}
