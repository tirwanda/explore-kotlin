fun main() {
    val range = 1..100
    val range2 = 100 downTo 1 step 2

    print(range)
    print(range.contains(67))
    print(range.count())
    print(range.step)
    print(range.first)
    print(range.last)
}