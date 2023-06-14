// Pair and Triplet are in-built kotlin data classes
fun main() {
    // Pair class is to store 2 data values
    val pair = Pair(4.4, true)
    val (number, boolean) = pair
    println(number)
    println(boolean)

    // we can also use 'to' keyword to create pair
    val pair2 = 44 to 'D'
    val (integer, character) = pair2
    println(integer)
    println(character)

    // Triple class is used to store 3 data values
    val triplet = Triple(6.3, 'A', true)
    println(triplet.first)
    println(triplet.second)
    println(triplet.third)

}