package com.example.generationgirl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.get

class ListActivity : AppCompatActivity() {
  // move the monthList before onCreate so the variable can be accessed everywhere
  val monthList = mutableListOf<String>("January", "February", "March", "April", "May", "June",
    "July")

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_list)

    // always write all findViewById under setContentView!
    val editTextName = findViewById<EditText>(R.id.editTextName)
    val buttonClick = findViewById<Button>(R.id.buttonClick)
    val listViewMonth = findViewById<ListView>(R.id.listViewMonth)

    /*
    create Array Adapter, with 4 parameters:
    1. context -> use this
    2. resource -> the layout of your item (item_month.xml)
    3. textView -> the id of your text view in item layout
    4. list -> list or mutablelist available
     */
    val monthAdapter = ArrayAdapter<String>(this, R.layout.item_month, R.id.textViewMonth, monthList)
    listViewMonth.adapter = monthAdapter

    // to click on each of the item in list view
    listViewMonth.setOnItemClickListener { parent, view, position, id ->
      Toast.makeText(this, "This row $position is ${monthList[position]}", Toast.LENGTH_SHORT).show()
    }

    // When we click on the button, the text in EditText is added in the listView
    buttonClick.setOnClickListener {
      val name = editTextName.text.toString()

      // add the editText to monthList
      monthList.add(name)
      // notify the adapter that a data is added in the mutableList
      monthAdapter.notifyDataSetChanged()
    }
  }
}