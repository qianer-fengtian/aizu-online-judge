package itp.itp1_3

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var i = 1
    while (true) {
        val x = sc.nextInt()
        if (x == 0) break
        println("Case ${i}: $x")
        i++
    }
}