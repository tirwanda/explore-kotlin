package data

class Address {

    constructor(paramCity: String, paramCountry: String) {
        city = paramCity
        country = paramCountry
    }

    constructor(paramStreet: String, paramCity: String, paramCountry: String)
            : this(paramCity, paramCountry){
        street = paramStreet
    }

    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"
}