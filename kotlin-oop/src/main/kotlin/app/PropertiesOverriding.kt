package app

import data.Rectangle
import data.Shape
import data.Triangle

fun main() {
    val shape1 = Shape()
    val shape2 = Rectangle()
    val shape3 = Triangle()

    println(shape1.corner)
    println(shape2.corner)
    println(shape3.corner)
}