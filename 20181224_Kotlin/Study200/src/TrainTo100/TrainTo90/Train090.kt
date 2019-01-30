package TrainTo100.TrainTo90

/*
090 inline 함수
함수를 호출 할 경우 발생하는 성능저하를 조금이나마 개선하기 위한 함수
모든 함수를 inline으로 쓸경우 길어질 수 있으므로 문장이 적고 빈번히 호출되는 함수만 inline으로 만들 것을 권장한다.

 */

inline fun hello()
{
    println("Hello")
    println("Kotlin")
}

fun main(args: Array<String>) {
    hello()
    hello()
    hello()
}
