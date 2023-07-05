package com.abhi41.interviewprograms.basic_programs.numbers

fun main() {
    val number = 0
    checkWeatherNumPrimeOrNot(number)
}

fun checkWeatherNumPrimeOrNot(number: Int) {
    var isPrime = true
    /*
        lets example number is 13
        0,1,2,3,4,5,6,7,8,9,10,11,13
        we need to skip 0,1 and 13 the number itself
        thats why we iterate from 2 and number -1 (means 13 -1 = 12)
        so we can iterate only 2,3,4...12
     */
    if (number <= 1) {
        isPrime = false
    } else {
        for (i in 2..number - 1) {
            if (number % i == 0) {
                isPrime = false
            }
        }
    }
    if (isPrime) {
        println("$number is a prime number")
    } else {
        println("$number is not a prime number")
    }
}


fun findPrimeNumber(){
    val number = 13 //number should not divisible by 0,1 and number itself
    var isPrime = true

    if (number <= 1){
        isPrime = false
    }else{
        for (num in 2..number-1){
            if (num % 2 == 0){
                isPrime = false
            }
        }
    }

    if (isPrime){
        println("the given number $number is prime number")
    }else{
        println("the given number $number is not a prime number")
    }



}


































