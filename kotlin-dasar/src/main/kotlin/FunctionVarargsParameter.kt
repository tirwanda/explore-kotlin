fun resultOfAverage(value1: Int, value2: Int, values: Array<Int>): Int {
    var result: Int = 0
    result += value1 + value2

    for (value in values) {
        result += value
    }

    return result / (values.size + 2)
}

fun main() {
    println("Nilai Rata Ratanya adalah ${resultOfAverage(80, 83, arrayOf(89, 82, 82))}")
}