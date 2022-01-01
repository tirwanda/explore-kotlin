package data

class Car(
    paramBrand: String,
    paramYear: Int = 2020
){
    /**
     * Initializer Block
     * Will be executed when object is created
     */
    init {
        println("Object Car is created")
    }

    var brand: String = paramBrand
    var year: Int = paramYear
}