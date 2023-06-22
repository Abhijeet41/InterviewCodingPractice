package com.abhi41.interviewprograms.basic_programs.numbers

fun main() {
    //print fibinacci series upto given term
    //0 1 1 2 3 5 8 13 21 34
    val number = 10
    var firstNumber = 0
    var secondNumber = 1

    println("Print fibonacci series upto $number th term")

    for (num in 1..number) {
        print("$firstNumber ")

        val sum = firstNumber + secondNumber  // 0 + 1 = 1 our sum is 1 now
        firstNumber = secondNumber        // now first become second first = 1
        secondNumber = sum                //now second become sum i.e second = 1

        //second loop
        /*
            sum = 1 + 1  i.e 2
            first = secondNumber  i.e 1
            second = sum          i.e 2
         */
    }
}