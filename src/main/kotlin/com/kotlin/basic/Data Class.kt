package com.kotlin.basic

//this common class
class User (val name : String, val age: Int) {
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

//this data class
data class DataUser(val name : String, val age : Int) {
    fun intro() {
        println("My name is $name, I am $age years old")
    }
}

fun main() {
    val user = User("Aldi", 22)
    val dataUser = DataUser("Nugraha", 12)

    println(user)
    println(dataUser)

//    equals()

    val dataUser1 = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)

    println(dataUser1.equals(dataUser2))
    println(dataUser1.equals(dataUser3))

//    Copy and Modify Data Class

    val dataUser4 = dataUser1.copy()
    println(dataUser4)

    val dataUser5 = dataUser1.copy(age = 10)
    println(dataUser5)

//    Destructuring Declaration
    val name = dataUser1.component1()
    val age = dataUser1.component2()

    println("My name is $name, I am $age years old")

    val (names, ages) = dataUser1
    println("My name is $names, I'm $ages years old")

    dataUser1.intro()

}