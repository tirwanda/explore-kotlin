package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Edho")
    manager.sayHello("Dwi")

    val vicePresident = VicePresident("Dwi")
    vicePresident.sayHello("Edho")
}