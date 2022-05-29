package com.example.calculatordemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatordemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSum.setOnClickListener {

            try {
                // var numA: Long  = 0
                var numA = 0
                var numB = 0

                if (binding.etNumA.text.isNotEmpty()) {
                    numA = binding.etNumA.text.toString().toInt()
                }

                if (binding.etNumB.text.isNotEmpty()) {
                    numB = binding.etNumB.text.toString().toInt()
                }

                // binding.tvResult.text = "Result: ${numA + numB}"
                binding.tvResult.text = getString(R.string.text_result, numA + numB)

                /*
                if (binding.etNumA.text.isNotEmpty()) {
                    if (binding.etNumB.text.isNotEmpty()) {
                        val numA = binding.etNumA.text.toString().toInt()
                        val numB = binding.etNumB.text.toString().toInt()
                        binding.tvResult.text = "Result: ${numA + numB}"
                    } else {
                        binding.etNumB.error = "Hiba"
                    }
                } else {
                    binding.etNumA.error = "Hiba"
                }
                */
            } catch (e: Exception) {
                binding.tvResult.text = "Error, the number is too large: ${e.message}"
            }

        }
    }
}