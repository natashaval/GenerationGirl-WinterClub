package com.example.generationgirl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_second)

    val buttonSecond = findViewById<Button>(R.id.buttonSecond)
    val buttonClose = findViewById<Button>(R.id.buttonClose)

    buttonSecond.setOnClickListener {
      val intent = Intent(this, FirstActivity::class.java)
      startActivity(intent)
    }

    buttonClose.setOnClickListener {
      finish()
    }
  }
}