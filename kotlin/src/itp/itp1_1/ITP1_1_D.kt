package itp.itp1_1

import java.util.*

fun main(args: Array<String>) {
    val S = Scanner(System.`in`).nextInt()
    println("${S/60/60}:${S/60%60}:${S%60%60}")
}