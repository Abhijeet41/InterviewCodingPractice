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


private fun swap2Number(){
    var num1 = 3
    var num2 = 5


    // now without using 3rd variable
    println("Before swapping number : $num1 and $num2")
    num1 = num1 + num2 //3+5 = 8
    num2 = num1 - num2 // 8-5 = 3
    num1 = num1 - num2 //8-3 = 5

    println("After swapping number : $num1 and $num2")



}






























