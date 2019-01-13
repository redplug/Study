package TrainTo100.TrainTo20

fun main(args: Array<String>): Unit
{
    var isRight: Boolean = (10 + 70)>(3 * 25)
    println(isRight)

    isRight = false
    println(isRight)
    isRight = 30 == (10 + 20) // 피 연산자의 타입이 반드시 일치해야 한다.
    println(isRight)

    isRight = 0.00001f == 0.005f * 0.02f
    println("0.00001f == 0.005f * 0.02f 비교는 $isRight") // 실수라 정확하게 값이 떨어지지 않아 false로 떨어진다.

    isRight = 3.0 * 5 + 2.7 <= 16 // 타입이 달라도 무방 앞은 실수 뒤는 정수타입
    println(isRight)
}