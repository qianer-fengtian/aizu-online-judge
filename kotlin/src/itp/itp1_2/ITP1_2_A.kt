package itp.itp1_2

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println("a ${if (a<b) "<" else if (a>b) ">" else "=="} b")
}