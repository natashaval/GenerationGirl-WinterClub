package com.example.generationgirl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListActivity : AppCompatActivity() {
  private val months = listOf(
    "January", "February", "March", "April", "May", "June", "July", "August", "September",
    "October", "November", "December"
  )

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_list)

    val listView = findViewById<ListView>(R.id.lv_months)
    val monthAdapter = ArrayAdapter<String>(this, R.layout.item_month, months)
    listView.adapter = monthAdapter

    listView.setOnItemClickListener { parent, view, position, id ->
      Toast.makeText(this, "This row $id is ${months[position]}", Toast.LENGTH_SHORT).show()
    }
  }
}