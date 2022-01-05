package app

import data.Product

fun main() {
    val bag = Product("Bag", 20000, "Accessorise")
    val shoes = bag.copy(name = "Shoes")
    println(bag.toString())
    println(shoes.toString())
}