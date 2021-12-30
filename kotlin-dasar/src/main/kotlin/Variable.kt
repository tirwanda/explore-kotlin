const val APPLICATION = "Kotlin Dasar"
const val VERSION = "0.0.1"

fun main() {
    var name: String = "Edho"
    name = "dwi"

    val age = 24
    val firstName: String? = null

    println(name)
    println(age)
    println(firstName?.length)
    println("$APPLICATION : $VERSION")
}