fun toUpper(value: String): String = value.toUpperCase()

fun main() {
    val lambdaName: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "His name is $firstName $lastName"
        result
    }

    val sayHello: (String) -> String = {
        "Hello, $it"
    }

    val toUpperCase: (String) -> String = ::toUpper

    println(lambdaName("Edho", "Dwi"))
    println(sayHello("Edho"))
    println(toUpperCase("Tirwanda"))
}