package com.abhi41.interviewprograms.basic_programs.numbers

fun main() {
    val numbers = mutableListOf(5, 9, 8, 3, 10, 15)

    val highest = findHighestNumber(numbers)
    println(highest)

    val secondMax = findSecondHighestNumber(numbers)
    println(secondMax)

    val secondMax2 = findSecondHighestUsingSorting(numbers)
    println(secondMax2)

    totalNumberGreaterThenGivenNum(numbers)
}


fun findHighestNumber(numbers: MutableList<Int>): Int {
    var max = -1
    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }
    return max
}

fun findSecondHighestNumber(numbers: MutableList<Int>): Int {
    var max = -1
    var secondMax = -1
    //5,9,8,2,0,2,3
    for (num in numbers) {
        if (num > max) {
            secondMax = max
            max = num
        } else if (num > secondMax && num != max) {
            secondMax = num
        }
    }

    return secondMax
}


fun findSecondHighestUsingSorting(numbers: MutableList<Int>): Int {
    numbers.sort()
   // val lastIndex = numbers.size - 1
    var second = numbers.get(numbers.size - 2)
    return second
}

fun totalNumberGreaterThenGivenNum(numbers: MutableList<Int>) {
    val givenNum = 7
    var tempMax = 0
    var tempMin = 0
    for (num in numbers){
        if (num > givenNum){
            tempMax++
        }else if (num < givenNum){
            tempMin++
        }
    }
    println("Number of element greater then $givenNum is $tempMax")
    println("Number of element less then $givenNum is $tempMin")

}
