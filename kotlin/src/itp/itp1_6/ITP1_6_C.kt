package itp.itp1_6

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val aparts = (1..4).map { (1..3).map { (1..10).map { 0 }.toMutableList() } }

    (1..n).forEach {
        val (b, f, r, v) = readLine()!!.split(" ").map(String::toInt)
        aparts[b-1][f-1][r-1] += v
    }

    aparts.forEachIndexed { index, apart ->
        apart.map { " " + it.joinToString(" ") }.map(::println)
        if (index != 3) println("#".repeat(20))
    }
}