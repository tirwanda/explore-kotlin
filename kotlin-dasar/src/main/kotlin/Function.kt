fun helloWorld(firstName: String, lastName: String) {
    println("Hello $firstName $lastName")
}

// Default Parameter
fun sayHello(firstName: String, lastName: String = "") {
    println("hello $firstName $lastName from default parameter")
}

fun main() {
    helloWorld("Edho", "Dwi")
    sayHello("Edho")
    helloWorld(lastName = "Tirwanda", firstName = "Edho")
}