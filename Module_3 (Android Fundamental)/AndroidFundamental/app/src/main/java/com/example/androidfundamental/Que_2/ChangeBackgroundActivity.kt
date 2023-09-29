package com.example.androidfundamental.Que_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.androidfundamental.R
import com.example.androidfundamental.databinding.ActivityChangeBackgroundBinding

class ChangeBackgroundActivity : AppCompatActivity() {

    private lateinit var binding : ActivityChangeBackgroundBinding

    private var colorList = mutableListOf<Int>(R.color.red, R.color.black, R.color.blue, R.color.white)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangeBackgroundBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.layoutMain.setBackgroundColor(ContextCompat.getColor(this,getRandomColor()))
        }
    }

    private fun getRandomColor(): Int {
        return colorList.shuffled().last()
    }
}