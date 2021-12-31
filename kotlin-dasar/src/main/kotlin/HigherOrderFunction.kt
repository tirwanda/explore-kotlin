fun main() {
    fun sayHello(name: String, transform: (String) -> String): String {
        val nameTransform = transform(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper = {value: String -> value.toUpperCase()}
    println(sayHello("Edho", lambdaUpper))
    println(sayHello("Dwi", { value: String -> value.toLowerCase() }))
    println(sayHello("Tirwanda") {value: String -> value.toLowerCase()})
}