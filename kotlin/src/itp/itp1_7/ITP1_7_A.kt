package itp.itp1_7

fun main(args: Array<String>) {
    while (true) {
        val (m, f, r) = readLine()!!.split(" ").map(String::toInt)

        if (m==-1 && f==-1 && r==-1) break

        val rank =
            if (m == -1 || f == -1) "F"
            else if (m + f >= 80) "A"
            else if (m + f >= 65) "B"
            else if (m + f >= 50) "C"
            else if (m + f >= 30 && r >= 50) "C"
            else if (m + f >= 30 && r <= 49) "D"
            else "F"
        println(rank)
    }
}