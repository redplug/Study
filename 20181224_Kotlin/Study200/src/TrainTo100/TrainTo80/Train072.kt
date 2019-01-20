package TrainTo100.TrainTo80

/*
072 예외 처리
 */

fun main(args: Array<String>) {
    try
    {
        val str = "abcd"
        val num = str.toInt()

        println(num)
    }
    catch (e: NumberFormatException)
        {
            println("문자열을 숫자로 변경하지 못함")
        }
    finally {
        println("프로그램 종료")

    }
}