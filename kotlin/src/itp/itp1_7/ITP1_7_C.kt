package itp.itp1_7

fun main(args: Array<String>) {
    val (r, c) = readLine()!!.split(" ").map(String::toInt)
    val l = mutableListOf<MutableList<Int>>()
    repeat((0 until r).count()) {
        val row = readLine()!!.split(" ").map(String::toInt).toMutableList()
        row.add(row.sum())
        l.add(row)
    }

    l.add((0..c).map { 0 }.toMutableList())
    (0 until r).forEach { i ->
        (0..c).forEach { j ->
            l[r][j] += l[i][j]
        }
    }

    l.map { it.joinToString(" ") }.forEach(::println)
}