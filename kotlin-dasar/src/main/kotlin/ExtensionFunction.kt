fun String.hello(): String = "Hello $this"

fun main() {
    val name = "Edho"
    println(name.hello())
}