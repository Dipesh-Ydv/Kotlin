fun main() {
    println("Is it going to rain?")
    val probability = 70
    if (probability <= 40) println("Unlikely")
    else if (probability <= 80) println("Likely")
    else if (probability < 100) println("Yes")
    else println("What?")

    val haveExtraMoney = true
    val tip : Double = if (haveExtraMoney) 10.0 else 0.0
    println(tip)

    // when statement
    println("What's the result?")
    val marks = 69
    when {
        marks < 40 -> {
            println("Just pass")
        }
        marks < 65 -> {
            println("Average")
        }
        marks < 89 -> {
            println("Above average")
        }
        marks < 100 -> {
            println("Outstanding")
        }
        else -> {
            println("Sorry! failed")
        }
    }

    val result  = when {
        marks < 40 -> "Just pass"
        marks < 65 -> "Average"
        marks < 89 -> "Above average"
        marks < 100 -> "Outstanding"
        else -> "Sorry! failed"
    }
    println("Result is $result")

    // when statement with expression and type check
    val something : Any = "Dipesh"
    when (something) {
        is String -> println("This is String")
        is Int -> println("This is Int")
        is Double -> println("This is Double")
        is Boolean -> println("This is Boolean")
    }
    println(something)

    // when statement with range
    var number = 1
    var value = when (number) {
        1 -> "Missed Hit"
        2, 3, 4, 5 -> "Hit with value $number"
        6 -> "Critical Hit"
        else -> "Unsupported value"
    }
    println(value)

    // using ranges in when statement
    number = 3
    value = when (number) {
        1 -> "Missed Hit"
        in 2..5 -> "Hit with value $number"
        6 -> "Critical Hit"
        else -> "Unsupported value"
    }
    println(value)
}