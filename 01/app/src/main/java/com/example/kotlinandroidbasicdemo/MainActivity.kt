package com.example.kotlinandroidbasicdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.kotlinandroidbasicdemo.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)

        /*
        btnDemo.setOnClickListener{
            tvData.text="Működik!"
        }
        */

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvData.text = Date(System.currentTimeMillis()).toString()

        // Régi módszer szerint:
        /*
        val tvData = findViewById<TextView>(R.id.tvData)
        tvData.text = Date(System.currentTimeMillis()).toString()
         */



        // btnDemo.setOnClickListener(::demoClick)

        binding.btnDemo.setOnClickListener(::demoClick)
    }

    fun demoClick(view: View) {
        binding.tvData.text="Működik: ${Date(System.currentTimeMillis()).toString()}"
    }

}