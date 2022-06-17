package com.kotlin.basic

//fun main() {
//    val colorRed = Color.RED
//    val colorGreen = Color.GREEN
//    val colorBlue = Color.BLUE
//}
//
////enum class Color(val value:Int){
////    RED(0xFF0000),
////    GREEN(0x00FF00),
////    BLUE(0x0000FF)
////}
//
////Anonymous class
//enum class Color(val value: Int) {
//    RED(0xFF0000) {
//          override fun printValue() {
//            println("value of RED is $value")
//          }
//      },
//    GREEN(0x00FF00){
//        override fun printValue() {
//            println("value of GREEN is $value")
//        }
//    },
//    BLUE(0x0000FF){
//        override fun printValue() {
//            println("value of BLUE is $value")
//        }
//    };
//    abstract fun printValue()
//}

//syntetic method
//fun main() {
//    val colors: Array<Color> = Color.values()
//    colors.forEach { color ->
//        print("$color")
//    }
//}
//
//enum class Color(val value: Int) {
//    RED(0xFF0000),
//    GREEN(0x00FF00),
//    BLUE(0x0000FF)
//}

// valueOf() for get name of object
fun main() {
    val color: Color = Color.valueOf("BLUE")
    println("Color is $color")
//    toString is convert to hexadecimal
    println("Color value is ${color.value.toString(16)}")
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}