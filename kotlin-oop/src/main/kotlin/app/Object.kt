package app

import data.Person

fun main() {
    val edho = Person()
    val dwi = Person()
    val tirwanda = Person()

    edho.firstName = "Edho"
    dwi.firstName = "Dwi"
    tirwanda.firstName = "Tirwanda"

    println(edho.firstName)
    println(dwi.firstName)
    println(tirwanda.firstName)
}