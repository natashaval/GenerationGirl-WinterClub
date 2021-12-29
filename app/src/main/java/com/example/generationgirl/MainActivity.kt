package com.example.generationgirl

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

    val viewButton = findViewById<Button>(R.id.bt_view)
    viewButton.setOnClickListener {
      val intent = Intent(this, ViewActivity::class.java)
      startActivity(intent)
    }

    val listButton = findViewById<Button>(R.id.bt_list)
    listButton.setOnClickListener {
      startActivity(Intent(this, TwoActivity::class.java))
    }

    val textWeb = findViewById<TextView>(R.id.tv_web)
    textWeb.setOnClickListener {
      startActivity(Intent(Intent.ACTION_VIEW,
        Uri.parse("https://www.generationgirl.org/home-english")))
    }

    val textEmail = findViewById<TextView>(R.id.tv_email)
    textEmail.setOnClickListener {
      val sendIntent = Intent(Intent.ACTION_SENDTO).apply {
        data = Uri.parse("mailto:")
        putExtra(Intent.EXTRA_EMAIL, arrayOf("contactus@generationgirl.org"))
        putExtra(Intent.EXTRA_SUBJECT, "Generation Girl Winter Club 2021")
        putExtra(Intent.EXTRA_TEXT,
          "Hi GenG team, I am very grateful that I have the opportunity to attend Winter Club 2021 :)")
      }
      if (intent.resolveActivity(packageManager) != null) {
        startActivity(sendIntent)
      } else {
        Log.e("MainActivity", "Failed to launch intent")
      }
    }
  }
}