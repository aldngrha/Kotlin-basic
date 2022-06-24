package com.kotlin.basic


fun main(){
// Fold
    val numbers = listOf(1,2,3,4,5)
    val fold = numbers.foldRight(20) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println("Fold result: $fold")

//    Drop
    val drop = numbers.drop(3)
    println(drop)

    val dropLast = numbers.dropLast(1)
    println(dropLast)

//    Take
    val take = numbers.take(3)
    println(take)

    val takeLast = numbers.takeLast(1)
    println(takeLast)


}