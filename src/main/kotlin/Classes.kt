class Employee (
    val name: String,
    var post: String
) {
    var label: String = "$name ($post)"
}

class Barista(
    val name: String
) {
    fun makeCoffe(type: String, size: Int): Coffee {
        println("$name makes coffee of type $type and size $size")
        return Coffee(type, size)
    }
}

class Coffee (
    val type: String,
    val size: Int
)
fun main() {
    val e1 = Employee("Dipesh Yadav", "CEO")

    println(e1.name)
    println(e1.post)

    e1.post = "Co-Founder"
    println(e1.post)
    println(e1.label)

    val barista = Barista("Ayush")
    val coffee = barista.makeCoffe("Latte", 1)
}