package com.abhi41.interviewprograms.kotlin_program

fun main() {
    val addition = { num1: Int, num2: Int ->
        num1 + num2
    }
    val result = calculateNumber(50, 20, addition)
    println(result)
    
}

fun calculateNumber(num1: Int, num2: Int, operation: (Int, Int) -> Int): Int {
    return operation(num1, num2)
}

