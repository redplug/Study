package TrainTo200.TrainTo120

/*
111 여러 타입을 인수로 받기
 */

fun <T,R> T.map(mapper: (T) -> R): R
{
    return mapper(this)
}

fun main() {
    val square: Int =
            11.map {
                it * it
            }
    println(square)
}

