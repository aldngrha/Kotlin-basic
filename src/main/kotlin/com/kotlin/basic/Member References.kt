package com.kotlin.basic


// Property References
//val message = "Aldi"

fun main() {

//    with :: opeator, can use as instances from function type
    val numbers = 1.rangeTo(10)
    val evenNumber = numbers.filter(::isEvenNumber)


//    println(::message.name)
//    println(::message.get())
//
////    ::message.set("Aldi Nugraha")
//
//    println(::message:get())
}

val sum1: (Int, Int) -> Int = ::count
fun count(valueA: Int, valueB : Int): Int {
    return valueA + valueB
}

// Function references
fun isEvenNumber(number: Int) = number % 2 == 0
