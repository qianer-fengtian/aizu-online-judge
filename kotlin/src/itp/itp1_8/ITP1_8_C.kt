package itp.itp1_8

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val str = StringBuffer()
    while (sc.hasNext()) str.append(sc.nextLine().toLowerCase())
    ('a'..'z').map {x -> "$x : ${str.count{ it == x }}" }.forEach(::println)
}