package itp.itp1_9

fun main(args: Array<String>) {
    while (true) {
        var s = readLine()!!.toString()
        if (s == "-") break
        val m = readLine()!!.toInt()
        val h = (0 until m).map { readLine()!!.toInt() }
        h.forEach { i ->
            s = s.slice(i until s.length) + s.slice(0 until i)
        }
        println(s)
    }
}