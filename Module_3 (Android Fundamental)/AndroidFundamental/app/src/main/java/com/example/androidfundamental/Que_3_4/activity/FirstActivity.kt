package com.example.androidfundamental.Que_3_4.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfundamental.Que_3_4.model.User
import com.example.androidfundamental.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            var name = binding.etName.text.toString().trim()
            var email = binding.etEmail.text.toString().trim()
            var age = if (binding.etAge.text.toString().isNotBlank()) binding.etAge.text.toString()
                .trim() else "0"

            var user = User(name = name, emailId = email, age = age.toInt())

            var intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("USER", user)
            startActivity(intent)
        }
    }
}