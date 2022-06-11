package com.example.kotlinobjectorienteddemo

abstract class Vehicle (var manufacturer: String){

    abstract fun startVehicle()

    fun showManufacturer(){
        println("$manufacturer")
    }
}

interface Loadable {
    fun load()
}

class Ship(var shipManufacturer: String) :  Vehicle(shipManufacturer), Loadable{
    override fun startVehicle() {
        println("Zászkót fel")
    }

    override fun load() {
        println("Feltöltve")
    }

}