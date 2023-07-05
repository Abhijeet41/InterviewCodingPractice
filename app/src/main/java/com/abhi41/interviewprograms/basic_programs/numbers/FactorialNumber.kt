package com.abhi41.interviewprograms.basic_programs.numbers

fun main() {
    //what is factorial no of 6! =  6*5*4*3*2*1
    // n! = n*(n-1) * n*(n-2) * n*(n-3)....*1

    val number = 5
    factorialNumber(number)

    //using recursive function
   val fact = factorialRecursive(number)
    println(fact)
}

private fun factorialNumber(number: Int) {
    var fact: Int = 1
    for (num in 1..number) {
        fact = fact * num // 1*1,1*2,2*3,6*4,24*5=120
    }
    println(fact)
}

private fun factorialRecursive(number: Int): Int {
    return if (number == 0) {
        1
    } else {
        number * factorialRecursive(number - 1)
    }
}







private fun printFact(){
    val num = 5  //5*4*3*2*1
    var fact:Int = 1
    for (num in  1..num){
        fact = fact * num
    }
    println(fact)
}



