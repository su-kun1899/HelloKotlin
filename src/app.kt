/**
 * はじめてのことりん
 *
 * Created by su-kun1899 on 2017/04/05.
 */
fun main(args: Array<String>) {
    println("Hello, Kotlin!")

    // val変数を使ってみる
    val valMessage = "val Message!"
    println(valMessage)

    // var変数は再代入できる
    var varMessage = "first var Message!"
    println(varMessage)
    varMessage = "second var Message"
    println(varMessage)

    // 基本データ型
    // String, Char
    val message: String = "Hi"
    val c: Char = 'c'

    // Byte, Short, Int, Long
    val i: Int = 1000
    val l: Long = 999999L

    // Float, Double
    val d: Double = 123.456
    val f: Float = 33.333F

    // Boolean
    val flag: Boolean = true
}