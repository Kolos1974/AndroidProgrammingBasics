package com.example.kotlinobjectorienteddemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.kotlinobjectorienteddemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // var myCar = Car( "abc-123", 12245)

        // Meg lehet adni a propertik neveit is
        var myCar = Car( aPlate = "abc-123", engineNum = 12245)

        // var myEngine = Car.Engine()
        var myEngine = Car("a").Engine()
        myEngine.startEngine()

        // println(myCar.showPlateNumber())
        println(myCar.showPlateAndEngine())

        binding.tvData.szinallitas()
    }

    fun TextView.szinallitas() {
        
    }
}