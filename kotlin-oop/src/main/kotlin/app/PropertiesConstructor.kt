package app

import data.User

fun main() {
    val user1 = User("Tirwanda", "password")
    val user2 = User("Dwi", "password")

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}