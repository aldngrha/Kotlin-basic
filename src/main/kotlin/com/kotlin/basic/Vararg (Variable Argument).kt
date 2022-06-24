package com.kotlin.basic

fun main() {
//    with vararg we can simplify several parameters that have the same data type into a single parameter.
//    a function can have a number of parameters based on the number of arguments we pass in when the function is called
    val number = sumNumbers(1,2,3,4,5)
    print(number)
//    output : 15

    val numbers = getNumberSize(10,20,30,40)
    print(numbers)
//    output : 5

    sets("Aldi",10, 10)
}

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

// Applying  Generic for type parameter when parameters determined by vararg
fun <T> asList(vararg input: T): List<T> {
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result
}

// Because it is basically an Array, then we can call functions or properties available in the Array class from within
// the function
fun getNumberSize(vararg number: Int): Int {
    return number.size
}
// inside a function, it is not allowed to have 2 (two) parameters marked vararg
// when we want to add new parameter without keyword vararg, the parameter marked with vararg should in the last position
fun sets(name: String, vararg number: Int): Int {
    return number.sum()
}