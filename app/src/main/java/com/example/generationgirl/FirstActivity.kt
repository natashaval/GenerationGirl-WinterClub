package com.example.generationgirl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_first)

    val buttonFirst = findViewById<Button>(R.id.buttonFirst)
    buttonFirst.setOnClickListener {
      val intent = Intent(this, SecondActivity::class.java)
      startActivity(intent)
    }
  }
}