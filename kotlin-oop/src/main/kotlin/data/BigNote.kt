package data

import java.util.*

class BigNote(val title: String) {
    val bigTitle: String
        get() = title.uppercase(Locale.getDefault())
}