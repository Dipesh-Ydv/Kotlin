import kotlin.jvm.Throws

annotation class MyAnnotation(val someDescription: String)
@MyAnnotation("Class Annotation")
class A(
    @MyAnnotation("Constructor Annotation")
    val num: Int
) {
    @MyAnnotation("Method Annotation")
    fun someFunction() {}
}
@Throws(ArithmeticException::class)
fun divide(a: Int, b: Int): Int {
    return a/b
}
fun main() {
    println(divide(4, 2))
}