package itp.itp1_7

fun main(args: Array<String>) {
    while (true) {
        val (n, x) = readLine()!!.split(" ").map(String::toInt)

        if (n == 0 && x == 0) break

        var cnt = 0
        (1..n).forEach { i ->
            (i..n).forEach { j ->
                (j..n).forEach { k ->
                    if (i != j && j != k && i+j+k == x) cnt++
                }
            }
        }
        println(cnt)
    }
}