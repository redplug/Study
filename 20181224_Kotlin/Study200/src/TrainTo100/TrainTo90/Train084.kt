package TrainTo100.TrainTo90

/*
084 접근 지정자: protected
클래스 내부와 서브 클래스 안에서만 접근 가능
 */

open class AAA(protected val number: Int)

class BBB(number: Int):  AAA(number)
{
    fun printNumber()
    {
        // AAA클래스의 nyumber 프로퍼티에 접근 가능
        println(number)
    }
}

fun main(args: Array<String>) {
    val test = BBB(36)
    // println(test.number) // 에러
    test.printNumber()
}
