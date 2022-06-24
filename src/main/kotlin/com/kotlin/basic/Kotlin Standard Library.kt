package com.kotlin.basic

//Scope function
//let, run, with, apply, and also

//Context Object
//accessed as lambda receiver (this)
//accessed as lambda argumnet (kit)

//Lambda Receiver (this)
val buildString = StringBuilder().apply {
    append("Aldi ")
    append("Nugraha")
}

fun main () {
    //Lambda argument (kit)
    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }
//  function run
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "Replace text form $from to $to"
    }
    println("result : $result")

//    function with
    val message = "Hello Kotlin"
    val results = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }
    println(results)

//    apply
    val builder = StringBuilder().apply {
        append("Aldi ")
        append("Nugraha")
    }
    builder.append("Hello ")
    builder.append("Alid ")

    println(builder.toString())
}