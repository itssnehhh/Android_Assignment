package com.example.androidfundamental.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidfundamental.Que_1.HelloWorldActivity
import com.example.androidfundamental.Que_2.ChangeBackgroundActivity
import com.example.androidfundamental.Que_3_4.activity.FirstActivity
import com.example.androidfundamental.Que_5.LoginActivity
import com.example.androidfundamental.Que_6.QuestionSixActivity
import com.example.androidfundamental.Que_7.LifeCycleActivity
import com.example.androidfundamental.Que_8.FragmentActivity
import com.example.androidfundamental.databinding.QuestionListLayoutBinding
import com.example.androidfundamental.model.Question

class QuestionListAdapter(var context: Context, private var questionList : MutableList<Question>) :
    RecyclerView.Adapter<QuestionListAdapter.MyViewHolder>(){
    class MyViewHolder(var binding: QuestionListLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var binding = QuestionListLayoutBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return questionList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var question = questionList[position]

        holder.binding.tvQuestion.text = question.question

        holder.binding.tvQuestion.setOnClickListener {
            when(question.id){
                1 -> context.startActivity(Intent(context, HelloWorldActivity::class.java))
                2 -> context.startActivity(Intent(context, ChangeBackgroundActivity::class.java))
                3 -> context.startActivity(Intent(context, FirstActivity::class.java))
                4 -> context.startActivity(Intent(context, FirstActivity::class.java))
                5 -> context.startActivity(Intent(context, LoginActivity::class.java))
                6 -> context.startActivity(Intent(context, QuestionSixActivity::class.java))
                7 -> context.startActivity(Intent(context, LifeCycleActivity::class.java))
                8 -> context.startActivity(Intent(context, FragmentActivity::class.java))
                9 -> context.startActivity(Intent(context, com.example.androidfundamental.Que_9.Activity.FirstActivity::class.java))
            }
        }}


}