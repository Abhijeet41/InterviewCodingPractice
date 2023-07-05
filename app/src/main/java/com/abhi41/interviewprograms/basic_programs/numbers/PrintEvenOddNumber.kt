package com.abhi41.interviewprograms.basic_programs.numbers


fun main() {
    printEvenNumber()
    printOddNumber()
}

fun printEvenNumber() {

    for (num in 1..20) {
        if (num % 2 == 0){
            println(num)
        }
    }

}


fun printOddNumber() {

    for (num in 1..20){
        if(num % 2 == 1){
            println(num)
        }
    }

}
