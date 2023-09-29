package com.example.androidfundamental.Que_9.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidfundamental.Que_9.Fragment.FirstFragment
import com.example.androidfundamental.R
import com.example.androidfundamental.databinding.ActivityFirst2Binding

class FirstActivity : AppCompatActivity() {
    private lateinit var binding : ActivityFirst2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirst2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFragment.setOnClickListener {

            var firstFragment = FirstFragment()

            var manager = supportFragmentManager
            var transaction = manager.beginTransaction()
            transaction.add(R.id.fragmentContainer,firstFragment)
            transaction.commit()
        }
    }
}