package com.isasm.webchat.m1l1

fun main() {
    val b: Byte = (-1).toByte()
    val ub: UByte = 1.toUByte()
    val a1 = arrayOf<Int>()
    val a2 = arrayOf(1,2,3)
    val a3 = Array(5) {i -> i * i}
    for (i in a3) {
        println(i)
    }
    println(a3.contentToString())
    println("Hello World!")
}