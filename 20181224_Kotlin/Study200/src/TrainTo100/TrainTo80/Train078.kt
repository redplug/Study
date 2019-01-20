package TrainTo100.TrainTo80

/*
078 엘비스 연산자(Elvis Operator) ?:
 */

fun main(args: Array<String>) {
    val number: Int? = null
    println(number ?: 0)

    val number2: Int? = 15
    println(number2 ?: 0)
}