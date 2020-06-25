package itp.itp1_6

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map(String::toInt)
    val A = (1..n).map { readLine()!!.split(" ").map(String::toInt) }
    val b = (1..m).map { readLine()!!.toInt() }

    (0 until n).forEach { ni ->
        println((0 until m).map { mi -> A[ni][mi] * b[mi] }.sum())
    }
}
