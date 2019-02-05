package TrainTo200.TrainTo110

/*
제네릭(Generic)
타입을 함수의 인수로 받는 방법을 알아본다.
 */

fun <T> toFunction(value: T): () -> T = {value}

fun main() {
    val func: () -> Int = toFunction<Int>(1107)
    println(func())
}