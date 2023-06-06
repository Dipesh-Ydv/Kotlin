fun main() {
    val greater = biggerOf(2, 3)
    println("Greater number is $greater")

    println("Area of triangle is ${areaOfTriangle(22.3, 43.2)} sq unit")

    sayHello()
    sayHello("Dipesh", "Yadav")

    // Named argument
    sayHello(hi= "Dipesh")
}
fun biggerOf (a: Int, b: Int): Int {
    return if (a > b) a else b
}
// Inline function
fun areaOfTriangle (width: Double, height: Double): Double = width * height / 2

// unit in kotlin is equivalent of void in java
// When a function doesn't return anything it's return type is unit by default

// Default argument function
fun sayHello(hello: String = "Hello! ", hi: String = "Hi") {
    println("$hello $hi")
}