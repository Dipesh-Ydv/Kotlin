fun main() {
    println("Please enter a number: ")
    val input = readln()?.toInt()

    if (input != null) {
        if (input.isPrime()) {
            println("$input is a prime number")
        } else {
            println("$input is not a prime number")
        }
    }

    val list: List<Int> = listOf(1,2,4,5)
    println("Product of $list is ${list.listProduct()}")
}

fun Int.isPrime(): Boolean {
    for (i in 2 until this - 1) {
        if (this % i == 0) {
            return false
        }
    }
    return true
}

fun List<Int>.listProduct(): Int {
    var product = 1
    for (num in this) {
        product *= num
    }
    return product
}