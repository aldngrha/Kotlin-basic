package com.kotlin.basic

fun main() {
//    eager evaluation
    val list = (1..1000000).toList()
    list.filter{ it % 100 == 0 }.map { it * 2}.forEach {println(it)}

//    lazy evaluation
    list.asSequence().filter {it % 100 == 0}.map {it * 2}.forEach { println(it) }

//    make object squence
//    generateSquence() function will make collection squence infinity, as a result we must add take() function
//    so that program not have infinite loop
    val squenceNumber = generateSequence(1) { it + 1 }
    squenceNumber.take(10).forEach { println("$it ") }

}