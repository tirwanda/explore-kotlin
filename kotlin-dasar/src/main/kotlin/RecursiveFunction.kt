fun main() {
    fun factorial(value: Int): Int {
//        return if (value == 1) {
//            1
//        } else {
//            value * factorial(value -1)
//        }
        return when (value) {
            1 -> 1
            else -> value * factorial(value - 1)
        }
    }

    println(factorial(5))
}