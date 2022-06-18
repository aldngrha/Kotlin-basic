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

//    withIndex()
    val range = 1.rangeTo(10) step 3
    for ((index, value) in range.withIndex()) {
        println("value $value with index $index")
    }

//    forEach
    val rangeForEach = 1.rangeTo(30) step 3
    rangeForEach.forEach{
        value -> println("value is $value")
    }

//    forEachIndexed
    val rangeForEachTwo = 1.rangeTo(30) step 3
    rangeForEachTwo.forEachIndexed{ index, value -> println("value $value with index $index")}

//    forEachIndexed
    val rangess = 1.rangeTo(10) step 3
    ranges.forEachIndexed { index, _ ->
        println("index $index")
    }
}