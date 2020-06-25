package itp.itp2_1

fun main(args: Array<String>) {
    val q = readLine()!!.toInt()
    val elements = mutableListOf<Int>()
    (1..q).forEach {
        val x = readLine()!!.split(" ").map(String::toInt)
        when(x[0]) {
            0 -> elements.add(x[1])
            1 -> println(elements[x[1]])
            2 -> elements.removeAt(elements.lastIndex)
        }
    }
}