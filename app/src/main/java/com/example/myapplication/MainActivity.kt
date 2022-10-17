package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.FirstText.text = binding.FirstText.context.getText(R.string.testText)
        binding.SecondText.text = "Buy Igor"



        binding.imageButton.setOnClickListener {
            if (count == 5){
                count = 0
                binding.FirstButton.visibility = View.VISIBLE
            } else{
                count++
            }


            binding.FirstText.text = count.toString()
        }

        binding.FirstButton.setOnClickListener{
            binding.imageButton.isEnabled = false
        }
    }
}