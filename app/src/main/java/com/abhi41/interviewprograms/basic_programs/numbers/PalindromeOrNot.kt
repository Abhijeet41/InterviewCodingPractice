package com.abhi41.interviewprograms.basic_programs.numbers

fun main() {
    val name = "abcdcba"
    var firstIndex = 0
    var lastIndex = name.length - 1
    var isPalindrome = true

    while (firstIndex < lastIndex) {
        if (name[firstIndex] != name[lastIndex]) {
            isPalindrome = false
            break
        }
        firstIndex++
        lastIndex--
    }

    if (isPalindrome) {
        println("The given number is Palindrome")
    } else {
        println("The given number is not Palindrome")
    }

}











