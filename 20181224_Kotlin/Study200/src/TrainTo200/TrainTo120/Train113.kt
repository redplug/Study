package TrainTo200.TrainTo120

/*
113 클래스와 인터페이스에서 제네릭 사용하기
 */

class Pair<A, B>(val first: A, val second: B)
{
    override fun toString() = "$first\n$second"
}

fun main() {
    val pair: Pair<Int, Double>
    pair = Pair<Int, Double>(15, 9.12)
    println(pair.toString())
}