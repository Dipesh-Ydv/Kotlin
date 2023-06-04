fun main () {
    // while loop
    var a = 0
    while (a < 5) {
        println("Value of i is : $a")
        a ++
    }

    // for loop
    // using close range
    for (i in 1 .. 5) {
        println("Hello $i")
    }

    // using open range
    for (i in 1 until 5) {
        println("World $i")
    }

    // using down to
    for (i in 5 downTo 1) {
        println("Mangoes left : $i")
    }

    // using step
    for (i in 1..5 step 2) {
        println("Apples left : $i")
    }
}