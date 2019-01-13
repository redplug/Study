package TrainTo100.TrainTo50

/*
049 문자열간 + 연산 시 주의 점
문자열을 + 연산할 경우 기존 값이 사라지지 않고 새로 힙영역에 생성되기 때문에 계속 될 경우 메모리가 쌓이는 증상이 발생함
해결은 다음 장
 */

fun main(args: Array<String>) {
    var first = "Hello"
    var second = "World"
    println(first)
    println(second)
    first += second
    println(first)
}