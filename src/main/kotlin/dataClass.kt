// data class is used to store data
data class Kutta (
    val name: String,
    val age: Int
)

fun main() {
    val dog1 = Kutta("Bruno", 3)
    val dog2 = Kutta("Charlie", 5)
    val dog3 = Kutta("Bruno", 3)

    println(dog1 == dog1)
    println(dog1 == dog2)
    println(dog2 == dog3)
    println(dog1 == dog3)

    println(dog1)
    println(dog2)
    println(dog3)

    println("Dog : $dog3")

    val (name, age) = dog1
    println("Name: $name Age: $age")

    // variable are always stored in the sequence they are declared in class
    // variable name can be anything
    val (age1, name2) = dog2
    println(name2)
    println(age1)

    // we can copy data from another object using copy method
    // and can also perform changes on variables according to our need
    val newDog = dog1.copy(age = dog1.age + 1)
    println(newDog)
    println(dog1)
}