fun labelBreak() {
    loopi@ for (i in 1..10) {
        loopj@ for (j in 1..10) {
            println("$i * $j = ${i * j}")
            if (j == 10) {
                break@loopi
            }
        }
    }
}

fun labelContinue() {
    loop2i@ for (i in 1..10) {
        loop2j@ for (j in 1..10) {
            println("$i * $j = ${i * j}")
            if (j == 5) {
                continue@loop2i
            }
        }
    }
}

fun main() {
    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

    test("Edho") Test@{
        if (it == "") {
            return@Test
        } else {
            println(it)
        }
    }
}