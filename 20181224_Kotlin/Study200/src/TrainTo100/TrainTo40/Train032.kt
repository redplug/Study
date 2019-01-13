package TrainTo100.TrainTo40

fun main(args: Array<String>) {
    celsiusToFah(27)
    celsiusToFah2(30)
    println(caclulateFomular(3,5))
    println(caclulateFomular(18,23))
}

fun celsiusToFah(celsius: Int): Unit
{
    println(celsius * 1.8 + 32)
}
fun celsiusToFah2(celsius: Int) = println(celsius * 1.8 + 32)

fun caclulateFomular(a: Int, b: Int) = a * b + a - b

