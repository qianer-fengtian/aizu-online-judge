package itp.itp1_2

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    println("%d %d %d".format(*arrayOf(a, b, c).sortedArray()))
}