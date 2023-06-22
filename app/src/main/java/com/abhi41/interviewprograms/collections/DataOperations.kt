package com.abhi41.interviewprograms.collections



fun main(){
    val chandler = Actor("Chandler", "chander_bing@friends.com", 50_000, Gender.MALE)
    val joey = Actor("Joey", "joey_tribbiani@friends.com", 1_000, Gender.MALE)
    val rachel = Actor("Rachel", "rachel_green@friends.com", 2, Gender.FEMALE)
    val phoebe = Actor("Phoebe", "phoebe_buffay@friends.com", 2_000, Gender.FEMALE)
    val ross = Actor("Ross", "ross_geller@friends.com", 50_000, Gender.MALE)
    val monica = Actor("Monica", "monica_geller@friends.com", 0, Gender.FEMALE)

    val actors = listOf(chandler, joey, rachel, phoebe, ross, monica)
    val episodes = listOf(
        Episode(
            "The One with the Monkey",
            "Peter Bonerz",
            "Adam Chase & Ira Ungerleider",
            Season.ONE
        ),
        Episode("The One with Mrs. Bing", "James Burrows", "Alexa Junge", Season.ONE),
        Episode(
            "The One with the Stoned Guy",
            "Alan Myerson",
            "Jeff Greenstein & Jeff Strauss",
            Season.ONE
        ),
        Episode("The One with the Baby on the Bus", "Gail Mancuso", "Betsy Borns", Season.TWO)
    )

    //Touple example
    val testName = "Kotlin Test"
    val grade = 10

    val resultTest = Pair (testName, grade)
    println(resultTest)
    // O/P (Kotlin Test, 10)

    // get the parts of Pair
    val book = Pair("Learn Kotlin from GDE", 20)
    val (title , price) = book
    println("Title = ${book.first} , Price = ${book.second}")
    // O/P Title = Learn Kotlin from GDE , Price = 20

    //Triple
    var kotlinVersions = Triple(1.1, 1.2, 1.3)
    var firstKotlinVersion = kotlinVersions.first
    var secondKotlinVersion = kotlinVersions.second
    var thirdKotlinVersion = kotlinVersions.third

    // combine different data types
    var kotlinBook = Triple(1289, "Learn Kotlin from GDE", 21.99)
    println("ISBN = ${kotlinBook.first} , Title = ${kotlinBook.second} , Price = ${kotlinBook.third}")

}