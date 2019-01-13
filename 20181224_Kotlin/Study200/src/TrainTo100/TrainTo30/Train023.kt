package TrainTo100.TrainTo30

fun main(args: Array<String>): Unit
{
    val score = 64

    when (score / 10)
    {
        6 -> {println('D')}
        7 -> {println('C')}
        8 -> {println('B')}
        9,10 -> {println('A')}
        else -> {println('F')}
    }
    println("test")

    val score2 = 95
    println(score2.javaClass) // javaClass 변수 타입 보고 싶을 떄 사용
    when (score2 / 10)
    {
        6 -> println('D')
        7 -> println('C')
        8 -> println('B')
        9,10 -> println('A')
        else -> println('F')
    }
    println("test")

}