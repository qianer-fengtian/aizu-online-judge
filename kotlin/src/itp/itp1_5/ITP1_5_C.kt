package itp.itp1_5

fun main(args: Array<String>) {
    while (true) {
        val (H, W) = readLine()!!.split(" ").map(String::toInt)
        if (H == 0 && W == 0) break
        (1..H).forEach { h ->
            (1..W).forEach { w ->
                print(if (h%2 xor w%2 == 0) "#" else ".")
            }
            println()
        }
        println()
    }
}