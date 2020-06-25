package itp.itp1_4

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    while (true) {
        val a = sc.nextInt()
        val op = sc.next()
        val b = sc.nextInt()
        if (op == "?") break
        val ans = when (op) {
            "+" -> a+b
            "-" -> a-b
            "*" -> a*b
            "/" -> a/b
            else -> throw IllegalStateException()
        }
        println(ans)
    }
}