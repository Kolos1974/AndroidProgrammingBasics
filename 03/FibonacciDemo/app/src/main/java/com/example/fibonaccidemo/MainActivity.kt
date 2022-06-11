package com.example.fibonaccidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fibonaccidemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShow.setOnClickListener(){
            if (!binding.etLength.text.isEmpty()){
                var n = binding.etLength.text.toString().toInt()
                fibonacci(n)
            } else {
                binding.etLength.error = "Ez a mező nem lehet üres!"
            }
        }
    }

    fun fibonacci(n: Int = 10){
        var t1 = 0
        var t2 = 1
        var i = 1

        binding.tvResult.text = ""


        var sum2 = 0

        while (i <= n){
            binding.tvResult.append("$t1 ")

            /*
            val sum = t1 + t2
            t1 = t2
            t2 = sum
            */

            sum2 = t1 + t2
            t1 = t2
            t2 = sum2

            i++
        }

    }

}