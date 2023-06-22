package com.abhi41.interviewprograms.kotlin_program

import android.view.View

fun String.concat(other: String): String{
    return this + other
}
fun main(){
    val str1 = "Hello"
    val str2 = "world"
    val concatinated = str1.concat(str2)
    //o/p Hello world

    //----------------------extension function------------------------------
    //these are extension function
    fun View.show() {
        this.visibility = View.VISIBLE
    }

    fun View.hide() {
        this.visibility = View.GONE
    }
    //toolbar.hide()
}