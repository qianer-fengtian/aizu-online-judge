package itp.itp1_3

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    while (true) {
        val x = sc.nextInt()
        val y = sc.nextInt()
        if (x == 0 && y == 0) break
        println("${Math.min(x,y)} ${Math.max(x,y)}")
    }
}