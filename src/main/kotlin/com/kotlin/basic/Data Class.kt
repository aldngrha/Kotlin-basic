package com.kotlin.basic

//this common class
class User (val name : String, val age: Int) {
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

//this data class
data class DataUser(val name : String, val age : Int)

fun main() {
    val user = User("Aldi", 22)
    val dataUser = DataUser("Nugraha", 12)

    println(user)
    println(dataUser)
}