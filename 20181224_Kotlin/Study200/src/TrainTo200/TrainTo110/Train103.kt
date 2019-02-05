package TrainTo200.TrainTo110

/*
103 함수 리터럴(Function Literal)과 람다식(Lambda Expression)
 */

fun main() {
    val instantFunc: (Int) -> Unit
    instantFunc = { number: Int ->
        println("Hello $number")
    }

    instantFunc(33)
    instantFunc.invoke(33)
}