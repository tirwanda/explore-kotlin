package app

import data.Rectangle
import data.Triangle

fun printObject(any: Any) {
    if (any is Triangle) {
        println("Triangle have ${any.corner} corner")
    } else if (any is Rectangle) {
        println("Rectangle have ${any.corner} corner")
    } else {
        println(any)
    }
}

fun printObjectWithWhen(any: Any) {
    when (any) {
        is Triangle -> println("Triangle have ${any.corner} corner")
        is Rectangle -> println("Rectangle have ${any.corner} corner")
        else -> println(any)
    }
}

fun printString(any: Any) {
    val value = any as String
    println(value)
}

fun printStringSafe(any: Any) {
    val value: String? = any as? String
    println(value)
}

fun main() {
    printObject(Triangle())
    printObjectWithWhen(Rectangle())

    printString("Edho")
    // printString(24) // Error
    printStringSafe(24)
}