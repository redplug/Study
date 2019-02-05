package TrainTo100.TrainTo080

/*
074 Nothing 타입
 */

fun throwing(): Nothing =throw Exception()

fun main(args: Array<String>) {
    println("start")
    val i: Int = throwing()
    println(i)
}