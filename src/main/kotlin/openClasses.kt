// The class must be open if we want to inherit it
//open class Dog(val breed: String)
//class Labrador(val name: String) : Dog("Labrador Retriever")
open class Dog(open val name: String)
class Labrador(override val name: String) : Dog(name)
//                      OR
//class Labrador(name: String) : Dog(name)
fun main() {
    val lab = Labrador("Coco")
    println(lab.name)
//    println(lab.breed)
}
