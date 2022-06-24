package com.kotlin.basic

fun main() {
//   Slice
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(3..6)

    val slice1 = total.slice(3..6 step 2)

    println(slice)

    val index = listOf(2, 3, 5, 8)
    val slice2 = total.slice(index)
    println(slice2)

//    distinct
    val total1 = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total1.distinct()
    println(distinct)

    data class Item(val key: String, val value: Any)

    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinct1 = text.distinctBy {
        it.length
    }

    println(distinct1)
//    funtion distinct() cannot use for object Map Collection

//    Chuncked
    val word = "QWERTY"
    val chunked = word.chunked(3)

    println(chunked)
/*
   output:[QWE, RTY]
*/
    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }

    println(chunkedTransform)
}