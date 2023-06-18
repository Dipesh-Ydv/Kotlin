fun main() {
    // creating list
    val list = listOf(1, 2, 4)
    val list2: List<String> = listOf("Ram", "Sita", "Shyam")
    val list3 = mutableListOf('A', 'B', 'C')

    // displaying a list
    println(list)
    println(list2)
    println(list3)

    // iterating list
    for (item in list) {
        print("$item\t")
    }

    println()
    // adding element into a list
    println(list2 + "Radha")
    println(list + listOf('D','E') - 1)
    println(list)

    // getting size of list
    println(list.size)

    // checking if contain an element
    println(list.contains(4))
    println("Ram" in list2)

    // getting element at a certain index
    println(list[0])
    println(list2[2])

    // adding and deleting element in mutable list
    list3.add('D')
    list3.add('E')
    list3.remove('C')
    println(list3)

}