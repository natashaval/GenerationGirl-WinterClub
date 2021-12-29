package com.example.generationgirl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FirstActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_first)

    val buttonFirst = findViewById<Button>(R.id.buttonFirst)
    val editTextFirstName = findViewById<TextView>(R.id.editTextFirstName)
    val buttonProfile = findViewById<Button>(R.id.buttonProfile)

    buttonFirst.setOnClickListener {
      val intent = Intent(this, SecondActivity::class.java)
      intent.putExtra("firstName", editTextFirstName.text.toString())
      startActivity(intent)
    }

    buttonProfile.setOnClickListener {
      val intent = Intent(this, ProfileActivity::class.java)
      startActivity(intent)
    }
  }
}