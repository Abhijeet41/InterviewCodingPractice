package com.abhi41.interviewprograms.basic_programs.char

fun main(){
    val inputString = "Hello World!"
    findDuplicateCharacters(inputString)
    removeDuplicateCharacter(inputString)
}


fun removeDuplicateCharacter(input: String) {
    val charSet = mutableSetOf<Char>()
    val result = StringBuilder()

    for (char in input){
        if (charSet.add(char)){
            result.append(char)
        }
    }
    println(result)
}

fun findDuplicateCharacters(input: String) {
    val charSet = mutableSetOf<Char>()
    val dublicateCharSet = mutableSetOf<Char>()

    for (char in input){
        if (!charSet.add(char)){
            dublicateCharSet.add(char)
        }
    }
    println(dublicateCharSet)
}
// O/P  [l, o]