package com.abhi41.interviewprograms.collections

enum class Season {
    ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN
}

enum class Gender {
    MALE, FEMALE
}

data class Actor(val name: String, val email: String, val salary: Int, val gender: Gender)

data class Episode(
    val title: String,
    val director: String,
    val writer: String,
    val season: Season
)

val chandler = Actor("Chandler", "chander_bing@friends.com", 50_000, Gender.MALE)
val joey = Actor("Joey", "joey_tribbiani@friends.com", 1_000, Gender.MALE)
val rachel = Actor("Rachel", "rachel_green@friends.com", 2, Gender.FEMALE)
val phoebe = Actor("Phoebe", "phoebe_buffay@friends.com", 2_000, Gender.FEMALE)
val ross = Actor("Ross", "ross_geller@friends.com", 50_000, Gender.MALE)
val monica = Actor("Monica", "monica_geller@friends.com", 0, Gender.FEMALE)

fun main() {
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

    //perform operations

    val emails: List<String> = actors.map { it.email }
    for (email in emails) {
        println(email)
    }
    /*    output
       chander_bing@friends.com
       joey_tribbiani@friends.com
       rachel_green@friends.com
       phoebe_buffay@friends.com
       ross_geller@friends.com
       monica_geller@friends.com */
    println()
    println("---------------separate emails through comma-----------\n")
    //separate emails through comma
    val emailCommaSeperated = emails.joinToString(separator = ",")
    println(emailCommaSeperated)
    //o/p
    //chander_bing@friends.com,joey_tribbiani@friends.com,rachel_green@friends.com,phoebe_buffay@friends.com,ross_geller@friends.com,monica_geller@friends.com

    println("\n------------ calculate total salary---------------------")
    val salaries = actors.sumOf { it.salary }
    println(salaries)
    //o/p 103002

    println("------------- episodesByDirector----------------")
    //------------- episodesByDirector----------------
    val episodesByDirector: Map<String, List<Episode>> = episodes.groupBy { it.director }
    episodesByDirector.forEach { println(it.key) }

    /*  o/p
          Peter Bonerz
         James Burrows
         Alan Myerson
         Gail Mancuso
  */
    println("------------- actors by gender (Male)----------------")

    val actorsByGender: Pair<List<Actor>, List<Actor>> =
        actors.partition { it.gender == Gender.MALE }
    actorsByGender.first.forEach { actor: Actor -> println(actor.name) }
    /* output
          Chandler
          Joey
          Ross
      */
    //female actor comma separated
    val females = mutableListOf<String>()
    actorsByGender.second.forEach { actors ->
        females.add(actors.name)
    }
    println("---------define other female actor------")
    val femaleActor = females.joinToString(separator = ",")
    println(femaleActor)

    // o/p  Rachel,Phoebe,Monica
    println()
    println("---------------namesByGender-----------------")
    val namesByGender: Map<Gender, List<String>> = actors.groupBy { it.gender }
        .mapValues { it.value.map { it.name } }

    //print only names
    namesByGender.values.forEach { names ->
        val name = names.joinToString(separator = ",")
        print(name)
    }
    //print key value pair
    println()
    println("-------------print key value pair-------------")
    namesByGender.forEach { key, value ->
        print("\ngender : ${key} \nnames : ${value.joinToString { it }}")
    }

    /*
    gender : MALE
     names : Chandler, Joey, Ross
     gender : FEMALE
     names : Rachel, Phoebe, Monica
     */

    println()
    println()

    println("-------------print longest name from list-------------")

    val longestName: String? = actors.map { it.name }.maxByOrNull { it.length }
    println(longestName)
    // O/p Chandler
    println()
    println("-------------Count season one episodes-------------")

    val countSeasonOneEpisodes: Int = episodes.filter { it.season == Season.ONE }.count()
    println(countSeasonOneEpisodes)
    // O/p  = 3

    // To reverse a list in Java with fewer iterations
    val mutableActors: MutableList<Actor> = mutableListOf()
    mutableActors.addAll(actors)
    reversedList(mutableActors)
    println("Reverse Order Actor name\n")
    for (actor in mutableActors) {
        println("${actor.name}")
    }
    //o/p
    /*
    Reverse Order Actor name
       Monica
       Ross
       Phoebe
       Rachel
       Joey
       Chandler
    */

    //------------------filter operations----------------------------------------
    println("---------------filter operations------------------------")
    val people = listOf(
        Person(name = "John", age = 20, male = true),
        Person(name = "Micheal", age = 21, male = true),
        Person(name = "Anna", age = 22, male = false),
        Person(name = "Sam", age = 23, male = true),
        Person(name = "Jennifer", age = 24, male = false),
    )

    people.filter { person -> person.male }.forEach {
        println(it.name)
        /*o/p John
              Micheal
              Sam
            */
    }

    people.filter { person -> !person.male }.forEach {
        println(it.name)
        /*o/p Anna
              Jennifer
            */
    }
    //lets do in shorter way to print male person
    people.filter(Person::male).forEach { println(it.name) }
    //lets print person's name who is not male
    people.filterNot(Person::male).forEach { println(it.name) }

    //lets sort people by age
    people.sortedBy(Person::age).forEach { println(it.name) }

    //calling extension function important
    println(people.any(Person::important))
    //o/p true
}

private fun reversedList(list: MutableList<Actor>) {
    println("\nPrint index")
    for (i in 0 until list.size / 2) {
        val size: Int = list.size

        println("${size - i - 1}")
        val temp = list.get(i)
        val last = list.get(size - i - 1)

        list.set(i, last)
        list.set(size - i - 1, temp)
    }

}

//example of extension function
fun Person.important() = this.name.startsWith(prefix = "M") && this.age > 20

data class Person(
    val name: String,
    val age: Int,
    val male: Boolean
)