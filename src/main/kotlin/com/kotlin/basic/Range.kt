package com.kotlin.basic

fun main() {
//    first way
    val rangeInt = 1..20 step 3

//    step
//    print(rangeInt.step)

//    change initailization step
    rangeInt.forEach{
        print("$it ")
    }
    println(rangeInt.step)

//    second way
    val rangeIntTwo = 1.rangeTo(20)
    val downInt = 20.downTo(3)

//    checking whether a value is in the range of values of the Range.
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("value 7 available")
    }

//    if in above same as
//    if (1 <= 7 && 7 <= 10){
//        println("Value 7 available")
//    }

//    checking whether a value is not in the range of values of the Range
    val twentyToTen = 20.downTo(10)
    if (11 !in twentyToTen) {
        println("No value 9 in Range")
    } else {
        println("Value available")
    }

    val rangeChar = "A".rangeTo("F")
}
