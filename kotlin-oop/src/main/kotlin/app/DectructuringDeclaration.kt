package app

import data.Game
import data.Login
import data.MinMax

fun minMax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}

fun main() {
    val game = Game("ML", 10000)
//    val name = game.name
//    val price = game.price

    val (name, price) = game
    println(name)
    println(price)

    val (min, max) = minMax(10, 100)
    println("value of min is $min")
    println("value of min is $max")

    val login = Login("Edho", "password")
//    login(login) {
//        login -> login.username == "Edho" && login.password == "password"
//    }

    login(login) {
        (username, password) -> username == "Edho" && password == "password"
    }
}