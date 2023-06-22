package com.abhi41.interviewprograms.basic_programs.pyramid

fun main(){
    val numRows = 5
    var row = 1
    var numStars = 1

    while (row <= numRows){
        var numSpaces = numRows - row

        //Print spaces before the stars
        while (numSpaces > 0){
            print(" ")
            numSpaces--
        }

        // Print the stars
        var starCount = 0
        while (starCount < numStars) {
            print("*")
            starCount++
        }
        // Print spaces after the stars
        numSpaces = numRows - row
        while (numSpaces > 0) {
            print(" ")
            numSpaces--
        }
        println() // Move to the next line
        row++
        numStars += 2
    }


}