fun main() {
    fun sayHello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }
    var anonymousUpper = fun(value: String): String {
        if (value == "") {
            return "value is null"
        } else {
            return value.toUpperCase()
        }
    }

    println(sayHello("edho", anonymousUpper))
}