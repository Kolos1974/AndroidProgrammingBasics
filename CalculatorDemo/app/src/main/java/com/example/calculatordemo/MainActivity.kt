package com.example.calculatordemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatordemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val numA = binding.etNumA.text.toString().toInt()
        //val numB = binding.etNumB.text.toString().toInt()

        //binding.tvResult.text = "Result: ${numA+numB}"
    }
}