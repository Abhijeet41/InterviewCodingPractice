
fun main() {
    val first = listOf("a", " b", "c", "d")
    val second = listOf(1, 2, 3, 4)
    println(first.zip(second))
    // o/ P: [(a, 1), ( b, 2), (c, 3), (d, 4)]

    val ids = listOf(10, 11, 12)
    val names = listOf("Bob", "Jill", "Jim")
    val result = ids.zip(names) { id, name ->
        Person(id = id, name = name)
    }
    println(result)

    //lets get an example of unzip function
     val numbersMap = mapOf(1 to "one",2 to "two", 3 to "Three", 4 to "four")
    println(numbersMap.toList())

    val (numbers, text) =  numbersMap.toList().unzip()
    println(numbers)
    println(text)
}

data class Person(
    val id: Int,
    val name: String
)
