package itp.itp1_10

fun dist(p: Double, q: Double): Double = Math.abs(Math.pow(p-q, 2.0))

fun main(args: Array<String>) {
    val (x1, y1, x2, y2) = readLine()!!.split(" ").map(String::toDouble)
    println(Math.sqrt(dist(x1, x2) + dist(y1, y2)))
}