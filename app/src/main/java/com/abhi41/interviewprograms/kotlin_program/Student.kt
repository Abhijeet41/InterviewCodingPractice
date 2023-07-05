package com.abhi41.interviewprograms.kotlin_program


fun main(){
    Student(name = "Abhijeet", id = 1)
}
class Student (var name: String) {

    var id: Int = 46

    constructor(name: String, id: Int) : this(name){
        this.id = id
        println("Sec Constructor $id")
    }
    init {
        println("Student has got a name as $name")
        println("Student has got a id as $id")
    }

}