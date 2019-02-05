package TrainTo100.TrainTo080
import TrainTo100.TrainTo060.Building

/*
077 Not-null 단정 연산자(Not-null Assertion Operator) !!
 */

fun main(args: Array<String>) {
    var obj: Building? = Building()
    obj!!.name = "서울시청"
    println(obj!!.name)

    obj = null
    obj!!.print()
}