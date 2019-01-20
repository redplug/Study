package TrainTo100.TrainTo80

/*
073 예외 던지기
고의로 예외를 발생시키는 것.
 */

fun main(args: Array<String>) {
    try
    {
        something()
    }
    catch (e: Exception)
    {
        println(e.message)
    }
}

fun something()
{
    val num1 = 10
    val num2 = 0
    div(num1, num2)
}

// a를 b로 나눈 몫을 반환하는 함수
fun div(a: Int, b:Int): Int
{
    if (b == 0)
        throw Exception("0으로 나눌 수 없습니다.")
    return a / b
}