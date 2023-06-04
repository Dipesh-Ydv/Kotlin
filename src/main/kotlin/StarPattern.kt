fun main() {
    // pattern 1
    println("Pattern 1 :")
    // *****
    // *****
    // *****
    // *****
    // *****
    for (i in 1..5) {
        for (j in 1..5) {
            print("*")
        }
        println()
    }

    // pattern 2
    println("Pattern 2 :")
    // *
    // **
    // ***
    // ****
    // *****

    for (i in 1..5) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }

    // pattern 3
    println("Pattern 3 :")
    // *****
    // ****
    // ***
    // **
    // *

    for (i in 5 downTo 1) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }

    // pattern 4
    println("Pattern 4 :")
    // *
    // ***
    // *****
    // ***
    // *
    val width = 5
    for (rows in 1..width step 2) {
        for (numberOfStars in 1..rows) {
            print("*")
        }
        println()
    }
    for (rows in width-2 downTo 1 step 2) {
        for (numberOfStars in rows downTo 1) {
            print("*")
        }
        println()
    }

    // pattern 5
    println("Pattern 5 :")
    //     *
    //    **
    //   ***
    //  ****
    // *****

    val width2 = 5
    for (rows in 1..width2) {
        val numberOfSpaces = width2 - rows
        for (spaces in 1..numberOfSpaces) {
            print(" ")
        }
        for (numberOfStars in 1..rows) {
            print("*")
        }
        println()
    }

    // pattern 6
    println("Pattern 6 :")
    //     *
    //    ***
    //   *****
    //  *******
    // *********
    val rows = 5
    for (i in 1..rows) {
        val numberOfSpaces = rows - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i * 2 - 1
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
}