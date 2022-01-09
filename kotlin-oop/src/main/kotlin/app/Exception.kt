package app

import exception.ValidationException

fun validationAndSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is Blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
//    validationAndSayHello("Edho")
//    validationAndSayHello("")

    try {
        validationAndSayHello("Edho")
//        validationAndSayHello("")
    } catch (error: ValidationException) {
        println("Error with message ${error.message}")
    } catch (error: Throwable) {
        println("Error with message: ${error.message}")
    } finally {
        println("Success Running program")
    }
}