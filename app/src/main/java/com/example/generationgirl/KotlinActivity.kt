package com.example.generationgirl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class KotlinActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_kotlin)

    val name: String? = null
    val textKotlin = findViewById<TextView>(R.id.textKotlin)
    textKotlin.text = name?.lowercase()
  }
}