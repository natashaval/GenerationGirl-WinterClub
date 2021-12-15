package com.example.generationgirl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val button = findViewById<Button>(R.id.bt_hello)
    button.setOnClickListener {
      Toast.makeText(this, "This is my Toast message!", Toast.LENGTH_LONG).show()
    }
  }
}