class Student (
    val rollNo: Int,
    var name: String,
    var grade: Char
) {
    // this keyword is used to take the reference of the object
    fun studentDetails() {
        println("Roll No: $rollNo \nName: ${this.name} \nGrade: $grade")
    }
    fun changeName(name: String) {
        println("Changed name from ${this.name} to $name ")
        this.name = name
    }
}

fun main() {
    val s1 = Student(12, "Dipesh Yadav",'A')
    s1.studentDetails()
    s1.changeName("Ankita Yadav")

    // Some string methods
    val text = "Hello World"
    println("Dipesh".replace('i', 'e'))
    println("Ankita".uppercase())
    println(text.lowercase())
    println(text.length)
    println(text.replace("World", "Kotlin"))

    // Conversion methods
    val i = 44
    val d: Double = i.toDouble()
    val f: Float = d.toFloat()
    val l: Long = f.toLong()
    val s: String = l.toString()

    println("$i \n$d \n$f \n$l \n$s")
}