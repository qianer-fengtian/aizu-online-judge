package itp.itp1_4

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println("${a/b} ${a%b} ${"%.5f".format(a.toDouble()/b)}")
}