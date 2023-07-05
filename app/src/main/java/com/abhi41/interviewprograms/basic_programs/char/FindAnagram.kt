package com.abhi41.interviewprograms.basic_programs.char

fun main() {
    //check weather giver characters are anagram or not

    val str1 = "LISTEN"
    val str2 = "SLIENT"
    var isAnagram = true
    val c1 = str1.toCharArray()
    val c2 = str2.toCharArray()

    if (c1.size != c2.size) {
        isAnagram = false
    } else {
        c1.sort()
        c2.sort()
        for (i in 0..c1.size - 1) {
            if (c1[i] != c2[i]) {
                isAnagram = false
                break
            }
        }
        if (isAnagram) {
            println("Given Two String are anagram")
        } else {
            println("Given Two String are not anagram")
        }
    }
}