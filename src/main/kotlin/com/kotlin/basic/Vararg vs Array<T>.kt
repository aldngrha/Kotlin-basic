package com.kotlin.basic

fun main() {
    val numberr = arrayOf(10,20,30,40)
    sets(numberr)
    val numbers = intArrayOf(10,20,30,40)
    set(19,29,39,*numbers,49)
}

fun sets(number: Array<Int>){

}

//when use vararg, we can input argumnet one by one. with spread operator (*), can input value array as argument for
//parameters which is marked with vararg

fun set(vararg number: Int): Int {
    return number.sum()
}