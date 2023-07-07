val lambda1 = { println("Hello World") }

// with type annotation in lambda expression
val sum1 = {
    a: Int, b: Int -> a+b
}

// without type annotation in lambda expression
val sum2: (Int, Int) -> Int = {
    a , b -> a + b
}

val lambda2 : (Int) -> String = {
    "Sum is $it"
}

val lambda3 : (Int) -> Unit = {
    println("$it")
}

val lambda4 : (Int, Int) -> Unit = { a , b ->
    println("Numbers are $a, $b")
}

// we can replace the variable with _ which we don't want to use
val lambda5 : (Int, Int) -> Unit = { a , _ ->
    println("Number is $a")
}

// we can also use lambdas as class extension
val stringLambda : String.(Int) -> String = {
    this + it
}

// Higher Order Functions
// these are those functions which take lambdas as parameter
fun myLambdaFun(a: Int, b: Int, lam: (Int) -> String) : String {
    val sum = a + b
    return lambda2(sum)
}
fun main() {
//    println(lambda1)      It will not execute
    lambda1()
    lambda1.invoke()

    lambda4(2, 3)
    lambda5(3, 3)
    val result1 = sum1(4,9)

    val userName = "Dipesh".stringLambda(4)
    println("Name is $userName")

    println( myLambdaFun(2, 4, lambda2))
}