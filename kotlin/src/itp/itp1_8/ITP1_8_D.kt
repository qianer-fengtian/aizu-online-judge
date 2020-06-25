package itp.itp1_8

fun main(args: Array<String>) {
    val s = readLine()
    val p = readLine()
    println(if ((s+s).contains(p.toString())) "Yes" else "No")
}