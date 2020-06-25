package itp.itp2_1

import java.util.ArrayDeque

fun main(args: Array<String>) {
    val q = readLine()!!.toInt()
    val elements = ArrayDeque<Int>()
    (1..q).forEach {
        val x = readLine()!!.split(" ").map(String::toInt)
        when(x[0]) {
            0 -> if (x[1] == 0) elements.addFirst(x[2]) else elements.addLast(x[2])
            1 -> println(elements.elementAt(x[1]))
            2 -> if (x[1] == 0) elements.removeFirst() else elements.removeLast()
        }
    }
}