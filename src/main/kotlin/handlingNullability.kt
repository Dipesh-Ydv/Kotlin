data class Students(
    val fullName: String,
    var grade: Double,
    var id: Int
)

val students = listOf<Students>(
    Students("John", 140.0, 223),
    Students("Mark", 120.0, 548),
    Students("Natali", 150.0, 342),
    Students("Sara", 130.0, 781)
)
fun getStudentById(id: Int) : Students {
    return students.find { it.id == id } !!
}
fun searchInStudents(name: String) : Students? {
    return students.find { it.fullName.lowercase() == name.lowercase() }
}
fun main() {
    println("Please, Enter the student's ID")
    val id = readln().toInt()
    println(getStudentById(id))
    println("Please, Enter the student's name")
    val name = readln()
    println(searchInStudents(name)?: "The student is not found")
}