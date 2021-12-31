fun main() {
    var counter: Int = 0
    var lambdaIncrement = {
        println("Lambda Increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("Anonymous Increment")
        counter++
    }

    fun functionIncrement() {
        println("Function Increment")
        counter++
    }
}