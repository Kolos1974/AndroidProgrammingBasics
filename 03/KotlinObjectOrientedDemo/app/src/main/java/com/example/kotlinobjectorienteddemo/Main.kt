package com.example.kotlinobjectorienteddemo

import com.example.kotlinobjectorienteddemo.Loadable

fun main(args: Array<String>) {
    var myCar = Car( aPlate = "abc-123", engineNum = 12245)

    println(myCar.showPlateAndEngine())

    var myShip = Ship("VitrolásGyár")

    myShip.showManufacturer()
    myShip.startVehicle()

    myShip.load()


    var myProfile = Person("Péter", 1984)


    // var (name, year) = myProfile

    var name = myProfile.component1()
    var year = myProfile.component2()

    println("$name, $year")

    loadingDemo(object : Loadable{
        override fun load() {
            // ..
        }
    })

    var data = object {
        var a = 5
        var b = 3

        fun demo(){

        }
    }

    data.demo()

    ElectricCar.CHARGEABLE = false
    ElectricCar.demo()
}

fun loadingDemo(item : Loadable){

}