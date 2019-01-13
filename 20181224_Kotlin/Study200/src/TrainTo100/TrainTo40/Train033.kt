package TrainTo100.TrainTo40

fun main(args: Array<String>) {
    println(getAverage(89, 96))
    getAverage(100, 50, true)
    println(getAverage(90))
    getAverage(66, print = true)
    getAverage(print = true)
    getAverage(print = true, a= 10, b = 30) // 매개변수 이름을 지정한 변수는 항상 다른 일반 인수들보다 항상 오른쪽에 있어야함
}

fun getAverage(a: Int = 0, b: Int = 0, print: Boolean = false): Double
{
    val result = (a + b)/ 2.0
    if (print)
        println(result)
    return result
}