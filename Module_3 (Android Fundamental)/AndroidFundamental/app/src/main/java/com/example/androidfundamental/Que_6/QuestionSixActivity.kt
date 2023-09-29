package com.example.androidfundamental.Que_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidfundamental.databinding.ActivityQuestionSixBinding

class QuestionSixActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuestionSixBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionSixBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvQuestion.text = "Que : What is R.java file?"

        binding.tvAnswer.text = "Ans :- \n" +
                "->Android R.java is an auto-generated file by aapt (Android Asset Packaging Tool) that contains resource IDs for all the resources of res/ directory.\n\n" +
                "-> If you create any component in the activity_main.xml file, id for the corresponding component is automatically created in this file.\n\n" +
                "-> This id can be used in the activity source file to perform any action on the component."

    }
}
