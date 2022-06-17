package com.kotlin.basic

fun main() {
    val ranges = 1..10
    for (i in ranges){
        println("value is $i")
    }

    val rangeDownTo = 20.downTo(5)
    for (j in rangeDownTo) {
        println("value is $j")
    }

//    step
    val rangeStep = 1.rangeTo(20) step 2
    for (y in rangeStep) {
        println("value is $y")
    }
}