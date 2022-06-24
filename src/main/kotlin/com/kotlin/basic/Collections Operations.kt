package com.kotlin.basic

fun main() {
//    function filter() and filterNot(), both will generate new list from selection based on condition we provide
//    filter()
    val numberList = listOf(1,2,3,4,5,6,7,8,9)
    val evenList = numberList.filter { it % 2 == 0 }

    println(evenList)
//    filterNot()
//    based on result which does not match the given conditions
    val notEvenList = numberList.filterNot { it % 2 == 0 }
    println(notEvenList)

//    map
//    make new collection according to changes what to do from the previous collection
    val multipliedBy5 = numberList.map{ it * 5}
    println(multipliedBy5)

//    count()
    println(numberList.count())
//    can add a parameter in the form of lambda which contains condition
    println(numberList.count { it % 3 == 0 })

//   find(), firstOrNull(), & lastOrNull()
//    function find() has the same work with firstOrNull(). its mean, if no matching data is found in the collection
//    then function will return null value
//    if want to searching last item, use lastOrNull() function

    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }

//    firts() and last()
//    used for filter the first item or last form collection
//    we can add a condition with lambda parameter, but need to pay attention if we add condition even though the condition
//    it is not fulfilled, the result will be Exception)
    val moreThan10 = numberList.first { it > 10 }
    print(moreThan10)

//    sum()
//    can only be used for collections of type number.
    val total = numberList.sum()
    println(total)

//    sorted()
//    used to sort the items in the collection.
//    By default the sorted() function will sort the data in ascending order
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)

//    for descending order we can use sortedDescending() function
    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)
}