package com.example.generationgirl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.generationgirl.databinding.ActivityViewBinding

class ViewActivity : AppCompatActivity() {
  private lateinit var binding: ActivityViewBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityViewBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.btGenerate.setOnClickListener {
      val text = "${binding.tvNumber.text} \n ${binding.etInput.text}"
      binding.tvNumber.text = text
      binding.etInput.text.clear()
    }
  }
}