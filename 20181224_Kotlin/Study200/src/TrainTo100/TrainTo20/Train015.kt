package TrainTo100.TrainTo20

fun main(args: Array<String>): Unit
{
    val a: Int
    var b: Int

    a = 10 + 5 // 15
    b = 10

    b += a // b에 a의 값을 누적
    println(b) // 25

    b %= 3 // b를 3으로 나눈 나머지를 b에 저장
    println(b) // 25%3 나머지는 1
}