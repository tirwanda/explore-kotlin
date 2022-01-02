package data

class Car(
    paramBrand: String,
    paramName: String,
    paramYear: Int
){
    /**
     * Initializer Block
     * Will be executed when object is created
     */
    init {
        println("Object Car is created")
    }

    constructor(paramName: String, paramBrand: String) :
            this(paramBrand, paramName, 2020) {
                println("Secondary Constructor")
            }

    constructor(paramName: String) : this(paramName, "") {
        println("Secondary Constructor 2")
    }

    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramYear
}