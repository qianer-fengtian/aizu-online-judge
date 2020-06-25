package itp.itp1_2

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val W = sc.nextInt()
    val H = sc.nextInt()
    val x = sc.nextInt()
    val y = sc.nextInt()
    val r = sc.nextInt()
    println(if (x+r in (r..W) && y+r in (r..H)) "Yes" else "No")
}