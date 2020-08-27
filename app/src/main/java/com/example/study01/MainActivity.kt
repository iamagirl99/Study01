package com.example.study01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_sunny.setOnClickListener {
            //button 을 클릭했을때 텍스트뷰(textView)의 텍스트를 변경한다
            text.text = "맑음"
            imageView.setImageResource(R.drawable.sunny02)
        }

        btn_cloudy.setOnClickListener {
            //button 을 클릭했을때 텍스트뷰(textView)의 텍스트를 변경한다
            text.text = "흐림"
            imageView.setImageResource(R.drawable.cloudy03)
        }

        btn_rainy.setOnClickListener {
            //button 을 클릭했을때 텍스트뷰(textView)의 텍스트를 변경한다
            text.text = "비"
            imageView.setImageResource(R.drawable.rainy04)
        }
    }
}