package com.example.androidfundamental.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidfundamental.Adapter.QuestionListAdapter
import com.example.androidfundamental.databinding.ActivityMainBinding
import com.example.androidfundamental.model.Question

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var questionList = mutableListOf<Question>()

    private lateinit var questionListAdapter: QuestionListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        prepareData()

        questionListAdapter = QuestionListAdapter(this,questionList)
        binding.recyclerView.adapter = questionListAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

    }

    private fun prepareData() {
        questionList.add(Question(1,"1. Create “hello world” application "))
        questionList.add(Question(2,"2. Change screen background color on different button click event "))
        questionList.add(Question(3,"3. Navigate between one screen to another screen "))
        questionList.add(Question(4,"4. Pass data from one screen to second screen "))
        questionList.add(Question(5,"5. Design login and registration screen"))
        questionList.add(Question(6,"6. What is R.java file "))
        questionList.add(Question(7,"7. What is activity and activity lifecycle  "))
        questionList.add(Question(8,"8. What is fragment and fragment lifecycle "))
        questionList.add(Question(9,"9. Activity to fragment and fragment to activity "))
    }
}