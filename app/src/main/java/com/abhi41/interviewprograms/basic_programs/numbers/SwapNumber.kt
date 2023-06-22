package com.abhi41.interviewprograms.basic_programs.numbers

fun main() {
    swapTwoNumWithout3rdVariable()
    swapTwoNumUsing3rdVariable()
}


fun swapTwoNumWithout3rdVariable() {
    var a = 5
    var b = 10

    println("Before Swapping: a = $a, b= $b")

    a = a + b  // 5 + 10 = 15
    b = a - b  //15 - 10 = 5
    a = a - b  //15 - 5 = 10

    println("After Swaping: a = $a, b = $b")

}

fun swapTwoNumUsing3rdVariable() {
    var a = 5
    var b = 10
    var temp = 0
    println("Before Swapping: a = $a, b= $b")

    temp = a  // temp = 5
    a = b     // a = 10
    b = temp  // b = 5

    println("After Swaping: a = $a, b = $b")
}