class User (
    val name: String
) {
    fun cheer() {
        println("Hello! my name is $name")
    }
}
fun printUserName(user: User?) {
    // elvis operator is used to provide default value to nullables
    val userWithDefault: User = user ?: User("(undefined)")
    println(userWithDefault.name)
    userWithDefault.cheer()
}
fun main() {
    var name: String? = "Ram"
    println(name?.length)
    name = null
    if (name != null) {
        println(name.length)
    }
    val length = name?.length
    println(length)

    printUserName(User("Shyam"))
    printUserName(null)
}