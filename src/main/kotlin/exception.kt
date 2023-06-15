import java.lang.IllegalArgumentException
import java.lang.IllegalStateException

class MyError: Throwable()
fun someFunction() {
    throw MyError()
    println("This will not be printed!")
}
// some important exception
// 1. IllegalArgumentException
fun findCluster(num: Int) {
    if(num < 1) {
        throw IllegalArgumentException("The number cluster must be greater than 1")
    }
}
// 2. IllegalStateException
fun printUserName(name: String) {
    if (name == "") throw IllegalStateException("User name can't be empty")
}
fun main() {
    // we us try-catch block to tackle an exception
    try {
        val a: Int = "ABC".toInt()
        println(a)
    } catch (t: ArithmeticException) {
        println("Caught ArithmeticException")
    } catch (t: NumberFormatException) {
        println("Caught NumberFormatException")
    } catch (t: Throwable) {
        println("Caught")
    }

    try {
        1 / 0
    } catch (exception: Exception) {
        println("$exception")
    } catch (e: Exception) {
        println("caught ${e.message}")
    } catch (t: Throwable) {
        t.printStackTrace()
    }

    try {
        someFunction()
    } catch (e: Throwable) {
        println("caught $e")
    } finally {
        println("Finally block executed when exception is occured")
    }
    println("Run successfully")

    printUserName("")
    findCluster(-2)
}