package com.abhi41.interviewprograms.basic_programs.char

fun main(){
    reversString()
}
private fun reversString(){
    var str = "Geek"

    //var result = ""
    var ch:Char
    var result = StringBuilder()
    for (i in 0..str.length-1){
        ch = str[i]
        //result = ch + result
        result.append(ch)
    }
    println("reversed word:" + result)
}

private fun recursive(){
    var str = "Geek"
    var nstr = ""

    

}