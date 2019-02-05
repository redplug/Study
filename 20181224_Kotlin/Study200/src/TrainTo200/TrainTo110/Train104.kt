package TrainTo200.TrainTo110

/*
104 익명 함수(Anonymous Function)
함수 리터럴을 작성하는 또 다른 방법
 */

fun main() {
    val instantFunc: (Int) -> Unit = fun(number: Int): Unit{
        println("Hello $number")
    }

    instantFunc(33)
    instantFunc.invoke(33)
}