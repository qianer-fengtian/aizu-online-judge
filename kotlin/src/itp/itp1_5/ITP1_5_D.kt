package itp.itp1_5

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    println(" " + (3..n).filter { it % 3 == 0 || it.toString().contains("3") }.toList().joinToString(" "))
}