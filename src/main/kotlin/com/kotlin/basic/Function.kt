package com.kotlin.basic

fun main() {
    val user = setUser("Aldi", 22)
    println(user)
    printUser("Aldi")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}