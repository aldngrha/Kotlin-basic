package com.kotlin.basic

// Extenstions Function for adding new function, Extensions Properties for adding new properties

fun main() {
//    extensions function
    10.println()
    println(10.plusThree())

//    extension properties
    println(10.slice)
}

//Extensions Function

fun Int.println() {
    println("value $this")
}

fun Int.plusThree(): Int {
    return this + 3
}

//Extensions Properties
val Int.slice: Int
    get() = this / 2