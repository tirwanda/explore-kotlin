fun main() {
    tailrec fun display(value: Int) {
        println(value)
        if (value > 0) display(value - 1)
    }

    tailrec fun factorial(value: Int, result: Int = 1): Int {
        return when (value) {
            1 -> result
            else -> factorial(value - 1, result * value)
        }
    }

    display(5)
    println(factorial(5))
}