fun main() {
    val a = 10
    println(a)
    val b = a
    println(b)
    val d : Int     // Declaring a variable

    var str = "Hello! World"
    println(str)
    str = "Hello! This is Dipesh Yadav"
    println(str)

//    str = 123       // Error

    val age : String = "" + 42
    println(age)

    // To include multiple subtypes we use "Any"
    var x : Any = "ABC"
    println(x)
    x = 12
    println(x)
    x = true
    println(x)
}