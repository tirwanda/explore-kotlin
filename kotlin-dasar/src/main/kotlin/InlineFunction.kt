inline fun hello(name: () -> String): String {
    return "Hello, ${name()}"
}

inline fun sayHello(firstName: () -> String, noinline lastName: () -> String): String {
    return "hello, ${firstName()} ${lastName()}"
}

fun main() {
    println(hello { "Edho" })
    println(sayHello({ "Edho" }, { "Dwi" }))
}