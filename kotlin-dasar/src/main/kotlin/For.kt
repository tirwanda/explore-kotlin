fun main() {
    val names = arrayOf("Edho", "Dwi", "Tirwanda")

    for (name in names) {
        println(name)
    }

    for (i in names.size - 1 downTo 0) {
        println(names[i])
    }
}