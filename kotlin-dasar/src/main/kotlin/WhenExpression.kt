fun main() {
    val value = "A";
    when(value) {
        "A" -> println("value is A")
        "B" -> println("value is B")
    }

    val result = "A"
    when(result) {
        "A", "B", "C" -> {
            println("Selamat Anda Lulus")
        }
        else -> {
            println("Maaf Anda gagal")
        }
    }

    val finalValue = "A"
    val passValue = arrayOf("A", "B", "C")
    when(finalValue) {
        in passValue -> println("Selamat anda lulus")
        !in passValue -> println("Maaf anda gagal")
    }

    when(finalValue) {
        is String -> println("This is String")
        !is String -> println("This is not string")
    }

    val resultValue = 90
    when {
        resultValue > 90 -> println("Amazing")
        resultValue > 80 -> println("Good Job !")
        resultValue > 60 -> println("Not Bad")
        else -> println("Please Try Again")
    }
}