package data

import java.util.*

class Application(val name: String) {

    object Utilities {
        fun toUpper(name: String) {
            println(name.uppercase(Locale.getDefault()))
        }
    }
}