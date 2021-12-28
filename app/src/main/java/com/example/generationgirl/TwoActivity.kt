package com.example.generationgirl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class TwoActivity : AppCompatActivity() {
  private val TAG = "TwoActivity"

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_two)

    val buttonClick = findViewById<Button>(R.id.buttonClick)

    buttonClick.setOnClickListener {
      Toast.makeText(this, "Hi Rookies!", Toast.LENGTH_SHORT).show()
    }

    val buttonChangeName = findViewById<Button>(R.id.buttonChangeName)
    val editName = findViewById<EditText>(R.id.editTextName)
    val textName = findViewById<TextView>(R.id.textName)
    buttonChangeName.setOnClickListener {
      textName.text = editName.text
    }
  }
}