package com.example.kotlinobjectorienteddemo

class ElectricCar(plateNum: String) : Car(plateNum){

    companion object {
        var CHARGEABLE = true

        fun demo(){

        }
    }

    fun charge(){

    }

    override fun showPlateAndEngine(): String {
        // super.showPlateNumber()
        return "zöld  - elektromotor"
    }
}