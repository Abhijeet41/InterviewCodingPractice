package com.abhi41.interviewprograms.solid_principles.liskov_substitution


open class Vehicle{
    open fun getInteriorWidth(): Int{
        return 0
    }
}

 class StreetCar: Vehicle(){
     override fun getInteriorWidth(): Int {
         return this.getCabinWidth()
     }

     fun getCabinWidth():Int{
        return 39
    }
}

class RacingCar:Vehicle(){
    override fun getInteriorWidth(): Int {
        return this.cockpitwidth()
    }

    fun cockpitwidth():Int{
        return 12
    }
}

class BmwCar:Vehicle(){
    override fun getInteriorWidth(): Int {
        return this.xxxWidth()
    }

    fun xxxWidth():Int{
        return 16
    }
}

fun main() {
    val list = mutableListOf(RacingCar(),StreetCar(),BmwCar())
    //insted of this

  /*  list.forEach {
        when(it){
            is RacingCar ->{
                println(it.cockpitwidth())
            }
            is StreetCar ->{
                println(it.getCabinWidth())
            }
            is BmwCar ->{
                println(it.xxxWidth())
            }
        }
    }*/

    list.forEach {
        println(it.getInteriorWidth())
    }
}