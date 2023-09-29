package com.example.androidfundamental.Que_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidfundamental.R
import com.example.androidfundamental.databinding.ActivityLifeCycleBinding

class LifeCycleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLifeCycleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLifeCycleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvQuestion.text = "Que. What is activity and activity lifecycle ?"
        binding.tvAnswer.text = "Ans.\n\n ->  In Android, an Activity is a single screen that the user can interact with.\n\n" +
                " ->  The Activity Lifecycle refers to the different states that an activity can be in during its lifetime.\n\n " +
                " ->  The lifecycle of an activity is managed by the system and consists of a series of callbacks that are invoked by the system when certain events occur, such as when the activity is created, resumed, paused, stopped, or destroyed."

    }
}