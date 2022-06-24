package com.kotlin.basic

fun main() {
    printResult(10){
        value -> value + value
    }
}

// few type declaration lambda
fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}
