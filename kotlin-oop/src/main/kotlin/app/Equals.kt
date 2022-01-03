package app

import data.Company

fun main() {
    val company1 = Company("Tirwanda-Tech")
    val company2 = Company("Tirwanda-Tech")

    println(company1.equals(company2))
}