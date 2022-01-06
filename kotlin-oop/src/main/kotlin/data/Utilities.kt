package data

import java.util.*

object Utilities {
    val name: String = "My utilities"

    fun toUpper(value: String): String {
        return value.uppercase(Locale.getDefault())
    }
}