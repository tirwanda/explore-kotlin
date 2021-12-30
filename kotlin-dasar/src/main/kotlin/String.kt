fun main() {
    val firstName: String = "Edho"
    val middleName: String = "Dwi"
    val lastName: String = "Tirwanda"

    val nameLength: String = "$firstName length = ${firstName.length}, $middleName length = ${middleName.length}"

    val user: String = """
        Edho Dwi Tirwanda
        Backend Dev
    """.trimIndent()

    println("$firstName $middleName $lastName")
    println(user)
    println(middleName)
}