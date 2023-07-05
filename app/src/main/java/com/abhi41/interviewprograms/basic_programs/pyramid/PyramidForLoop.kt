package com.abhi41.interviewprograms.basic_programs.pyramid

fun main(){
    val numRows = 5
    //printStarPyramid(numRows)

    //printNumberPattern()
    pyramidNumberPattern()
    
}

fun printStarPyramid(numRows: Int) {

    for (row in 0 until numRows){
        //print spaces before star
        for(i in 0 until(numRows - row)){
            print(" ")
        }
        //print stars
        for (i in 0 until((row * 2) - 1)){
             print("*")
        }
        println()
    }
}
//   o/p
//        *
//       ***
//      *****
//     *******
//    *********


fun printNumberPattern(){
    val rows = 5
    var number = 1

    for (i in 1..rows){
        for (j in 1..i){
            print("$number ")
            number++
        }
        println()
    }
}
/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15 */


fun pyramidNumberPattern(){
    val rows = 4
    var number = 1

    for (i in 1..rows){
        for(j in 1..rows - i){
            print(" ")
        }
        for (j in 1..i){
            print("$number ")
            number++
        }
        println()
    }
}
/*
    1
   2 3
  4 5 6
 7 8 9 10
 */



fun pyramidNumber(){
    val row = 4
    var num = 1

    for (i in 1..4){
        for (j in 1..row - 1){
            print("*")
        }
        for (j in 1..i){
            print(num )
            num++
        }

        println()
    }
}












