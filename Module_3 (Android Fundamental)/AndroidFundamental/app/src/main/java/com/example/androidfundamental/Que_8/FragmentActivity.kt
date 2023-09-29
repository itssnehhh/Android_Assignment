package com.example.androidfundamental.Que_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidfundamental.R
import com.example.androidfundamental.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {

    private lateinit var binding : ActivityFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvQuestion.text = "Que. What is fragment and fragment lifecycle ?"
        binding.tvAnswer.text = " Ans. \n\n ->  A Fragment is a modular section of an activity that has its own lifecycle and can be added or removed from an activity while it’s running. \n\n" +
                "->  Each Fragment instance has its own lifecycle, which transitions through various states as it is added, removed, and enters or exits the screen.\n\n" +
                "->  The Fragment class includes callback methods that correspond to each of the changes in a fragment’s lifecycle.\n\n" +
                "->  These include onCreate(), onStart(), onResume(), onPause(), onStop(), and onDestroy(). "
    }
}



