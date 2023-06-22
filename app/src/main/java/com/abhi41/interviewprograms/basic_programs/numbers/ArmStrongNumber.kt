package com.abhi41.interviewprograms.basic_programs.numbers

fun main() {

    val number = 153
    checkArmStringOrNot(number)

}

fun checkArmStringOrNot(number: Int) {
    //sum of the cube of the digit of any number is equal to number itself then its armstrong
    //1*1*1  + 5*5*5 + 3*3*3
    //153 % 10 = 3
    //15 % 10 = 5
    //1 % 10 = 1

    var original = number
    var result: Int
    var armStrong = 0
    val power = 3
    while (original != 0) {
        result = original % 10   //153 % 10 = 3,  15 % 10 = 5,  1 %  10 = 1
        result = Math.pow(result.toDouble(), power.toDouble()).toInt()  //3*3*3, 5*5*5, 1*1*1
        armStrong = armStrong + result  // 27 + 125 + 1 = 153
        original /= 10  // 153/10 = 15,  15/10 = 1,  1/10 = 0
    }

    if (armStrong == number){
        println("$number is an ArmStrong number")
    }else{
        println("$number is not an ArmStrong number")
    }

}
