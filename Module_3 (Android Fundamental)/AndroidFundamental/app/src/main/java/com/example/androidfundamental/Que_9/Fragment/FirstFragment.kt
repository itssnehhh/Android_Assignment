package com.example.androidfundamental.Que_9.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidfundamental.Que_9.Activity.FirstActivity
import com.example.androidfundamental.R
import com.example.androidfundamental.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentFirstBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment

        binding.btnActivity.setOnClickListener {
            startActivity(Intent(context,FirstActivity::class.java))
        }

        return binding.root
    }


}