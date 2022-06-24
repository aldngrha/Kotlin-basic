package com.kotlin.basic

fun main() {
    val message = buildStringg {
        append("Hello ")
        append("Aldi ")
        append("Nugraha")
    }

    print(message)
}

// without DSL (Domain Specific Languages)
fun buildString(): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello")
    stringBuilder.append("from")
    stringBuilder.append("aldi")
    return stringBuilder.toString()
}

//with DSL
fun buildStringg(action: StringBuilder.() -> Unit): String{
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}