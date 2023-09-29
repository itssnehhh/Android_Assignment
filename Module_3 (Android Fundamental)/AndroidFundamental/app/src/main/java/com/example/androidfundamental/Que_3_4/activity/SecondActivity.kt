package com.example.androidfundamental.Que_3_4.activity

import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfundamental.Que_3_4.model.User
import com.example.androidfundamental.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var user = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra("USER", User::class.java)
        } else {
            intent.getParcelableExtra("USER")
        }
            user?.let {
                binding.tvResult.text="""
           name : ${it.name}
            email : ${it.emailId}
            age : ${it.age}
        """.trimIndent()

            }


    }
}