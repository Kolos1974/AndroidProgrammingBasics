package com.example.kotlinobjectorienteddemo

// class Car constructor(var plateNumber :String){

// Nem kötelező kiírni a constructor kulcsszót
// class Car (var plateNumber :String){
open class Car (var plateNumber :String){

    var upperPlateNumber: String=""
        get(){
            return "$field hello"
        }
        // set(value : String){
        set(value){
            // field = "DEMO $value"
            field = " $value"
        }

    var engineNum = 0

    init {
        // Depricated:
        // upperPlateNumber = plateNumber.toUpperCase()

        upperPlateNumber = plateNumber.uppercase()
    }

    // class Engine {
    inner class Engine {
        fun startEngine() {
            engineNum++

            showPlateNumber()
            this@Car.showPlateNumber()
        }
    }

    constructor(aPlate: String, engineNum: Int) :this(aPlate){
        this.engineNum = engineNum
    }

    fun showPlateNumber() : String {
        return upperPlateNumber
    }

   open fun showPlateAndEngine() : String {
        return "$upperPlateNumber, $engineNum"
    }

    fun showConstructorParams() : String {
        return "$plateNumber"
    }
}