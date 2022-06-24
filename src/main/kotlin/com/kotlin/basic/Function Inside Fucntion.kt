package com.kotlin.basic

// inner function
fun setWord(message: String) {
    fun printMessage(text: String) {
        println(text)
    }

    printMessage(message)
}

// can access parent parameters
fun setWords(message: String) {
    fun printMessage() {
        println(message)
    }

    printMessage()
}

// in a condition use inner function
fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    if (valueA == 0) {
        throw IllegalArgumentException("valueA must be better than 0")
    }

    if (valueB == 0) {
        throw IllegalArgumentException("valueB must be better than 0")
    }

    if (valueC == 0) {
        throw IllegalArgumentException("valueC must be better than 0")
    }

    return valueA + valueB + valueC
}

// if there's a boilerplate, we can use inner function
// inner function can be as extensions function
fun sum1(valueA: Int, valueB: Int, valueC: Int): Int {
    fun validateNumber(value: Int) {
        if (value == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    validateNumber(10)
    validateNumber(0)
    validateNumber(2)

    return valueA + valueB + valueC
}