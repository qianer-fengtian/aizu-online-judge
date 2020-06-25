package itp.itp1_4

fun main(args: Array<String>) {
    readLine()
    val a = readLine()!!.split(" ").map(String::toLong)
    println("${a.min()} ${a.max()} ${a.sum()}")
}