package app

import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("Edho")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Dwi")
    baseDelegate.sayGoodbye("Edho")
}