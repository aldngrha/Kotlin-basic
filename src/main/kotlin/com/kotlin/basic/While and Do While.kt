package com.kotlin.basic

fun main() {
    var count = 1
    while (count <= 10) {
        println(count++)
    }

    do {
        println(count++)
    } while (count <= 7)
}