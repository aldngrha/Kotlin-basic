package com.kotlin.basic

typealias Arithmetic = (Int, Int) -> Int
val sum: Arithmetic = { valueA, valueB -> valueA + valueB}
val multiply: Arithmetic = {valueA, valueB -> valueA * valueB}

// instance with invoke

val sumResult = sum.invoke(10,10)
val multiplyResult = multiply.invoke(20,20)

// instance without invoke

val sumResult2 = sum(20,20)
val multiplyResult2 = multiply(10,10)

//nullable
typealias Arithm = ((Int, Int) -> Int)?
val summ: Arithm = { valueA, valueB ->  valueA + valueB }

val summResult = summ?.invoke(10,20)