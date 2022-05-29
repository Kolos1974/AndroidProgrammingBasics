package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener{

            try {
                var numFirst: Long = 0
                var numSecond: Long = 0

                if (binding.firstNum.text.isNotEmpty()) {
                    numFirst = binding.firstNum.text.toString().toLong()
                }

                if (binding.secondNum.text.isNotEmpty()) {
                    numSecond = binding.secondNum.text.toString().toLong()
                }

                // binding.tvResult.text = "Result: ${numFirst + numSecond}"
                binding.tvResult.text = getString(R.string.text_result, numFirst + numSecond)

            } catch (e: Exception) {
                // binding.tvResult.text = "Error, the number is too large: ${e.message}"
                binding.tvResult.text = getString(R.string.error_add, e.message)
            }
        }


        binding.btnMinus.setOnClickListener{

            try {
                var numFirst: Long = 0
                var numSecond: Long = 0

                if (binding.firstNum.text.isNotEmpty()) {
                    numFirst = binding.firstNum.text.toString().toLong()
                }

                if (binding.secondNum.text.isNotEmpty()) {
                    numSecond = binding.secondNum.text.toString().toLong()
                }

                // binding.tvResult.text = "Result: ${numFirst + numSecond}"
                binding.tvResult.text = getString(R.string.text_result, numFirst - numSecond)

            } catch (e: Exception) {
                // binding.tvResult.text = "Error, the number is too large: ${e.message}"
                binding.tvResult.text = getString(R.string.error_add, e.message)
            }
        }

        binding.btnClear.setOnClickListener(){
            clearValues(binding)
        }



    }

    fun clearValues(binding : ActivityMainBinding){
        binding.firstNum.text.clear()
        binding.secondNum.text.clear()
        binding.tvResult.text = ""
    }


}