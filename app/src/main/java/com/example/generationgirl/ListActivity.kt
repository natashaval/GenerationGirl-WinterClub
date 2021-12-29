package com.example.generationgirl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.get

class ListActivity : AppCompatActivity() {
  val monthList = mutableListOf<String>("January", "February", "March", "April", "May", "June",
    "July")

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_list)

    val editTextName = findViewById<EditText>(R.id.editTextName)
    val buttonClick = findViewById<Button>(R.id.buttonClick)

    val listViewMonth = findViewById<ListView>(R.id.listViewMonth)
    val monthAdapter = ArrayAdapter<String>(this, R.layout.item_month, R.id.textViewMonth, monthList)
    listViewMonth.adapter = monthAdapter

    listViewMonth.setOnItemClickListener { parent, view, position, id ->
      Toast.makeText(this, "This row $position is ${monthList[position]}", Toast.LENGTH_SHORT).show()
    }

    buttonClick.setOnClickListener {
      val name = editTextName.text.toString()
      monthList.add(name)
      monthAdapter.notifyDataSetChanged()
    }
  }
}