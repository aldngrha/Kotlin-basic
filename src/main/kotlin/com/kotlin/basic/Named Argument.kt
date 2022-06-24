package com.kotlin.basic

fun main() {
    val fullName = getFullName(first = "Kotlin")
    print(fullName)
}

//fun getFullName(first: String, middle: String, last:String): String {
//    return "$first $middle $last"
//}
// defualt parameter
fun getFullName(
    first: String = "Aldi",
    middle: String = " is ",
    last: String = "Awesome"): String {
    return "$first $middle $last"
}