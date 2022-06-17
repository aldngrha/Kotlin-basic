package com.kotlin.basic


fun main() {
    // statement
//    not return value
    val openOffice = 7
    val now = 8
    if (now > openOffice) {
        print("Office is open")
    } else {
        print("office close")
    }

//    if expressions
//    return value
    val officeOpen = 7
    val noww = 8
    val office = if (noww > officeOpen) "Office already open" else "Office close"
    print(office)
}