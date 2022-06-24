package com.kotlin.basic


fun main() {
    val value: Int? = null
    val value1: Int? = null

    println(value.slicc)
    println(value1.slicc)
}

// if expression
val Int?.slice: Int
    get() = if (this == null) 0 else this.div(2)

//elvis operator
val Int?.slicee: Int
    get() = this?.div(2) ?: 0

val Int.slic: Int
    get() = this.div(2)

val Int?.slicc: Int
    get() = this?.div(2) ?: 0