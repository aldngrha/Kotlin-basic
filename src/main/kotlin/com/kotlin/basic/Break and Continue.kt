package com.kotlin.basic

fun main() {
    val listOfInt = listOf(1, 2, 3 ,null, 5, null, 7)
    for (i in listOfInt) {
        print(i)
    }

//    Continue
    val listOfIntTwo = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfIntTwo) {
        if (i == null) continue
        print(i)
    }

//    break
    val listOfIntThree = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfIntThree) {
        if (i == null) break
        print(i)
    }

//    Break dan Continue Labels
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }
}