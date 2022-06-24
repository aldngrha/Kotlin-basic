package com.kotlin.basic

fun main() {

//    let
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }

//    safe call
//    val length = message?.length ?: 0 * 2
//    val text = "text length $length"
//    println(text)

//    also
    val text = "Hello world!"
    val result = text.also{
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}