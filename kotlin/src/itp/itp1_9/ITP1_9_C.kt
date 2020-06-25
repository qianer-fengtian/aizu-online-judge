package itp.itp1_9

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var taro = 0
    var hana = 0
    (0 until n).forEach {
        val (t, h) = readLine()!!.toString().split(" ")
        when {
            t == h -> {
                taro++
                hana++
            }
            t > h -> {
                taro += 3
            }
            else -> {
                hana += 3
            }
        }
    }

    println("$taro $hana")
}