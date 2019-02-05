package TrainTo200.TrainTo110

/*
108 클로저(Closure)
지역변수가 소멸하지 않은 것처럼 보이도록 하는 방법
 */

fun returnFunc(num: Int): () -> Unit = {println(num)}
fun main() {
    val f: () -> Unit = returnFunc(30)
    f()
}