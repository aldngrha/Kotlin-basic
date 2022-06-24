package com.kotlin.basic

// lambda == anonymous function or function literal


fun main() {
    message()
    printMessage("Hello Aldi Nugraha")

    val length = messageLength("Hello lambda")
    println("Message length $length")

}
// without lambda
val comparator = object :Runnable{
    override fun run() {
//            TODO
    }
}
// with lambda
val comprator = Runnable {
// TODO
}

// Lambda Expression
val message = { println("Hello From Lambda")}

//with parameters
val printMessage = { messages: String -> println(messages)}

//lambda return value
val messageLength = {message: String -> message.length}