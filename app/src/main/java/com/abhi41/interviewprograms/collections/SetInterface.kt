package com.abhi41.interviewprograms.collections

fun main(){
    val mySet = setOf(1,2,2,5,6,7)

    println(mySet.toSet())
    //[1, 2, 5, 6, 7]   //its removed the duplicate element
    println(mySet.contains(element = 2))
    //true
    println(2 in mySet)
    //true
    println(mySet.containsAll(elements = setOf(1,2,6)))
    //true
    println(mySet.containsAll(elements = setOf(1,3,5)))
    //false


}