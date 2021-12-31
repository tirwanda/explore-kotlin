fun main() {

    fun sayHello(name: String = ""): String {
        return if (name == "") {
            "Hello Bro!"
        } else {
            "Hello $name"
        }
    }

    fun greeting(name: String = ""): String {
        return when(name) {
            "" -> "Good morning bro!"
            else -> "Good morning $name"
        }
    }

    println(sayHello("edho"))
    println(sayHello())
    println(greeting())
    println(greeting("Edho"))
}