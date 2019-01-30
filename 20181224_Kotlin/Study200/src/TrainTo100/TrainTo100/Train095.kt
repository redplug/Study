package TrainTo100.TrainTo100

/*
095 확장 함수의 리시버 타입이 상속 관계에 있을 때
 */

open class AAA; class BBB: AAA()

fun AAA.hello()  = println("AAA")
fun BBB.hello()  = println("BBB")

fun main() { // 1.3버젼 부터 main(args: Array<String>) > main()으로 변경
    val test: AAA = BBB()
    test.hello()
}