package com.abhi41.interviewprograms.kotlin_program

import android.content.Context
import androidx.appcompat.app.AlertDialog

fun main() {

    val addition = { num1: Int, num2: Int ->
        num1 + num2
    }
    val result = calculateNumber(50, 20, addition)
    println(result)

 /*   showAlert(this,"title","message","ok"){
        //button action
    }
  */
}


fun showAlert(
    context: Context,
    title: String,
    message: String,
    positiveButtonText: String,
    positiveButtonAction: () -> Unit
) {
    val alertDialogBuilder = AlertDialog.Builder(context)
    alertDialogBuilder.setTitle(title)
    alertDialogBuilder.setMessage(message)
    alertDialogBuilder.setPositiveButton(positiveButtonText) { dialog, _ ->
        positiveButtonAction.invoke()
        dialog.dismiss()
    }

    val alertDialog = alertDialogBuilder.create()
    alertDialog.show()
}

fun calculateNumber(num1: Int, num2: Int, operation: (Int, Int) -> Int): Int {
    return operation(num1, num2)
}

