enum class PizzaSize (
    val sizeInCms: Int
) {
    SMALL(15),
    MEDIUM(20),
    LARGE(25),
    EXTRALARGE(30)
}
fun printSize(pizzaSize: PizzaSize) {
    println("$pizzaSize is ${pizzaSize.sizeInCms} cms")
}
fun main() {
    printSize(PizzaSize.SMALL)
    printSize(PizzaSize.MEDIUM)
    printSize(PizzaSize.LARGE)
    printSize(PizzaSize.EXTRALARGE)

    // return the index at which it is stored inside the enum class
    println(PizzaSize.EXTRALARGE.ordinal)

    // iterating into the enum class
    for (size in PizzaSize.values()) {
        println("At ${size.ordinal} is $size Pizza with ${size.sizeInCms} cms size.")
    }

}