package com.kotlin.basic

fun main() {
    val value = 7

//    can be save in variable
    val stringofValue = when(value) {
//        if we have 2 or more line of codes on every branch, we can add curly braces {}
        6 -> {
            println("six")
            "value is 6"
        }
        7 -> {
            println("six")
            "value is 7"
        }
        8 -> {
            println("six")
            "value is 8"
        }
//        can add else too
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    println(stringofValue)
}