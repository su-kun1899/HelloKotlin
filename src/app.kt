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
}