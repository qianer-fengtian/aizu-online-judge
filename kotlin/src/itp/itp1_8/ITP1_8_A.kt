package itp.itp1_8

fun main(args: Array<String>) {
    val str = readLine()!!.map { e -> if (e.isUpperCase()) e.toLowerCase() else e.toUpperCase() }.joinToString("")
    println(str)
}