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

    // 変数展開
    val name = "su-kun1899"
    println("Hello, $name!")

    // 式展開
    println("My score is ${12 + 34}.")

    // ifは値を返せる
    val score = 60
    val resultMessage = if (score > 70) "Great!" else "Don't mind."
    println(resultMessage)

    // switchの代わりにwhen
    var num = 3
    when (num) {
        0 -> println("Zero")
        1 -> println("One")
        2, 3 -> println("Two or Three")
        in 4..10 -> println("Many")
        else -> println("other")
    }

    // whenも値を返せる
    num = 8
    val whenResult = when (num) {
        0 -> "Zero"
        1 -> "One"
        2, 3 -> "Two or Three"
        in 4..10 -> "Many"
        else -> "other"
    }
    println(whenResult)
}