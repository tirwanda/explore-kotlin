package app

import data.Address

fun main() {
    val fullAddress = Address("Jalan Perintis", "Bekasi", "Indonesia")
    val shortAddress = Address("Bekasi", "Indonesia")

    println(fullAddress.street)
    println(shortAddress.city)
}