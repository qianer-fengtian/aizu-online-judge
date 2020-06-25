package itp.itp1_4

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val r = sc.nextDouble()
    println("${"%.5f".format(Math.PI*r*r)} ${"%.5f".format(2*Math.PI*r)}")
}