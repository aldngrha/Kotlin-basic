package com.kotlin.basic

fun main() {
//    List
    val numberList : List<Int> = listOf(1,2,3,4,5,6)
    val charList = listOf("a", "b", "c")
    val anyList = mutableListOf("A", "Kotlin", 1, true)

    anyList.add("a") // menambah item di akhir list
    anyList.add(1, "aldi") // menambah item pada indeks ke 1
    anyList[3]= false //mengubah nilai item pada indeks ke 3
    anyList.removeAt(1) //menghapus item berdasarkan index atau posisi nilaidi dalam array

//    Set
//    can save unique value, useful when you don't want to same data at the collections
    val integerSet = setOf(1,2,3,2,1,4)
    println(integerSet)

//    can check if the value is in variable
    println(5 in integerSet)

//  union and intersect for knowing merge and slicing form two variable
    val setA = setOf(1,2,8,7, 5)
    val union = integerSet.union(setA)
    val intersect = integerSet.intersect(setA)

    println(union)
    println(intersect)

//    on Mutable Set we can add and delete item, but can not change value like on the List

    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
//mutableSet[2] = 6 // tidak bisa mengubah set immutable
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1

//    Map
//    can save data with format key-value
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "Madrid" to "Spain"
    )

    println(capital["Jakarta"])
//    can use function getValue() to get data
    println(capital.getValue("Madrid"))
//    the difference between [] and getValue() is when key is nothing [] showing null, and getValue() showing Exception

//    we can showing any key on the Map using function keys(). this function return value in the form of Set, because key on
//    the map must be unique
    val maplKeys = capital.keys
    // mapKeys: [Jakarta, London, Madrid]

//    for knowing any value form map
    val mapValues = capital.values
    // mapValues: [Indonesia, England, Spain]

//    for adding key-value to the map, we must ensure that the map used is Mutable
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

//    but need to pay attention that used mutable collcetion is not recommended
}