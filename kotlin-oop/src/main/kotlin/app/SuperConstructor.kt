package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val customer1 = PremiumCustomer("Edho")
    val customer2 = ExecutiveCustomer("Dwi")

    println(customer1.type)
    println(customer2.type)
}