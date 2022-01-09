package data

import kotlin.properties.Delegates

class Account(description: String = "") {
    val name: String by lazy {
        println("Name is Called")
        "Edho"
    }

    var description: String by Delegates.observable(description) {
        property, oldValue, newValue ->
            println("${property.name} change from $oldValue to $newValue ")
    }
}